package hu.johndoe.panda.proto.pl.cmd.args;

public final class ConnectWardrobesArgs {

    public final int wardrobe1Id;
    public final int wardrobe2Id;

    public ConnectWardrobesArgs (int wardrobe1Id, int wardrobe2Id) {
        this.wardrobe1Id = wardrobe1Id;
        this.wardrobe2Id = wardrobe2Id;
    }

}
