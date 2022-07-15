package net.afatflyingwhale.todust.item;

import net.afatflyingwhale.todust.ToDust;
import net.afatflyingwhale.todust.block.ModBlocks;
import net.afatflyingwhale.todust.item.custom.ModMusicDiscItem;
import net.afatflyingwhale.todust.item.custom.catalysts.catalyst_cores.ModCatalystCore1Item;
import net.afatflyingwhale.todust.item.custom.catalysts.catalyst_cores.ModCatalystCore2Item;
import net.afatflyingwhale.todust.item.custom.catalysts.catalyst_cores.ModCatalystCore3Item;
import net.afatflyingwhale.todust.item.custom.catalysts.catalyst_cores.ModCatalystCore4Item;
import net.afatflyingwhale.todust.item.custom.catalysts.dust_catalysts.*;
import net.afatflyingwhale.todust.item.custom.catalysts.material_catalysts.*;
import net.afatflyingwhale.todust.item.custom.catalysts.misc_catalysts.ArtisticCatalyst;
import net.afatflyingwhale.todust.item.custom.catalysts.mob_catalysts.*;
import net.afatflyingwhale.todust.item.custom.catalysts.resource_catalysts.*;
import net.afatflyingwhale.todust.item.custom.perfects.PerfectItem;
import net.afatflyingwhale.todust.item.custom.tooltypes.ModAxeItem;
import net.afatflyingwhale.todust.item.custom.tooltypes.ModHoeItem;
import net.afatflyingwhale.todust.item.custom.tooltypes.ModPickaxeItem;
import net.afatflyingwhale.todust.item.custom.tooltypes.sword_effect_types.ModHungerSwordItem;
import net.afatflyingwhale.todust.item.custom.tooltypes.sword_effect_types.ModSlownessSwordItem;
import net.afatflyingwhale.todust.item.custom.tooltypes.sword_effect_types.ModWeaknessSwordItem;
import net.afatflyingwhale.todust.sounds.ModSounds;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.client.render.debug.BeeDebugRenderer;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Dust Crystals
    public static final Item FIRE_DUST_CRYSTAL = registerItem("fire_dust_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST).fireproof()));
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

    // Dust Geodes
    public static Item FIRE_DUST_BLOCK = new BlockItem(ModBlocks.FIRE_DUST_BLOCK, new Item.Settings().group(ModItemGroup.TODUST).fireproof());
    public static Item BUDDING_FIRE_DUST = new BlockItem(ModBlocks.BUDDING_FIRE_DUST, new Item.Settings().group(ModItemGroup.TODUST).fireproof());
    public static Item SMALL_FIRE_DUST_BUD = new BlockItem(ModBlocks.SMALL_FIRE_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST).fireproof());
    public static Item MEDIUM_FIRE_DUST_BUD = new BlockItem(ModBlocks.MEDIUM_FIRE_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST).fireproof());
    public static Item LARGE_FIRE_DUST_BUD = new BlockItem(ModBlocks.LARGE_FIRE_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST).fireproof());
    public static Item FIRE_DUST_CLUSTER = new BlockItem(ModBlocks.FIRE_DUST_CLUSTER, new Item.Settings().group(ModItemGroup.TODUST).fireproof());

    public static Item AIR_DUST_BLOCK = new BlockItem(ModBlocks.AIR_DUST_BLOCK, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item BUDDING_AIR_DUST = new BlockItem(ModBlocks.BUDDING_AIR_DUST, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item SMALL_AIR_DUST_BUD = new BlockItem(ModBlocks.SMALL_AIR_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item MEDIUM_AIR_DUST_BUD = new BlockItem(ModBlocks.MEDIUM_AIR_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item LARGE_AIR_DUST_BUD = new BlockItem(ModBlocks.LARGE_AIR_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item AIR_DUST_CLUSTER = new BlockItem(ModBlocks.AIR_DUST_CLUSTER, new Item.Settings().group(ModItemGroup.TODUST));

    public static Item EARTH_DUST_BLOCK = new BlockItem(ModBlocks.EARTH_DUST_BLOCK, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item BUDDING_EARTH_DUST = new BlockItem(ModBlocks.BUDDING_EARTH_DUST, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item SMALL_EARTH_DUST_BUD = new BlockItem(ModBlocks.SMALL_EARTH_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item MEDIUM_EARTH_DUST_BUD = new BlockItem(ModBlocks.MEDIUM_EARTH_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item LARGE_EARTH_DUST_BUD = new BlockItem(ModBlocks.LARGE_EARTH_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item EARTH_DUST_CLUSTER = new BlockItem(ModBlocks.EARTH_DUST_CLUSTER, new Item.Settings().group(ModItemGroup.TODUST));

    public static Item WATER_DUST_BLOCK = new BlockItem(ModBlocks.WATER_DUST_BLOCK, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item BUDDING_WATER_DUST = new BlockItem(ModBlocks.BUDDING_WATER_DUST, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item SMALL_WATER_DUST_BUD = new BlockItem(ModBlocks.SMALL_WATER_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item MEDIUM_WATER_DUST_BUD = new BlockItem(ModBlocks.MEDIUM_WATER_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item LARGE_WATER_DUST_BUD = new BlockItem(ModBlocks.LARGE_WATER_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item WATER_DUST_CLUSTER = new BlockItem(ModBlocks.WATER_DUST_CLUSTER, new Item.Settings().group(ModItemGroup.TODUST));

    public static Item LIGHTNING_DUST_BLOCK = new BlockItem(ModBlocks.LIGHTNING_DUST_BLOCK, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item BUDDING_LIGHTNING_DUST = new BlockItem(ModBlocks.BUDDING_LIGHTNING_DUST, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item SMALL_LIGHTNING_DUST_BUD = new BlockItem(ModBlocks.SMALL_LIGHTNING_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item MEDIUM_LIGHTNING_DUST_BUD = new BlockItem(ModBlocks.MEDIUM_LIGHTNING_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item LARGE_LIGHTNING_DUST_BUD = new BlockItem(ModBlocks.LARGE_LIGHTNING_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item LIGHTNING_DUST_CLUSTER = new BlockItem(ModBlocks.LIGHTNING_DUST_CLUSTER, new Item.Settings().group(ModItemGroup.TODUST));

    public static Item GRAVITY_DUST_BLOCK = new BlockItem(ModBlocks.GRAVITY_DUST_BLOCK, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item BUDDING_GRAVITY_DUST = new BlockItem(ModBlocks.BUDDING_GRAVITY_DUST, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item SMALL_GRAVITY_DUST_BUD = new BlockItem(ModBlocks.SMALL_GRAVITY_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item MEDIUM_GRAVITY_DUST_BUD = new BlockItem(ModBlocks.MEDIUM_GRAVITY_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item LARGE_GRAVITY_DUST_BUD = new BlockItem(ModBlocks.LARGE_GRAVITY_DUST_BUD, new Item.Settings().group(ModItemGroup.TODUST));
    public static Item GRAVITY_DUST_CLUSTER = new BlockItem(ModBlocks.GRAVITY_DUST_CLUSTER, new Item.Settings().group(ModItemGroup.TODUST));

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
    public static final Item RELIC_IRON_NUGGET = registerItem("relic_iron_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item RELIC_GOLD_NUGGET = registerItem("relic_gold_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item MITHRIL_NUGGET = registerItem("mithril_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ORICHALCUM_NUGGET = registerItem("orichalcum_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ADAMANTINE_NUGGET = registerItem("adamantine_nugget",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));

    // Tools & Armor
    // Mithril
    public static final Item MITHRIL_SWORD = registerItem("mithril_sword",
            new ModWeaknessSwordItem(ModToolMaterials.MITHRIL, 2, -1.6f, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item MITHRIL_AXE = registerItem("mithril_axe",
            new ModAxeItem(ModToolMaterials.MITHRIL, 4, -2.6f, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item MITHRIL_SHOVEL = registerItem("mithril_shovel",
            new ShovelItem(ModToolMaterials.MITHRIL, 0, -3f, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item MITHRIL_HOE = registerItem("mithril_hoe",
            new ModHoeItem(ModToolMaterials.MITHRIL, 0, 0.5f, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item MITHRIL_PICKAXE = registerItem("mithril_pickaxe",
            new ModPickaxeItem(ModToolMaterials.MITHRIL, 0, -2.8f, new FabricItemSettings().group(ModItemGroup.TODUST)));

    public static final Item MITHRIL_HELMET = registerItem("mithril_helmet",
            new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item MITHRIL_CHESTPLATE = registerItem("mithril_chestplate",
            new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item MITHRIL_LEGGINGS = registerItem("mithril_leggings",
            new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item MITHRIL_BOOTS = registerItem("mithril_boots",
            new ArmorItem(ModArmorMaterials.MITHRIL, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.TODUST)));
    // Orichalcum
    public static final Item ORICHALCUM_SWORD = registerItem("orichalcum_sword",
            new ModHungerSwordItem(ModToolMaterials.ORICHALCUM, 2, -2.4f, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ORICHALCUM_AXE = registerItem("orichalcum_axe",
            new ModAxeItem(ModToolMaterials.ORICHALCUM, 4, -3f, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ORICHALCUM_SHOVEL = registerItem("orichalcum_shovel",
            new ShovelItem(ModToolMaterials.ORICHALCUM, 0, -3f, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ORICHALCUM_HOE = registerItem("orichalcum_hoe",
            new ModHoeItem(ModToolMaterials.ORICHALCUM, 0, 0f, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ORICHALCUM_PICKAXE = registerItem("orichalcum_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ORICHALCUM, 0, -2.8f, new FabricItemSettings().group(ModItemGroup.TODUST)));

    public static final Item ORICHALCUM_HELMET = registerItem("orichalcum_helmet",
            new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ORICHALCUM_CHESTPLATE = registerItem("orichalcum_chestplate",
            new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ORICHALCUM_LEGGINGS = registerItem("orichalcum_leggings",
            new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ORICHALCUM_BOOTS = registerItem("orichalcum_boots",
            new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.TODUST)));
    // Adamantine
    public static final Item ADAMANTINE_SWORD = registerItem("adamantine_sword",
            new ModSlownessSwordItem(ModToolMaterials.ADAMANTINE, 3, -2.4f, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ADAMANTINE_AXE = registerItem("adamantine_axe",
            new ModAxeItem(ModToolMaterials.ADAMANTINE, 5, -3f, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ADAMANTINE_SHOVEL = registerItem("adamantine_shovel",
            new ShovelItem(ModToolMaterials.ADAMANTINE, 0, -3f, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ADAMANTINE_HOE = registerItem("adamantine_hoe",
            new ModHoeItem(ModToolMaterials.ADAMANTINE, 0, 0f, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ADAMANTINE_PICKAXE = registerItem("adamantine_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ADAMANTINE, 0, -2.8f, new FabricItemSettings().group(ModItemGroup.TODUST)));

    public static final Item ADAMANTINE_HELMET = registerItem("adamantine_helmet",
            new ArmorItem(ModArmorMaterials.ADAMANTINE, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ADAMANTINE_CHESTPLATE = registerItem("adamantine_chestplate",
            new ArmorItem(ModArmorMaterials.ADAMANTINE, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ADAMANTINE_LEGGINGS = registerItem("adamantine_leggings",
            new ArmorItem(ModArmorMaterials.ADAMANTINE, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ADAMANTINE_BOOTS = registerItem("adamantine_boots",
            new ArmorItem(ModArmorMaterials.ADAMANTINE, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.TODUST)));
    // Malichor


    public static final Item MALICHOR_HELMET = registerItem("malichor_helmet", new ArmorItem(ModArmorMaterials.MALICHOR, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item MALICHOR_CHESTPLATE = registerItem("malichor_chestplate", new ArmorItem(ModArmorMaterials.MALICHOR, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item MALICHOR_LEGGINGS = registerItem("malichor_leggings", new ArmorItem(ModArmorMaterials.MALICHOR, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item MALICHOR_BOOTS = registerItem("malichor_boots", new ArmorItem(ModArmorMaterials.MALICHOR, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroup.TODUST)));

    // Misc Materials
        // Small Coals
    public static final Item TINY_COAL = registerItem("tiny_coal", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item TINY_CHARCOAL = registerItem("tiny_charcoal", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
        // Pyrecoal
    public static final Item PYRECOAL = registerItem("pyrecoal", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item TINY_PYRECOAL = registerItem("tiny_pyrecoal", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));

    // Mob Drops
        // Warden Heart
    public static final Item WARDEN_HEART = registerItem("warden_heart", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));

    // Armor Cores
    public static final Item MITHRIL_CORE = registerItem("mithril_core",
                new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ORICHALCUM_CORE = registerItem("orichalcum_core",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item ADAMANTINE_CORE = registerItem("adamantine_core",
            new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
        // Malichor
    public static final Item DROP_OF_MALICHOR = registerItem("drop_of_malichor", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item MALICHOR_INGOT = registerItem("malichor_ingot", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
        // Alchemic Amber
        // Ender Pearl Dust
    public static final Item ENDER_PEARL_POWDER = registerItem("ender_pearl_powder", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
        // Gilded Steel
    public static final Item GILDED_STEEL_BLEND = registerItem("gilded_steel_blend", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item GILDED_STEEL_INGOT = registerItem("gilded_steel_ingot", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
        // Misc Dusts
    public static final Item PYRECOAL_DUST = registerItem("pyrecoal_dust", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item RELIC_IRON_DUST = registerItem("relic_iron_dust", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item RELIC_GOLD_DUST = registerItem("relic_gold_dust", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
        // Reinforcing Plate
    public static final Item REINFORCING_PLATE = registerItem("reinforcing_plate", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
        // Nephilim Dust???

    // Dust Powders
    public static final Item FIRE_DUST_POWDER = registerItem("fire_dust_powder", new Item(new FabricItemSettings().group(ModItemGroup.TODUST).fireproof()));
    public static final Item AIR_DUST_POWDER = registerItem("air_dust_powder", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item EARTH_DUST_POWDER = registerItem("earth_dust_powder", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item WATER_DUST_POWDER = registerItem("water_dust_powder", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item LIGHTNING_DUST_POWDER = registerItem("lightning_dust_powder", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item GRAVITY_DUST_POWDER = registerItem("gravity_dust_powder", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    // Cut Dust Crystals
    public static final Item CUT_FIRE_DUST = registerItem("cut_fire_dust", new Item(new FabricItemSettings().group(ModItemGroup.TODUST).fireproof()));
    public static final Item CUT_AIR_DUST = registerItem("cut_air_dust", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item CUT_EARTH_DUST = registerItem("cut_earth_dust", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item CUT_WATER_DUST = registerItem("cut_water_dust", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item CUT_LIGHTNING_DUST = registerItem("cut_lightning_dust", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item CUT_GRAVITY_DUST = registerItem("cut_gravity_dust", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));

    // Catalysts Components
        // Catalyst Binder
    public static final Item CATALYST_BINDER = registerItem("catalyst_binder", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));

    // Catalyst Cores
    public static final Item TIER_I_CORE = registerItem("tier_i_core", new ModCatalystCore1Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item TIER_II_CORE = registerItem("tier_ii_core", new ModCatalystCore2Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item TIER_III_CORE = registerItem("tier_iii_core", new ModCatalystCore3Item(new FabricItemSettings().group(ModItemGroup.TODUST)));
    public static final Item TIER_IV_CORE = registerItem("tier_iv_core", new ModCatalystCore4Item(new FabricItemSettings().group(ModItemGroup.TODUST)));


    // Resource Catalysts & Perfects
    public static final Item COAL_CATALYST = registerItem("coal_catalyst", new CoalCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_COAL = registerItem("perfect_coal", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item IRON_CATALYST = registerItem("iron_catalyst", new IronCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_IRON = registerItem("perfect_iron", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item GOLD_CATALYST = registerItem("gold_catalyst", new GoldCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_GOLD = registerItem("perfect_gold", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item COPPER_CATALYST = registerItem("copper_catalyst", new CopperCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_COPPER = registerItem("perfect_copper", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item DIAMOND_CATALYST = registerItem("diamond_catalyst", new DiamondCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_DIAMOND = registerItem("perfect_diamond", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item EMERALD_CATALYST = registerItem("emerald_catalyst", new EmeraldCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_EMERALD = registerItem("perfect_emerald", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item REDSTONE_CATALYST = registerItem("redstone_catalyst", new RedstoneCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_REDSTONE = registerItem("perfect_redstone", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item LAPIS_CATALYST = registerItem("lapis_catalyst", new LapisCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_LAPIS = registerItem("perfect_lapis", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item NETHERITE_CATALYST = registerItem("netherite_catalyst", new NetheriteCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC).fireproof()));
    public static final Item PERFECT_NETHERITE = registerItem("perfect_netherite", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON).fireproof()));

    public static final Item RELIC_IRON_CATALYST = registerItem("relic_iron_catalyst", new RelicIronCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_RELIC_IRON = registerItem("perfect_relic_iron", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item RELIC_GOLD_CATALYST = registerItem("relic_gold_catalyst", new RelicGoldCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_RELIC_GOLD = registerItem("perfect_relic_gold", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item MITHRIL_CATALYST = registerItem("mithril_catalyst", new MithrilCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_MITHRIL = registerItem("perfect_mithril", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item ORICHALCUM_CATALYST = registerItem("orichalcum_catalyst", new OrichalcumCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_ORICHALCUM = registerItem("perfect_orichalcum", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item ADAMANTINE_CATALYST = registerItem("adamantine_catalyst", new AdamantineCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_ADAMANTINE = registerItem("perfect_adamantine", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item GILDED_STEEL_CATALYST = registerItem("gilded_steel_catalyst", new GildedSteelCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_GILDED_STEEL = registerItem("perfect_gilded_steel", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item MALICHOR_CATALYST = registerItem("malichor_catalyst", new MalichorCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC).fireproof()));
    public static final Item PERFECT_MALICHOR = registerItem("perfect_malichor", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON).fireproof()));

    public static final Item QUARTZ_CATALYST = registerItem("quartz_catalyst", new QuartzCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_QUARTZ = registerItem("perfect_quartz", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item GLOWSTONE_CATALYST = registerItem("glowstone_catalyst", new GlowstoneCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_GLOWSTONE = registerItem("perfect_glowstone", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item AMETHYST_CATALYST = registerItem("amethyst_catalyst", new AmethystCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_AMETHYST = registerItem("perfect_amethyst", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Dust Catalysts & Perfects
    public static final Item FIRE_DUST_CATALYST = registerItem("fire_dust_catalyst", new FireDustCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC).fireproof()));
    public static final Item PERFECT_FIRE_DUST = registerItem("perfect_fire_dust", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON).fireproof()));

    public static final Item AIR_DUST_CATALYST = registerItem("air_dust_catalyst", new AirDustCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_AIR_DUST = registerItem("perfect_air_dust", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item EARTH_DUST_CATALYST = registerItem("earth_dust_catalyst", new EarthDustCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_EARTH_DUST = registerItem("perfect_earth_dust", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item WATER_DUST_CATALYST = registerItem("water_dust_catalyst", new WaterDustCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_WATER_DUST = registerItem("perfect_water_dust", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item LIGHTNING_DUST_CATALYST = registerItem("lightning_dust_catalyst", new LightningDustCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_LIGHTNING_DUST = registerItem("perfect_lightning_dust", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    public static final Item GRAVITY_DUST_CATALYST = registerItem("gravity_dust_catalyst", new GravityDustCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_GRAVITY_DUST = registerItem("perfect_gravity_dust", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Material Catalysts
        // Cobblestone Catalyst
    public static final Item COBBLESTONE_CATALYST = registerItem("cobblestone_catalyst", new CobblestoneCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_COBBLESTONE = registerItem("perfect_cobblestone", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Stone Catalyst - "From the deep"
    public static final Item STONE_CATALYST = registerItem("stone_catalyst", new StoneCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_STONE = registerItem("perfect_stone", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Deepslate Catalyst - "From the deeper"
    public static final Item DEEPSLATE_CATALYST = registerItem("deepslate_catalyst", new DeepslateCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_DEEPSLATE = registerItem("perfect_deepslate", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Netherrack Catalyst - "From the deepest"
    public static final Item NETHERRACK_CATALYST = registerItem("netherrack_catalyst", new NetherrackCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_NETHERRACK = registerItem("perfect_netherrack", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Blackstone Catalyst - "Not politically correct"
    public static final Item BLACKSTONE_CATALYST = registerItem("blackstone_catalyst", new BlackstoneCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_BLACKSTONE = registerItem("perfect_blackstone", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Basalt Catalyst - "Igneous? No, ig-nice-s"
    public static final Item BASALT_CATALYST = registerItem("basalt_catalyst", new BasaltCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_BASALT = registerItem("perfect_basalt", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Calcite Catalyst - "Poor man's marble"
    public static final Item CALCITE_CATALYST = registerItem("calcite_catalyst", new CalciteCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_CALCITE = registerItem("perfect_calcite", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Andesite Catalyst - "Rich man's stone"
    public static final Item ANDESITE_CATALYST = registerItem("andesite_catalyst", new AndesiteCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_ANDESITE = registerItem("perfect_andesite", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Granite Catalyst - "Taking things for granite"
    public static final Item GRANITE_CATALYST = registerItem("granite_catalyst", new GraniteCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_GRANITE = registerItem("perfect_granite", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Diorite Catalyst - "Bird Crapalyst"
    public static final Item DIORITE_CATALYST = registerItem("diorite_catalyst", new DioriteCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_DIORITE = registerItem("perfect_diorite", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Dirt Catalyst - "You've got a jar of dirt!"
    public static final Item DIRT_CATALYST = registerItem("dirt_catalyst", new DirtCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_DIRT = registerItem("perfect_dirt", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Sand Catalyst - "Pocket sand!"
    public static final Item SAND_CATALYST = registerItem("sand_catalyst", new SandCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_SAND = registerItem("perfect_sand", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Gravel Catalyst - "Fancy pebbles"
    public static final Item GRAVEL_CATALYST = registerItem("gravel_catalyst", new GravelCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_GRAVEL = registerItem("perfect_gravel", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Ice Catalyst - ice+packed+blue
    public static final Item ICE_CATALYST = registerItem("ice_catalyst", new IceCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_ICE = registerItem("perfect_ice", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Mud Catalyst - Tough mudder
    public static final Item MUD_CATALYST = registerItem("mud_catalyst", new MudCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_MUD = registerItem("perfect_mud", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Soul Sand Catalyst - Soulthief
    public static final Item SOUL_SAND_CATALYST = registerItem("soul_sand_catalyst", new SoulSandCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_SOUL_SAND = registerItem("perfect_soul_sand", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Clay Catalyst - Primitive technology
    public static final Item CLAY_CATALYST = registerItem("clay_catalyst", new ClayCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_CLAY = registerItem("perfect_clay", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // Obsidian Catalyst - Hardest glass you'll ever see
    public static final Item OBSIDIAN_CATALYST = registerItem("obsidian_catalyst", new ObsidianCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_OBSIDIAN = registerItem("perfect_obsidian", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
        // End Stone Catalyst
    public static final Item END_STONE_CATALYST = registerItem("end_stone_catalyst", new EndStoneCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_END_STONE = registerItem("perfect_end_stone", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Misc Catalysts
        // Artistic Catalyst
    public static final Item ARTISTIC_CATALYST = registerItem("artistic_catalyst", new ArtisticCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));

    public static final Item PERFECT_WHITE_DYE = registerItem("perfect_white_dye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
    public static final Item PERFECT_ORANGE_DYE = registerItem("perfect_orange_dye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
    public static final Item PERFECT_MAGENTA_DYE = registerItem("perfect_magenta_dye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
    public static final Item PERFECT_LIGHT_BLUE_DYE = registerItem("perfect_light_blue_dye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
    public static final Item PERFECT_YELLOW_DYE = registerItem("perfect_yellow_dye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
    public static final Item PERFECT_LIME_DYE = registerItem("perfect_lime_dye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
    public static final Item PERFECT_PINK_DYE = registerItem("perfect_pink_dye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
    public static final Item PERFECT_GRAY_DYE = registerItem("perfect_gray_dye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
    public static final Item PERFECT_LIGHT_GRAY_DYE = registerItem("perfect_light_gray_dye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
    public static final Item PERFECT_CYAN_DYE = registerItem("perfect_cyan_dye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
    public static final Item PERFECT_PURPLE_DYE = registerItem("perfect_purple_dye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
    public static final Item PERFECT_BLUE_DYE = registerItem("perfect_blue_dye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
    public static final Item PERFECT_BROWN_DYE = registerItem("perfect_brown_dye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
    public static final Item PERFECT_GREEN_DYE = registerItem("perfect_green_dye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
    public static final Item PERFECT_RED_DYE = registerItem("perfect_red_dye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
    public static final Item PERFECT_BLACK_DYE = registerItem("perfect_black_dye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));
    // Natural Catalysts
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
    // MORE
    // Wheat
    // Carrots
    // Potato
    // Beetroot
    // Pumpkin
    // Watermelon
    // Sugarcane
    // Cactus
    // Cocoa Beans
    // Chorus Fruit
    // Sweet Berry
    // Mob Catalysts
    // Tier I
    // Cow - "Cow goes moo"
    public static final Item COW_CATALYST = registerItem("cow_catalyst", new CowCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_LEATHER = registerItem("perfect_leather", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Pig - "Mmm... bacon..."
    public static final Item PIG_CATALYST = registerItem("pig_catalyst", new PigCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_PORK = registerItem("perfect_pork", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Sheep - "Counting makes me tired"
    public static final Item SHEEP_CATALYST = registerItem("sheep_catalyst", new SheepCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_WOOL = registerItem("perfect_wool", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Chicken - "Good protein?"
    public static final Item CHICKEN_CATALYST = registerItem("chicken_catalyst", new ChickenCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_EGG = registerItem("perfect_egg", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Rabbit - "The most foul, cruel, and bad-tempered rodent you ever set eyes on"
    public static final Item RABBIT_CATALYST = registerItem("rabbit_catalyst", new RabbitCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_RABBIT_FOOT = registerItem("perfect_rabbit_foot", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Fish - "Something's fishy"
    public static final Item FISH_CATALYST = registerItem("fish_catalyst", new FishCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_FISH = registerItem("perfect_fish", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Bee - "It's not Forestry!"
    public static final Item BEE_CATALYST = registerItem("bee_catalyst", new BeeCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_HONEYCOMB = registerItem("perfect_honeycomb", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Goat - "2014 called"
    public static final Item GOAT_CATALYST = registerItem("goat_catalyst", new GoatCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_HORN = registerItem("perfect_horn", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

        // Tier II
    //Zombie Catalyst - "Mmm... brains..."
        public static final Item ZOMBIE_CATALYST = registerItem("zombie_catalyst", new ZombieCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_ROTTEN_FLESH = registerItem("perfect_rotten_flesh", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Skeleton Catalyst - "Play me like a xylophone"
    public static final Item SKELETON_CATALYST = registerItem("skeleton_catalyst", new SkeletonCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_BONE = registerItem("perfect_bone", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Creeper Catalyst - "On the bright side, they aren't invisible?"
    public static final Item CREEPER_CATALYST = registerItem("creeper_catalyst", new CreeperCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_GUNPOWDER = registerItem("perfect_gunpowder", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Spider Catalyst - "Creepy crawlies"
    public static final Item SPIDER_CATALYST = registerItem("spider_catalyst", new SpiderCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_EYE = registerItem("perfect_eye", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Enderman Catalyst - "Blink and you'll miss it"
    public static final Item ENDERMAN_CATALYST = registerItem("enderman_catalyst", new EndermanCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_PEARL = registerItem("perfect_pearl", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Pillager Catalyst - "Looters beware"
    public static final Item PILLAGER_CATALYST = registerItem("pillager_catalyst", new PillagerCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_TOTEM = registerItem("perfect_totem", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Slime Catalyst - "Bounce. Bounce. Bounce"
    public static final Item SLIME_CATALYST = registerItem("slime_catalyst", new SlimeCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_SLIMEBALL = registerItem("perfect_slimeball", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Blaze Catalyst - "Brewskis inbound"
    public static final Item BLAZE_CATALYST = registerItem("blaze_catalyst", new BlazeCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_ROD = registerItem("perfect_rod", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

        // Tier III
    // Magma Cube Catalyst - "Bounce. Bounce. Bounce. But hotter"
        public static final Item MAGMA_CUBE_CATALYST = registerItem("magma_cube_catalyst", new MagmaCubeCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_CREAM = registerItem("perfect_cream", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Phantom Catalyst - "MAINTAIN A HEALTHY SLEEP CYCLE"
    public static final Item PHANTOM_CATALYST = registerItem("phantom_catalyst", new PhantomCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_MEMBRANE = registerItem("perfect_membrane", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Guardian Catalyst - "It's like a cactus with fins! And a laser eye!"
    public static final Item GUARDIAN_CATALYST = registerItem("guardian_catalyst", new GuardianCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_PRISMARINE = registerItem("perfect_prismarine", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Ghast Catalyst - "Ghussy"
    public static final Item GHAST_CATALYST = registerItem("ghast_catalyst", new GhastCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_TEAR = registerItem("perfect_tear", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Shulker Catalyst - "It's not flying, it's gliding, with style!"
    public static final Item SHULKER_CATALYST = registerItem("shulker_catalyst", new ShulkerCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_SHELL = registerItem("perfect_shell", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Drowned Catalyst - "The deep calls"
    public static final Item DROWNED_CATALYST = registerItem("drowned_catalyst", new DrownedCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_NAUTILUS = registerItem("perfect_nautilus", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Witch Catalyst - "Every tumblr user circa 2013"
    public static final Item WITCH_CATALYST = registerItem("witch_catalyst", new WitchCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_POTION = registerItem("perfect_potion", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Wither Skeleton Catalyst - "Taller than they look"
    public static final Item WITHER_SKELETON_CATALYST = registerItem("wither_skeleton_catalyst", new WitherSkeletonCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_SKULL = registerItem("perfect_skull", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Tier IV
    // Wither - "Three heads does not equal more brains"
    public static final Item WITHER_CATALYST = registerItem("wither_catalyst", new WitherCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_STAR = registerItem("perfect_star", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Ender Dragon - "You killed a lot of mothers. Are you happy?"
    public static final Item ENDER_DRAGON_CATALYST = registerItem("ender_dragon_catalyst", new EnderDragonCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_DRAGON_EGG = registerItem("perfect_dragon_egg", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Warden - "Blind, but definitely not deaf"
    public static final Item WARDEN_CATALYST = registerItem("warden_catalyst", new WardenCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_HEART = registerItem("perfect_heart", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));

    // Elder Guardian - "Spiky fishy"
    public static final Item ELDER_GUARDIAN_CATALYST = registerItem("elder_guardian_catalyst", new ElderGuardianCatalyst(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.EPIC)));
    public static final Item PERFECT_SPONGE = registerItem("perfect_sponge", new PerfectItem(new FabricItemSettings().group(ModItemGroup.TODUST).rarity(Rarity.UNCOMMON)));



    // Music Discs
    public static final Item BLANK_DISC = registerItem("blank_disc", new Item(new FabricItemSettings().group(ModItemGroup.TODUST)));

    public static final Item DISTANCE_DAIZIES_MUSIC_DISC = registerItem("distance_daizies_music_disc", new ModMusicDiscItem(7, ModSounds.DISTANCE_DAIZIES, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));
    public static final Item SERIOUS_MUSIC_DISC = registerItem("serious_music_disc", new ModMusicDiscItem(7, ModSounds.SERIOUS, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));
    public static final Item SIENTELO_MUSIC_DISC = registerItem("sientelo_music_disc", new ModMusicDiscItem(7, ModSounds.SIENTELO, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));
    public static final Item FROM_HERE_MUSIC_DISC = registerItem("from_here_music_disc", new ModMusicDiscItem(7, ModSounds.FROM_HERE, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));
    public static final Item GOLD_DUST_MUSIC_DISC = registerItem("gold_dust_music_disc", new ModMusicDiscItem(7, ModSounds.GOLD_DUST, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));
    public static final Item TOUR_MUSIC_DISC = registerItem("tour_music_disc", new ModMusicDiscItem(7, ModSounds.MACKY_GEE_TOUR, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));
    public static final Item BULLETS_MUSIC_DISC = registerItem("bullets_music_disc", new ModMusicDiscItem(7, ModSounds.BULLETS, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));
    public static final Item BON_VOYAGE_MUSIC_DISC = registerItem("bon_voyage_music_disc", new ModMusicDiscItem(7, ModSounds.BON_VOYAGE, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));
    public static final Item ANVIL_MUSIC_DISC = registerItem("anvil_music_disc", new ModMusicDiscItem(7, ModSounds.ANVIL, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));
    public static final Item HOMETOWN_MUSIC_DISC = registerItem("hometown_music_disc", new ModMusicDiscItem(7, ModSounds.HOMETOWN, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));
    public static final Item OVERTHINKER_MUSIC_DISC = registerItem("overthinker_music_disc", new ModMusicDiscItem(7, ModSounds.OVERTHINKER, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));
    public static final Item DEFERENCE_MUSIC_DISC = registerItem("deference_music_disc", new ModMusicDiscItem(7, ModSounds.DEFERENCE, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));
    public static final Item HEART_MUSIC_DISC = registerItem("heart_music_disc", new ModMusicDiscItem(7, ModSounds.HEART, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));
    public static final Item GUNGNIR_MUSIC_DISC = registerItem("gungnir_music_disc", new ModMusicDiscItem(7, ModSounds.GUNGNIR, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));
    public static final Item BFG_DIVISION_MUSIC_DISC = registerItem("bfg_division_music_disc", new ModMusicDiscItem(7, ModSounds.BFG_DIVISION, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));
    public static final Item DISTANCE_BUUNSHIN_MUSIC_DISC = registerItem("distance_buunshin_music_disc", new ModMusicDiscItem(7, ModSounds.DISTANCE_BUUNSHIN, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));
    public static final Item NEVER_MEANT_MUSIC_DISC = registerItem("never_meant_music_disc", new ModMusicDiscItem(7, ModSounds.NEVER_MEANT, new FabricItemSettings().group(ModItemGroup.TODUST).maxCount(1).rarity(Rarity.RARE)));



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

    public static void registerDustItems() {
        registerBeta("fire_dust_block", FIRE_DUST_BLOCK);
        registerBeta("budding_fire_dust", BUDDING_FIRE_DUST);
        registerBeta("small_fire_dust_bud", SMALL_FIRE_DUST_BUD);
        registerBeta("medium_fire_dust_bud", MEDIUM_FIRE_DUST_BUD);
        registerBeta("large_fire_dust_bud", LARGE_FIRE_DUST_BUD);
        registerBeta("fire_dust_cluster", FIRE_DUST_CLUSTER);

        registerBeta("air_dust_block", AIR_DUST_BLOCK);
        registerBeta("budding_air_dust", BUDDING_AIR_DUST);
        registerBeta("small_air_dust_bud", SMALL_AIR_DUST_BUD);
        registerBeta("medium_air_dust_bud", MEDIUM_AIR_DUST_BUD);
        registerBeta("large_air_dust_bud", LARGE_AIR_DUST_BUD);
        registerBeta("air_dust_cluster", AIR_DUST_CLUSTER);

        registerBeta("earth_dust_block", EARTH_DUST_BLOCK);
        registerBeta("budding_earth_dust", BUDDING_EARTH_DUST);
        registerBeta("small_earth_dust_bud", SMALL_EARTH_DUST_BUD);
        registerBeta("medium_earth_dust_bud", MEDIUM_EARTH_DUST_BUD);
        registerBeta("large_earth_dust_bud", LARGE_EARTH_DUST_BUD);
        registerBeta("earth_dust_cluster", EARTH_DUST_CLUSTER);

        registerBeta("water_dust_block", WATER_DUST_BLOCK);
        registerBeta("budding_water_dust", BUDDING_WATER_DUST);
        registerBeta("small_water_dust_bud", SMALL_WATER_DUST_BUD);
        registerBeta("medium_water_dust_bud", MEDIUM_WATER_DUST_BUD);
        registerBeta("large_water_dust_bud", LARGE_WATER_DUST_BUD);
        registerBeta("water_dust_cluster", WATER_DUST_CLUSTER);

        registerBeta("lightning_dust_block", LIGHTNING_DUST_BLOCK);
        registerBeta("budding_lightning_dust", BUDDING_LIGHTNING_DUST);
        registerBeta("small_lightning_dust_bud", SMALL_LIGHTNING_DUST_BUD);
        registerBeta("medium_lightning_dust_bud", MEDIUM_LIGHTNING_DUST_BUD);
        registerBeta("large_lightning_dust_bud", LARGE_LIGHTNING_DUST_BUD);
        registerBeta("lightning_dust_cluster", LIGHTNING_DUST_CLUSTER);

        registerBeta("gravity_dust_block", GRAVITY_DUST_BLOCK);
        registerBeta("budding_gravity_dust", BUDDING_GRAVITY_DUST);
        registerBeta("small_gravity_dust_bud", SMALL_GRAVITY_DUST_BUD);
        registerBeta("medium_gravity_dust_bud", MEDIUM_GRAVITY_DUST_BUD);
        registerBeta("large_gravity_dust_bud", LARGE_GRAVITY_DUST_BUD);
        registerBeta("gravity_dust_cluster", GRAVITY_DUST_CLUSTER);
    }

    public static void registerBeta(String name, Item item) {
        Registry.register(Registry.ITEM, new Identifier(ToDust.MOD_ID, name), item);
    }

    public static void registerModItems() {
        ToDust.LOGGER.debug("Registering Mod Items for " + ToDust.MOD_ID);
    }
}
