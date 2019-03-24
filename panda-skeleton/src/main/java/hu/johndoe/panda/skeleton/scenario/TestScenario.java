package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Represents a test scenario, also serves as a base class
 * for all test scenarios
 */
public class TestScenario {

    /**
     * The list of scenarios to run
     */
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

    /**
     * The name of the scenario
     */
    private final String name;
    /**
     * The (runnable) function to be executed during the test
     * Includes the initialization of all members,
     * enabling of the action logger and steps relevant
     * to the scenario
     */
    private final Runnable scenarioAction;

    /**
     * The constructor of the test scenario, sets the name
     * and the (runnable) function to be executed
     * @param name the name of the scenario
     * @param scenarioAction the (runnable) function to be executed
     */
    public TestScenario (String name, Runnable scenarioAction) {
        this.name = name;
        this.scenarioAction = scenarioAction;
    }

    /**
     * Returns the name of the scenario
     * @return the name of the scenario
     */
    public String getName () {
        return name;
    }

    /**
     * Returns the action of the scenario, which
     * means the function being executed during the
     * scenario
     * @return the scenario's action
     */
    public Runnable getScenarioAction () {
        return scenarioAction;
    }

}
