package hu.johndoe.panda.gui.model;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Sizes;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Tile extends BaseGameEntity {

    public static final int DEFAULT_LIFE = 20;

    public int life = DEFAULT_LIFE;

    public boolean isFragile;
    public boolean isExit;

    public Animal currentAnimal;
    public Item placedItem;

    public List <Tile> neighbours = new ArrayList<> ();

    @Override
    public void draw (Graphics2D g, float delta) {

        if (isExit) {
            g.setColor (Colors.TileExit);
        } else if (equals (GameState.getInstance ().getLevel ().entranceTile)) {
            g.setColor (Colors.TileEntrance);
        } else {
            g.setColor (Colors.Tile);
        }

        g.fillOval (
                (int) x, (int) y,
                (int) (Sizes.TileRadius * 2f), (int) (Sizes.TileRadius * 2f)
        );

    }

    @Override
    public void update (float delta) {

    }

}
