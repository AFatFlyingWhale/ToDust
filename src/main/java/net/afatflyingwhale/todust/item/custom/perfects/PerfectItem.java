package net.afatflyingwhale.todust.item.custom.perfects;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import net.minecraft.text.Text;

import javax.annotation.Nullable;
import java.util.List;

public class PerfectItem extends Item {
    public PerfectItem(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("Perfected").formatted(Formatting.GREEN));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
