package artifacts.common.util;

import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.EntityDamageSource;
import net.minecraft.world.damagesource.IndirectEntityDamageSource;
import net.minecraft.world.entity.LivingEntity;

import javax.annotation.Nullable;

public class DamageSourceHelper {

    @Nullable
    public static LivingEntity getAttacker(DamageSource source) {
        if (source.getEntity() instanceof LivingEntity entity) {
            return entity;
        }
        return null;
    }

    public static boolean isMeleeAttack(DamageSource source) {
        return source instanceof EntityDamageSource entitySource
                && !(source instanceof IndirectEntityDamageSource)
                && !entitySource.isThorns();
    }
}
