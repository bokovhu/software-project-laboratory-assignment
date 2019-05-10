package hu.johndoe.panda.gui.swing.view;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Views;
import hu.johndoe.panda.gui.swing.GamePanel;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class MainMenuView extends ViewBase {

    private static final String MAIN_TITLE = "Panda Plaza!";
    private static final String SUB_TITLE = "Main Menu";
    private static final String PLAY_BUTTON_TEXT = "Play";
    private static final String EXIT_BUTTON_TEXT = "Exit";

    private static final float SHADOW_OFFSET = 4f;
    private static final float BUTTON_WIDTH = 256f;
    private static final float BUTTON_HEIGHT = 128f;
    private static final float BUTTON_SPACING = 16f;
    // Font's baseline is a bit weird, and AWT cannot correctly determine the height of the rendered text
    // This value was found by experimenting, and it seems to correctly place the text in the middle of the button
    private static final float BUTTON_TEXT_Y_OFFSET = -12f;

    public MainMenuView (GamePanel gamePanel) {
        super (gamePanel);
    }

    @Override
    public void onEnter () {

    }

    @Override
    public void onExit () {

    }

    private float getPlayButtonCenterX () {
        return getWidth () / 2f;
    }

    private float getPlayButtonCenterY () {
        return getHeight () / 2f;
    }

    private float getPlayButtonX () {
        return getPlayButtonCenterX () - BUTTON_WIDTH / 2f;
    }

    private float getPlayButtonY () {
        return getPlayButtonCenterY () - BUTTON_HEIGHT / 2f;
    }

    private float getExitButtonCenterX () {
        return getPlayButtonCenterX ();
    }

    private float getExitButtonCenterY () {
        return getPlayButtonCenterY () + BUTTON_HEIGHT + BUTTON_SPACING;
    }

    private float getExitButtonX () {
        return getExitButtonCenterX () - BUTTON_WIDTH / 2f;
    }

    private float getExitButtonY () {
        return getExitButtonCenterY () - BUTTON_HEIGHT / 2f;
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

    private void drawButtonBackgrounds (Graphics2D g, float delta) {

        // Draw shadows //
        g.setColor (Colors.Shadow);

        // Play button
        g.fillRect (
                (int) (getPlayButtonX () + SHADOW_OFFSET),
                (int) (getPlayButtonY () + SHADOW_OFFSET),
                (int) BUTTON_WIDTH,
                (int) BUTTON_HEIGHT
        );

        // Exit button
        g.fillRect (
                (int) (getExitButtonX () + SHADOW_OFFSET),
                (int) (getExitButtonY () + SHADOW_OFFSET),
                (int) BUTTON_WIDTH,
                (int) BUTTON_HEIGHT
        );

        // Draw button backgrounds //

        // Play button
        g.setColor (Colors.BlueButtonBackground);
        g.fillRect (
                (int) (getPlayButtonX ()),
                (int) (getPlayButtonY ()),
                (int) BUTTON_WIDTH,
                (int) BUTTON_HEIGHT
        );

        // Exit button
        g.setColor (Colors.RedButtonBackground);
        g.fillRect (
                (int) (getExitButtonX ()),
                (int) (getExitButtonY ()),
                (int) BUTTON_WIDTH,
                (int) BUTTON_HEIGHT
        );

    }

    private void drawButtonTexts (Graphics2D g, float delta) {

        Rectangle2D playButtonTextBounds = Resources.GameFont64 ()
                .getStringBounds (
                        PLAY_BUTTON_TEXT,
                        g.getFontRenderContext ()
                );
        Rectangle2D exitButtonTextBounds = Resources.GameFont64 ()
                .getStringBounds (
                        EXIT_BUTTON_TEXT,
                        g.getFontRenderContext ()
                );

        g.setFont (Resources.GameFont64 ());

        // Draw text shadows //
        g.setColor (Colors.Shadow);

        // Play button text
        g.drawString (
                PLAY_BUTTON_TEXT,
                getPlayButtonCenterX () - (float) playButtonTextBounds.getWidth () / 2f + SHADOW_OFFSET,
                getPlayButtonCenterY () + (float) playButtonTextBounds.getHeight () / 2f + SHADOW_OFFSET + BUTTON_TEXT_Y_OFFSET
        );

        // Exit button text
        g.drawString (
                EXIT_BUTTON_TEXT,
                getExitButtonCenterX () - (float) exitButtonTextBounds.getWidth () / 2f + SHADOW_OFFSET,
                getExitButtonCenterY () + (float) exitButtonTextBounds.getHeight () / 2f + SHADOW_OFFSET + BUTTON_TEXT_Y_OFFSET
        );

        // Draw texts //
        g.setColor (Colors.TextLight);

        // Play button text
        g.drawString (
                PLAY_BUTTON_TEXT,
                getPlayButtonCenterX () - (float) playButtonTextBounds.getWidth () / 2f,
                getPlayButtonCenterY () + (float) playButtonTextBounds.getHeight () / 2f + BUTTON_TEXT_Y_OFFSET
        );

        // Exit button text
        g.drawString (
                EXIT_BUTTON_TEXT,
                getExitButtonCenterX () - (float) exitButtonTextBounds.getWidth () / 2f,
                getExitButtonCenterY () + (float) exitButtonTextBounds.getHeight () / 2f + BUTTON_TEXT_Y_OFFSET
        );

    }

    public void onDraw (Graphics2D g, float delta) {

        g.setColor (Colors.MenuBackground);
        g.fillRect (0, 0, (int) getWidth (), (int) getHeight ());

        drawTitles (g, delta);
        drawButtonBackgrounds (g, delta);
        drawButtonTexts (g, delta);

    }

    @Override
    public void onUpdate (float delta) {

    }

    @Override
    public void onMouseReleased (int button, float x, float y) {

        if (x >= getPlayButtonX () && x <= getPlayButtonX () + BUTTON_WIDTH
                && y >= getPlayButtonY () && y <= getPlayButtonY () + BUTTON_HEIGHT) {

            getGamePanel ().switchView (Views.PLAY_MENU);

        } else if (x >= getExitButtonX () && x <= getExitButtonX () + BUTTON_WIDTH
                && y >= getExitButtonY () && y <= getExitButtonY () + BUTTON_HEIGHT) {

            System.exit (0);

        }

    }

}
