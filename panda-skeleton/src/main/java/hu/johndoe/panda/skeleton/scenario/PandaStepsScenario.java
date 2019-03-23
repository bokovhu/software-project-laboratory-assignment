package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class PandaStepsScenario extends TestScenario {

    public PandaStepsScenario () {
        super (
                "Panda steps",
                () -> {

                    ActionLogger.disable ();
                    IdGenerator.reset ();


                    JumpyPanda panda = new JumpyPanda ();

                    Tile startTile = new Tile (20, false, false, null, null, new ArrayList<> ());

                    Tile exitTile = new Tile (20, false, true, null, null, new ArrayList<> ());

                    Tile tile1 = new Tile (20, false, false, panda, null, new ArrayList<> ());
                    Tile tile2 = new Tile (20, false, false, null, null, new ArrayList<> ());

                    startTile._addNeighbour (tile1);
                    tile1._addNeighbour (tile2);
                    tile2._addNeighbour (exitTile);

                    panda.setStandingOn(tile1);

                    Level level = new Level (
                            Arrays.asList (panda),
                            Arrays.asList (startTile, tile1, tile2, exitTile),
                            startTile,
                            exitTile
                    );

                    ActionLogger.enable ();

                    panda.moveTo (tile2);

                }
        );
    }

}
