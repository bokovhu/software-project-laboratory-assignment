package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * In this scenario, a panda and four tiles (including a start and
 * and exit tile) are set up and a couch emitting a sleepy wave is
 * placed on a tile. Then the panda is placed next to the couch
 * and gets hit by the wave, then reacts accordingly.
 */
public class PandaSleepsAloneScenario extends TestScenario{
    public PandaSleepsAloneScenario () {
        super("Panda Sleeps Alone",

                () -> {

                    {
                        ActionLogger.disable();
                        IdGenerator.reset();
/**
 * Initializing members
 * The action logger is disabled, the relevant steps come after.
 */

                        SleepyPanda panda = new SleepyPanda();

                        Tile startTile = new Tile(20, false, false, null, null, new ArrayList<>());

                        Tile exitTile = new Tile(20, false, true, null, null, new ArrayList<>());


                        Tile tile0 = new Tile(20, false, false, panda, null, new ArrayList<>());
                        Tile tile1 = new Tile(20, false, false, null, null, new ArrayList<>());

                        Couch couch = new Couch(tile1);
                        SleepyWave w = new SleepyWave(tile1);
                        tile1.setPlacedItem(couch);
                        panda.setStandingOn(tile0);

                        Game.getInstance().level = new Level();

                        Game.getInstance().level.setAnimals((new ArrayList(Arrays.asList(panda))));
                        Game.getInstance().level.setTiles((new ArrayList(Arrays.asList(tile1, tile0))));
                        Game.getInstance().level.setExitTile(exitTile);
                        Game.getInstance().level.setStartTile(startTile);

                        ActionLogger.enable();

                        /**
                         * Relevant steps come here.
                         * The action logger is enabled, the output shows
                         * the sequence of methods called following this.
                         */

                        w.hit(panda);

                    }
                }
        );
    }
}
