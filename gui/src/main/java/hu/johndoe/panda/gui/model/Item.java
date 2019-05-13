package hu.johndoe.panda.gui.model;

public abstract class Item extends BaseGameEntity {

    private static final long serialVersionUID = 1L;

    /** The tile this item is placed on. Only a single item may be placed on any given tile */
    private Tile placedOn;

    public Tile getPlacedOn () {
        return placedOn;
    }

    public void setPlacedOn (Tile placedOn) {
        this.placedOn = placedOn;
    }

    /**
     * Makes the item be used by the parameter animal
     * @param user the item user animal
     */
    public void use (Animal user) {

    }

}
