package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * In this scenario, a free jumpy panda is hit by a jumpy wave.
 * The panda lets go of its leader animal and guided animal and
 * the guided animal lets go of its guided animal as a result and
 * this continues recursively down the line.
 * The panda jumps, damaging the tile it currently stands on.
 * As a result, the health of the tile is decremented by one.
 */

public class PandaJumpsAloneScenario extends TestScenario {
    public PandaJumpsAloneScenario () {
        super("Panda Jumps Alone",

                () -> {

                    {

                        ActionLogger.disable();
                        IdGenerator.reset();


                        JumpyWave w = new JumpyWave();

                        JumpyPanda panda = new JumpyPanda();

                        Tile startTile = new Tile(20, false, false, null, null, new ArrayList<>());

                        Tile exitTile = new Tile(20, false, true, null, null, new ArrayList<>());

                        Tile tile0 = new Tile(20, true, false, panda, null, new ArrayList<>());

                        panda.setStandingOn(tile0);

                        Game.getInstance().level = new Level();
                        Game.getInstance().level.setAnimals((new ArrayList(Arrays.asList(panda))));
                        Game.getInstance().level.setTiles((new ArrayList(Arrays.asList(tile0))));
                        Game.getInstance().level.setExitTile(exitTile);
                        Game.getInstance().level.setStartTile(startTile);

                        ActionLogger.enable();
                        w.hit(panda);
                    }
                }
        );
    }
}
