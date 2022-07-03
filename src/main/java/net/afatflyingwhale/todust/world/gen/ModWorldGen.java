package net.afatflyingwhale.todust.world.gen;

public class ModWorldGen {
    public static void generateModWorldGen() {
        //RAW_GENERATION
        //LAKES
        //LOCAL_MODIFICATIONS
        //UNDERGROUND_STRUCTURES
        //SURFACE_STRUCTURES
        //STRONGHOLDS
        ModOreGeneration.generateOres();
        //UNDERGROUND_DECORATION
        //FLUID_SPRINGS
        ModTreeGeneration.generateTrees();
        //TOP_LAYER_MODIFICATION
    }
}
