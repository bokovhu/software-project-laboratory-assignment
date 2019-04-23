package hu.johndoe.panda.proto.pl.cmd.args;

/**
 * Contains the arguments of an "ADD ORANGUTAN ..." command
 */
public final class AddOrangutanArgs {

    /** The ID of the created orangutan */
    public final int id;

    /** The ID of the tile to put this orangutan onto */
    public final int ontoTileId;

    public AddOrangutanArgs (int id, int ontoTileId) {
        this.id = id;
        this.ontoTileId = ontoTileId;
    }

}
