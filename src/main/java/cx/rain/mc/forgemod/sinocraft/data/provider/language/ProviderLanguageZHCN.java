package cx.rain.mc.forgemod.sinocraft.data.provider.language;

import cx.rain.mc.forgemod.sinocraft.block.ModBlockItems;
import cx.rain.mc.forgemod.sinocraft.block.ModBlocks;
import cx.rain.mc.forgemod.sinocraft.data.provider.base.ProviderLanguage;
import cx.rain.mc.forgemod.sinocraft.entity.ModEntities;
import cx.rain.mc.forgemod.sinocraft.item.ModItems;
import net.minecraft.data.DataGenerator;

public class ProviderLanguageZHCN extends ProviderLanguage {
    public ProviderLanguageZHCN(DataGenerator gen) {
        super(gen, "zh_cn");
    }

    @Override
    protected void addTranslations() {
        addItemGroups();
        addItems();
        addBlocks();
        addTooltips();
        addEntities();
        addAdvancements();
        addMisc();
        addGui();
    }

    private void addAdvancements() {
        addAdvancement("root",
                "SinoCraft 华夏工艺",
                "有服章之美谓之华，有礼仪之大谓之夏。");
        addAdvancement("got_knife",
                "刀",
                "获得一把小刀。");
        addAdvancement("kill_entity_by_knives",
                "无物为真，诸行皆可",
                "用小刀杀死一个生物。");
        addAdvancement("got_bark",
                "周扒皮",
                "用小刀扒下一棵树的树皮。");
        addAdvancement("kill_all_mobs_with_knife",
                "怪物大师",
                "用小刀杀死每一种怪物。");
        addAdvancement("kill_all_entities_with_knife",
                "刺客的盛宴",
                "用小刀杀死每一种生物。");
        addAdvancement("got_ink",
                "粉墨登场",
                "获得墨汁。");
        addAdvancement("write_on_paper",
                "纸上描眉目，不辨妍或媸",
                "在纸上着墨。");
        addAdvancement("got_stone_mill",
                "磨坊主",
                "制作石磨。");
        addAdvancement("eating_first",
                "民以食为天",
                "搭锅做饭。");
        addAdvancement("porridge_ready",
                "食以粥为先",
                "用锅煮粥。");
        addAdvancement("heroes_assembly",
                "看看这道菜，群英荟萃",
                "要您老八十一点都不贵。");
        addAdvancement("plant_millet",
                "春种一粒粟，秋收万颗子",
                "四海无闲田，农夫犹饿死。");
    }

    private void addItemGroups() {
        addItemGroup("blocks", "华夏工艺 | 方块");
        addItemGroup("decorate", "华夏工艺 | 装饰");
        addItemGroup("agriculture", "华夏工艺 | 农业");
        addItemGroup("foods", "华夏工艺 | 食物");
        addItemGroup("combat", "华夏工艺 | 战斗");
        addItemGroup("tools", "华夏工艺 | 工具");
        addItemGroup("misc", "华夏工艺 | 杂项");
    }

    private void addMisc() {
        add("gui.sinocraft.category.soaking", "浸泡");
    }

    private void addItems() {
        addItem(ModItems.PEACH, "桃子");
        addItem(ModItems.CHILI_PEPPER_SEED, "辣椒种子");
        addItem(ModItems.GREEN_PEPPER_SEED, "青椒种子");
        addItem(ModItems.CABBAGE_SEED, "白菜种子");
        addItem(ModItems.EGGPLANT_SEED, "茄子种子");
        addItem(ModItems.RICE_SEED, "稻谷");
        addItem(ModItems.MILLET_SEED, "粟");
        addItem(ModItems.SORGHUM_SEED, "高粱");
        addItem(ModItems.SOYBEAN, "大豆");
        addItem(ModItems.RICE, "大米");
        addItem(ModItems.MILLET, "小米");
        addItem(ModItems.SORGHUM, "高粱米");

        addItem(ModItems.FLOUR, "面粉");
        addItem(ModItems.DOUGH, "面团");
        addItem(ModItems.DUMPLING_WRAPPER, "饺子皮");

        addItem(ModBlockItems.GREEN_RADISH, "青萝卜");
        addItem(ModBlockItems.SUMMER_RADISH, "水萝卜");
        addItem(ModBlockItems.WHITE_RADISH, "白萝卜");
        addItem(ModItems.CHILI_PEPPER, "辣椒");
        addItem(ModItems.GREEN_PEPPER, "青椒");
        addItem(ModItems.EGGPLANT, "茄子");
        addItem(ModItems.CABBAGE, "白菜");
        addItem(ModItems.HEROES_ASSEMBLE, "群英荟萃");

        addItem(ModItems.DISH, "盘子");
        addItem(ModItems.BARK, "树皮");
        addItem(ModItems.KNIFE_IRON, "铁质小刀");
        addItem(ModItems.KNIFE_GOLD, "金质小刀");
        addItem(ModItems.KNIFE_DIAMOND, "钻石小刀");
        addItem(ModItems.CHINESE_BRUSH, "毛笔");
        addItem(ModItems.CHINESE_INK, "墨汁");
        addItem(ModItems.CHARCOAL_BLACK, "炭黑");
        addItem(ModItems.INK_STONE, "砚台");
        addItem(ModItems.EMPTY_XUAN_PAPER, "空白的宣纸");
        addItem(ModItems.XUAN_PAPER, "宣纸");
        addItem(ModItems.BUCKET_WOOD_PULP, "木浆桶");
//         addItem(ModItems.TUTORIAL_BOOK, "《华夏工艺》");
    }

