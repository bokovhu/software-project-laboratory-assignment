package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

/***
 * In this scenario, the orangutan steps on a broken tile
 * (a fragile tile with 0 remaining health points).
 * The orangutan falls down and is removed from the level and game.
 */


public class OrangutanFallsDownScenario extends TestScenario{
    public OrangutanFallsDownScenario () {
        super("Orangutan Falls Down",

                () -> {

                    {
                        ActionLogger.disable();
                        IdGenerator.reset();

                        /**
                         * Initializing members
                         * The action logger is disabled, the relevant steps come after.
                         */

                        Orangutan o = new Orangutan();

                        Tile startTile = new Tile (20, false, false, null, null, new ArrayList<> ());

                        Tile exitTile = new Tile (20, false, true, null, null, new ArrayList<> ());

                        Tile tile0 = new Tile(20, false, false, o, null, new ArrayList<>());
                        Tile tile1 = new Tile(0, true, false, null, null, new ArrayList<>());//STEPS

                        tile0._addNeighbour(tile1);

                        Game.getInstance().level = new Level();

                        Game.getInstance().level.setAnimals(new ArrayList(Arrays.asList(o)));
                        Game.getInstance().level.setTiles((new ArrayList(Arrays.asList(startTile,exitTile,tile0,tile1))));


                        ActionLogger.enable();

                        /**
                         * Relevant steps come here.
                         * The action logger is enabled, the output shows
                         * the sequence of methods called following this.
                         */

                        o.moveTo(tile1);

                    }
                }
        );
    }
}
