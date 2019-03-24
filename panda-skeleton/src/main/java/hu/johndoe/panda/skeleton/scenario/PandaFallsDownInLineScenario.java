package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * In this scenario, a panda that is lead steps on a broken tile
 * (a fragile tile with 0 health remaining).
 * The panda lets go of its leader animal and guided animal and
 * the guided animal lets go of its guided animal as a result and
 * this continues recursively down the line.
 * The panda falls down and dies, is removed from the level and the game.
 */

public class PandaFallsDownInLineScenario extends TestScenario{
    public PandaFallsDownInLineScenario () {
        super("Panda Falls Down in Line",

                () -> {

                    {

                        ActionLogger.disable();
                        IdGenerator.reset();

                        Orangutan o = new Orangutan();
                        JumpyPanda p1 = new JumpyPanda();
                        CowardPanda p2 = new CowardPanda();
                        SleepyPanda p3 = new SleepyPanda();


                        Tile startTile = new Tile (20, false, false, null, null, new ArrayList<>());

                        Tile exitTile = new Tile (20, false, true, null, null, new ArrayList<> ());

                        Tile tile0 = new Tile(20, false, false, null, null, new ArrayList<>());
                        Tile tile1 = new Tile(0, true, false, o, null, new ArrayList<>());
                        Tile tile2 = new Tile(20, false, false, p1, null, new ArrayList<>());
                        Tile tile3 = new Tile(20, false, false, p2, null, new ArrayList<>());
                        Tile tile4 = new Tile(20, false, false, p3, null, new ArrayList<>());


                        tile0._addNeighbour(tile1);

                        Game.getInstance().level = new Level();



                        o.setStandingOn(tile1);
                        p1.setStandingOn(tile2);
                        p2.setStandingOn(tile3);
                        p3.setStandingOn(tile4);

                        p3.startLeading(o);
                        p2.startLeading(o);
                        p1.startLeading(o);


                        Game.getInstance().level.setAnimals((new ArrayList(Arrays.asList(o, p1, p2, p3))));
                        Game.getInstance().level.setTiles((new ArrayList(Arrays.asList(startTile,exitTile,tile0,tile1, tile2, tile3))));

                        ActionLogger.enable();
                        o.moveTo(tile0);


                    }
                }
        );
    }
}
