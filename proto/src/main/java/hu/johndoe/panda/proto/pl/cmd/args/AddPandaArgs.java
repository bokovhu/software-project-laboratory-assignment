package hu.johndoe.panda.proto.pl.cmd.args;

public final class AddPandaArgs {

    public final boolean isCoward;
    public final boolean isSleepy;
    public final boolean isJumpy;
    public final int id;
    public final int ontoTileId;

    public AddPandaArgs (boolean isCoward, boolean isSleepy, boolean isJumpy, int id, int ontoTileId) {
        this.isCoward = isCoward;
        this.isSleepy = isSleepy;
        this.isJumpy = isJumpy;
        this.id = id;
        this.ontoTileId = ontoTileId;
    }

}
