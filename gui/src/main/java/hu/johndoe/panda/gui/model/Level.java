package hu.johndoe.panda.gui.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Level extends BaseEntity implements Updatable {

    private static final long serialVersionUID = 1L;

    public List<Tile> tiles = Collections.synchronizedList (new ArrayList<> ());
    public Tile entranceTile;
    public Tile exitTile;

    public List<Animal> animals = Collections.synchronizedList (new ArrayList<> ());

    private List<Animal> animalsToRemove = Collections.synchronizedList (new ArrayList<> ());

    public void removeAnimal (Animal animal) {

        if (animal.getGuidedAnimal () != null) {
            animal.getGuidedAnimal ().setLeaderAnimal (null);
        }
        if (animal.getLeaderAnimal () != null) {
            animal.getLeaderAnimal ().setGuidedAnimal (null);
        }
        animal.getStandingOn ().setCurrentAnimal (null);
        animal.setStandingOn (null);
        animalsToRemove.add (animal);

    }

    @Override
    public void update (float delta) {

        animals.removeAll (animalsToRemove);
        animalsToRemove.clear ();

    }

}
