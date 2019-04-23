package hu.johndoe.panda.proto.pl.cmd.handler;

import hu.johndoe.panda.proto.model.*;
import hu.johndoe.panda.proto.pl.cmd.CommandHandler;
import hu.johndoe.panda.proto.pl.cmd.args.AddPandaArgs;

/**
 * Handles an "ADD PANDA ..." command
 */
public class AddPandaCommandHandler implements CommandHandler <AddPandaArgs> {

    @Override
    public void handleCommand (AddPandaArgs addPandaArgs) {

        Panda panda = null;

        if (addPandaArgs.isCoward) {
            panda = new CowardPanda ();
        } else if (addPandaArgs.isJumpy) {
            panda = new JumpyPanda ();
        } else if (addPandaArgs.isSleepy) {
            panda = new SleepyPanda ();
        }

        panda.setId (addPandaArgs.id);

        Tile standingOn = Game.getInstance ().level.getTiles ()
                .stream ().filter (t -> t.getId () == addPandaArgs.ontoTileId)
                .findFirst ().orElseThrow (IllegalArgumentException::new);

        // TODO: Check if panda is addable

        panda.setStandingOn (standingOn);
        standingOn.setCurrentAnimal (panda);

        Game.getInstance ().level.getAnimals ().add (panda);

    }

}
