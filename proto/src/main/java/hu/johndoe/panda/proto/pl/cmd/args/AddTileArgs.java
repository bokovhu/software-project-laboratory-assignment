package hu.johndoe.panda.proto.pl.cmd.args;

import java.util.List;

public final class AddTileArgs {

    public final List <String> flags;
    public final Integer id;

    public AddTileArgs (List<String> flags, Integer id) {
        this.flags = flags;
        this.id = id;
    }

}
