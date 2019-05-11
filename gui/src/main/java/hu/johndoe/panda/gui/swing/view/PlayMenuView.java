package hu.johndoe.panda.gui.swing.view;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Sizes;
import hu.johndoe.panda.gui.constants.Views;
import hu.johndoe.panda.gui.model.GameState;
import hu.johndoe.panda.gui.model.Level;
import hu.johndoe.panda.gui.swing.GamePanel;
import hu.johndoe.panda.gui.swing.view.menu.GameButton;
import hu.johndoe.panda.gui.swing.view.menu.TitleRenderer;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class PlayMenuView extends ViewBase {

    private static final String MAIN_TITLE = "Panda Plaza!";
    private static final String SUB_TITLE = "Play";
    private static final String LOAD_BUTTON_TEXT = "Load";
    private static final String EDITOR_BUTTON_TEXT = "Editor";

    private GameButton loadButton;
    private GameButton editorButton;
    private TitleRenderer titleRenderer;

    public PlayMenuView (GamePanel gamePanel) {
        super (gamePanel);
    }

    @Override
    public void onEnter () {

        loadButton = new GameButton (
                LOAD_BUTTON_TEXT,
                Colors.BlueButtonBackground,
                getWidth () / 2f - Sizes.ButtonWidth / 2f,
                getHeight () / 2f - Sizes.ButtonHeight / 2f
        ).onClick (this::loadLevel);

        editorButton = new GameButton (
                EDITOR_BUTTON_TEXT,
                Colors.BlueButtonBackground,
                getWidth () / 2f - Sizes.ButtonWidth / 2f,
                getHeight () / 2f + Sizes.ButtonHeight / 2f + Sizes.ButtonSpacing
        ).onClick (this::openEditor);

        titleRenderer = new TitleRenderer (MAIN_TITLE, SUB_TITLE);

    }

    @Override
    public void onExit () {

    }

    @Override
    public void onDraw (Graphics2D g, float delta) {

        g.setColor (Colors.Background);
        g.fillRect (0, 0, (int) getWidth (), (int) getHeight ());

        titleRenderer.draw (g, delta);
        loadButton.draw (g, delta);
        editorButton.draw (g, delta);

    }

    @Override
    public void onUpdate (float delta) {

        loadButton.setX (getWidth () / 2f - Sizes.ButtonWidth / 2f);
        loadButton.setY (getHeight () / 2f - Sizes.ButtonHeight / 2f);

        editorButton.setX (getWidth () / 2f - Sizes.ButtonWidth / 2f);
        editorButton.setY (getHeight () / 2f + Sizes.ButtonHeight / 2f + Sizes.ButtonSpacing);

        titleRenderer.setCenterX (getWidth () / 2f);
        titleRenderer.setCenterY (96f);

    }

    @Override
    public void onKeyUp (int keyCode) {

    }

    private void loadLevel () {

        JFileChooser fileChooser = new JFileChooser (new File (System.getProperty ("user.dir")));
        fileChooser.setFileFilter (new FileNameExtensionFilter ("Panda Plaza Level (*.ppl)", "ppl"));

        int result = fileChooser.showOpenDialog (null);
        if (result == JFileChooser.APPROVE_OPTION) {

            File file = fileChooser.getSelectedFile ();

            try (
                    FileInputStream fis = new FileInputStream (file);
                    ObjectInputStream ois = new ObjectInputStream (fis)
                    ) {

                GameState.getInstance ().reset ();
                Level loadedLevel = (Level) ois.readObject ();
                GameState.getInstance ().setLevel (loadedLevel);
                getGamePanel ().switchView (Views.GAME);

            } catch (Exception e) {
                e.printStackTrace ();
            }

        }

    }

    private void openEditor () {

        GameState.getInstance ().reset ();

        getGamePanel ().switchView (Views.LEVEL_EDITOR);

    }

    @Override
    public void onMouseReleased (int button, float x, float y) {

        loadButton.handleMouseRelease (x, y);
        editorButton.handleMouseRelease (x, y);

    }

}
