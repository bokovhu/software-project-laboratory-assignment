package hu.johndoe.panda.gui.model;

import java.util.ArrayList;
import java.util.List;

public class Level extends BaseEntity implements Updatable {

    public List <Tile> tiles = new ArrayList<> ();
    public Tile entranceTile;
    public Tile exitTile;

    public List <Animal> animals = new ArrayList<> ();

    private List <Animal> animalsToRemove = new ArrayList<> ();

    public void removeAnimal (Animal animal) {

        animalsToRemove.add (animal);

    }

    @Override
    public void update (float delta) {

        animals.removeAll (animalsToRemove);
        animalsToRemove.clear ();

    }

}
