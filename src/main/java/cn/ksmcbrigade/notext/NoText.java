package cn.ksmcbrigade.notext;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod(NoText.MODID)
public class NoText {

    public static final String MODID = "notext";

    public NoText() {
        MinecraftForge.EVENT_BUS.register(this);
    }
}
