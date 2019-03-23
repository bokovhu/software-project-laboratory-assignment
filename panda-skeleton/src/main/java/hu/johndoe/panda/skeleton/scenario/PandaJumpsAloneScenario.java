package hu.johndoe.panda.skeleton.scenario;

import hu.johndoe.panda.skeleton.model.*;
import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.model._internal.IdGenerator;

import java.util.ArrayList;

public class PandaJumpsAloneScenario extends TestScenario {
    public PandaJumpsAloneScenario () {
        super("Panda Jumps Alone",

                () -> {

                    {

                        ActionLogger.disable();
                        IdGenerator.reset();


                        JumpyWave w = new JumpyWave();

                        JumpyPanda panda = new JumpyPanda();

                        Tile tile0 = new Tile(20, true, false, panda, null, new ArrayList<>());

                        panda.setStandingOn(tile0);

                        ActionLogger.enable();
                        w.hit(panda);
                    }
                }
        );
    }
}
