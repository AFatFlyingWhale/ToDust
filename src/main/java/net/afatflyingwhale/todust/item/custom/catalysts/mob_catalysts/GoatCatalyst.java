package net.afatflyingwhale.todust.item.custom.catalysts.mob_catalysts;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class GoatCatalyst extends Item {

    public GoatCatalyst(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("2014 called").formatted(Formatting.GREEN));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
