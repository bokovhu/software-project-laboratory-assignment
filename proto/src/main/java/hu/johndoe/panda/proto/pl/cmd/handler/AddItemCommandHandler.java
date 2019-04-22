package hu.johndoe.panda.proto.pl.cmd.handler;

import hu.johndoe.panda.proto.model.*;
import hu.johndoe.panda.proto.pl.cmd.CommandHandler;
import hu.johndoe.panda.proto.pl.cmd.args.AddItemArgs;

public class AddItemCommandHandler implements CommandHandler <AddItemArgs> {

    @Override
    public void handleCommand (AddItemArgs addItemArgs) {

        Item item = null;

        if (addItemArgs.addVendingMachine) {
            item = new ChocolateVendingMachine ();
        } else if (addItemArgs.addGameMachine) {
            item = new GameMachine ();
        } else if (addItemArgs.addWardrobe) {
            item = new Wardrobe ();
        } else if (addItemArgs.addCouch) {
            item = new Couch ();
        }

        item.setId (addItemArgs.id);

        Tile placedOn = Game.getInstance ().level.getTiles ()
                .stream ()
                .filter (t -> t.getId () == addItemArgs.placedOnTileId)
                .findFirst ().orElseThrow (IllegalArgumentException::new);

        // TODO: Check if item is placable

        item.setPlacedOn (placedOn);
        placedOn.setPlacedItem (item);

    }

}
