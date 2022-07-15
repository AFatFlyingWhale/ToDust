package net.afatflyingwhale.todust.item.custom.catalysts.natural_catalysts;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class RedHeartnutCatalyst extends Item {

    public RedHeartnutCatalyst(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("The sap is a delicacy").formatted(Formatting.GREEN));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
