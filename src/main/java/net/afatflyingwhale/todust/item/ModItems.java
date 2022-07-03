package net.afatflyingwhale.todust.item;

import net.afatflyingwhale.todust.ToDust;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Dust Crystals
    public static final Item FIRE_DUST_CRYSTAL = registerItem("fire_dust_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item WATER_DUST_CRYSTAL = registerItem("water_dust_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item EARTH_DUST_CRYSTAL = registerItem("earth_dust_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item AIR_DUST_CRYSTAL = registerItem("air_dust_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item LIGHTNING_DUST_CRYSTAL = registerItem("lightning_dust_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item GRAVITY_DUST_CRYSTAL = registerItem("gravity_dust_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    // Raw Ores
    public static final Item RAW_RELIC_IRON = registerItem("raw_relic_iron",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item RAW_RELIC_GOLD = registerItem("raw_relic_gold",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item RAW_MITHRIL = registerItem("raw_mithril",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item RAW_ORICHALCITE = registerItem("raw_orichalcite",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item RAW_ADAMANTITE = registerItem("raw_adamantite",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    // Ingots
    public static final Item RELIC_IRON_INGOT = registerItem("relic_iron_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item RELIC_GOLD_INGOT = registerItem("relic_gold_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item MITHRIL_INGOT = registerItem("mithril_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ORICHALCUM_INGOT = registerItem("orichalcum_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ADAMANTINE_INGOT = registerItem("adamantine_ingot",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    // Nuggets
        // Relic Iron Nugget

        // Relic Gold Nugget

        // Mithril Nugget

        // Orichalcum Nugget

        // Adamantine Nugget

    // Misc Materials
        // Pyrecoal
        // Drop of Malichor
        // Alchemic Amber

    // Catalysts
        // Catalyst Binder
    // Catalyst Cores
        // Tier I Core - "#todust:dust_crystal, relic_iron_ingot, #todust:dust_crystal", "relic_gold_ingot, pyrecoal_block, relic_gold_ingot", "#todust:dust_crystal, relic_iron_ingot, #todust:dust_crystal"
        // Tier II Core - "x, x, x", "x, x, x", "x, x, x"
        // Tier III Core - "x, drop_of_malichor, x", "x, netherite_block, x", "x, drop_of_malichor, x"
        // Tier IV Core - "x, x, x", "x, x, x", "x, x, x"

    // Resource Catalysts
        // Coal Catalyst - "You could smelt a lot with this"
        // Iron Catalyst - "Makes the world go square"
        // Gold Catalyst - "Beware sneaky piglins"
        // Copper Catalyst - "Definitely a new material!"
        // Diamond Catalyst - "Every kid's dream"
        // Emerald Catalyst - "Condensed labour"
        // Redstone Catalyst - "Blink and it'll invent teleportation"
        // Lapis Catalyst - "If you squint it looks REALLY blue"
        // Netherite Catalyst - "This is overkill"
        // Relic Iron Catalyst - "Old metal from beneath, like all metal, actually"
        // Relic Gold Catalyst - "It's like gold, but older!"
        // Mithril Catalyst - "The entire wealth of Moria"
        // Orichalcum Catalyst - "It green! It hit good!"
        // Adamantine Catalyst - "Unbreakable, even on a bad day"
    // Dust Catalysts
        // Fire Dust Catalyst - "Oof, ow, hot, hot!"
        // Air Dust Catalyst - "Feels like I'm holding nothing at all!"
        // Earth Dust Catalyst - "Heavy, fragile and sharp, the best combination"
        // Water Dust Catalyst - "DO NOT DRINK"
        // Lightning Dust Catalyst - "Portable generator on a very large budget"
        // Gravity Dust Catalyst - "It's like a black hole, only portable"
    // Material Catalysts
        // Stone Catalyst - "From the deep"
        // Deepslate Catalyst - "From the deeper"
        // Netherrack Catalyst - "From the deepest"
        // Blackstone Catalyst - "It has sprinkles!"
        // Basalt Catalyst - "Igneous? No, ig-nice-s"
        // Calcite Catalyst - "Poor man's marble"
        // Andesite Catalyst - "Rich man's stone"
        // Granite Catalyst - "The color of foolish choices"
        // Diorite Catalyst - "This is just birdcrap"
        // Dirt Catalyst - "Life giveth, life taketh away-eth"
    // Wood Catalysts
            // Tier I
        // Oak Catalyst - "Begin anew"
        // Birch Catalyst - "Pales in comparison"
        // Spruce Catalyst - "Cold winter's night"
        // Jungle Catalyst - "Humidity cubed"
        // Acacia Catalyst - "Tastes like sherbet"
        // Dark Oak Catalyst - "Best wood 10/10"
        // Mangrove Catalyst - "New, improved, mysterious, mangrove"
        // Sapling Catalyst - "Made from life's potential!"
            // Tier II
        // Crimson Stem Catalyst - "What's red all over?"
        // Warped Stem Catalyst - "Mycological nightmare"
        // Twisted Oak Catalyst - "Dizzy-maker"
        // Magebane Catalyst - "A wizard's worst nightmare"
        // Pyrewood Catalyst - "Burn, baby, burn!"
        // Wisewillow Catalyst - "Does not make you smarter"
        // Black Birch Catalyst - "It's like birch but darker"
        // Red Heartnut Catalyst - "The sap is a delicacy!"
    // Mob Catalysts
            // Tier I
        // Cow - "Cow goes moo"
        // Pig - "Mmm... bacon..."
        // Sheep - "Counting makes me tired"
        // Chicken - "Good protein?"
        // Rabbit - "The most foul, cruel, and bad-tempered rodent you ever set eyes on"
        // Cod - "Fishy"
        // Bee - "It's not Forestry!!!"
        // Goat - "2014 called"
            // Mob Catalyst Core I
            // Tier II
        // Zombie Catalyst - "Mmm... brains..."
        // Skeleton Catalyst - "Play me like a xylophone"
        // Creeper Catalyst - "On the bright side, they aren't invisible?"
        // Spider Catalyst - "Creepy crawlies"
        // Enderman Catalyst - "Blink and you'll miss it"
        // Pillager Catalyst - "Looters beware"
        // Slime Catalyst - "Bounce. Bounce. Bounce"
        // Blaze Catalyst - "Brewskis inbound"
            // Mob Catalyst Core II
            // Tier II
        // Magma Cube Catalyst - "Bounce. Bounce. Bounce. But hotter"
        // Phantom Catalyst - "MAINTAIN A HEALTHY SLEEP CYCLE"
        // Guardian Catalyst - "It's like a cactus with fins! And a laser eye!"
        // Ravager Catalyst - "A sentient garbage compactor with legs"
        // Shulker Catalyst - "It's not flying, it's gliding, with style!"
        // Drowned Catalyst - "The deep calls"
        // Witch Catalyst - "Every tumblr user circa 2013"
        // Wither Skeleton Catalyst - "Taller than they look"
            // Mob Catalyst Core III
            // Tier IV
        // Wither - "Three heads does not equal more brains"
        // Ender Dragon - "You killed a lot of mothers. Are you happy?"
        // Warden - "Blind, but definitely not deaf"
        // Elder Guardian - "Spiky fishy"
            // Mob Catalyst Core IV

    // Wood Cores


    // Charms
        // Speed Charms
        // Slowness Charms
        // Haste Charms
        // Mining Fatigue Charms
        // Strength Charms
        // Jump Boost Charms
        // Nausea Charms
        // Regeneration Charms
        // Resistance Charms
        // Fire Resistance Charms
        // Water Breathing Charms
        // Invisibility Charms
        // Blindness Charms
        // Night Vision Charms
        // Hunger Charms
        // Weakness Charms
        // Poison Charms
        // Wither Charms
        // Health Boost Charms
        // Absorption Charms
        // Saturation Charms
        // Glowing Charms
        // Levitation Charms
        // Luck Charms
        // Bad Luck Charms
        // Slow Falling Charms
        // Conduit Charms
        // Dolphin's Grace Charms
        // Bad Omen Charms
        // Hero of the Village Charms
        // Charm of Curing
        // Charm of Flight



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(ToDust.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ToDust.LOGGER.debug("Registering Mod Items for " + ToDust.MOD_ID);
    }
}
