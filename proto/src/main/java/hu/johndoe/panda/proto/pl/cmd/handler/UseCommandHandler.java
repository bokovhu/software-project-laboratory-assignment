package hu.johndoe.panda.proto.pl.cmd.handler;

import hu.johndoe.panda.proto.model.Animal;
import hu.johndoe.panda.proto.model.Game;
import hu.johndoe.panda.proto.model.Item;
import hu.johndoe.panda.proto.model.Tile;
import hu.johndoe.panda.proto.pl.cmd.CommandHandler;
import hu.johndoe.panda.proto.pl.cmd.args.UseArgs;

/**
 * Handles a "USE ..." command
 */
public class UseCommandHandler implements CommandHandler <UseArgs> {

    @Override
    public void handleCommand (UseArgs useArgs) {

        Animal animal = Game.getInstance ().level.getAnimals ()
                .stream ()
                .filter (a -> a.getId () == useArgs.id)
                .findFirst ().orElseThrow (IllegalArgumentException::new);

        Item item = Game.getInstance ().level.getTiles ()
                .stream ()
                .filter (t -> t.getPlacedItem () != null)
                .filter (t -> t.getPlacedItem ().getId () == useArgs.itemId)
                .map (Tile::getPlacedItem)
                .findFirst ().orElseThrow (IllegalArgumentException::new);

        item.use (animal);

    }

}
