package hu.johndoe.panda.gui.swing.view;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Sizes;
import hu.johndoe.panda.gui.constants.Views;
import hu.johndoe.panda.gui.swing.GamePanel;
import hu.johndoe.panda.gui.swing.view.menu.GameButton;
import hu.johndoe.panda.gui.swing.view.menu.TitleRenderer;

import java.awt.*;

public class MainMenuView extends ViewBase {

    private static final String MAIN_TITLE = "Panda Plaza!";
    private static final String SUB_TITLE = "Main Menu";
    private static final String PLAY_BUTTON_TEXT = "Play";
    private static final String EXIT_BUTTON_TEXT = "Exit";

    private GameButton playButton;
    private GameButton exitButton;
    private TitleRenderer titleRenderer;

    public MainMenuView (GamePanel gamePanel) {
        super (gamePanel);
    }

    @Override
    public void onEnter () {

        playButton = GameButton.bigButton (
                PLAY_BUTTON_TEXT,
                Colors.BlueButtonBackground,
                getWidth () / 2f - Sizes.ButtonWidth / 2f,
                getHeight () / 2f - Sizes.ButtonHeight / 2f
        ).onClick (() -> getGamePanel ().switchView (Views.PLAY_MENU));

        exitButton = GameButton.bigButton (
                EXIT_BUTTON_TEXT,
                Colors.RedButtonBackground,
                getWidth () / 2f - Sizes.ButtonWidth / 2f,
                getHeight () / 2f + Sizes.ButtonHeight / 2f + Sizes.ButtonSpacing
        ).onClick (() -> System.exit (0));

        titleRenderer = new TitleRenderer (MAIN_TITLE, SUB_TITLE);

    }

    @Override
    public void onExit () {

    }

    public void onDraw (Graphics2D g, float delta) {

        g.setColor (Colors.Background);
        g.fillRect (0, 0, (int) getWidth (), (int) getHeight ());

        titleRenderer.draw (g, delta);
        playButton.draw (g, delta);
        exitButton.draw (g, delta);

    }

    @Override
    public void onUpdate (float delta) {

        playButton.setX (getWidth () / 2f - Sizes.ButtonWidth / 2f);
        playButton.setY (getHeight () / 2f - Sizes.ButtonHeight / 2f);

        exitButton.setX (getWidth () / 2f - Sizes.ButtonWidth / 2f);
        exitButton.setY (getHeight () / 2f + Sizes.ButtonHeight / 2f + Sizes.ButtonSpacing);

        titleRenderer.setCenterX (getWidth () / 2f);
        titleRenderer.setCenterY (96f);

    }

    @Override
    public void onMouseReleased (int button, float x, float y) {

        playButton.handleMouseRelease (x, y);
        exitButton.handleMouseRelease (x, y);

    }

}
