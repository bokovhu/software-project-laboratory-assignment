package hu.johndoe.panda.skeleton.model;

public abstract class Wave {

    private Tile origin;

    public Wave () {
    }

    public Wave (Tile origin) {
        this.origin = origin;
    }

    public abstract void hit (Animal animal);

    public Tile getOrigin () {
        return origin;
    }

    public void setOrigin (Tile origin) {
        this.origin = origin;
    }

}
