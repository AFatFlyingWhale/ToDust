package net.afatflyingwhale.todust.tags;

import net.afatflyingwhale.todust.ToDust;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;

public class ModBiomeTags {

    public static final TagKey<Biome> HAS_FIRE_GEODE = of("has_fire_geode");
    public static final TagKey<Biome> HAS_AIR_GEODE = of("has_air_geode");
    public static final TagKey<Biome> HAS_EARTH_GEODE = of("has_earth_geode");
    public static final TagKey<Biome> HAS_WATER_GEODE = of("has_water_geode");
    public static final TagKey<Biome> HAS_LIGHTNING_GEODE = of("has_lightning_geode");
    public static final TagKey<Biome> HAS_GRAVITY_GEODE = of("has_gravity_geode");


    private static TagKey<Biome> of(String id) {
        return TagKey.of(Registry.BIOME_KEY, new Identifier(ToDust.MOD_ID, id));
    }
}
