package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

public class OrangutanLeadsPandasOutScenario extends TestScenario {

    public OrangutanLeadsPandasOutScenario () {
        super("Orangutan Leads Pandas Out",

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
