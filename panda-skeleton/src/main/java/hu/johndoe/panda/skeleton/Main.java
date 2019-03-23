package hu.johndoe.panda.skeleton;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;
import hu.johndoe.panda.skeleton.scenario.TestScenario;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        System.out.println ("Welcome to John Doe's skeleton!");
        System.out.println ("Type 'exit' to exit from the application");
        System.out.println ("Type the number of the scenario to run it");

        Scanner inputScanner = new Scanner (System.in);

        while (true) {

            System.out.println ("===== Available scenarios =====");

            for (int i = 0; i < TestScenario.SCENARIOS.size (); i++) {

                TestScenario scenario = TestScenario.SCENARIOS.get (i);
                System.out.println (
                        String.format ("%d: %s", (i + 1), scenario.getName ())
                );

            }

            System.out.println (
                    String.format ("Type the number of the scenario to run! [1-%d]: ", TestScenario.SCENARIOS.size ())
            );
            String command = inputScanner.nextLine ();

            if ("exit".equalsIgnoreCase (command)) {
                System.out.println ("Thank you for using our application!");
                System.exit (0);
            }

            Integer scenarioIndex = null;

            while (true) {

                if (command.matches ("[0-9]+")) {

                    scenarioIndex = Integer.parseInt (command);
                    if (scenarioIndex >= 1 && scenarioIndex <= TestScenario.SCENARIOS.size ()) {
                        break;
                    }

                }

                if ("exit".equalsIgnoreCase (command)) {
                    System.out.println ("Thank you for using our application!");
                    System.exit (0);
                }

                System.out.println (
                        String.format ("Please type a number in the range [1-%d]: ", TestScenario.SCENARIOS.size ())
                );
                command = inputScanner.nextLine ();

            }

            TestScenario scenarioToRun = TestScenario.SCENARIOS.get (scenarioIndex);
            System.out.println (
                    String.format ("===== %s =====", scenarioToRun.getName ())
            );

            ActionLogger.reset ();
            scenarioToRun.getScenarioAction ().run ();

        }

    }

}
