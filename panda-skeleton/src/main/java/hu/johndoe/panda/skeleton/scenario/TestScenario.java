package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestScenario {

    public static final List<TestScenario> SCENARIOS = Arrays.asList (
            new PandaStepsScenario (), //done
            new OrangutanStepsScenario (), //done
            new OrangutanStepsWithPandasScenario(), //done
            new OrangutanGrabsFirstPandaScenario(), //done
            new OrangutanGrabsAnotherPandaScenario(), //done
            new PandaGetsScaredInLineScenario(), //done
            new PandaGetsScaredAloneScenario(), //done
            new OrangutanLeadsPandasOutScenario(), //done
            new PandaFallsDownAloneScenario(), //done
            new PandaFallsDownInLineScenario(), //done
            new OrangutanFallsDownScenario(), //done
            new PandaSleepsAloneScenario(), //done
            new PandaJumpsAloneScenario(), //done
            new PandaSleepsInLineScenario(), //done
            new PandaJumpsInLineScenario(), //done
            new PandaCollidesWithPandaScenario() //done
    );

    private final String name;
    private final Runnable scenarioAction;

    public TestScenario (String name, Runnable scenarioAction) {
        this.name = name;
        this.scenarioAction = scenarioAction;
    }

    public String getName () {
        return name;
    }

    public Runnable getScenarioAction () {
        return scenarioAction;
    }

}