    private void addBlocks() {
        addBlock(ModBlocks.PEACH_LOG, "桃树原木");
        addBlock(ModBlocks.PEACH_LOG_STRIPPED, "去皮桃树原木");
        addBlock(ModBlocks.PEACH_LOG_BARK, "桃树树皮块");
        addBlock(ModBlocks.PEACH_LOG_STRIPPED_BARK, "去皮桃树树皮块");
        addBlock(ModBlocks.PEACH_PLANK, "桃树木板");
        addBlock(ModBlocks.PEACH_LEAVES, "桃树树叶");
        addBlock(ModBlocks.PEACH_SAPLING, "桃树树苗");

        addBlock(ModBlocks.WALNUT_LOG, "核桃树原木");
        addBlock(ModBlocks.WALNUT_LOG_STRIPPED, "去皮核桃树原木");
        addBlock(ModBlocks.WALNUT_LOG_BARK, "核桃树树皮块");
        addBlock(ModBlocks.WALNUT_LOG_STRIPPED_BARK, "去皮核桃树树皮块");
        addBlock(ModBlocks.WALNUT_PLANK, "核桃树木板");
        addBlock(ModBlocks.WALNUT_LEAVES, "核桃树树叶");
        addBlock(ModBlocks.WALNUT_SAPLING, "核桃树树苗");

        addBlock(ModBlocks.PLUM_LOG, "梅花原木");
        addBlock(ModBlocks.PLUM_LOG_STRIPPED, "去皮梅花原木");
        addBlock(ModBlocks.PLUM_LOG_BARK, "梅花树皮块");
        addBlock(ModBlocks.PLUM_LOG_STRIPPED_BARK, "去皮梅花树皮块");
        addBlock(ModBlocks.PLUM_PLANK, "梅花木板");
        addBlock(ModBlocks.PLUM_LEAVES, "梅花树叶");
        addBlock(ModBlocks.PLUM_SAPLING, "梅花树苗");

        addBlock(ModBlocks.MULBERRY_LOG, "桑树原木");
        addBlock(ModBlocks.MULBERRY_LOG_STRIPPED, "去皮桑树原木");
        addBlock(ModBlocks.MULBERRY_LOG_BARK, "桑树树皮块");
        addBlock(ModBlocks.MULBERRY_LOG_STRIPPED_BARK, "去皮桑树树皮块");
        addBlock(ModBlocks.MULBERRY_PLANK, "桑树木板");
        addBlock(ModBlocks.MULBERRY_LEAVES, "桑树树叶");
        addBlock(ModBlocks.MULBERRY_SAPLING, "桑树树苗");

        addBlock(ModBlocks.WHITE_MARBLE, "汉白玉大理石");
        addBlock(ModBlocks.RED_MARBLE, "南江红大理石");
        addBlock(ModBlocks.BLACK_MARBLE, "晶墨玉大理石");

        addBlock(ModBlocks.STOVE, "灶台");
        addBlock(ModBlocks.VAT, "木缸");
        addBlock(ModBlocks.POT, "铁锅");
        addBlock(ModBlocks.PAPER_DRYING_RACK, "晾纸架");
        addBlock(ModBlocks.STONE_MILL, "石磨");
    }

    private void addTooltips() {
        addTooltip(ModItems.HEROES_ASSEMBLE, "我看就是萝卜开会。");
    }

    private void addEntities() {
        addEntityType(ModEntities.ENTITY_BUFFALO, "水牛");
    }

    private void addGui() {
        add("sinocraft.jei.recipe.cooking", "铁锅");
        add("sinocraft.jei.recipe.soaking", "木缸");
        add("sinocraft.jei.recipe.steamer", "蒸笼");
        add("config.waila.plugin_sinocraft", "华夏工艺");
        add("config.waila.plugin_sinocraft.enabled", "启用");
    }
}
