package net.afatflyingwhale.todust.item;

import net.afatflyingwhale.todust.ToDust;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup TODUST = FabricItemGroupBuilder.build(
            new Identifier(ToDust.MOD_ID, "todust"), () -> new ItemStack(ModItems.FIRE_DUST_CRYSTAL));
}
