package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * In this scenario, a free panda steps on a broken tile
 * (a fragile tile with 0 remaining health).
 * The panda falls down and dies, is removed from the level and the game.
 */
public class PandaFallsDownAloneScenario extends TestScenario {
    public PandaFallsDownAloneScenario () {
        super("Panda Falls Down Alone",

                () -> {

                    {
                        ActionLogger.disable();
                        IdGenerator.reset();

                        JumpyPanda panda = new JumpyPanda();

                        Tile startTile = new Tile (20, false, false, null, null, new ArrayList<>());

                        Tile exitTile = new Tile (20, false, true, null, null, new ArrayList<> ());

                        Tile tile0 = new Tile(20, false, false, panda, null, new ArrayList<>());
                        Tile tile1 = new Tile(0, true, false, null, null, new ArrayList<>());//STEPS

                        tile0._addNeighbour(tile1);

                        Game.getInstance().level = new Level();

                        Game.getInstance().level.setAnimals((new ArrayList(Arrays.asList(panda))));
                        Game.getInstance().level.setTiles((new ArrayList(Arrays.asList(startTile,exitTile,tile0,tile1))));

                        Game.getInstance().level = new Level();

                        Game.getInstance().level.setAnimals(new ArrayList(Arrays.asList(panda)));
                        Game.getInstance().level.setTiles(new ArrayList(Arrays.asList(tile1, tile0, startTile, exitTile)));
                        Game.getInstance().level.setStartTile(startTile);
                        Game.getInstance().level.setExitTile(exitTile);


                        ActionLogger.enable();
                        panda.moveTo(tile1);

                    }
                }
        );
    }
}
