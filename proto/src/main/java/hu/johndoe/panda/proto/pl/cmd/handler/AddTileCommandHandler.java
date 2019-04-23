package hu.johndoe.panda.proto.pl.cmd.handler;

import hu.johndoe.panda.proto.model.Game;
import hu.johndoe.panda.proto.model.Tile;
import hu.johndoe.panda.proto.pl.cmd.CommandHandler;
import hu.johndoe.panda.proto.pl.cmd.args.AddTileArgs;
import hu.johndoe.panda.proto.util.StringListUtil;

public class AddTileCommandHandler implements CommandHandler <AddTileArgs> {

    @Override
    public void handleCommand (AddTileArgs addTileArgs) {

        Tile tile = new Tile ();
        tile.life = addTileArgs.life;
        tile.setId (addTileArgs.id);
        if (StringListUtil.listContainsIgnoreCase (addTileArgs.flags, "fragile")) {
            tile.isFragile = true;
        }

        Game.getInstance ().level.getTiles ().add (tile);

        if (StringListUtil.listContainsIgnoreCase (addTileArgs.flags, "exit")) {
            tile.isExit = true;
            Game.getInstance ().level.setExitTile (tile);
        }

        if (StringListUtil.listContainsIgnoreCase (addTileArgs.flags, "start")) {
            Game.getInstance ().level.setStartTile (tile);
        }

    }

}
