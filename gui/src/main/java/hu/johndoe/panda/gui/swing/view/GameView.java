package hu.johndoe.panda.gui.swing.view;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Sizes;
import hu.johndoe.panda.gui.constants.Views;
import hu.johndoe.panda.gui.model.Animal;
import hu.johndoe.panda.gui.model.GameState;
import hu.johndoe.panda.gui.model.Level;
import hu.johndoe.panda.gui.model.Tile;
import hu.johndoe.panda.gui.swing.GamePanel;
import hu.johndoe.panda.gui.swing.view.game.CameraController;
import hu.johndoe.panda.gui.swing.view.game.GameEffects;
import hu.johndoe.panda.gui.swing.view.game.LevelRenderer;
import hu.johndoe.panda.gui.util.GraphicsUtil;
import hu.johndoe.panda.gui.util.LogUtil;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;

public class GameView extends ViewBase {

    private static final String LOGTAG = "Game View";

    public enum InputState {

        Initial,
        AnimalSelected

    }

    private final CameraController cameraController = new CameraController ();

    private InputState inputState = InputState.Initial;
    private Animal selectedAnimal = null;

    private final LevelRenderer levelRenderer = new LevelRenderer ();

    public GameView (GamePanel gamePanel) {
        super (gamePanel);
    }

    @Override
    public void onEnter () {

    }

    @Override
    public void onExit () {

    }

    private void drawLevel (Graphics2D g, float delta) {

        Level level = GameState.getInstance ().getLevel ();

        levelRenderer.renderLevel (level, g, delta);

        switch (inputState) {

            case Initial:
                break;
            case AnimalSelected:

                g.setColor (Color.YELLOW);
                g.drawOval (
                        (int) selectedAnimal.getX (), (int) selectedAnimal.getY (),
                        (int) Sizes.AnimalSize, (int) Sizes.AnimalSize
                );

                break;
        }

        GameEffects.getInstance ().update (delta);
        GameEffects.getInstance ().draw (g, delta);

    }

    private void drawUI (Graphics2D g, float delta) {

        GraphicsUtil.textWithShadow (
                String.format ("Score: %d", GameState.getInstance ().getNumPoints ()),
                16f, 48f + (float) Math.sin (getScreenTime () * 2f) * 6f,
                Resources.GameFont32 (), g
        );

    }

    @Override
    public void onDraw (Graphics2D g, float delta) {

        g.setColor (Colors.Background);
        g.fillRect (0, 0, (int) getWidth (), (int) getHeight ());

        cameraController.push (g);

        drawLevel (g, delta);

        cameraController.pop (g);

        drawUI (g, delta);

    }

    @Override
    public void onUpdate (float delta) {

        for (Animal animal : GameState.getInstance ().getLevel ().animals) {

            animal.update (delta);

        }

        for (Tile tile : GameState.getInstance ().getLevel ().tiles) {
            if (tile.placedItem != null) {
                tile.placedItem.update (delta);
            }
        }

        GameState.getInstance ().getLevel ().update (delta);

        if (GameState.getInstance ().getLevel ()
                .animals
                .stream ().noneMatch (Animal::canBeGrabbed)) {
            getGamePanel ().switchView (Views.GAME_OVER);
        }

    }

    @Override
    public void onMousePressed (int button, float x, float y) {

        Point2D.Float unprojected = cameraController.unproject (x, y);

        switch (button) {
            case MouseEvent.BUTTON1:

                switch (inputState) {
                    case Initial:

                        // Find orangutan
                        for (Animal animal : GameState.getInstance ().getLevel ().animals) {

                            if (animal.select (unprojected.x, unprojected.y)) {
                                LogUtil.log (
                                        LOGTAG,
                                        "Select animal " + animal.getClass ().getSimpleName () + " " + animal.getId ()
                                );
                                selectedAnimal = animal;
                                inputState = InputState.AnimalSelected;
                                break;
                            }

                        }

                        break;
                    case AnimalSelected:

                        if (selectedAnimal != null) {

                            // Find tile or item

                            for (Tile tile : GameState.getInstance ().getLevel ().tiles) {

                                if (tile.select (unprojected.x, unprojected.y)) {

                                    if (selectedAnimal.getStandingOn ().neighbours.contains (tile)) {

                                        LogUtil.log (LOGTAG, "Select tile " + tile.getId ());
                                        selectedAnimal.moveTo (tile);

                                    } else if (tile.equals (selectedAnimal.getStandingOn ()) && tile.placedItem != null) {
                                        tile.placedItem.use (selectedAnimal);
                                    }

                                    break;

                                }

                            }

                            selectedAnimal = null;
                        }

                        inputState = InputState.Initial;

                        break;
                }

                break;
        }

        cameraController.handleMousePress (button, x, y);

    }

    @Override
    public void onMouseReleased (int button, float x, float y) {

        cameraController.handleMouseRelease (button, x, y);

    }

    @Override
    public void onMouseDragged (float x, float y) {

        cameraController.handleMouseDrag (x, y);

    }

    @Override
    public void onMouseScrolled (int amount) {

        /* if (amount > 0) {
            zoom *= 3f / 4f;
        } else {
            zoom *= 4f / 3f;
        } */

    }

    @Override
    public void onKeyDown (int keyCode) {

        switch (keyCode) {
            case KeyEvent.VK_ESCAPE:
                getGamePanel ().switchView (Views.MAIN_MENU);
                break;

        }

    }

}
