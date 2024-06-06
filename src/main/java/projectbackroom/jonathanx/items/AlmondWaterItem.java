package projectbackroom.jonathanx.items;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import projectbackroom.jonathanx.entity.effect.ModdedStatusEffects;

public class AlmondWaterItem extends Item {
    public AlmondWaterItem(Settings settings) {
        super(settings);
    }

    @Override
    public ItemStack finishUsing(ItemStack stack, World world, LivingEntity user) {
        if (user.hasStatusEffect(ModdedStatusEffects.INSANITY)){
            user.removeStatusEffect(ModdedStatusEffects.INSANITY);
        }
        return super.finishUsing(stack, world, user);
    }
}