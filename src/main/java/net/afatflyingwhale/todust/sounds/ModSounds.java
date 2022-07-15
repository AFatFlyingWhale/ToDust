package net.afatflyingwhale.todust.sounds;

import net.afatflyingwhale.todust.ToDust;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {

    public static SoundEvent DISTANCE_DAIZIES = registerSoundEvent("distance_daizies");
    public static SoundEvent SERIOUS = registerSoundEvent("serious");
    public static SoundEvent SIENTELO = registerSoundEvent("sientelo");
    public static SoundEvent FROM_HERE = registerSoundEvent("from_here");
    public static SoundEvent GOLD_DUST = registerSoundEvent("gold_dust");
    public static SoundEvent MACKY_GEE_TOUR = registerSoundEvent("macky_gee_tour");
    public static SoundEvent BULLETS = registerSoundEvent("bullets");
    public static SoundEvent BON_VOYAGE = registerSoundEvent("bon_voyage");
    public static SoundEvent ANVIL = registerSoundEvent("anvil");
    public static SoundEvent HOMETOWN = registerSoundEvent("hometown");
    public static SoundEvent OVERTHINKER = registerSoundEvent("overthinker");
    public static SoundEvent DEFERENCE = registerSoundEvent("deference");
    public static SoundEvent HEART = registerSoundEvent("heart");
    public static SoundEvent GUNGNIR = registerSoundEvent("gungnir");
    public static SoundEvent BFG_DIVISION = registerSoundEvent("bfg_division");
    public static SoundEvent DISTANCE_BUUNSHIN = registerSoundEvent("distance_buunshin");
    public static SoundEvent NEVER_MEANT = registerSoundEvent("never_meant");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(ToDust.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

}
