package hu.johndoe.panda.gui.swing.view;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.swing.GamePanel;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.geom.Rectangle2D;

public class MainMenuView extends ViewBase {

    private static final String MAIN_TITLE = "Panda Plaza!";

    public MainMenuView (GamePanel gamePanel) {
        super (gamePanel);
    }

    @Override
    public void onEnter () {

    }

    @Override
    public void onExit () {

    }

    private void drawMainMenuText (Graphics2D g, float delta) {

        g.setFont (Resources.GameFont96 ());
        Rectangle2D mainTitleTextBounds = Resources.GameFont96 ()
                .getStringBounds (MAIN_TITLE, g.getFontRenderContext ());

        float mainTitleY = 96f + (float) Math.sin (getScreenTime () * 2.0f) * 12f;
        float mainTitleX = getWidth () / 2f - (float) mainTitleTextBounds.getWidth () / 2f;

        // Draw main title //

        // Shadow
        g.setColor (Colors.TextLightShadow);
        g.drawString (
                MAIN_TITLE,
                mainTitleX + 8f,
                mainTitleY + 8f
        );

        // Text
        g.setColor (Colors.TextLight);

        g.drawString (
                MAIN_TITLE,
                mainTitleX,
                mainTitleY
        );

    }

    public void onDraw (Graphics2D g, float delta) {

        g.setColor (Colors.MenuBackground);
        g.fillRect (0, 0, (int) getWidth (), (int) getHeight ());

        drawMainMenuText (g, delta);

    }

    @Override
    public void onUpdate (float delta) {

    }

    @Override
    public void onKeyDown (int keyCode) {
        if (keyCode == KeyEvent.VK_ESCAPE) {
            System.exit (0);
        }
    }

}
