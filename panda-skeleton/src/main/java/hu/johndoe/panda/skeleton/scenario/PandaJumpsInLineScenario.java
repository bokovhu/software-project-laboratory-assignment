package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class PandaJumpsInLineScenario extends TestScenario {
    public PandaJumpsInLineScenario () {
        super("Panda Jumps In Line",

                () -> {

                    {

                        ActionLogger.disable();
                        IdGenerator.reset();

                        JumpyWave w = new JumpyWave();

                        SleepyPanda p1 = new SleepyPanda();
                        JumpyPanda p2 = new JumpyPanda();
                        CowardPanda p3 = new CowardPanda();

                        Tile startTile = new Tile(20, false, false, null, null, new ArrayList<>());

                        Tile exitTile = new Tile(20, false, true, null, null, new ArrayList<>());


                        Tile tile1 = new Tile(20, false, false, p1, null, new ArrayList<>());
                        Tile tile2 = new Tile(20, true, false, p2, null, new ArrayList<>());
                        Tile tile3 = new Tile(20, false, false, p3, null, new ArrayList<>());

                        tile1._addNeighbour(tile2);
                        tile2._addNeighbour(tile3);


                        p1.setStandingOn(tile1);
                        p2.setStandingOn(tile2);
                        p3.setStandingOn(tile3);


                        Level level = new Level(
                                Arrays.asList(p1, p2, p3),
                                Arrays.asList(tile1, tile2, tile3, startTile, exitTile),
                                startTile,
                                exitTile
                        );

                        p3.setLeaderAnimal(p2);
                        p2.setGuidedAnimal(p3);
                        p2.setLeaderAnimal(p1);
                        p1.setGuidedAnimal(p2);

                        ActionLogger.enable();
                        w.hit(p2);

                    }
                }
        );
    }
}
