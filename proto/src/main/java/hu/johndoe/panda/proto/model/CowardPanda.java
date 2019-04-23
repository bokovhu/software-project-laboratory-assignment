package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

import java.io.Serializable;

/**
 * A single coward panda. Coward pandas may be scared by the vending machines' noise.
 */
public class CowardPanda extends Panda implements Serializable {

    /**
     * Scares the panda, causing it to disrupts the currently lead chain, if one is present.
     */
    @Override
    public void scare () {

        ActionLogger.log (this, "Getting scared");
        ActionLogger.push ();

        if (this.getLeaderAnimal () != null) {
            stopLeading ();
        }

        ActionLogger.pop ();

    }

    @Override
    public String toString () {
        return "CowardPanda{" +
                "id=" + id +
                '}';
    }

    @Override
    public String getTag () {
        return "COWARD PANDA";
    }

}
