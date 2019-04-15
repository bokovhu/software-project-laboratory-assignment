package java.model;

import java._internal.ActionLogger;
import java._internal.IdGenerator;

import java.util.List;

public class Level {

    private List<Animal> animals;
    private List<Tile> tiles;
    private Tile startTile;
    private Tile exitTile;

    public Level () {
    }

    public Level (List<Animal> animals, List<Tile> tiles, Tile startTile, Tile exitTile) {
        this.animals = animals;
        this.tiles = tiles;
        this.startTile = startTile;
        this.exitTile = exitTile;
    }

    public void removeAnimal (Animal animal) {

        ActionLogger.log ("Level", "Removing animal %s", animal.toString ());

        animals.remove(animal);

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
