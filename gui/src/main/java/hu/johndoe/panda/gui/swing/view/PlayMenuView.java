package hu.johndoe.panda.gui.swing.view;

import com.sun.glass.events.KeyEvent;
import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Views;
import hu.johndoe.panda.gui.model.GameState;
import hu.johndoe.panda.gui.swing.GamePanel;
import hu.johndoe.panda.gui.util.LevelGeneratorUtil;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class PlayMenuView extends ViewBase {

    private static final String MAIN_TITLE = "Panda Plaza!";
    private static final String SUB_TITLE = "Play";
    private static final float SHADOW_OFFSET = 4f;

    public PlayMenuView (GamePanel gamePanel) {
        super (gamePanel);
    }

    @Override
    public void onEnter () {

    }

    @Override
    public void onExit () {

    }

    private void drawTitles (Graphics2D g, float delta) {

        Rectangle2D mainTitleTextBounds = Resources.GameFont96 ()
                .getStringBounds (MAIN_TITLE, g.getFontRenderContext ());
        Rectangle2D subTitleTextBounds = Resources.GameFont64 ()
                .getStringBounds (SUB_TITLE, g.getFontRenderContext ());

        final float mainTitleY = 96f + (float) Math.sin (getScreenTime () * 2.0f) * 12f;
        final float mainTitleX = getWidth () / 2f - (float) mainTitleTextBounds.getWidth () / 2f;

        final float subTitleY = mainTitleY + 64f;
        final float subTitleX = getWidth () / 2f - (float) subTitleTextBounds.getWidth () / 2f;

        // Draw main title //
        g.setFont (Resources.GameFont96 ());

        // Shadow
        g.setColor (Colors.Shadow);
        g.drawString (
                MAIN_TITLE,
                mainTitleX + SHADOW_OFFSET,
                mainTitleY + SHADOW_OFFSET
        );

        // Text
        g.setColor (Colors.TextLight);

        g.drawString (
                MAIN_TITLE,
                mainTitleX,
                mainTitleY
        );

        // Draw sub title //
        g.setFont (Resources.GameFont64 ());

        // Shadow
        g.setColor (Colors.Shadow);
        g.drawString (
                SUB_TITLE,
                subTitleX + SHADOW_OFFSET,
                subTitleY + SHADOW_OFFSET
        );

        g.setColor (Colors.TextDark);
        g.drawString (
                SUB_TITLE,
                subTitleX,
                subTitleY
        );

    }

    @Override
    public void onDraw (Graphics2D g, float delta) {

        g.setColor (Colors.MenuBackground);
        g.fillRect (0, 0, (int) getWidth (), (int) getHeight ());

        drawTitles (g, delta);

    }

    @Override
    public void onUpdate (float delta) {

    }

    @Override
    public void onKeyUp (int keyCode) {

        switch (keyCode) {
            case KeyEvent.VK_ENTER:

                GameState.getInstance ().reset ();
                // Generate a random level

                LevelGeneratorUtil.generate (
                        GameState.getInstance ().getLevel ()
                );

                getGamePanel ().switchView (Views.GAME);

                break;
        }

    }

}
