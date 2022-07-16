package net.afatflyingwhale.todust.item.custom.tooltypes.axe_effect_types;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

public class ModHungerAxeItem extends AxeItem {
    public ModHungerAxeItem(ToolMaterial toolMaterial, float attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        target.addStatusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 200, 1), attacker);
        return super.postHit(stack, target, attacker);
    }

    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        tooltip.add(Text.translatable("Insatiable").formatted(Formatting.RED));
        super.appendTooltip(stack, world, tooltip, context);
    }
}
