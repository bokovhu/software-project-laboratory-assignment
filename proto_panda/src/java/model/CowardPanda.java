package java.model;

import java._internal.ActionLogger;
import java._internal.IdGenerator;

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
