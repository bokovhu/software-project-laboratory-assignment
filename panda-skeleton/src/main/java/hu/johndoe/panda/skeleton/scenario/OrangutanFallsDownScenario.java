package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

public class OrangutanFallsDownScenario extends TestScenario{
    public OrangutanFallsDownScenario () {
        super("Orangutan Falls Down",

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
