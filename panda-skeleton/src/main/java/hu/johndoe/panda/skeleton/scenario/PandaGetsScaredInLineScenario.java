package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class PandaGetsScaredInLineScenario extends TestScenario {
    public PandaGetsScaredInLineScenario () {
        super("Panda Gets Scared In Line",

                () -> {

                    {

                        ActionLogger.disable();
                        IdGenerator.reset();

                        BeepWave w = new BeepWave();
                        Orangutan o = new Orangutan();
                        SleepyPanda p1 = new SleepyPanda();
                        CowardPanda p2 = new CowardPanda();
                        JumpyPanda p3 = new JumpyPanda();

                        Tile startTile = new Tile(20, false, false, null, null, new ArrayList<>());

                        Tile exitTile = new Tile(20, false, true, null, null, new ArrayList<>());

                        Tile tile0 = new Tile(20, false, false, o, null, new ArrayList<>());
                        Tile tile1 = new Tile(20, false, false, p1, null, new ArrayList<>());
                        Tile tile2 = new Tile(20, false, false, p2, null, new ArrayList<>());
                        Tile tile3 = new Tile(20, false, false, p3, null, new ArrayList<>());

                        tile1._addNeighbour(tile2);
                        tile2._addNeighbour(tile3);

                        o.setStandingOn(tile0);
                        p1.setStandingOn(tile1);
                        p2.setStandingOn(tile2);
                        p3.setStandingOn(tile3);


                        Level level = new Level(
                                Arrays.asList(p1, p2, p3),
                                Arrays.asList(tile0, tile1, tile2, tile3, startTile, exitTile),
                                startTile,
                                exitTile
                        );

                        p3.startLeading(o);
                        p2.startLeading(o);
                        p1.startLeading(o);
                        ActionLogger.enable();

                        w.hit(p2);

                    }
                }
        );
    }
}
