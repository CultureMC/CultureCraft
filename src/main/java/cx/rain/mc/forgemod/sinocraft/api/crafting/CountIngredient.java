package cx.rain.mc.forgemod.sinocraft.api.crafting;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.network.PacketBuffer;

/**
 * Use {@link ICountIngredient}
 *
 * @see ICountIngredient
 * @see ICountIngredient#EMPTY
 * @see IModRecipes#newCountIngredient(Ingredient, int)
 */
@Deprecated
public class CountIngredient implements ICountIngredient {

    @Deprecated
    public static final CountIngredient EMPTY = new CountIngredient(Ingredient.EMPTY, 0);

    private final Ingredient ingredient;
    private final int count;

    public CountIngredient(Ingredient ingredient, int count) {
        this.ingredient = ingredient;
        this.count = count;
    }

    @Override
    public Ingredient getIngredient() {
        return ingredient;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public boolean match(ItemStack stack) {
        return stack.getCount() >= count && ingredient.test(stack);
    }

    @Override
    public void write(PacketBuffer buffer) {
        ingredient.write(buffer);
        buffer.writeVarInt(count);
    }

    @Deprecated
    public static CountIngredient read(PacketBuffer buffer) {
        Ingredient ingredient = Ingredient.read(buffer);
        return new CountIngredient(ingredient, buffer.readVarInt());
    }
}
