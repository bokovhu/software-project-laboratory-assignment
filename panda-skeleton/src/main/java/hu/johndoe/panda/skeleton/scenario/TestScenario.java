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
            new TestScenario (
                    "Orangutan steps with pandas",
                    () -> {

                        ActionLogger.disable ();
                        //INIT
                        ActionLogger.enable ();

                        //actual methods used

                    }
            ),
            new TestScenario (
                    "Orangutan grabs first panda",
                    () -> {

                        ActionLogger.disable ();
                        //INIT
                        ActionLogger.enable ();

                        //actual methods used

                    }
            ),
            new TestScenario (
                    "Orangutan grabs another panda",
                    () -> {

                        ActionLogger.disable ();
                        //INIT
                        ActionLogger.enable ();

                        //actual methods used

                    }
            ),
            new TestScenario (
                    "Panda gets scared in line",
                    () -> {

                        ActionLogger.disable ();
                        //INIT
                        ActionLogger.enable ();

                        //actual methods used

                    }
            ),
            new TestScenario (
                    "Panda gets scared alone",
                    () -> {

                        ActionLogger.disable ();
                        //INIT
                        ActionLogger.enable ();

                        //actual methods used

                    }
            ),
            new TestScenario (
                    "Orangutan leads pandas out",
                    () -> {

                        ActionLogger.disable ();
                        //INIT
                        ActionLogger.enable ();

                        //actual methods used

                    }
            ),
            new TestScenario (
                    "Panda falls down alone",
                    () -> {

                        ActionLogger.disable ();
                        //INIT
                        ActionLogger.enable ();

                        //actual methods used

                    }
            ),
            new TestScenario (
                    "Panda falls down in line",
                    () -> {

                        ActionLogger.disable ();
                        //INIT
                        ActionLogger.enable ();

                        //actual methods used

                    }
            ),
            new TestScenario (
                    "Orangutan falls down",
                    () -> {

                        ActionLogger.disable ();
                        //INIT
                        ActionLogger.enable ();

                        //actual methods used

                    }
            ),
            new TestScenario (
                    "Panda sleeps alone",
                    () -> {

                        ActionLogger.disable ();
                        //INIT
                        ActionLogger.enable ();

                        //actual methods used


                    }
            ),
            new TestScenario (
                    "Panda jumps alone",
                    () -> {

                        ActionLogger.disable ();
                        //INIT
                        ActionLogger.enable ();

                        //actual methods used

                    }
            ),
            new TestScenario (
                    "Panda sleeps in line",
                    () -> {

                        ActionLogger.disable ();
                        //INIT
                        ActionLogger.enable ();

                        //actual methods used

                    }
            ),
            new TestScenario (
                    "Panda jumps in line",
                    () -> {

                        ActionLogger.disable ();
                        //INIT
                        ActionLogger.enable ();

                        //actual methods used

                    }
            ),
            new TestScenario (
                    "Panda collides with panda",
                    () -> {

                        ActionLogger.disable ();
                        //INIT
                        ActionLogger.enable ();

                        //actual methods used

                    }
            )


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
