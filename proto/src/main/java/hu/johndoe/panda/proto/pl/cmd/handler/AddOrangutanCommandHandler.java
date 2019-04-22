package hu.johndoe.panda.proto.pl.cmd.handler;

import hu.johndoe.panda.proto.model.Game;
import hu.johndoe.panda.proto.model.Orangutan;
import hu.johndoe.panda.proto.model.Tile;
import hu.johndoe.panda.proto.pl.cmd.CommandHandler;
import hu.johndoe.panda.proto.pl.cmd.args.AddOrangutanArgs;

public class AddOrangutanCommandHandler implements CommandHandler <AddOrangutanArgs> {

    @Override
    public void handleCommand (AddOrangutanArgs addOrangutanArgs) {

        Orangutan orangutan = new Orangutan ();
        orangutan.setId (addOrangutanArgs.id);

        // TODO: Check whether tile already contains an animal

        Tile tile = Game.getInstance ().level.getTiles ()
                .stream ()
                .filter (t -> t.getId () == addOrangutanArgs.ontoTileId)
                .findFirst ().orElseThrow (IllegalArgumentException::new);

        orangutan.setStandingOn (tile);
        tile.setCurrentAnimal (orangutan);

        Game.getInstance ().level.getAnimals ().add (orangutan);

    }

}
