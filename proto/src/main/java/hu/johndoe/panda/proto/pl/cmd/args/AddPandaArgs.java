package hu.johndoe.panda.proto.pl.cmd.args;

/**
 * Contains the arguments of an "ADD ... PANDA ..." command
 */
public final class AddPandaArgs {

    /** True in case of "ADD COWARD PANDA ..." commands */
    public final boolean isCoward;

    /** True in case of "ADD SLEEPY PANDA ..." commands */
    public final boolean isSleepy;

    /** True in case of "ADD JUMPY PANDA ..." commands */
    public final boolean isJumpy;

    /** The ID of the created panda */
    public final int id;

    /** The ID of the tile this panda will be added to */
    public final int ontoTileId;

    public AddPandaArgs (boolean isCoward, boolean isSleepy, boolean isJumpy, int id, int ontoTileId) {
        this.isCoward = isCoward;
        this.isSleepy = isSleepy;
        this.isJumpy = isJumpy;
        this.id = id;
        this.ontoTileId = ontoTileId;
    }

}
