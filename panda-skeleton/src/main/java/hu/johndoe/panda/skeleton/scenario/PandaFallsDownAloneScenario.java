package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

public class PandaFallsDownAloneScenario extends TestScenario {
    public PandaFallsDownAloneScenario () {
        super("Panda Falls Down Alone",

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
