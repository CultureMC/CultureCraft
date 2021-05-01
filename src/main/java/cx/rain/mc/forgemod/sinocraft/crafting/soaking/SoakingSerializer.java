package cx.rain.mc.forgemod.sinocraft.crafting.soaking;

import com.google.gson.JsonObject;
import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipeSerializer;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.JsonToNBT;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.registries.ForgeRegistryEntry;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class SoakingSerializer extends ForgeRegistryEntry<IRecipeSerializer<?>> implements IRecipeSerializer<SoakingRecipe> {
    public static Map<ResourceLocation, ISoakingRecipe> recipes = new HashMap<>();

    public static <T extends ISoakingRecipe> void register(ResourceLocation id, T recipe) {
        recipes.put(id, recipe);
    }

    @Override
    public SoakingRecipe read(ResourceLocation id, JsonObject json) {
        try {
            ItemStack item = ItemStack.read(new JsonToNBT(new StringReader(
                    json.getAsJsonPrimitive("item").getAsString())
            ).readStruct());
            if (json.has("result")) {
                ItemStack result = ItemStack.read(new JsonToNBT(new StringReader(
                        json.getAsJsonPrimitive("result").getAsString())
                ).readStruct());
                register(id, new SoakingRecipe(item, result, id));
            }
            else {
                if (json.has("fluid_result")) {
                    FluidStack result = FluidStack.loadFluidStackFromNBT(new JsonToNBT(new StringReader(
                            json.getAsJsonPrimitive("fluid_result").getAsString())
                    ).readStruct());
                    register(id, new SoakingRecipe(item, result, id));
                }
            }
        } catch (CommandSyntaxException e) {
            e.printStackTrace();
        }
        return (SoakingRecipe) recipes.get(id);
    }

    @Nullable
    @Override
    public SoakingRecipe read(ResourceLocation id, PacketBuffer buffer) {
        ItemStack item = ItemStack.read(buffer.readCompoundTag());
        if (buffer.readBoolean()) {
            ItemStack result = ItemStack.read(buffer.readCompoundTag());
            return new SoakingRecipe(item, result, id);
        }
        else {
            FluidStack result = FluidStack.loadFluidStackFromNBT(buffer.readCompoundTag());
            return new SoakingRecipe(item, result, id);
        }
    }

    @Override
    public void write(PacketBuffer buffer, SoakingRecipe recipe) {
        CompoundNBT nbt = new CompoundNBT();
        recipe.getItem().write(nbt);
        buffer.writeCompoundTag(nbt);
        nbt = new CompoundNBT();
        if (recipe.getRecipeOutput() != null) {
            buffer.writeBoolean(true);
            recipe.getRecipeOutput().write(nbt);
        }
        else {
            buffer.writeBoolean(false);
            recipe.getFluidResult().writeToNBT(nbt);
        }
        buffer.writeCompoundTag(nbt);
    }
}
