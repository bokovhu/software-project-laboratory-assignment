package hu.johndoe.panda.gui.constants;

public final class Sizes {

    public static final float ShadowOffset = 4f;
    public static final float ButtonWidth = 256f;
    public static final float ButtonHeight = 128f;
    public static final float ButtonSpacing = 16f;
    // Font's baseline is a bit weird, and AWT cannot correctly determine the height of the rendered text
    // This value was found by experimenting, and it seems to correctly place the text in the middle of the button
    public static final float ButtonTextYOffset = -12f;

    private Sizes () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

    public static final float TileRadius = 40f;
    public static final float PandaSize = 64f;
    public static final float OrangutanSize = 64f;
    public static final float GameMachineSize = 64f;
    public static final float ChocolateVendingMachineSize = 64f;
    public static final float CouchSize = 64f;
    public static final float WardrobeSize = 64f;

}
