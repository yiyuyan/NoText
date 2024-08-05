package cn.ksmcbrigade.notext.mixin;

import net.minecraft.client.gui.components.SplashRenderer;
import net.minecraft.client.resources.SplashManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SplashManager.class)
public class SplashManagerMixin {
    @Inject(method = "getSplash",at = @At("HEAD"),cancellable = true)
    public void splash(CallbackInfoReturnable<SplashRenderer> cir){
        cir.setReturnValue(null);
        cir.cancel();
    }
}
