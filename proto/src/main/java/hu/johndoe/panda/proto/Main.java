package hu.johndoe.panda.proto;

import hu.johndoe.panda.proto.cli.CommandLineInterface;
import hu.johndoe.panda.proto.model.Game;
import hu.johndoe.panda.proto.model.Level;

import java.util.ArrayList;

public class Main {

    public static void main (String [] args) {

        Game.getInstance ().level = new Level ();
        Game.getInstance ().level.setTiles (new ArrayList<> ());

        CommandLineInterface cli = new CommandLineInterface ();
        cli.loop ();

    }

}
