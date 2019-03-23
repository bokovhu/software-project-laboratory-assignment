package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.BeepWave;
import hu.johndoe.panda.skeleton.model.CowardPanda;
import hu.johndoe.panda.skeleton.model.Tile;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;

public class PandaGetsScaredAloneScenario extends TestScenario {
    public PandaGetsScaredAloneScenario () {
        super("Panda Gets Scared Alone",

                () -> {

                    {

                        ActionLogger.disable();
                        IdGenerator.reset();

                        BeepWave w = new BeepWave();
                        CowardPanda panda = new CowardPanda();

                        Tile tile0 = new Tile(20, false, false, panda, null, new ArrayList<>());
                        panda.setStandingOn(tile0);

                        ActionLogger.enable();
                        w.hit(panda);

                    }
                }
        );
    }
}
