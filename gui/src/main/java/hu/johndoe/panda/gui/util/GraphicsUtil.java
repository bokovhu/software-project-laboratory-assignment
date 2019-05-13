package hu.johndoe.panda.gui.util;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Errors;
import hu.johndoe.panda.gui.constants.Sizes;

import java.awt.*;

public final class GraphicsUtil {

    private GraphicsUtil () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

    public static void textWithShadow (
            String text,
            float x, float y,
            Font font, Graphics2D g
    ) {

        g.setFont (font);

        g.setColor (Colors.Shadow);
        g.drawString (text, x + Sizes.ShadowOffset, y + Sizes.ShadowOffset);

        g.setColor (Colors.TextLight);
        g.drawString (text, x, y);

    }

}
