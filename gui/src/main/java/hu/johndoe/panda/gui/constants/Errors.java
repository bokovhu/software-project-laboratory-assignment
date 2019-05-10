package hu.johndoe.panda.gui.constants;

public final class Errors {

    private Errors () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

    public static String PandaGui_IllegalInstantiation () {
        return "You shall not `new`!";
    }

    public static String PandaGui_ColorUtil_HexNull () {
        return "Color hex string should not be null or empty string!";
    }

    public static String PandaGui_ColorUtil_HexInvalidFormat () {
        return "Color hex should be in [0-9a-fA-F]{6} or [0-9a-fA-F]{8} format!";
    }

    public static String PandaGui_ViewFactory_InvalidViewId () {
        return "Invalid view ID!";
    }

}
