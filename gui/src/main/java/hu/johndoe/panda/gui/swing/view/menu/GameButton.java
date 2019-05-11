package hu.johndoe.panda.gui.swing.view.menu;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Sizes;
import hu.johndoe.panda.gui.model.Drawable;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public final class GameButton implements Drawable {

    private final String text;
    private final Color backgroundColor;
    private float x, y;

    private Rectangle2D textBounds;

    private Runnable onClickRunnable = () -> {
    };

    public GameButton (String text, Color backgroundColor, float x, float y) {
        this.text = text;
        this.backgroundColor = backgroundColor;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw (Graphics2D g, float delta) {

        if (textBounds == null) {
            textBounds = Resources.GameFont64 ()
                    .getStringBounds (
                            text,
                            g.getFontRenderContext ()
                    );
        }

        // Button background //

        // Draw button background shadow
        g.setColor (Colors.Shadow);
        g.fillRect (
                (int) (x + Sizes.ShadowOffset), (int) (y + Sizes.ShadowOffset),
                (int) Sizes.ButtonWidth, (int) Sizes.ButtonHeight
        );

        // Draw button background
        g.setColor (backgroundColor);
        g.fillRect (
                (int) x, (int) y,
                (int) Sizes.ButtonWidth, (int) Sizes.ButtonHeight
        );

        // Button text //

        final float centerX = x + Sizes.ButtonWidth / 2f;
        final float centerY = y + Sizes.ButtonHeight / 2f;

        // Draw button text shadow
        g.setColor (Colors.Shadow);
        g.drawString (
                text,
                centerX - (float) textBounds.getWidth () / 2f + Sizes.ShadowOffset,
                centerY + (float) textBounds.getHeight () / 2f + Sizes.ShadowOffset + Sizes.ButtonTextYOffset
        );

        // Draw actual text
        g.setColor (Colors.TextLight);
        g.drawString (
                text,
                centerX - (float) textBounds.getWidth () / 2f,
                centerY + (float) textBounds.getHeight () / 2f + Sizes.ButtonTextYOffset
        );

    }

    public GameButton onClick (Runnable onClickRunnable) {
        this.onClickRunnable = onClickRunnable;
        return this;
    }

    public void handleMouseRelease (float x, float y) {

        if (x >= this.x && x <= this.x + Sizes.ButtonWidth
                && y >= this.y && y <= this.y + Sizes.ButtonHeight) {

            this.onClickRunnable.run ();

        }

    }

    public float getX () {
        return x;
    }

    public void setX (float x) {
        this.x = x;
    }

    public float getY () {
        return y;
    }

    public void setY (float y) {
        this.y = y;
    }

}
