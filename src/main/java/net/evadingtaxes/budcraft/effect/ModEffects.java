package net.evadingtaxes.budcraft.effect;

import net.evadingtaxes.budcraft.BudCraft;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModEffects {
    public static final StatusEffect STONED = registerStatusEffect("stoned",
            new StonedEffect(StatusEffectCategory.NEUTRAL, 295911));


    private static StatusEffect registerStatusEffect(String name, StatusEffect statusEffect) {
        return Registry.register(Registries.STATUS_EFFECT, new Identifier(BudCraft.MOD_ID, name), statusEffect);
    }

    public static void registerEffects() {
        BudCraft.LOGGER.info("Registering Mod Effects for " + BudCraft.MOD_ID);
    }
}