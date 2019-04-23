package hu.johndoe.panda.proto.pl.cmd.handler;

import hu.johndoe.panda.proto.model.Game;
import hu.johndoe.panda.proto.model.Tile;
import hu.johndoe.panda.proto.pl.cmd.CommandHandler;
import hu.johndoe.panda.proto.pl.cmd.args.ConnectTilesArgs;

/**
 * Handles a "CONNECT TILE ..." command
 */
public class ConnectTilesCommandHandler implements CommandHandler<ConnectTilesArgs> {

    @Override
    public void handleCommand (ConnectTilesArgs connectTilesArgs) {

        Tile tile1 = Game.getInstance ().level.getTiles ()
                .stream ()
                .filter (t -> t.getId () == connectTilesArgs.tile1Id)
                .findFirst ()
                .orElseThrow (IllegalArgumentException::new);

        Tile tile2 = Game.getInstance ().level.getTiles ()
                .stream ()
                .filter (t -> t.getId () == connectTilesArgs.tile2Id)
                .findFirst ()
                .orElseThrow (IllegalArgumentException::new);

        tile1._addNeighbour (tile2);

    }

}
