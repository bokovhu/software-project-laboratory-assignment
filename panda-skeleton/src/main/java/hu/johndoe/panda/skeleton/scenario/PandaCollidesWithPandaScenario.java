package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * In this scenario, a free panda (not lead by any animal) steps to a free tile
 * on which another panda is standing already.
 * The panda cannot move to a tile that is not free and so it's denied.
 */
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

                        Game.getInstance().level = new Level();

                        Game.getInstance().level.setAnimals(new ArrayList(Arrays.asList(firstPanda, secondPanda)));
                        Game.getInstance().level.setTiles(new ArrayList(Arrays.asList(tile1, tile2, startTile, exitTile)));
                        Game.getInstance().level.setStartTile(startTile);
                        Game.getInstance().level.setExitTile(exitTile);

                        ActionLogger.enable();

                        firstPanda.moveTo(tile2);

                    }
                }
        );
    }
}
