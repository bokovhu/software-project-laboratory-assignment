package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

public class OrangutanGrabsAnotherPandaScenario extends TestScenario {
    public OrangutanGrabsAnotherPandaScenario () {
        super("Orangutan Grabs Another Panda",

                () -> {

                    {

                        ActionLogger.disable();
                        IdGenerator.reset();

                        //STEPS

                        ActionLogger.enable();
                        //STEPS

                    }
                }
        );
    }
}
