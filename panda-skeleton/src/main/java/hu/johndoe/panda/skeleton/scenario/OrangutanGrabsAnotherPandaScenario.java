package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * In this scenario, the orangutan begins to lead a panda
 * while already leading at least one panda.
 * The newest panda becomes the guided animal of the orangutan and
 * the leader animal of the previously guided animal.
 */
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

                    Game.getInstance().level = new Level();

                    Game.getInstance().level.setAnimals(new ArrayList(Arrays.asList(orangutan, firstPanda, newPanda)));
                    Game.getInstance().level.setTiles(new ArrayList(Arrays.asList(tile1, tile2, tile3, startTile, exitTile)));
                    Game.getInstance().level.setStartTile(startTile);
                    Game.getInstance().level.setExitTile(exitTile);


                    orangutan.collideWithAnimal(firstPanda);


                    ActionLogger.enable();
                    orangutan.collideWithAnimal(newPanda);


                }
                    );
    }
    }

