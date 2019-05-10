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
            default:
                throw new IllegalArgumentException (Errors.PandaGui_ViewFactory_InvalidViewId ());
        }

    }

}
