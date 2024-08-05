package cn.ksmcbrigade.notext.mixin;

import net.minecraft.network.chat.ComponentContents;
import net.minecraft.network.chat.MutableComponent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MutableComponent.class)
public abstract class MutableTextMixin {
    @Shadow
    public static MutableComponent create(ComponentContents p_237205_) {
        return null;
    }

    @Inject(method = "create",at = @At("HEAD"),cancellable = true)
    private static void nullTo(ComponentContents p_237205_, CallbackInfoReturnable<MutableComponent> cir){
        if(p_237205_!=ComponentContents.EMPTY){
            cir.setReturnValue(create(ComponentContents.EMPTY));
        }
    }

    @Inject(method = "getContents",at = @At("HEAD"),cancellable = true)
    private void contents(CallbackInfoReturnable<ComponentContents> cir){
        cir.setReturnValue(ComponentContents.EMPTY);
    }

    @Inject(method = "toString",at = @At("HEAD"),cancellable = true)
    public void str(CallbackInfoReturnable<String> cir){
        cir.setReturnValue("");
    }
}
