package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class OrangutanGrabsAnotherPandaScenario extends TestScenario {
    public OrangutanGrabsAnotherPandaScenario () {
        super("Orangutan Grabs Another Panda",

                () -> {

                    ActionLogger.disable();
                    IdGenerator.reset();

                    Orangutan orangutan = new Orangutan();
                    CowardPanda firstPanda = new CowardPanda();
                    JumpyPanda newPanda = new JumpyPanda();

                    Tile startTile = new Tile(20, false, false, null, null, new ArrayList<>());

                    Tile exitTile = new Tile(20, false, true, null, null, new ArrayList<>());

                    Tile tile1 = new Tile(20, false, false, orangutan, null, new ArrayList<>());
                    Tile tile2 = new Tile(20, false, false, firstPanda, null, new ArrayList<>());
                    Tile tile3 = new Tile(20, false, false, newPanda, null, new ArrayList<>());

                    tile1._addNeighbour(tile2);
                    tile1._addNeighbour(tile3);

                    orangutan.setStandingOn(tile1);
                    firstPanda.setStandingOn(tile2);
                    newPanda.setStandingOn(tile3);



                    Level level = new Level(
                            Arrays.asList(orangutan, firstPanda, newPanda),
                            Arrays.asList(tile1, tile2, tile3, startTile, exitTile),
                            startTile,
                            exitTile
                    );

                    orangutan.collideWithAnimal(firstPanda);


                    ActionLogger.enable();
                    orangutan.collideWithAnimal(newPanda);


                }
                    );
    }
    }

