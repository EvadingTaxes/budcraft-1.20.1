package net.evadingtaxes.budcraft.item.custom;

import net.evadingtaxes.budcraft.effect.ModEffects;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public class JointItem extends Item {

    // Cooldown in ticks (20 ticks = 1 second)
    private static final int USE_COOLDOWN = 300; // 15 seconds cooldown

    public JointItem(Settings settings) {
        super(settings);
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        // Check if the item is on cooldown
        if (user.getItemCooldownManager().isCoolingDown(this)) {
            return TypedActionResult.fail(user.getStackInHand(hand));
        }

        ItemStack offhandStack = user.getOffHandStack();

        // Check if the player is holding a flint and steel in the offhand
        if (offhandStack.getItem() instanceof net.minecraft.item.FlintAndSteelItem) {
            user.playSound(SoundEvents.ENTITY_CREEPER_PRIMED, 0.1f, 2.0f); // Example sound, adjust volume and pitch as needed

            // Apply the status effect
            StatusEffectInstance effect = new StatusEffectInstance(ModEffects.STONED, 600, 0); // Apply speed effect for 30 seconds with level 1
            user.addStatusEffect(effect);

            // Start cooldown
            user.getItemCooldownManager().set(this, USE_COOLDOWN);

            // Consume the joint item
            ItemStack stack = user.getStackInHand(hand);
            stack.decrement(1);

            return TypedActionResult.success(stack);
        }

        return TypedActionResult.fail(user.getStackInHand(hand));
    }
}