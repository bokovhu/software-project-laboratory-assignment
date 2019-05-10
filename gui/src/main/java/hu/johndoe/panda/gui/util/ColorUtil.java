package hu.johndoe.panda.gui.util;

import hu.johndoe.panda.gui.constants.Errors;

import java.awt.*;
import java.util.regex.Pattern;

public final class ColorUtil {

    private static final Pattern HEX_PATTERN = Pattern.compile ("(?:[0-9a-fA-F]{6})|(?:[0-9a-fA-F]{8})");


    private ColorUtil () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

    public static Color hex (String hex) {

        if (hex == null || hex.isEmpty ()) {
            throw new IllegalArgumentException (Errors.PandaGui_ColorUtil_HexNull ());
        }

        if (!HEX_PATTERN.matcher (hex).matches ()) {
            throw new IllegalArgumentException (Errors.PandaGui_ColorUtil_HexInvalidFormat ());
        }

        int [] values = new int[] { 0, 0, 0, 255 };

        for (int i = 0; i < hex.length (); i += 2) {

            values [i / 2] = Integer.parseInt (hex.substring (i, i + 2), 16);

        }

        return new Color (values [0], values [1], values [2], values [3]);

    }

}
