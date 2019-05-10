package hu.johndoe.panda.gui.constants;

import hu.johndoe.panda.gui.util.ColorUtil;

import java.awt.*;

public final class Colors {

    public static final Color MenuBackground = ColorUtil.hex ("95e653");
    public static final Color TextLight = ColorUtil.hex ("ffffff");
    public static final Color TextLightShadow = ColorUtil.hex ("121212");
    private Colors () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

}
