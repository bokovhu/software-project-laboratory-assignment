package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

public class OrangutanStepsWithPandasScenario extends TestScenario {
    public OrangutanStepsWithPandasScenario () {
        super("Orangutan Steps with Pandas",

                () ->

                {

                    ActionLogger.disable();
                    IdGenerator.reset();

                    //STEPS

                    ActionLogger.enable();
                    //STEPS

                }
        );
    }

}
