package cn.ksmcbrigade.notext.mixin;

import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.Style;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

import javax.annotation.Nullable;
import java.util.List;

@Mixin(Component.class)
public interface TextMixin {

    /**
     * @author KSmc_brigade
     * @reason empty
     */
    @Overwrite
    static Component nullToEmpty(@Nullable String p_130675_) {
        return Component.empty();
    }

    /**
     * @author KSmc_brigade
     * @reason empty
     */
    @Overwrite
    default List<Component> toFlatList() {
        return List.of();
    }

    /**
     * @author KSmc_brigade
     * @reason empty
     */
    @Overwrite
    default List<Component> toFlatList(Style style) {
        return List.of();
    }
}
