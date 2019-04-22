package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;
import hu.johndoe.panda.proto._internal.IdGenerator;

import java.io.Serializable;

public abstract class Wave implements Serializable {

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
