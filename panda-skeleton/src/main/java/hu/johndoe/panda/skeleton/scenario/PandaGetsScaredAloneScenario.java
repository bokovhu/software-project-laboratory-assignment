package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * In this scenario, a free coward panda is scared.
 */

public class PandaGetsScaredAloneScenario extends TestScenario {
    public PandaGetsScaredAloneScenario () {
        super("Panda Gets Scared Alone",

                () -> {

                    {

                        ActionLogger.disable();
                        IdGenerator.reset();

                        BeepWave w = new BeepWave();
                        CowardPanda panda = new CowardPanda();

                        Tile startTile = new Tile (20, false, false, null, null, new ArrayList<>());

                        Tile exitTile = new Tile (20, false, true, null, null, new ArrayList<> ());

                        Tile tile0 = new Tile(20, false, false, panda, null, new ArrayList<>());
                        panda.setStandingOn(tile0);

                        Game.getInstance().level = new Level();

                        Game.getInstance().level.setAnimals(new ArrayList(Arrays.asList(panda)));
                        Game.getInstance().level.setTiles(new ArrayList(Arrays.asList(tile0, startTile, exitTile)));
                        Game.getInstance().level.setStartTile(startTile);
                        Game.getInstance().level.setExitTile(exitTile);

                        ActionLogger.enable();
                        w.hit(panda);

                    }
                }
        );
    }
}
