package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.Game;
import hu.johndoe.panda.skeleton.model.Level;
import hu.johndoe.panda.skeleton.model.Orangutan;
import hu.johndoe.panda.skeleton.model.Tile;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * In this scenario, the orangutan steps to a free tile.
 * The current tile of the orangutan becomes the tile stepped on and
 * the current animal of the orangutan's previous tile is set to NULL.
 */

public class OrangutanStepsScenario extends TestScenario {

    public OrangutanStepsScenario () {
        super (
                "Orangutan steps",
                () -> {

                    ActionLogger.disable ();
                    IdGenerator.reset ();

                    Orangutan orangutan = new Orangutan ();


                    Tile startTile = new Tile (20, false, false, orangutan, null, new ArrayList<> ());

                    Tile exitTile = new Tile (20, false, true, null, null, new ArrayList<> ());

                    Tile tile1 = new Tile (20, false, false, null, null, new ArrayList<> ());
                    Tile tile2 = new Tile (20, false, false, null, null, new ArrayList<> ());

                    startTile._addNeighbour (tile1);
                    tile1._addNeighbour (tile2);
                    tile2._addNeighbour (exitTile);

                    orangutan.setStandingOn(startTile);


                    Game.getInstance().level = new Level();

                    Game.getInstance().level.setAnimals(new ArrayList(Arrays.asList(orangutan)));
                    Game.getInstance().level.setTiles(new ArrayList(Arrays.asList(tile1, tile2, startTile, exitTile)));
                    Game.getInstance().level.setStartTile(startTile);
                    Game.getInstance().level.setExitTile(exitTile);

                    ActionLogger.enable ();

                    orangutan.moveTo (tile1);

                }
        );
    }

}
