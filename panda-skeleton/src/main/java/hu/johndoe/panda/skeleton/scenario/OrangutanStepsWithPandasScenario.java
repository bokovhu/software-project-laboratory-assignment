package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * In this scenario, the orangutan steps to a free tile while leading at least one panda.
 * The pandas follow the orangutan and each other recursively.
 * The last panda's previous tile becomes empty (its current animal is set to NULL),
 * in every other case the panda steps on its leader's previous tile.
 */

public class OrangutanStepsWithPandasScenario extends TestScenario {
    public OrangutanStepsWithPandasScenario () {
        super("Orangutan Steps with Pandas",

                () -> {
                    {
                        ActionLogger.disable();
                        IdGenerator.reset();
                        Orangutan orangutan = new Orangutan();
                        JumpyPanda firstPanda = new JumpyPanda();
                        SleepyPanda lastPanda = new SleepyPanda();


                        firstPanda.startLeading(orangutan);
                        lastPanda.startLeading(firstPanda);


                        Tile startTile = new Tile(20, false, false, orangutan, null, new ArrayList<>());

                        Tile exitTile = new Tile(20, false, true, null, null, new ArrayList<>());

                        Tile tile1 = new Tile(20, false, false, orangutan, null, new ArrayList<>());
                        Tile tile2 = new Tile(20, false, false, firstPanda, null, new ArrayList<>());
                        Tile tile3 = new Tile(20, false, false, lastPanda, null, new ArrayList<>());
                        Tile tile4 = new Tile(20, false, false, null, null, new ArrayList<>());

                        tile1._addNeighbour(tile2);
                        tile2._addNeighbour(tile3);
                        tile1._addNeighbour(tile4);

                        orangutan.setStandingOn(tile1);
                        firstPanda.setStandingOn(tile2);
                        lastPanda.setStandingOn(tile3);


                        Game.getInstance().level = new Level();

                        Game.getInstance().level.setAnimals(new ArrayList(Arrays.asList(orangutan, firstPanda, lastPanda)));
                        Game.getInstance().level.setTiles(new ArrayList(Arrays.asList(tile1, tile2, tile3, tile4, startTile, exitTile)));
                        Game.getInstance().level.setStartTile(startTile);
                        Game.getInstance().level.setExitTile(exitTile);

                        //STEPS

                        ActionLogger.enable();
                        orangutan.moveTo(tile4);

                    }
                }
        );
    }

}