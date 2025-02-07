package com.teamremastered.endrem.mixin;

import com.teamremastered.endrem.config.ERConfig;
import com.teamremastered.endrem.registers.ERItems;
import com.teamremastered.endrem.utils.CrypticEyeDistribution;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.EnchantmentMenu;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Random;

@SuppressWarnings("unused")
@Mixin(EnchantmentMenu.class)
public class PlayerEnchantMixin {

    @Inject(method = "clickMenuButton", at = @At(value = "RETURN", ordinal = 2))
    private void isEnchanting(final Player player, final int id, final CallbackInfoReturnable<Boolean> info) {
        CrypticEyeDistribution.rollForCrypticEye(player);
    }
}
