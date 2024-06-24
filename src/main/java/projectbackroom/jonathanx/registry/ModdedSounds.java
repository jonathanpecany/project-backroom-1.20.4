package projectbackroom.jonathanx.registry;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import projectbackroom.jonathanx.ProjectBackroom;

public class ModdedSounds {
    public static final SoundEvent SOGGY_STEPS = registerSound("soggy_steps");
    public static final SoundEvent BUZZING_LIGHTS = registerSound("buzzing_lights");
    public static final SoundEvent LEVEL0_AMBIENCE = registerSound("level0_ambience");

    public static SoundEvent registerSound(String name){
        Identifier ID = ProjectBackroom.id(name);
        return Registry.register(Registries.SOUND_EVENT, ID, SoundEvent.of(ID));
    }

    public static void registerModdedSounds(){
        ProjectBackroom.displayRegisteredSectors(ModdedSounds.class);
    }
}