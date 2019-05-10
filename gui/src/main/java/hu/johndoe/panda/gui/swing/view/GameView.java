package hu.johndoe.panda.gui.swing.view;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Sizes;
import hu.johndoe.panda.gui.model.GameState;
import hu.johndoe.panda.gui.model.Level;
import hu.johndoe.panda.gui.model.Tile;
import hu.johndoe.panda.gui.swing.GamePanel;
import hu.johndoe.panda.gui.util.LevelLayoutUtil;

import java.awt.*;
import java.awt.event.MouseEvent;

public class GameView extends ViewBase {

    private static final String LOGTAG = "Game View";

    private boolean panning = false;
    private float panStartX = 0f;
    private float panStartY = 0f;
    private float panStartCameraX = 0f;
    private float panStartCameraY = 0f;
    private float cameraX = 0f;
    private float cameraY = 0f;
    private float zoom = 1f;

    final Stroke levelEdgeStroke = new BasicStroke (
            1f,
            BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL,
            0f,
            new float[] { 32f },
            0f
    );

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

                g.setStroke (levelEdgeStroke);
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

        g.translate (-cameraX, -cameraY);
        g.scale (zoom, zoom);

        drawLevel (g, delta);

        g.scale (1f / zoom, 1f / zoom);
        g.translate (cameraX, cameraY);

        drawUI (g, delta);

    }

    @Override
    public void onUpdate (float delta) {

    }

    @Override
    public void onMousePressed (int button, float x, float y) {

        switch (button) {
            case MouseEvent.BUTTON2:
                panning = true;
                panStartX = x;
                panStartY = y;
                panStartCameraX = cameraX;
                panStartCameraY = cameraY;
                break;
        }

    }

    @Override
    public void onMouseReleased (int button, float x, float y) {

        panning = false;

    }

    @Override
    public void onMouseDragged (float x, float y) {

        if (panning) {

            float dx = x - panStartX;
            float dy = y - panStartY;

            cameraX = panStartCameraX - dx;
            cameraY = panStartCameraY - dy;

        }

    }

    @Override
    public void onMouseScrolled (int amount) {

        if (amount > 0) {
            zoom *= 3f / 4f;
        } else {
            zoom *= 4f / 3f;
        }

    }

}
