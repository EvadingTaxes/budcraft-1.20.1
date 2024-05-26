package net.evadingtaxes.budcraft.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.player.PlayerEntity;

public class StonedEffect extends StatusEffect {
    protected StonedEffect(StatusEffectCategory category, int color) {
        super(category, color);
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entity;

            // Apply regeneration every 90 ticks (5 seconds)
            if (player.age % 90 == 0) {
                if (!player.getWorld().isClient) {
                    player.heal(0.5F);
                }
            }

            // Take hunger every 10 ticks (1 second)
            if (player.age % 10 == 0 && player.getHungerManager().getFoodLevel() > 0) {
                if (!player.getWorld().isClient) {
                    player.getHungerManager().addExhaustion(0.5F); // Adjust exhaustion as needed
                }
            }
        }
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // Make sure the effect persists
        return duration < 300;
    }
}