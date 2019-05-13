package hu.johndoe.panda.gui.model;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Sizes;

import java.awt.*;
import java.util.Objects;

public class SleepyPanda extends Panda {

    private static final long serialVersionUID = 1L;

    /**
     * Causes the sleepy panda to go to sleep into the couch that is found on the parameter tile.
     *
     * @param where the tile to go to in order to sleep
     */
    @Override
    public boolean goToSleep (Tile where) {

        if (moveTo (where)) {
            isSleeping = true;
            return true;
        }
        return false;

    }

    @Override
    public void draw (Graphics2D g, float delta) {

        setX (getStandingOn ().getX ());
        setY (getStandingOn ().getY ());

        // Draw "Sleepy" text //

        // Shadow
        g.setColor (Colors.Shadow);
        g.setFont (Resources.GameFont18 ());
        g.drawString (
                "Sleepy",
                getX () + 2f, getY () + 2f - 12f
        );

        // Actual text
        g.setColor (Colors.TextLight);
        g.drawString (
                "Sleepy",
                getX (), getY () - 12f
        );

        // Draw panda image //

        g.setColor (Color.WHITE);
        g.drawImage (
                Resources.PandaTexture ().getImage (),
                (int) getX (), (int) getY (),
                (int) Sizes.AnimalSize, (int) Sizes.AnimalSize,
                null
        );

    }

    @Override
    public boolean canBeGrabbed () {
        return !isSleeping;
    }

}
