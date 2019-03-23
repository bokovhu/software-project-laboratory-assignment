package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class PandaSleepsInLineScenario extends TestScenario {
    public PandaSleepsInLineScenario () {
        super("Panda Sleeps In Line",

                () -> {

                    {

                        ActionLogger.disable();
                        IdGenerator.reset();



                        JumpyPanda p1 = new JumpyPanda();
                        SleepyPanda p2 = new SleepyPanda();
                        CowardPanda p3 = new CowardPanda();

                        Tile startTile = new Tile(20, false, false, null, null, new ArrayList<>());

                        Tile exitTile = new Tile(20, false, true, null, null, new ArrayList<>());


                        Tile tile0 = new Tile(20, false, false, null, null, new ArrayList<>());
                        Tile tile1 = new Tile(20, false, false, p1, null, new ArrayList<>());
                        Tile tile2 = new Tile(20, false, false, p2, null, new ArrayList<>());
                        Tile tile3 = new Tile(20, false, false, p3, null, new ArrayList<>());

                        tile1._addNeighbour(tile2);
                        tile1._addNeighbour(tile0);
                        tile2._addNeighbour(tile3);

                        SleepyWave w = new SleepyWave(tile0);
                        Couch couch = new Couch(tile0);
                        tile0.setPlacedItem(couch);

                        p1.setStandingOn(tile1);
                        p2.setStandingOn(tile2);
                        p3.setStandingOn(tile3);


                        Level level = new Level(
                                Arrays.asList(p1, p2, p3),
                                Arrays.asList(tile0, tile1, tile2, tile3, startTile, exitTile),
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
