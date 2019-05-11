package hu.johndoe.panda.gui.swing.view.menu;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Sizes;
import hu.johndoe.panda.gui.model.Drawable;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class TitleRenderer implements Drawable {

    private final String mainTitle, subTitle;
    private float centerX, centerY;
    private Rectangle2D mainTitleTextBounds, subTitleTextBounds;

    private float timer = 0f;

    public TitleRenderer (String mainTitle, String subTitle) {
        this.mainTitle = mainTitle;
        this.subTitle = subTitle;
    }

    @Override
    public void draw (Graphics2D g, float delta) {

        timer += delta;

        if (mainTitleTextBounds == null) {
            mainTitleTextBounds = Resources.GameFont96 ()
                    .getStringBounds (mainTitle, g.getFontRenderContext ());
        }

        if (subTitleTextBounds == null) {
            subTitleTextBounds = Resources.GameFont64 ()
                    .getStringBounds (subTitle, g.getFontRenderContext ());
        }

        final float yOffset =  (float) Math.sin (timer * 2.0f) * 12f;

        g.setFont (Resources.GameFont96 ());

        // Shadow
        g.setColor (Colors.Shadow);
        g.drawString (
                mainTitle,
                centerX - (float) mainTitleTextBounds.getWidth () / 2f + Sizes.ShadowOffset,
                centerY + Sizes.ShadowOffset + yOffset
        );

        // Text
        g.setColor (Colors.TextLight);

        g.drawString (
                mainTitle,
                centerX - (float) mainTitleTextBounds.getWidth () / 2f,
                centerY + yOffset
        );

        // Draw sub title //
        g.setFont (Resources.GameFont64 ());

        // Shadow
        g.setColor (Colors.Shadow);
        g.drawString (
                subTitle,
                centerX - (float) subTitleTextBounds.getWidth () / 2f + Sizes.ShadowOffset,
                centerY + 64f + yOffset + Sizes.ShadowOffset
        );

        g.setColor (Colors.TextDark);
        g.drawString (
                subTitle,
                centerX - (float) subTitleTextBounds.getWidth () / 2f,
                centerY + 64f + yOffset
        );

    }

    public float getCenterX () {
        return centerX;
    }

    public void setCenterX (float centerX) {
        this.centerX = centerX;
    }

    public float getCenterY () {
        return centerY;
    }

    public void setCenterY (float centerY) {
        this.centerY = centerY;
    }

}
