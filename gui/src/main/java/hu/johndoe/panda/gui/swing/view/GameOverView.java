package hu.johndoe.panda.gui.swing.view;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Views;
import hu.johndoe.panda.gui.model.GameState;
import hu.johndoe.panda.gui.swing.GamePanel;
import hu.johndoe.panda.gui.util.GraphicsUtil;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class GameOverView extends ViewBase {

    private static final String GAME_OVER_TEXT = "Game Over!";
    private static final String PLAYER_POINTS_TEXT = "You scored %d points";
    private static final String PRESS_ANY_KEY_TEXT = "Press any key to return to the main menu";

    Rectangle2D gameOverTextBounds;
    Rectangle2D playerPointsTextBounds;
    Rectangle2D pressAnyKeyTextBounds;

    public GameOverView (GamePanel gamePanel) {
        super (gamePanel);
    }

    @Override
    public void onEnter () {

    }

    @Override
    public void onExit () {

    }

    @Override
    public void onDraw (Graphics2D g, float delta) {

        g.setColor (Colors.Background);
        g.fillRect (0, 0, (int) getWidth (), (int) getHeight ());

        g.setFont (Resources.GameFont96 ());

        if (gameOverTextBounds == null) {
            gameOverTextBounds = Resources.GameFont96 ().getStringBounds (
                    GAME_OVER_TEXT,
                    g.getFontRenderContext ()
            );
        }
        if (playerPointsTextBounds == null) {
            playerPointsTextBounds = Resources.GameFont64 ().getStringBounds (
                    String.format (PLAYER_POINTS_TEXT, GameState.getInstance ().getNumPoints ()),
                    g.getFontRenderContext ()
            );
        }
        if (pressAnyKeyTextBounds == null) {
            pressAnyKeyTextBounds = Resources.GameFont32 ().getStringBounds (
                    PRESS_ANY_KEY_TEXT,
                    g.getFontRenderContext ()
            );
        }

        GraphicsUtil.textWithShadow (
                GAME_OVER_TEXT,
                getWidth () / 2f - (float) gameOverTextBounds.getWidth () / 2f,
                96f,
                Resources.GameFont96 (), g
        );

        GraphicsUtil.textWithShadow (
                String.format (PLAYER_POINTS_TEXT, GameState.getInstance ().getNumPoints ()),
                getWidth () / 2f - (float) playerPointsTextBounds.getWidth () / 2f,
                getHeight () / 2f + (float) playerPointsTextBounds.getHeight () / 2f,
                Resources.GameFont64 (), g
        );

        GraphicsUtil.textWithShadow (
                PRESS_ANY_KEY_TEXT,
                getWidth () / 2f - (float) pressAnyKeyTextBounds.getWidth () / 2f,
                getHeight () - 128f,
                Resources.GameFont32 (), g
        );

    }

    @Override
    public void onUpdate (float delta) {

    }

    @Override
    public void onKeyDown (int keyCode) {

        getGamePanel ().switchView (Views.MAIN_MENU);

    }

}
