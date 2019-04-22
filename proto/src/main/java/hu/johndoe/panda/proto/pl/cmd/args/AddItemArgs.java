package hu.johndoe.panda.proto.pl.cmd.args;

public final class AddItemArgs {

    public final boolean addVendingMachine;
    public final boolean addGameMachine;
    public final boolean addWardrobe;
    public final boolean addCouch;

    public final int id;
    public final int placedOnTileId;

    public AddItemArgs (
            boolean addVendingMachine,
            boolean addGameMachine,
            boolean addWardrobe,
            boolean addCouch,
            int id,
            int placedOnTileId
    ) {
        this.addVendingMachine = addVendingMachine;
        this.addGameMachine = addGameMachine;
        this.addWardrobe = addWardrobe;
        this.addCouch = addCouch;
        this.id = id;
        this.placedOnTileId = placedOnTileId;
    }

}
