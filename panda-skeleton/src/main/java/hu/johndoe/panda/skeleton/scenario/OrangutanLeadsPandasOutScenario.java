package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * In this scenario, the orangutan steps on the exit tile while leading at least one panda.
 * After this, the orangutan is moved to the start tile and
 * the game gives 1 point per each panda lead out.
 */

public class OrangutanLeadsPandasOutScenario extends TestScenario {

    public OrangutanLeadsPandasOutScenario () {
        super("Orangutan Leads Pandas Out",

                () -> {

                    { ActionLogger.disable();
                        IdGenerator.reset();

                        /**
                         * Initializing members
                         * The action logger is disabled, the relevant steps come after.
                         */

                        Orangutan o = new Orangutan();
                        JumpyPanda p1 = new JumpyPanda();
                        CowardPanda p2 = new CowardPanda();
                        SleepyPanda p3 = new SleepyPanda();


                        Tile startTile = new Tile (20, false, false, null, null, new ArrayList<>());

                        Tile exitTile = new Tile (20, false, true, null, null, new ArrayList<> ());

                        Tile tile0 = new Tile(20, false, false, null, null, new ArrayList<>());
                        Tile tile1 = new Tile(20, false, false, o, null, new ArrayList<>());
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
                        Game.getInstance().level.setExitTile(exitTile);
                        Game.getInstance().level.setStartTile(startTile);

                        ActionLogger.enable();

                        /**
                         * Relevant steps come here.
                         * The action logger is enabled, the output shows
                         * the sequence of methods called following this.
                         */

                        o.moveTo(exitTile);

                    }
                }
        );
    }
}
