package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestScenario {

    public static final List<TestScenario> SCENARIOS = Arrays.asList (
            new PandaStepsScenario (),
            new OrangutanStepsScenario (),
            new OrangutanStepsWithPandasScenario(),
            new OrangutanGrabsFirstPandaScenario(),
            new OrangutanGrabsAnotherPandaScenario(),
            new PandaGetsScaredInLineScenario(),
            new PandaGetsScaredAloneScenario(),
            new OrangutanLeadsPandasOutScenario(),
            new PandaFallsDownAloneScenario(),
            new PandaFallsDownInLineScenario(),
            new OrangutanFallsDownScenario(),
            new PandaSleepsAloneScenario(),
            new PandaJumpsAloneScenario(),
            new PandaSleepsInLineScenario(),
            new PandaJumpsInLineScenario(),
            new PandaCollidesWithPandaScenario()
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
