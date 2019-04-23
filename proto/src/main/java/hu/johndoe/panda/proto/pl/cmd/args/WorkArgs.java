package hu.johndoe.panda.proto.pl.cmd.args;

/**
 * Contains the arguments of a "WORK ..." command
 */
public class WorkArgs {

    /** True, if the Updatable is an animal */
    public final boolean isAnimal;

    /** True, if the Updatable is an item */
    public final boolean isItem;

    /** The ID of the Updatable */
    public final int id;

    public WorkArgs (boolean isAnimal, boolean isItem, int id) {
        this.isAnimal = isAnimal;
        this.isItem = isItem;
        this.id = id;
    }

}
