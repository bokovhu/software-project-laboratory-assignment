package hu.johndoe.panda.proto.pl.cmd.args;

/**
 * Contains the arguments of a "USE ..." command
 */
public final class UseArgs {

    /** The user animal's ID */
    public final int id;

    /** The ID of the item to use */
    public final int itemId;

    public UseArgs (int id, int itemId) {
        this.id = id;
        this.itemId = itemId;
    }

}
