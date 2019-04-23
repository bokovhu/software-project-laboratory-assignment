package hu.johndoe.panda.proto.pl.cmd.args;

/**
 * Contains the arguments of a "CONNECT TILE ..." command
 */
public class ConnectTilesArgs {

    /** The ID of one of the tiles */
    public final int tile1Id;

    /** The ID of the other tile */
    public final int tile2Id;

    public ConnectTilesArgs (int tile1Id, int tile2Id) {
        this.tile1Id = tile1Id;
        this.tile2Id = tile2Id;
    }

}
