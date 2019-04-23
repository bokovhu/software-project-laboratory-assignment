package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

import java.io.Serializable;
import java.util.List;

/**
 * The level the game is played on. Contains the tiles, as well as the animals.
 */
public class Level implements Serializable {

    /** The (alive) animals in the game */
    private List<Animal> animals;

    /** The tiles in the game */
    private List<Tile> tiles;

    /** The start tile in the level. When an animal steps on the exit tile, it appears here instantly */
    private Tile startTile;

    /** The exit tile in the level. When an orangutan steps on it, the player is rewarded with a point for each animal
     * in its currently lead chain. The animals then disappear, and the orangutan is placed on the start tile
     */
    private Tile exitTile;

    public Level () {
    }

    public Level (List<Animal> animals, List<Tile> tiles, Tile startTile, Tile exitTile) {
        this.animals = animals;
        this.tiles = tiles;
        this.startTile = startTile;
        this.exitTile = exitTile;
    }

    /**
     * Removes an animal from the level. This may occur if the animal dies, or is lead out.
     * @param animal the animal to remove
     */
    public void removeAnimal (Animal animal) {

        ActionLogger.log ("Level", "Removing animal %s", animal.toString ());

        animals.remove (animal);

    }

    public List<Animal> getAnimals () {
        return animals;
    }

    public void setAnimals (List<Animal> animals) {
        this.animals = animals;
    }

    public List<Tile> getTiles () {
        return tiles;
    }

    public void setTiles (List<Tile> tiles) {
        this.tiles = tiles;
    }

    public Tile getStartTile () {
        return startTile;
    }

    public void setStartTile (Tile startTile) {
        this.startTile = startTile;
    }

    public Tile getExitTile () {
        return exitTile;
    }

    public void setExitTile (Tile exitTile) {
        this.exitTile = exitTile;
    }

}
