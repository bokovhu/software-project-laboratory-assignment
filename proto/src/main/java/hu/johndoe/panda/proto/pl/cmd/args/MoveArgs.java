package hu.johndoe.panda.proto.pl.cmd.args;

/**
 * Contains the arguments of a "MOVE ..." command
 */
public final class MoveArgs {

    /** The ID of the animal to move */
    public final int id;

    /** The ID of the target tile */
    public final int ontoTileId;

    public MoveArgs (int id, int ontoTileId) {
        this.id = id;
        this.ontoTileId = ontoTileId;
    }

}
