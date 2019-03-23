package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.Level;
import hu.johndoe.panda.skeleton.model.Orangutan;
import hu.johndoe.panda.skeleton.model.Tile;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

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

                    orangutan.setStandingOn (startTile);


                    Level level = new Level (
                            Arrays.asList (orangutan),
                            Arrays.asList (startTile, tile1, tile2, exitTile),
                            startTile,
                            exitTile
                    );

                    ActionLogger.enable ();

                    orangutan.moveTo (tile1);

                }
        );
    }

}
