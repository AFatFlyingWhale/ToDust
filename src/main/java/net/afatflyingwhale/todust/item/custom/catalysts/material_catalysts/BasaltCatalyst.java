package net.afatflyingwhale.todust.item.custom.catalysts.material_catalysts;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BasaltCatalyst extends Item {

    public BasaltCatalyst(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("Igneous? No, ig-nice-s").formatted(Formatting.GREEN));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
