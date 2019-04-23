package hu.johndoe.panda.proto.pl.cmd.args;

/**
 * Contains the arguments for an "ADD ITEM ..." command
 */
public final class AddItemArgs {

    /** True in case of "ADD VENDINGMACHINE ..." commands */
    public final boolean addVendingMachine;

    /** True in case of "ADD GAMEMACHINE ..." commands */
    public final boolean addGameMachine;

    /** True in case of "ADD WARDROBE ..." commands */
    public final boolean addWardrobe;

    /** True in case of "ADD COUCH ..." commands */
    public final boolean addCouch;

    /** The ID of the created item */
    public final int id;

    /** The ID of the tile this item will be placed on */
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
