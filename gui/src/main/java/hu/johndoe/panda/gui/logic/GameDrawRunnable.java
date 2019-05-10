package hu.johndoe.panda.gui.logic;

import hu.johndoe.panda.gui.swing.MainFrame;
import hu.johndoe.panda.gui.util.LogUtil;

public class GameDrawRunnable implements Runnable {

    private static final String LOGTAG = "Game Draw Thread";

    private final MainFrame mainFrame;

    public GameDrawRunnable (MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void run () {

        LogUtil.log (LOGTAG, "Starting up");

        while (true) {

            mainFrame.invalidate ();
            mainFrame.repaint ();

            try {
                Thread.sleep (1L);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }

        }

    }

}
