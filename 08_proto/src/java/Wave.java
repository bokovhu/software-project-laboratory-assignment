package java;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

public abstract class Wave {

    protected final int id = IdGenerator.fetch ();

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
        ActionLogger.log (this, "setOrigin (%s)", origin.toString ());
        this.origin = origin;
    }

    @Override
    public String toString () {
        return "Wave{" +
                "id=" + id +
                '}';
    }

}
