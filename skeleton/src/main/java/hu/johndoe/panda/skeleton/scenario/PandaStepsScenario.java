package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * In this scenario, we create and set up the tiles (including an exit and a start tile,
 * on which the panda doesn't step) and also create a panda.
 * The panda is put on a tile and then moved to another one, simulating a stepping
 * of a panda in the game.
 */
public class PandaStepsScenario extends TestScenario {

    public PandaStepsScenario () {
        super (
                "Panda steps",
                () -> {

                    ActionLogger.disable ();
                    IdGenerator.reset ();

                    /**
                     * Initializing members
                     * The action logger is disabled, the relevant steps come after.
                     */


                    JumpyPanda panda = new JumpyPanda ();

                    Tile startTile = new Tile (20, false, false, null, null, new ArrayList<> ());

                    Tile exitTile = new Tile (20, false, true, null, null, new ArrayList<> ());

                    Tile tile1 = new Tile (20, false, false, panda, null, new ArrayList<> ());
                    Tile tile2 = new Tile (20, false, false, null, null, new ArrayList<> ());

                    startTile._addNeighbour (tile1);
                    tile1._addNeighbour (tile2);
                    tile2._addNeighbour (exitTile);

                    panda.setStandingOn(tile1);

                    Game.getInstance().level = new Level ();
                    Game.getInstance().level.setAnimals((new ArrayList(Arrays.asList(panda))));
                    Game.getInstance().level.setTiles((new ArrayList(Arrays.asList(tile1, tile2, exitTile, startTile))));
                    Game.getInstance().level.setExitTile(exitTile);
                    Game.getInstance().level.setStartTile(startTile);

                    ActionLogger.enable ();

                    /**
                     * Relevant steps come here.
                     * The action logger is enabled, the output shows
                     * the sequence of methods called following this.
                     */

                    panda.moveTo (tile2);

                }
        );
    }

}
