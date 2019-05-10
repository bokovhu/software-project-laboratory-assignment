package hu.johndoe.panda.gui.constants;

import hu.johndoe.panda.gui.util.ColorUtil;

import java.awt.*;

public final class Colors {

    public static final Color MenuBackground = ColorUtil.hex ("95e653");
    public static final Color Shadow = ColorUtil.hex ("121212");
    public static final Color TextLight = ColorUtil.hex ("ffffff");
    public static final Color TextDark = ColorUtil.hex ("dedede");
    public static final Color BlueButtonBackground = ColorUtil.hex ("67c9cd");
    public static final Color RedButtonBackground = ColorUtil.hex ("cd7367");
    public static final Color Tile = ColorUtil.hex ("000000");
    public static final Color TileEntrance = ColorUtil.hex ("1a5c00");
    public static final Color TileExit = ColorUtil.hex ("840000");

    private Colors () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

}
