package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * In this scenario, a coward panda that is lead and is leading gets scared.
 * The panda lets go of its leader animal and guided animal and
 * the guided animal lets go of its guided animal as a result and
 * this continues recursively down the line.
 */

public class PandaGetsScaredInLineScenario extends TestScenario {
    public PandaGetsScaredInLineScenario () {
        super("Panda Gets Scared In Line",

                () -> {

                    {

                        ActionLogger.disable();
                        IdGenerator.reset();

                        BeepWave w = new BeepWave();

                        SleepyPanda p1 = new SleepyPanda();
                        CowardPanda p2 = new CowardPanda();
                        JumpyPanda p3 = new JumpyPanda();

                        Tile startTile = new Tile(20, false, false, null, null, new ArrayList<>());

                        Tile exitTile = new Tile(20, false, true, null, null, new ArrayList<>());


                        Tile tile1 = new Tile(20, false, false, p1, null, new ArrayList<>());
                        Tile tile2 = new Tile(20, false, false, p2, null, new ArrayList<>());
                        Tile tile3 = new Tile(20, false, false, p3, null, new ArrayList<>());

                        tile1._addNeighbour(tile2);
                        tile2._addNeighbour(tile3);


                        p1.setStandingOn(tile1);
                        p2.setStandingOn(tile2);
                        p3.setStandingOn(tile3);



                        p3.setLeaderAnimal(p2);
                        p2.setGuidedAnimal(p3);
                        p2.setLeaderAnimal(p1);
                        p1.setGuidedAnimal(p2);

                       Game.getInstance().level = new Level();
                        Game.getInstance().level.setAnimals((new ArrayList(Arrays.asList(p1, p2, p3))));
                        Game.getInstance().level.setTiles((new ArrayList(Arrays.asList(startTile,exitTile,tile1, tile2, tile3))));
                        Game.getInstance().level.setExitTile(exitTile);
                        Game.getInstance().level.setStartTile(startTile);

                        ActionLogger.enable();

                        w.hit(p2);

                    }
                }
        );
    }
}
