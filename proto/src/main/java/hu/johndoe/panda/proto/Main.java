package hu.johndoe.panda.proto;

import hu.johndoe.panda.proto.cli.CommandLineInterface;

public class Main {

    public static void main (String [] args) {

        CommandLineInterface cli = new CommandLineInterface ();
        cli.loop ();

    }

}
