package net.afatflyingwhale.todust.item.custom.catalysts.resource_catalysts;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RedstoneCatalyst extends Item {

    public RedstoneCatalyst(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("Blink and it'll invent teleportation").formatted(Formatting.LIGHT_PURPLE));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
