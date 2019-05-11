package hu.johndoe.panda.gui.model;

import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Sizes;

import java.awt.*;

public class Couch extends Item {

    @Override
    public void draw (Graphics2D g, float delta) {

        setX (getPlacedOn ().getX ());
        setY (getPlacedOn ().getY ());

        g.drawImage (
                Resources.CouchTexture ().getImage (),
                (int) getX (), (int) getY (),
                (int) Sizes.ChocolateVendingMachineSize, (int) Sizes.ChocolateVendingMachineSize,
                null
        );

    }

    @Override
    public void update (float delta) {

    }

}
