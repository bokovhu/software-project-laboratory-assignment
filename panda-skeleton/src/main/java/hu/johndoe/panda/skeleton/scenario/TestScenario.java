package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestScenario {

    public static final List <TestScenario> SCENARIOS = Arrays.asList (

            new TestScenario (
                    "Panda steps",
                    () -> {

                        ActionLogger.disable ();

                        Orangutan orangutan = new Orangutan ();
                        Panda panda = new SleepyPanda ();

                        Tile startTile = new Tile (20, false, false, orangutan, null, new ArrayList<> ());

                        Tile exitTile = new Tile (20, false, true, null, null, new ArrayList<> ());

                        Tile tile1 = new Tile (20, false, false, null, null, new ArrayList<> ());
                        Tile tile2 = new Tile (20, false, false, null, null, new ArrayList<> ());

                        startTile._addNeighbour (tile1);
                        tile1._addNeighbour (tile2);
                        tile2._addNeighbour (exitTile);

                        orangutan.setStandingOn (startTile);
                        panda.setStandingOn (tile2);

                        Level level = new Level (
                                Arrays.asList (orangutan, panda),
                                Arrays.asList (startTile, tile1, tile2, exitTile),
                                startTile,
                                exitTile
                        );

                        ActionLogger.enable ();

                        panda.moveTo (tile1);

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