package hu.johndoe.panda.gui.model;

import java.util.ArrayList;
import java.util.List;

public class Level extends BaseEntity {

    public List <Tile> tiles = new ArrayList<> ();
    public Tile entranceTile;
    public Tile exitTile;

    public List <Animal> animals = new ArrayList<> ();

    public void removeAnimal (Animal animal) {

        // TODO: Test!!!!! Might cause ConcurrentModificationException!!!
        animals.remove (animal);

    }

}
