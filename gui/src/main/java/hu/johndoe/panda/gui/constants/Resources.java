package hu.johndoe.panda.gui.constants;

import hu.johndoe.panda.gui.util.LogUtil;

import javax.swing.*;
import java.awt.*;

public final class Resources {

    private static final String LOGTAG = "Game Resources";

    private static final Resources INSTANCE = new Resources ();

    private ImageIcon pandaTexture;
    private ImageIcon orangutanTexture;
    private ImageIcon wardrobeTexture;
    private ImageIcon favicon;

    private Font gameFont;
    private Font gameFont12, gameFont18, gameFont32, gameFont48, gameFont64, gameFont96;

    private Resources () {

    }

    public static void init () {

        LogUtil.log (LOGTAG, "Initializing");
        try {

            INSTANCE.load ();
            LogUtil.log (LOGTAG, "Done loading game resources");

        } catch (Exception e) {

            LogUtil.log (LOGTAG, "Failed to load game resources!");
            throw new RuntimeException (e);

        }

    }

    public static ImageIcon PandaTexture () {
        return INSTANCE.pandaTexture;
    }

    public static ImageIcon OrangutanTexture () {
        return INSTANCE.orangutanTexture;
    }

    public static ImageIcon WardrobeTexture () {
        return INSTANCE.wardrobeTexture;
    }

    public static ImageIcon Favicon () {
        return INSTANCE.favicon;
    }

    public static Font GameFont () {
        return INSTANCE.gameFont;
    }

    public static Font GameFont12 () {
        return INSTANCE.gameFont12;
    }

    public static Font GameFont18 () {
        return INSTANCE.gameFont18;
    }

    public static Font GameFont32 () {
        return INSTANCE.gameFont32;
    }

    public static Font GameFont48 () {
        return INSTANCE.gameFont48;
    }

    public static Font GameFont64 () {
        return INSTANCE.gameFont64;
    }

    public static Font GameFont96 () {
        return INSTANCE.gameFont96;
    }

    private void load () throws Exception {

        pandaTexture = new ImageIcon (Resources.class.getClassLoader ().getResource ("textures/panda.png"));
        orangutanTexture = new ImageIcon (Resources.class.getClassLoader ().getResource ("textures/orangutan.png"));
        wardrobeTexture = new ImageIcon (Resources.class.getClassLoader ().getResource ("textures/wardrobe.png"));
        favicon = pandaTexture;


        gameFont = Font.createFont (
                Font.TRUETYPE_FONT,
                Resources.class.getClassLoader ().getResourceAsStream ("fonts/dpcomic.ttf")
        );
        gameFont12 = gameFont.deriveFont (12f);
        gameFont18 = gameFont.deriveFont (18f);
        gameFont32 = gameFont.deriveFont (32f);
        gameFont48 = gameFont.deriveFont (48f);
        gameFont64 = gameFont.deriveFont (64f);
        gameFont96 = gameFont.deriveFont (96f);

    }

}
