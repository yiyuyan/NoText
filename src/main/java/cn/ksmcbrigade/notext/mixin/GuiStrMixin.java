package cn.ksmcbrigade.notext.mixin;

import net.minecraft.client.gui.GuiGraphics;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

import javax.annotation.Nullable;

@Mixin(GuiGraphics.class)
public class GuiStrMixin {
    @ModifyVariable(remap = false,method = "drawString(Lnet/minecraft/client/gui/Font;Ljava/lang/String;FFIZ)I", at = @At(value = "HEAD",ordinal = 0),argsOnly = true)
    public @Nullable String draw(String value){
        return "";
    }
}
