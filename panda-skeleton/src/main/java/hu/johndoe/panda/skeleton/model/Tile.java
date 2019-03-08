package hu.johndoe.panda.skeleton.model;

import java.util.List;

public class Tile {

    public int life;
    public boolean isFragile;
    public boolean isExit;

    private Animal currentAnimal;
    private Item placedItem;
    private List<Tile> neighbours;

    public boolean accept (Animal animal) {

        throw new UnsupportedOperationException ();

    }

    public void damage () {

    }

    public void spawnWave (Wave wave) {

        pushWave (wave);

        if (neighbours != null) {

            for (Tile neighbour : neighbours) {
                neighbour.pushWave (wave);
            }

        }

    }

    public void pushWave (Wave wave) {

        if (currentAnimal != null) {
            wave.hit (currentAnimal);
        }

    }

    public Animal getCurrentAnimal () {
        return currentAnimal;
    }

    public void setCurrentAnimal (Animal currentAnimal) {
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

}
