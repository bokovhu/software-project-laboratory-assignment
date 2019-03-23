package hu.johndoe.panda.skeleton.model;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

public class CowardPanda extends Panda {

    @Override
    public void scare () {

        ActionLogger.log (this, "Getting scared");
        ActionLogger.push ();

        if(this.getLeaderAnimal() != null) stopLeading ();

        ActionLogger.pop ();

    }

    @Override
    public String toString () {
        return "CowardPanda{" +
                "id=" + id +
                '}';
    }

}
