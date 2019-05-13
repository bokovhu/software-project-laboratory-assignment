package hu.johndoe.panda.gui.swing.view.menu;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Sizes;
import hu.johndoe.panda.gui.model.Drawable;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public final class GameButton implements Drawable {

    private final String text;
    private final Font font;
    private final Color backgroundColor;
    private float x, y;
    private float width, height, textYOffset;

    private Rectangle2D textBounds;

    private Runnable onClickRunnable = () -> {
    };

    private GameButton (
            String text, Font font,
            Color backgroundColor,
            float x, float y,
            float width, float height, float textYOffset
    ) {
        this.text = text;
        this.backgroundColor = backgroundColor;
        this.x = x;
        this.y = y;
        this.font = font;
        this.width = width;
        this.height = height;
        this.textYOffset = textYOffset;
    }

    public static GameButton bigButton (String text, Color backgroundColor, float x, float y) {
        return new GameButton (
                text, Resources.GameFont64 (),
                backgroundColor,
                x, y,
                Sizes.ButtonWidth, Sizes.ButtonHeight, Sizes.ButtonTextYOffset
        );
    }

    public static GameButton smallButton (String text, Color backgroundColor, float x, float y) {
        return new GameButton (
                text, Resources.GameFont18 (),
                backgroundColor,
                x, y,
                Sizes.SmallButtonWidth, Sizes.SmallButtonHeight, Sizes.SmallButtonTextYOffset
        );
    }

    @Override
    public void draw (Graphics2D g, float delta) {

        if (textBounds == null) {
            textBounds = font
                    .getStringBounds (
                            text,
                            g.getFontRenderContext ()
                    );
        }

        // Button background //

        // Draw button background shadow
        g.setColor (Colors.Shadow);
        g.fillRoundRect (
                (int) (x + Sizes.ShadowOffset), (int) (y + Sizes.ShadowOffset),
                (int) width, (int) height,
                6, 6
        );

        // Draw button background
        g.setColor (backgroundColor);
        g.fillRoundRect (
                (int) x, (int) y,
                (int) width, (int) height,
                6, 6
        );

        // Button text //

        final float centerX = x + width / 2f;
        final float centerY = y + height / 2f;
        g.setFont (font);

        // Draw button text shadow
        g.setColor (Colors.Shadow);
        g.drawString (
                text,
                centerX - (float) textBounds.getWidth () / 2f + Sizes.ShadowOffset,
                centerY + (float) textBounds.getHeight () / 2f + Sizes.ShadowOffset + textYOffset
        );

        // Draw actual text
        g.setColor (Colors.TextLight);
        g.drawString (
                text,
                centerX - (float) textBounds.getWidth () / 2f,
                centerY + (float) textBounds.getHeight () / 2f + textYOffset
        );

    }

    public GameButton onClick (Runnable onClickRunnable) {
        this.onClickRunnable = onClickRunnable;
        return this;
    }

    public void handleMouseRelease (float x, float y) {

        if (x >= this.x && x <= this.x + width
                && y >= this.y && y <= this.y + height) {

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
