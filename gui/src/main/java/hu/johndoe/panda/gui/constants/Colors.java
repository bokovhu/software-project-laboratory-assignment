package hu.johndoe.panda.gui.constants;

import hu.johndoe.panda.gui.util.ColorUtil;

import java.awt.*;

public final class Colors {

    private Colors () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

    public static final Color MenuBackground = ColorUtil.hex ("95e653");

}
