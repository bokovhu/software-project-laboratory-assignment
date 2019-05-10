package hu.johndoe.panda.gui.swing.view;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Sizes;
import hu.johndoe.panda.gui.model.GameState;
import hu.johndoe.panda.gui.model.Level;
import hu.johndoe.panda.gui.model.Tile;
import hu.johndoe.panda.gui.swing.GamePanel;
import hu.johndoe.panda.gui.util.LevelLayoutUtil;

import java.awt.*;

public class GameView extends ViewBase {

    public GameView (GamePanel gamePanel) {
        super (gamePanel);
    }

    @Override
    public void onEnter () {

        LevelLayoutUtil.generateLayout (GameState.getInstance ().getLevel ());

    }

    @Override
    public void onExit () {

    }

    private void drawLevel (Graphics2D g, float delta) {

        Level level = GameState.getInstance ().getLevel ();

        g.setColor (Colors.Tile);
        for (Tile tile : level.tiles) {
            for (Tile neighbour : tile.neighbours) {

                g.drawLine (
                        (int) ( tile.getX () + Sizes.TileRadius ),
                        (int) ( tile.getY () + Sizes.TileRadius ),
                        (int) ( neighbour.getX () + Sizes.TileRadius ),
                        (int) ( neighbour.getY () + Sizes.TileRadius )
                );

            }
        }

        for (Tile tile : level.tiles) {

            tile.draw (g, delta);

        }

    }

    private void drawUI (Graphics2D g, float delta) {

    }

    @Override
    public void onDraw (Graphics2D g, float delta) {

        g.setColor (Colors.MenuBackground);
        g.fillRect (0, 0, (int) getWidth (), (int) getHeight ());

        drawUI (g, delta);
        drawLevel (g, delta);

    }

    @Override
    public void onUpdate (float delta) {

    }

}
