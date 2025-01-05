package net.scorchedduck.infernia.sound;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.util.DeferredSoundType;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.scorchedduck.infernia.Infernia;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(BuiltInRegistries.SOUND_EVENT, Infernia.MOD_ID);

    public static final Supplier<SoundEvent> CHSIEL_USE = registerSoundEvent("chisel_use");

    public static final Supplier<SoundEvent> COOKER_BLOCK_BREAK = registerSoundEvent("cooker_block_break");
    public static final Supplier<SoundEvent> COOKER_BLOCK_STEP = registerSoundEvent("cooker_block_step");
    public static final Supplier<SoundEvent> COOKER_BLOCK_PLACE = registerSoundEvent("cooker_block_place");
    public static final Supplier<SoundEvent> COOKER_BLOCK_HIT = registerSoundEvent("cooker_block_hit");
    public static final Supplier<SoundEvent> COOKER_BLOCK_FALL = registerSoundEvent("cooker_block_fall");

    public static final DeferredSoundType COOKER_BLOCK_SOUNDS = new DeferredSoundType(1f,1f,
            ModSounds.COOKER_BLOCK_BREAK, ModSounds.COOKER_BLOCK_STEP, ModSounds.COOKER_BLOCK_PLACE,
            ModSounds.COOKER_BLOCK_HIT, ModSounds.COOKER_BLOCK_FALL);


    private static Supplier<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = ResourceLocation.fromNamespaceAndPath(Infernia.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> SoundEvent.createVariableRangeEvent(id));
    }


    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
