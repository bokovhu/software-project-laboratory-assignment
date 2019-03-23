package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class PandaCollidesWithPandaScenario extends TestScenario{
    public PandaCollidesWithPandaScenario () {
        super("Panda Collides With Panda",

                () -> {

                    {

                        ActionLogger.disable();
                        IdGenerator.reset();


                        CowardPanda firstPanda = new CowardPanda();
                        JumpyPanda secondPanda = new JumpyPanda();

                        Tile startTile = new Tile(20, false, false, null, null, new ArrayList<>());

                        Tile exitTile = new Tile(20, false, true, null, null, new ArrayList<>());

                        Tile tile1 = new Tile(20, false, false, firstPanda, null, new ArrayList<>());
                        Tile tile2 = new Tile(20, false, false, secondPanda, null, new ArrayList<>());

                        tile1._addNeighbour(tile2);

                        firstPanda.setStandingOn(tile1);
                        secondPanda.setStandingOn(tile2);

                        Level level = new Level(
                                Arrays.asList(firstPanda, secondPanda),
                                Arrays.asList(tile1, tile2, startTile, exitTile),
                                startTile,
                                exitTile
                        );

                        ActionLogger.enable();

                        firstPanda.moveTo(tile2);

                    }
                }
        );
    }
}
