package cn.ksmcbrigade.notext.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Minecraft.class)
public class MinecraftMixin {
    @Inject(method = "createTitle",at = @At("HEAD"), cancellable = true)
    public void title(CallbackInfoReturnable<String> cir){
        cir.setReturnValue("");
    }
}
