package hu.johndoe.panda.proto.pl.cmd.args;

public class ConnectTilesArgs {

    public final int tile1Id;
    public final int tile2Id;

    public ConnectTilesArgs (int tile1Id, int tile2Id) {
        this.tile1Id = tile1Id;
        this.tile2Id = tile2Id;
    }

}
