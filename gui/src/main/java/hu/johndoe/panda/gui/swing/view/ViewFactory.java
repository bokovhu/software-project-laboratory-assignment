package hu.johndoe.panda.gui.swing.view;

import hu.johndoe.panda.gui.constants.Errors;
import hu.johndoe.panda.gui.constants.Views;
import hu.johndoe.panda.gui.swing.GamePanel;
import hu.johndoe.panda.gui.swing.View;

public final class ViewFactory {

    private ViewFactory () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

    public static View createView (GamePanel gamePanel, int viewId) {

        switch (viewId) {
            case Views.MAIN_MENU:
                return new MainMenuView (gamePanel);
            case Views.PLAY_MENU:
                return new PlayMenuView (gamePanel);
            case Views.GAME:
                return new GameView (gamePanel);
            default:
                throw new IllegalArgumentException (Errors.PandaGui_ViewFactory_InvalidViewId ());
        }

    }

}
