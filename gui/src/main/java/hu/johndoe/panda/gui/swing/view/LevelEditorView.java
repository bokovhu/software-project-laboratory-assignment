package hu.johndoe.panda.gui.swing.view;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Sizes;
import hu.johndoe.panda.gui.constants.Views;
import hu.johndoe.panda.gui.model.*;
import hu.johndoe.panda.gui.swing.GamePanel;
import hu.johndoe.panda.gui.swing.view.game.CameraController;
import hu.johndoe.panda.gui.swing.view.game.LevelRenderer;
import hu.johndoe.panda.gui.swing.view.menu.GameButton;
import hu.johndoe.panda.gui.util.LevelUtil;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.geom.Point2D;
import java.io.*;
import java.util.List;
import java.util.*;
import java.util.stream.Collectors;

public class LevelEditorView extends ViewBase {

    public enum Mode {
        ConnectTile,
        MoveTile,
        MoveAnimal,
        MoveItem,
        SetEntranceTile,
        SetExitTile,
        SetFragileTile,
        DeleteAnimal,
        DeleteItem,
        DeleteTile
    }

    private Level level;
    private final LevelRenderer levelRenderer = new LevelRenderer ();
    private final CameraController cameraController = new CameraController ();

    private Mode mode = Mode.MoveTile;

    private Tile selectedTile;
    private Item selectedItem;
    private Animal selectedAnimal;

    private float startX, startY;

    private float addTileX = 500f;
    private float addTileY = 300f;

    Set<String> visitedLevelEdges = new HashSet<> ();
    private List<GameButton> buttons = new ArrayList<> ();

    public LevelEditorView (GamePanel gamePanel) {
        super (gamePanel);
    }

