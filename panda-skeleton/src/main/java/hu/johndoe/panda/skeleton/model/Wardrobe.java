package hu.johndoe.panda.skeleton.model;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

public class Wardrobe extends Item {

    private Wardrobe otherWardrobe;

    public Wardrobe () {
    }

    public Wardrobe (Tile placedOn, Wardrobe otherWardrobe) {
        super (placedOn);
        this.otherWardrobe = otherWardrobe;
    }

    @Override
    public void use (Animal user) {

        ActionLogger.log (
                this,
                "Getting used by %s, moving it to %s",
                user.toString (),
                otherWardrobe.getPlacedOn ().toString ()
        );
        ActionLogger.push ();

        user.moveTo (otherWardrobe.getPlacedOn ());

        ActionLogger.pop ();

    }

    @Override
    public void update () {

    }

    public Wardrobe getOtherWardrobe () {
        return otherWardrobe;
    }

    public void setOtherWardrobe (Wardrobe otherWardrobe) {
        this.otherWardrobe = otherWardrobe;
    }

    @Override
    public String toString () {
        return "Wardrobe{" +
                "id=" + id +
                '}';
    }

}
