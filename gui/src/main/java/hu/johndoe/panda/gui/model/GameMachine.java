package hu.johndoe.panda.gui.model;

import hu.johndoe.panda.gui.constants.Probabilities;
import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Sizes;

import java.awt.*;
import java.util.Random;

public class GameMachine extends Item {

    @Override
    public void draw (Graphics2D g, float delta) {

        setX (getPlacedOn ().getX ());
        setY (getPlacedOn ().getY ());

        g.drawImage (
                Resources.GameMachineTexture ().getImage (),
                (int) getX (), (int) getY (),
                (int) Sizes.ChocolateVendingMachineSize, (int) Sizes.ChocolateVendingMachineSize,
                null
        );

    }

    @Override
    public void update (float delta) {

        Random random = new Random ();
        if (random.nextFloat () < Probabilities.ChocolateVendingMachineBeepProbability) {
            JumpyWave wave = new JumpyWave ();
            wave.setOrigin (getPlacedOn ());
            getPlacedOn ().spawnWave (wave);
        }

    }

}
