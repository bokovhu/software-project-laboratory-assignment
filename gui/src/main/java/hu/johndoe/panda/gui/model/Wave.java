package hu.johndoe.panda.gui.model;

public abstract class Wave extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Tile origin;

    public Wave () {
    }

    public Wave (Tile origin) {
        this.origin = origin;
    }

    /**
     * Makes this wave be perceived by the parameter animal
     * @param animal the animal that perceives this wave
     */
    public abstract void hit (Animal animal);

    public abstract String getComicText ();

    public Tile getOrigin () {
        return origin;
    }

    public void setOrigin (Tile origin) {
        this.origin = origin;
    }

}
