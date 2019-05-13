package hu.johndoe.panda.gui.swing.view;

import hu.johndoe.panda.gui.swing.GamePanel;
import hu.johndoe.panda.gui.swing.View;

public abstract class ViewBase implements View {

    private final GamePanel gamePanel;

    public ViewBase (GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public GamePanel getGamePanel () {
        return gamePanel;
    }

    protected float getScreenTime () {
        return gamePanel.getScreenTime ();
    }

    protected float getWidth () {
        return gamePanel.getWidth ();
    }

    protected float getHeight () {
        return gamePanel.getHeight ();
    }

}
