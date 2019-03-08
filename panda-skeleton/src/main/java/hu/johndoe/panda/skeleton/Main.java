package hu.johndoe.panda.skeleton;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.scenario.TestScenario;

public class Main {

    public static void main (String [] args) {

        for (TestScenario testScenario : TestScenario.SCENARIOS) {

            System.out.println ("====== " + testScenario.getName () + " ======");
            ActionLogger.reset ();
            testScenario.getScenarioAction ().run ();

        }

    }

}
