package hu.johndoe.panda.proto.pl.cmd.args;

/**
 * Contains the arguments of a "CONNECT WARDROBE ..." command
 */
public final class ConnectWardrobesArgs {

    /** The ID of one of the wardrobe */
    public final int wardrobe1Id;

    /** The ID of the other wardrobe */
    public final int wardrobe2Id;

    public ConnectWardrobesArgs (int wardrobe1Id, int wardrobe2Id) {
        this.wardrobe1Id = wardrobe1Id;
        this.wardrobe2Id = wardrobe2Id;
    }

}
