package hu.johndoe.panda.proto.pl.cmd.args;

import java.util.List;

/**
 * Contains the arguments of an "ADD ... TILE ..." command
 */
public final class AddTileArgs {

    /**
     * Contains the flags of the tile. Flags may be one of the following: FRAGILE, START, EXIT
     */
    public final List <String> flags;

    /** The ID of the created tile */
    public final Integer id;

    /** The initial wear value of the created tile */
    public final Integer life;

    public AddTileArgs (List<String> flags, Integer id, Integer life) {
        this.flags = flags;
        this.id = id;
        this.life = life;
    }

}
