package hu.johndoe.panda.skeleton.model;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tile {

    private final int id = IdGenerator.fetch ();

    public int life;
    public boolean isFragile;
    public boolean isExit;

    private Animal currentAnimal;
    private Item placedItem;
    private List<Tile> neighbours;

    public Tile (
            int life,
            boolean isFragile,
            boolean isExit,
            Animal currentAnimal,
            Item placedItem,
            List<Tile> neighbours
    ) {
        this.life = life;
        this.isFragile = isFragile;
        this.isExit = isExit;
        this.currentAnimal = currentAnimal;
        this.placedItem = placedItem;
        this.neighbours = neighbours;
    }

    public Tile () {
    }

    public boolean accept (Animal animal) {

        ActionLogger.log (this, "Accepting animal %s", animal.toString ());
        ActionLogger.push ();

        if (currentAnimal != null) {
            ActionLogger.log (
                    this,
                    "There's already an animal here, colliding %s with %s",
                    animal.toString (),
                    currentAnimal.toString ()
            );
            animal.collideWithAnimal (currentAnimal);
            return false;
        }

        if (life == 0 && isFragile) {
            ActionLogger.log (this, "I am broken, killing %s", animal.toString ());
            animal.kill ();
            return true;
        }

        animal.getStandingOn ().setCurrentAnimal (null);
        if (animal.getGuidedAnimal () != null) {
            animal.getGuidedAnimal ().moveTo (animal.getStandingOn ());
        }
        animal.setStandingOn (this);
        setCurrentAnimal (animal);

        ActionLogger.pop ();

        return true;

    }

    public void damage () {

        if (isFragile) {
            life -= 1;
            ActionLogger.log (this, "Getting damaged, new life value: %d", life);
        }

    }

    public void spawnWave (Wave wave) {

        ActionLogger.log (this, "Spawning wave %s", wave.toString ());
        ActionLogger.push ();

        pushWave (wave);

        if (neighbours != null) {

            ActionLogger.log (this, "Propagating wave push to neighbours");
            for (Tile neighbour : neighbours) {
                neighbour.pushWave (wave);
            }

        }

        ActionLogger.pop ();

    }

    public void pushWave (Wave wave) {

        ActionLogger.log (this, "Pushing wave %s", wave.toString ());
        ActionLogger.push ();

        if (currentAnimal != null) {
            ActionLogger.log (this, "Making wave %s hit animal %s", wave.toString (), currentAnimal.toString ());
            wave.hit (currentAnimal);
        }

        ActionLogger.pop ();

    }

    public Animal getCurrentAnimal () {
        ActionLogger.log (this, "getCurrentAnimal ()");
        return currentAnimal;
    }

    public void setCurrentAnimal (Animal currentAnimal) {
        ActionLogger.log (this, "setCurrentAnimal (%s)", Objects.toString (currentAnimal));
        this.currentAnimal = currentAnimal;
    }

    public Item getPlacedItem () {
        return placedItem;
    }

    public void setPlacedItem (Item placedItem) {
        this.placedItem = placedItem;
    }

    public List<Tile> getNeighbours () {
        return neighbours;
    }

    public void setNeighbours (List<Tile> neighbours) {
        this.neighbours = neighbours;
    }

    public void _addNeighbour (Tile neighbour) {

        if (neighbours == null) {
            neighbours = new ArrayList<> ();
        }

        neighbours.add (neighbour);
        if (!neighbour.getNeighbours ().contains (this)) {
            neighbour._addNeighbour (this);
        }

    }

    @Override
    public String toString () {
        return "Tile{" +
                "id=" + id +
                '}';
    }

}
