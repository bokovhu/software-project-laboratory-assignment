package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;
import hu.johndoe.panda.proto._internal.IdGenerator;

import java.io.Serializable;

/**
 * A wave, that may be perceived by animals.
 */
public abstract class Wave implements Serializable {

    protected final int id = IdGenerator.fetch ();

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
