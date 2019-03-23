package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class PandaSleepsAloneScenario extends TestScenario{
    public PandaSleepsAloneScenario () {
        super("Panda Sleeps Alone",

                () -> {

                    {
                        ActionLogger.disable();
                        IdGenerator.reset();


                        SleepyPanda panda = new SleepyPanda();

                        Tile startTile = new Tile(20, false, false, null, null, new ArrayList<>());

                        Tile exitTile = new Tile(20, false, true, null, null, new ArrayList<>());


                        Tile tile0 = new Tile(20, false, false, panda, null, new ArrayList<>());
                        Tile tile1 = new Tile(20, false, false, null, null, new ArrayList<>());

                        Couch couch = new Couch(tile1);
                        SleepyWave w = new SleepyWave(tile1);
                        tile1.setPlacedItem(couch);
                        panda.setStandingOn(tile0);

                        Game.getInstance().level = new Level();

                        Game.getInstance().level.setAnimals((new ArrayList(Arrays.asList(panda))));
                        Game.getInstance().level.setTiles((new ArrayList(Arrays.asList(tile1, tile0))));
                        Game.getInstance().level.setExitTile(exitTile);
                        Game.getInstance().level.setStartTile(startTile);

                        ActionLogger.enable();
                        w.hit(panda);

                    }
                }
        );
    }
}
