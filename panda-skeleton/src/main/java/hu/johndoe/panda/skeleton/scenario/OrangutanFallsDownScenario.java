package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.Game;
import hu.johndoe.panda.skeleton.model.Level;
import hu.johndoe.panda.skeleton.model.Orangutan;
import hu.johndoe.panda.skeleton.model.Tile;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class OrangutanFallsDownScenario extends TestScenario{
    public OrangutanFallsDownScenario () {
        super("Orangutan Falls Down",

                () -> {

                    {
                        ActionLogger.disable();
                        IdGenerator.reset();

                        Orangutan o = new Orangutan();

                        Tile startTile = new Tile (20, false, false, null, null, new ArrayList<> ());

                        Tile exitTile = new Tile (20, false, true, null, null, new ArrayList<> ());

                        Tile tile0 = new Tile(20, false, false, o, null, new ArrayList<>());
                        Tile tile1 = new Tile(0, true, false, null, null, new ArrayList<>());//STEPS

                        tile0._addNeighbour(tile1);

                        Game.getInstance().level = new Level (
                                Arrays.asList (o),
                                Arrays.asList (startTile, tile1, exitTile),
                                startTile,
                                exitTile
                        );


                        ActionLogger.enable();
                        o.moveTo(tile1);

                    }
                }
        );
    }
}
