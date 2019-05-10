package hu.johndoe.panda.gui.model;

import java.util.ArrayList;
import java.util.List;

public class Level extends BaseEntity {

    public List <Tile> tiles = new ArrayList<> ();
    public Tile entranceTile;
    public Tile exitTile;

}
