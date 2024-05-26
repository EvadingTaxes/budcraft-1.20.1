package net.evadingtaxes.budcraft.sound;

import net.evadingtaxes.budcraft.BudCraft;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {
    public static final SoundEvent SMOKING_JOINT = registerSoundEvent("smoking_joint");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier identifier = new Identifier(BudCraft.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }

    public static void registerSounds() {
        BudCraft.LOGGER.info("Registering Mod Sounds for " + BudCraft.MOD_ID);
    }
}