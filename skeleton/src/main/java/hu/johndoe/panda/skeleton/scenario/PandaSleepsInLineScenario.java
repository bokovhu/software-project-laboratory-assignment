package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * In this scenario, the three different types of pandas and
 * a start, exit and several other tiles are created and set up,
 * and a couch emitting a sleepy wave is placed on a tile.
 * The pandas are placed on the tiles behind each other in a row leading
 * each other, then all of them are added to the map.
 * In the end, the sleepy wave hits the sleepy panda which reacts to it
 * accordingly.
 */
public class PandaSleepsInLineScenario extends TestScenario {
    public PandaSleepsInLineScenario () {
        super("Panda Sleeps In Line",

                () -> {

                    {

                        ActionLogger.disable();
                        IdGenerator.reset();

                        /**
                         * Initializing members
                         * The action logger is disabled, the relevant steps come after.
                         */

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


                        Game.getInstance().level = new Level();
                        Game.getInstance().level.setAnimals((new ArrayList(Arrays.asList(p1, p2, p3))));
                        Game.getInstance().level.setTiles((new ArrayList(Arrays.asList(tile0, tile1, tile2, tile3, exitTile,startTile))));
                        Game.getInstance().level.setExitTile(exitTile);
                        Game.getInstance().level.setStartTile(startTile);

                        p3.setLeaderAnimal(p2);
                        p2.setGuidedAnimal(p3);
                        p2.setLeaderAnimal(p1);
                        p1.setGuidedAnimal(p2);

                        ActionLogger.enable();

                        /**
                         * Relevant steps come here.
                         * The action logger is enabled, the output shows
                         * the sequence of methods called following this.
                         */

                        w.hit(p2);

                    }
                }
        );
    }
}
