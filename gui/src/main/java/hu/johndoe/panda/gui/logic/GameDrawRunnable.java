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

        int fps = 0;
        long lastFrameTime = System.currentTimeMillis ();
        float fpsTimer = 0f;

        while (true) {

            long now = System.currentTimeMillis ();
            fpsTimer += (now - lastFrameTime) / 1000.0f;
            lastFrameTime = now;
            if (fpsTimer >= 1f) {
                LogUtil.log (LOGTAG, "FPS: " + fps);
                fps = 0;
                fpsTimer -= 1f;
            }

            mainFrame.invalidate ();
            mainFrame.repaint ();

            ++fps;

            try {
                Thread.sleep (1L);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }

        }

    }

}