    @Override
    public void onEnter () {

        GameState.getInstance ().reset ();
        level = GameState.getInstance ().getLevel ();

        int btnIndex = 0;
        float btnY = 48f;

        // Mode selection buttons //

        // Button to select "Connect Tiles" mode
        buttons.add (
                GameButton.smallButton (
                        "Connect Tiles",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (() -> mode = Mode.ConnectTile)
        );

        // Button to select "Move Tile" mode
        buttons.add (GameButton.smallButton (
                "Move Tile",
                Colors.BlueButtonBackground,
                btnIndex++ * Sizes.SmallButtonWidth, btnY
        ).onClick (() -> mode = Mode.MoveTile));

        // Button to select "Move Animal" mode
        buttons.add (
                GameButton.smallButton (
                        "Move Animal",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (() -> mode = Mode.MoveAnimal)
        );

        // Button to select "Move Item" mode
        buttons.add (
                GameButton.smallButton (
                        "Move Item",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (() -> mode = Mode.MoveItem)
        );

        btnIndex = 0;
        btnY += Sizes.SmallButtonHeight + Sizes.ButtonSpacing;

        // Button to select "Set Entrance" mode
        buttons.add (
                GameButton.smallButton (
                        "Set Entrance",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (() -> mode = Mode.SetEntranceTile)
        );

        // Button to select "Set Exit" mode
        buttons.add (
                GameButton.smallButton (
                        "Set Exit",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (() -> mode = Mode.SetExitTile)
        );

        // Button to select "Set Fragile" mode
        buttons.add (
                GameButton.smallButton (
                        "Set Fragile",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (() -> mode = Mode.SetFragileTile)
        );

        btnIndex = 0;
        btnY += Sizes.SmallButtonHeight + Sizes.ButtonSpacing;

        // Button to select "Delete Tile" mode
        buttons.add (
                GameButton.smallButton (
                        "Delete Tile",
                        Colors.RedButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (() -> mode = Mode.DeleteTile)
        );

        // Button to select "Delete Animal" mode
        buttons.add (
                GameButton.smallButton (
                        "Delete Animal",
                        Colors.RedButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (() -> mode = Mode.DeleteAnimal)
        );

        // Button to select "Delete Item" mode
        buttons.add (
                GameButton.smallButton (
                        "Delete Item",
                        Colors.RedButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (() -> mode = Mode.DeleteItem)
        );

        btnIndex = 0;
        btnY += Sizes.SmallButtonHeight + Sizes.ButtonSpacing;

        // Buttons for adding stuff //

        // Button to add a coward panda
        buttons.add (
                GameButton.smallButton (
                        "+Coward Panda",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (this::addCowardPanda)
        );

        // Button to add a jumpy panda
        buttons.add (
                GameButton.smallButton (
                        "+Jumpy Panda",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (this::addJumpyPanda)
        );

        // Button to add a sleepy panda
        buttons.add (
                GameButton.smallButton (
                        "+Sleepy Panda",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (this::addSleepyPanda)
        );

        // Button to add an orangutan
        buttons.add (
                GameButton.smallButton (
                        "+Orangutan",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (this::addOrangutan)
        );

        btnIndex = 0;
        btnY += Sizes.SmallButtonHeight + Sizes.ButtonSpacing;

        // Button to add a game machine
        buttons.add (
                GameButton.smallButton (
                        "+Game Machine",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (this::addGameMachine)
        );

        // Button to add a couch
        buttons.add (
                GameButton.smallButton (
                        "+Couch",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (this::addCouch)
        );

        // Button to add a pair of wardrobes
        buttons.add (
                GameButton.smallButton (
                        "+Wardrobes",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (this::addWardrobes)
        );

        // Button to add a vending machine
        buttons.add (
                GameButton.smallButton (
                        "+Vending Machine",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (this::addVendingMachine)
        );

        btnIndex = 0;
        btnY += Sizes.SmallButtonHeight + Sizes.ButtonSpacing;

        // Button to add a tile
        buttons.add (
                GameButton.smallButton (
                        "+Tile",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (this::addTile)
        );

        btnIndex = 0;
        btnY += Sizes.SmallButtonHeight + Sizes.ButtonSpacing;

        // Buttons to save and load //

        // Button to save
        buttons.add (
                GameButton.smallButton (
                        "Save",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (this::save)
        );

        // Button to load
        buttons.add (
                GameButton.smallButton (
                        "Load",
                        Colors.BlueButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (this::load)
        );

        // Button to go back to the menu
        buttons.add (
                GameButton.smallButton (
                        "Back",
                        Colors.RedButtonBackground,
                        btnIndex++ * Sizes.SmallButtonWidth, btnY
                ).onClick (() -> getGamePanel ().switchView (Views.MAIN_MENU))
        );

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

        buttons.forEach (b -> b.draw (g, delta));

    }

    @Override
    public void onDraw (Graphics2D g, float delta) {

        g.setColor (Colors.Background);
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
                    (int) (Sizes.AnimalSize + 8f),
                    (int) (Sizes.AnimalSize + 8f)
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
                                } else {
                                    tile.neighbours.remove (selectedTile);
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

                    // level.entranceTile = null;
                    for (Tile tile : level.tiles) {
                        if (tile.select (p.x, p.y)) {
                            level.entranceTile = tile;
                            break;
                        }
                    }

                    break;
                case SetExitTile:

                    for (Tile tile : level.tiles) {
                        if (tile.select (p.x, p.y)) {
                            level.tiles.stream ().filter (t -> t.isExit).forEach (t -> t.isExit = false);
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

                case DeleteAnimal:

                    Animal animalToRemove = null;
                    for (Animal animal : level.animals) {
                        if (animal.getStandingOn ().select (p.x, p.y)) {
                            animalToRemove = animal;
                            break;
                        }
                    }

                    if (animalToRemove != null) {
                        animalToRemove.getStandingOn ().setCurrentAnimal (null);
                        level.animals.remove (animalToRemove);
                    }

                    break;
                case DeleteItem:

                    Item itemToRemove = null;
                    for (Tile tile : level.tiles) {
                        if (tile.placedItem != null && tile.select (p.x, p.y)) {
                            itemToRemove = tile.placedItem;
                            break;
                        }
                    }

                    if (itemToRemove != null) {
                        itemToRemove.getPlacedOn ().placedItem = null;
                    }

                    break;
                case DeleteTile:

                    Tile tileToRemove = null;
                    for (Tile tile : level.tiles) {
                        if (tile.select (p.x, p.y)) {
                            tileToRemove = tile;
                        }
                    }

                    if (tileToRemove != null) {
                        if (tileToRemove.getCurrentAnimal () != null) {
                            tileToRemove.getCurrentAnimal ().setStandingOn (null);
                            level.animals.remove (tileToRemove.getCurrentAnimal ());
                        }
                        if (tileToRemove.placedItem != null) {
                            tileToRemove.placedItem = null;
                        }
                        if (tileToRemove.equals (level.exitTile)) {
                            level.exitTile = null;
                        }
                        if (tileToRemove.equals (level.entranceTile)) {
                            level.entranceTile = null;
                        }
                        for (Tile neighbour : tileToRemove.neighbours) {
                            neighbour.neighbours.remove (tileToRemove);
                        }
                        level.tiles.remove (tileToRemove);
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
        buttons.forEach (b -> b.handleMouseRelease (x, y));

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

                LevelUtil.fixLevel (loadedLevel);

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
            case KeyEvent.VK_ESCAPE:
                getGamePanel ().switchView (Views.MAIN_MENU);
                break;
        }

    }

}
