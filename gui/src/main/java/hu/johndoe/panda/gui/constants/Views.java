package hu.johndoe.panda.gui.constants;

public final class Views {

    public static final int MAIN_MENU = 1;
    public static final int PLAY_MENU = 2;
    public static final int GAME = 3;

    private Views () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

}
