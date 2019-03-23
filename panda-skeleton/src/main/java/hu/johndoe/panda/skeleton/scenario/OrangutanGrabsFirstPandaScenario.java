package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

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

                        Level level = new Level(
                                Arrays.asList(orangutan, firstPanda),
                                Arrays.asList(tile1, tile2, startTile, exitTile),
                                startTile,
                                exitTile
                        );




                        ActionLogger.enable();
                        orangutan.collideWithAnimal(firstPanda);

                    }
                }
        );
    }
}

