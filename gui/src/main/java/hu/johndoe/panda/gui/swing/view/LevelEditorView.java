package hu.johndoe.panda.gui.swing.view;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Sizes;
import hu.johndoe.panda.gui.model.*;
import hu.johndoe.panda.gui.swing.GamePanel;
import hu.johndoe.panda.gui.swing.view.game.CameraController;
import hu.johndoe.panda.gui.swing.view.game.LevelRenderer;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class LevelEditorView extends ViewBase {

    public enum Mode {
        ConnectTile,
        MoveTile,
        MoveAnimal,
        MoveItem,
        SetEntranceTile,
        SetExitTile,
        SetFragileTile
    }

    private Level level;
    private final LevelRenderer levelRenderer = new LevelRenderer ();
    private final CameraController cameraController = new CameraController ();

    private Mode mode = Mode.MoveTile;

    private Tile selectedTile;
    private Item selectedItem;
    private Animal selectedAnimal;

    private float startX, startY;

    private float addTileX = 0f;
    private float addTileY = 0f;

    Set<String> visitedLevelEdges = new HashSet<> ();

    public LevelEditorView (GamePanel gamePanel) {
        super (gamePanel);
    }

    @Override
    public void onEnter () {

        GameState.getInstance ().reset ();
        level = GameState.getInstance ().getLevel ();

    }

    @Override
    public void onExit () {

    }

    private void drawUI (Graphics2D g, float delta) {

        g.setFont (Resources.GameFont32 ());

        g.setColor (Colors.Shadow);
        g.drawString ("Mode: " + mode.name (), 2, 34);

        g.setColor (Colors.TextLight);
        g.drawString ("Mode: " + mode.name (), 0, 32);

    }

    @Override
    public void onDraw (Graphics2D g, float delta) {

        g.setColor (Colors.MenuBackground);
        g.fillRect (0, 0, (int) getWidth (), (int) getHeight ());

        cameraController.push (g);

        levelRenderer.renderLevel (level, g, delta);

        if (selectedTile != null) {

            g.setColor (Color.BLACK);
            g.drawRect (
                    (int) (selectedTile.getX () - 4f),
                    (int) (selectedTile.getY () - 4f),
                    (int) (Sizes.TileRadius * 2f + 8f),
                    (int) (Sizes.TileRadius * 2f + 8f)
            );

        }

        if (selectedAnimal != null) {

            g.setColor (Color.BLACK);
            g.drawRect (
                    (int) (selectedAnimal.getX () - 4f),
                    (int) (selectedAnimal.getY () - 4f),
                    (int) (Sizes.OrangutanSize + 8f),
                    (int) (Sizes.OrangutanSize + 8f)
            );

        }

        if (selectedItem != null) {

            g.setColor (Color.BLACK);
            g.drawRect (
                    (int) (selectedItem.getX () - 4f),
                    (int) (selectedItem.getY () - 4f),
                    (int) (Sizes.WardrobeSize + 8f),
                    (int) (Sizes.WardrobeSize + 8f)
            );

        }

        cameraController.pop (g);

        drawUI (g, delta);

    }

    @Override
    public void onUpdate (float delta) {

    }

    @Override
    public void onMousePressed (int button, float x, float y) {

        Point2D.Float p = cameraController.unproject (x, y);

        if (button == MouseEvent.BUTTON1) {

            switch (mode) {
                case ConnectTile:

                    if (selectedTile == null) {

                        for (Tile tile : level.tiles) {
                            if (tile.select (p.x, p.y)) {
                                selectedTile = tile;
                                break;
                            }
                        }

                    } else {

                        for (Tile tile : level.tiles) {
                            if (tile.select (p.x, p.y)) {
                                if (!tile.neighbours.contains (selectedTile)) {
                                    selectedTile.neighbours.add (tile);
                                    tile.neighbours.add (selectedTile);
                                }
                            }
                        }

                        selectedTile = null;

                    }

                    break;
                case MoveTile:

                    if (selectedTile == null) {

                        for (Tile tile : level.tiles) {
                            if (tile.select (p.x, p.y)) {
                                selectedTile = tile;
                                break;
                            }
                        }

                    } else {

                        selectedTile.setX (p.x - Sizes.TileRadius);
                        selectedTile.setY (p.y - Sizes.TileRadius);
                        selectedTile = null;

                    }

                    break;
                case MoveAnimal:

                    if (selectedAnimal == null) {

                        for (Animal animal : level.animals) {
                            if (animal.getStandingOn ().select (p.x, p.y)) {
                                selectedAnimal = animal;
                                break;
                            }
                        }

                    } else {

                        for (Tile tile : level.tiles) {
                            if (tile.select (p.x, p.y)) {
                                if (tile.currentAnimal == null) {
                                    tile.currentAnimal = selectedAnimal;
                                    selectedAnimal.getStandingOn ().currentAnimal = null;
                                    selectedAnimal.setStandingOn (tile);
                                }
                            }
                        }
                        selectedAnimal = null;

                    }

                    break;
                case MoveItem:

                    if (selectedItem == null) {

                        for (Tile tile : level.tiles) {
                            if (tile.placedItem != null && tile.select (p.x, p.y)) {
                                selectedItem = tile.placedItem;
                                break;
                            }
                        }

                    } else {

                        for (Tile tile : level.tiles) {
                            if (tile.placedItem == null && tile.select (p.x, p.y)) {
                                tile.placedItem = selectedItem;
                                selectedItem.getPlacedOn ().placedItem = null;
                                selectedItem.setPlacedOn (tile);
                                break;
                            }
                        }

                        selectedItem = null;

                    }

                    break;
                case SetEntranceTile:

                    level.entranceTile = null;
                    for (Tile tile : level.tiles) {
                        if (tile.select (p.x, p.y)) {
                            level.entranceTile = tile;
                            break;
                        }
                    }

                    break;
                case SetExitTile:

                    level.exitTile = null;
                    level.tiles.stream ().filter (t -> t.isExit).forEach (t -> t.isExit = false);
                    for (Tile tile : level.tiles) {
                        if (tile.select (p.x, p.y)) {
                            tile.isExit = true;
                            level.exitTile = tile;
                            break;
                        }
                    }

                    break;
                case SetFragileTile:

                    for (Tile tile : level.tiles) {
                        if (tile.select (p.x, p.y)) {
                            tile.isFragile = !tile.isFragile;
                            break;
                        }
                    }

                    break;
            }

        } else {

            cameraController.handleMousePress (button, x, y);

        }

    }

    @Override
    public void onMouseReleased (int button, float x, float y) {

        cameraController.handleMouseRelease (button, x, y);

    }

    @Override
    public void onMouseDragged (float x, float y) {

        cameraController.handleMouseDrag (x, y);

    }

    private void addAnimal (Animal a, Tile t) {
        a.setStandingOn (t);
        a.setX (t.getX ());
        a.setY (t.getY ());
        t.setCurrentAnimal (a);
        level.animals.add (a);
    }

    private void addItem (Item i, Tile t) {
        i.setPlacedOn (t);
        i.setX (t.getX ());
        i.setY (t.getY ());
        t.placedItem = i;
    }

    private void addCowardPanda () {

        Optional<Tile> tile = level.tiles.stream ().filter (t -> t.currentAnimal == null)
                .findFirst ();

        tile.ifPresent (
                t -> addAnimal (new CowardPanda (), t)
        );

    }

    private void addJumpyPanda () {

        Optional<Tile> tile = level.tiles.stream ().filter (t -> t.currentAnimal == null)
                .findFirst ();

        tile.ifPresent (
                t -> addAnimal (new JumpyPanda (), t)
        );

    }

    private void addSleepyPanda () {

        Optional<Tile> tile = level.tiles.stream ().filter (t -> t.currentAnimal == null)
                .findFirst ();

        tile.ifPresent (
                t -> addAnimal (new SleepyPanda (), t)
        );

    }

    private void addOrangutan () {

        Optional<Tile> tile = level.tiles.stream ().filter (t -> t.currentAnimal == null)
                .findFirst ();

        tile.ifPresent (
                t -> addAnimal (new Orangutan (), t)
        );

    }

    private void addGameMachine () {

        Optional<Tile> tile = level.tiles.stream ().filter (t -> t.placedItem == null)
                .findFirst ();

        tile.ifPresent (
                t -> addItem (new GameMachine (), t)
        );

    }

    private void addCouch () {

        Optional<Tile> tile = level.tiles.stream ().filter (t -> t.placedItem == null)
                .findFirst ();

        tile.ifPresent (
                t -> addItem (new Couch (), t)
        );

    }

    private void addWardrobes () {

        List<Tile> list = level.tiles
                .stream ()
                .filter (t -> t.placedItem == null)
                .collect (Collectors.toList ());

        if (list.size () >= 2) {
            Wardrobe w1 = new Wardrobe ();
            Wardrobe w2 = new Wardrobe ();
            w1.setOtherWardrobe (w2);
            w2.setOtherWardrobe (w1);

            addItem (w1, list.get (0));
            addItem (w2, list.get (1));
        }

    }

    private void addVendingMachine () {

        Optional<Tile> tile = level.tiles.stream ().filter (t -> t.placedItem == null)
                .findFirst ();

        tile.ifPresent (
                t -> addItem (new ChocolateVendingMachine (), t)
        );

    }

    private void addTile () {

        Tile tile = new Tile ();

        tile.setX (addTileX);
        tile.setY (addTileY);

        addTileX += Sizes.TileRadius * 2.2f;

        level.tiles.add (tile);

    }

    private void save () {

        JFileChooser fileChooser = new JFileChooser (new File (System.getProperty ("user.dir")));
        fileChooser.addChoosableFileFilter (
                new FileNameExtensionFilter ("Panda Plaza Level", ".ppl")
        );
        int result = fileChooser.showSaveDialog (null);

        if (result == JFileChooser.APPROVE_OPTION) {

            File file = fileChooser.getSelectedFile ();

            try (
                    FileOutputStream fos = new FileOutputStream (file);
                    ObjectOutputStream oos = new ObjectOutputStream (fos);
            ) {

                oos.writeObject (GameState.getInstance ().getLevel ());

            } catch (Exception e) {
                e.printStackTrace ();
            }

        }

    }

    private void load () {

        JFileChooser fileChooser = new JFileChooser (new File (System.getProperty ("user.dir")));
        fileChooser.setSelectedFile (new File ("My Level.ppl"));
        int result = fileChooser.showOpenDialog (null);

        if (result == JFileChooser.APPROVE_OPTION) {

            File file = fileChooser.getSelectedFile ();

            try (
                    FileInputStream fis = new FileInputStream (file);
                    ObjectInputStream ois = new ObjectInputStream (fis)
            ) {

                Level loadedLevel = (Level) ois.readObject ();
                GameState.getInstance ().setLevel (loadedLevel);
                level = loadedLevel;

            } catch (Exception e) {
                e.printStackTrace ();
            }

        }

    }

    @Override
    public void onKeyDown (int keyCode) {

        switch (keyCode) {
            case KeyEvent.VK_Q:
                addCowardPanda ();
                break;
            case KeyEvent.VK_W:
                addJumpyPanda ();
                break;
            case KeyEvent.VK_E:
                addSleepyPanda ();
                break;
            case KeyEvent.VK_R:
                addOrangutan ();
                break;
            case KeyEvent.VK_T:
                addGameMachine ();
                break;
            case KeyEvent.VK_Z:
                addCouch ();
                break;
            case KeyEvent.VK_U:
                addWardrobes ();
                break;
            case KeyEvent.VK_I:
                addVendingMachine ();
                break;
            case KeyEvent.VK_O:
                addTile ();
                break;
            case KeyEvent.VK_A:
                mode = Mode.ConnectTile;
                break;
            case KeyEvent.VK_S:
                mode = Mode.MoveTile;
                break;
            case KeyEvent.VK_D:
                mode = Mode.MoveItem;
                break;
            case KeyEvent.VK_F:
                mode = Mode.MoveAnimal;
                break;
            case KeyEvent.VK_G:
                mode = Mode.SetEntranceTile;
                break;
            case KeyEvent.VK_H:
                mode = Mode.SetExitTile;
                break;
            case KeyEvent.VK_J:
                mode = Mode.SetFragileTile;
                break;
            case KeyEvent.VK_Y:
                save ();
                break;
            case KeyEvent.VK_X:
                load ();
                break;
        }

    }

}
