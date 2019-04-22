package hu.johndoe.panda.proto.pl.cmd.handler;

import hu.johndoe.panda.proto.model.Animal;
import hu.johndoe.panda.proto.model.Game;
import hu.johndoe.panda.proto.model.Tile;
import hu.johndoe.panda.proto.pl.cmd.CommandHandler;
import hu.johndoe.panda.proto.pl.cmd.args.MoveArgs;

public class MoveCommandHandler implements CommandHandler <MoveArgs> {

    @Override
    public void handleCommand (MoveArgs moveArgs) {

        Animal animal = Game.getInstance ().level.getAnimals ()
                .stream ()
                .filter (a -> a.getId () == moveArgs.id)
                .findFirst ().orElseThrow (IllegalArgumentException::new);

        Tile tile = Game.getInstance ().level.getTiles ()
                .stream ()
                .filter (t -> t.getId () == moveArgs.ontoTileId)
                .findFirst ().orElseThrow (IllegalArgumentException::new);

        animal.moveTo (tile);

    }

}
