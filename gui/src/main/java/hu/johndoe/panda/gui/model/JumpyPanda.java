package hu.johndoe.panda.gui.model;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Sizes;

import java.awt.*;

public class JumpyPanda extends Panda {

    /**
     * Makes the panda jump
     */
    @Override
    public void jump () {

        getStandingOn ().damage ();
        stopLeading ();

    }

    @Override
    public void draw (Graphics2D g, float delta) {

        setX (getStandingOn ().getX ());
        setY (getStandingOn ().getY ());

        // Draw "Jumpy" text //

        // Shadow
        g.setColor (Colors.Shadow);
        g.setFont (Resources.GameFont18 ());
        g.drawString (
                "Jumpy",
                getX () + 2f, getY () + 2f - 12f
        );

        // Actual text
        g.setColor (Colors.TextLight);
        g.drawString (
                "Jumpy",
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

}
