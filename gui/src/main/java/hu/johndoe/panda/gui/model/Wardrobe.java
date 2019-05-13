package hu.johndoe.panda.gui.model;

import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.constants.Sizes;

import java.awt.*;

public class Wardrobe extends Item {

    private static final long serialVersionUID = 1L;

    private Wardrobe otherWardrobe;

    @Override
    public void draw (Graphics2D g, float delta) {

        setX (getPlacedOn ().getX ());
        setY (getPlacedOn ().getY ());

        g.drawImage (
                Resources.WardrobeTexture ().getImage (),
                (int) getX (), (int) getY (),
                (int) Sizes.ChocolateVendingMachineSize, (int) Sizes.ChocolateVendingMachineSize,
                null
        );

    }

    /**
     * Makes this wardrobe be used by the parameter animal. The animal is teleported to the counterpart wardrobe upon
     * calling this function.
     * @param user the item user animal
     */
    @Override
    public void use (Animal user) {

        user.moveTo (otherWardrobe.getPlacedOn ());

    }

    @Override
    public void update (float delta) {

    }

    public Wardrobe getOtherWardrobe () {
        return otherWardrobe;
    }

    public void setOtherWardrobe (Wardrobe otherWardrobe) {
        this.otherWardrobe = otherWardrobe;
    }

}
