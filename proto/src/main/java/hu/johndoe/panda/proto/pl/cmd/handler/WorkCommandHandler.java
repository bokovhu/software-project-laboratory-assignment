package hu.johndoe.panda.proto.pl.cmd.handler;

import hu.johndoe.panda.proto.model.Game;
import hu.johndoe.panda.proto.model.Tile;
import hu.johndoe.panda.proto.model.Updatable;
import hu.johndoe.panda.proto.pl.cmd.CommandHandler;
import hu.johndoe.panda.proto.pl.cmd.args.WorkArgs;

/**
 * Handles a "WORK ..." command
 */
public class WorkCommandHandler implements CommandHandler <WorkArgs> {

    @Override
    public void handleCommand (WorkArgs workArgs) {

        Updatable updatable = null;

        if (workArgs.isAnimal) {

            updatable = Game.getInstance ().level
                    .getAnimals ()
                    .stream ()
                    .filter (a -> a.getId () == workArgs.id)
                    .findFirst ().orElseThrow (IllegalArgumentException::new);

        } else if (workArgs.isItem) {

            updatable = Game.getInstance ().level
                    .getTiles ()
                    .stream ()
                    .filter (t -> t.getPlacedItem () != null)
                    .filter (t -> t.getPlacedItem ().getId () == workArgs.id)
                    .map (Tile::getPlacedItem)
                    .findFirst ().orElseThrow (IllegalArgumentException::new);

        }

        updatable.update ();

    }

}
