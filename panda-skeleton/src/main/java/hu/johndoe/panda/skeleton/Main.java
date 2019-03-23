package hu.johndoe.panda.skeleton;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.scenario.TestScenario;

public class Main {

    public static void main (String [] args) {
        System.out.println("Welcome to John Doe's skeleton!");
        System.out.println("Please choose a scenario id and enter it: ");

        for (TestScenario testScenario : TestScenario.SCENARIOS) {

            System.out.println ("id: " + TestScenario.SCENARIOS.indexOf(testScenario) + " name:" + testScenario.getName());
            ActionLogger.reset ();
            //testScenario.getScenarioAction ().run ();

        }

        

       /* for (TestScenario testScenario : TestScenario.SCENARIOS) {

            System.out.println ("====== " + testScenario.getName () + " ======");
            ActionLogger.reset ();
            testScenario.getScenarioAction ().run ();

        }*/

    }

}
