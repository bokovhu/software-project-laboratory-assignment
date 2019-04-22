package hu.johndoe.panda.proto.pl.cmd.args;

public final class MoveArgs {

    public final int id;
    public final int ontoTileId;

    public MoveArgs (int id, int ontoTileId) {
        this.id = id;
        this.ontoTileId = ontoTileId;
    }

}
