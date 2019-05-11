package hu.johndoe.panda.gui.model;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Sizes;

import java.awt.*;

public class CowardPanda extends Panda {

    /**
     * Scares the panda, causing it to disrupts the currently lead chain, if one is present.
     */
    @Override
    public void scare () {

        if (this.getLeaderAnimal () != null) {
            stopLeading ();
        }

    }
    @Override
    public void draw (Graphics2D g, float delta) {

        // Draw "Coward" text //

        // Shadow
        g.setColor (Colors.Shadow);
        g.setFont (Resources.GameFont18 ());
        g.drawString (
                "Coward",
                getX () + 2f, getY () + 2f - 12f
        );

        // Actual text
        g.setColor (Colors.TextLight);
        g.drawString (
                "Coward",
                getX (), getY () - 12f
        );

        // Draw panda image //

        g.setColor (Color.WHITE);
        g.drawImage (
                Resources.PandaTexture ().getImage (),
                (int) getX (), (int) getY (),
                (int) Sizes.PandaSize, (int) Sizes.PandaSize,
                null
        );

    }

}
