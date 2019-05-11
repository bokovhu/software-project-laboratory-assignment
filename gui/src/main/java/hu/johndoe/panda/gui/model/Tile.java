package hu.johndoe.panda.gui.model;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Sizes;
import hu.johndoe.panda.gui.swing.view.game.GameEffects;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Tile extends BaseGameEntity implements Selectable {

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

        if (isFragile) {
            g.setColor (Colors.TextLight);
            g.setFont (Resources.GameFont12 ());
            g.drawString ("Fragile", getX (), getY () + Sizes.TileRadius);
        }

        if (placedItem != null) {
            placedItem.setX (getX ());
            placedItem.setY (getY ());
            placedItem.draw (g, delta);
        }

        if (currentAnimal != null) {
            currentAnimal.draw (g, delta);
        }

    }

    @Override
    public void update (float delta) {

    }

    /**
     * Tries to accept an animal. When successful, the animal is moved to this tile.
     * @param animal the animal that's trying to move here
     * @return true, if the movement is successful, false otherwise
     */
    public boolean accept (Animal animal) {

        if (currentAnimal != null) {
            animal.collideWithAnimal (currentAnimal);
            return false;
        }

        if(isFragile){

            life --;

            if (life == 0) {
                animal.kill ();
                return true;
            }
        }


        if (isExit) {
            animal.leadOut ();
            return true;

        } else {
            animal.getStandingOn ().setCurrentAnimal (null);
            if (animal.getGuidedAnimal () != null) {
                animal.getGuidedAnimal ().moveTo (animal.getStandingOn ());
            }
            animal.setStandingOn (this);
            setCurrentAnimal (animal);

            return true;
        }

    }

    public void damage () {

        if (life > 0) {
            if (isFragile) {
                life -= 1;
            }
        }

        if (isFragile && life <= 0 && currentAnimal != null) currentAnimal.kill ();

    }

    /**
     * Spawns a perceivable wave on this tile. The spawned tile is propagated to the tile's neighbours too.
     * @param wave the wave to spawn
     */
    public void spawnWave (Wave wave) {

        pushWave (wave);

        if (neighbours != null) {

            for (Tile neighbour : neighbours) {
                neighbour.pushWave (wave);
            }

        }

    }

    /**
     * Pushes a wave onto this tile. If an animal is currently present on this tile, the wave hits it.
     * @param wave the wave to push onto this tile
     */
    public void pushWave (Wave wave) {

        if (wave.getComicText () != null) {
            GameEffects.getInstance ()
                    .addFlyingDisappearingText (
                            wave.getComicText (),
                            getX (), getY (),
                            0f, -100f,
                            1f
                    );
        }

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

    @Override
    public boolean select (float x, float y) {
        float dx = x - (getX () + Sizes.TileRadius);
        float dy = y - (getY () + Sizes.TileRadius);
        return (float) Math.sqrt (dx * dx + dy * dy) < Sizes.TileRadius;
    }

}
