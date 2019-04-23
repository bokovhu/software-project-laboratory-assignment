package hu.johndoe.panda.proto.pl.cmd.args;

/**
 * Contains the arguments of a "RELEASE ..." command
 */
public final class ReleaseArgs {

    /** The ID of the animal to release */
    public final int id;

    public ReleaseArgs (int id) {
        this.id = id;
    }

}
