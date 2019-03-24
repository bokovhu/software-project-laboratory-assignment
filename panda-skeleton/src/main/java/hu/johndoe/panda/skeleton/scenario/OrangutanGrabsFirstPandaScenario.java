package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

/***
 * In this scenario, the orangutan begins to lead its first panda,
 * meaning it guided no pandas before.
 * The orangutan becomes the leader animal of the panda and
 * the panda becomes the guided animal of the orangutan.
 */

public class OrangutanGrabsFirstPandaScenario extends TestScenario{

    public OrangutanGrabsFirstPandaScenario () {
        super("Orangutan Grabs First Panda",

                () -> {

                    {

                        ActionLogger.disable();
                        IdGenerator.reset();

                        Orangutan orangutan = new Orangutan();
                        SleepyPanda firstPanda = new SleepyPanda();

                        Tile startTile = new Tile(20, false, false, null, null, new ArrayList<>());

                        Tile exitTile = new Tile(20, false, true, null, null, new ArrayList<>());

                        Tile tile1 = new Tile(20, false, false, orangutan, null, new ArrayList<>());
                        Tile tile2 = new Tile(20, false, false, firstPanda, null, new ArrayList<>());

                        tile1._addNeighbour(tile2);

                        orangutan.setStandingOn(tile1);
                        firstPanda.setStandingOn(tile2);

                        Game.getInstance().level = new Level();

                        Game.getInstance().level.setAnimals(new ArrayList(Arrays.asList(orangutan, firstPanda)));
                        Game.getInstance().level.setTiles(new ArrayList(Arrays.asList(tile1, tile2,startTile, exitTile)));
                        Game.getInstance().level.setStartTile(startTile);
                        Game.getInstance().level.setExitTile(exitTile);




                        ActionLogger.enable();
                        orangutan.collideWithAnimal(firstPanda);

                    }
                }
        );
    }
}

