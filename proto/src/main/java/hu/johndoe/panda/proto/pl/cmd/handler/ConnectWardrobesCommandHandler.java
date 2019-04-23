package hu.johndoe.panda.proto.pl.cmd.handler;

import hu.johndoe.panda.proto.model.Game;
import hu.johndoe.panda.proto.model.Tile;
import hu.johndoe.panda.proto.model.Wardrobe;
import hu.johndoe.panda.proto.pl.cmd.CommandHandler;
import hu.johndoe.panda.proto.pl.cmd.args.ConnectWardrobesArgs;

/**
 * Handles a "CONNECT WARDROBE ..." command
 */
public class ConnectWardrobesCommandHandler implements CommandHandler <ConnectWardrobesArgs> {

    @Override
    public void handleCommand (ConnectWardrobesArgs connectWardrobesArgs) {

        Wardrobe wardrobe1 = Game.getInstance ().level.getTiles ()
                .stream ()
                .filter (t -> t.getPlacedItem () != null)
                .filter (t -> t.getPlacedItem ().getId () == connectWardrobesArgs.wardrobe1Id)
                .map (Tile::getPlacedItem)
                .map (Wardrobe.class::cast)
                .findFirst ().orElseThrow (IllegalArgumentException::new);

        Wardrobe wardrobe2 = Game.getInstance ().level.getTiles ()
                .stream ()
                .filter (t -> t.getPlacedItem () != null)
                .filter (t -> t.getPlacedItem ().getId () == connectWardrobesArgs.wardrobe2Id)
                .map (Tile::getPlacedItem)
                .map (Wardrobe.class::cast)
                .findFirst ().orElseThrow (IllegalArgumentException::new);

        // TODO: Check if it is not already set

        wardrobe1.setOtherWardrobe (wardrobe2);
        wardrobe2.setOtherWardrobe (wardrobe1);

    }

}
