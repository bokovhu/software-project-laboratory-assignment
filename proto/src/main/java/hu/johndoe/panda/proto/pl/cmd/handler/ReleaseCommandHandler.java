package hu.johndoe.panda.proto.pl.cmd.handler;

import hu.johndoe.panda.proto.model.Animal;
import hu.johndoe.panda.proto.model.Game;
import hu.johndoe.panda.proto.pl.cmd.CommandHandler;
import hu.johndoe.panda.proto.pl.cmd.args.ReleaseArgs;

public class ReleaseCommandHandler implements CommandHandler <ReleaseArgs> {

    @Override
    public void handleCommand (ReleaseArgs releaseArgs) {

        Animal animal = Game.getInstance ().level.getAnimals ()
                .stream ()
                .filter (a -> a.getId () == releaseArgs.id)
                .findFirst ().orElseThrow (IllegalArgumentException::new);

        animal.stopLeading ();

    }

}
