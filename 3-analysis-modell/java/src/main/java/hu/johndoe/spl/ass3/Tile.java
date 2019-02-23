package hu.johndoe.spl.ass3;

import java.util.ArrayList;
import java.util.List;

public class Tile {

    public List <Tile> neighbours = new ArrayList<> ();
    public boolean isFragile;
    public int life;
    public List <Wave> waves = new ArrayList<> ();

    // TODO: Missing from DOCUMENT.md
    public Animal currentAnimal;

    // TODO: Missing from DOCUMENT.md
    public Item currentItem;

    public boolean accept (Animal animal) {

        if (this.currentAnimal != null) {
            animal.collideWithAnimal (this.currentAnimal);
            return false;
        }

        if (this.life == 0) {
            animal.kill ();
            return true;
        }

        animal.standingOn.currentAnimal = null;
        animal.standingOn = this;
        this.currentAnimal = animal;

        return true;

    }

    public void spawnWave (Wave wave) {

        wave.origin = this;

        for (Tile neighbour : neighbours) {
            neighbour.waves.add (wave);
        }

    }

    // TODO: Missing from DOCUMENT.md
    public void damage () {

        if (isFragile) {
            life -= 1;
        }

    }

}
