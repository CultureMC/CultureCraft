package cx.rain.mc.forgemod.sinocraft.data.gen.provider.language;

import cx.rain.mc.forgemod.sinocraft.SinoCraft;
import cx.rain.mc.forgemod.sinocraft.block.BlockItems;
import cx.rain.mc.forgemod.sinocraft.data.gen.provider.base.ProviderBaseAdvancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.FrameType;
import net.minecraft.advancements.IRequirementsStrategy;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.StringTextComponent;

public class ProviderAdvancement extends ProviderBaseAdvancement {
    public static final String ID = SinoCraft.MODID;

    public ProviderAdvancement(DataGenerator generatorIn) {
        super(generatorIn);
    }

    @Override
    protected void registerAdvancements() {
        /*Advancements.put(new ResourceLocation(ID,"basic/root"),RootAdvancement(
                new ItemStack(BlockItems.WHITE_MARBLE.get()),"!","!",
                new ResourceLocation(ID,"textures/gui/advancements/backgrounds/white_marble.png"),
                FrameType.TASK,false,true,true,new AdvancementRewards.Builder().addExperience(0), IRequirementsStrategy

                )
        );*/
    }

    @Override
    public String getName() {
        return "Advancements";
    }
}