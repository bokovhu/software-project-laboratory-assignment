package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

public class OrangutanGrabsFirstPandaScenario extends TestScenario{

    public OrangutanGrabsFirstPandaScenario () {
        super("Orangutan Grabs First Panda",

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

