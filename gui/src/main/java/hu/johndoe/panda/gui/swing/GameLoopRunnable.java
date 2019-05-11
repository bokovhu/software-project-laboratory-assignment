package hu.johndoe.panda.gui.swing;

import hu.johndoe.panda.gui.swing.MainFrame;
import hu.johndoe.panda.gui.util.LogUtil;

public class GameLoopRunnable implements Runnable {

    private static final String LOGTAG = "Game Draw Thread";

    private final MainFrame mainFrame;
    private static final int targetUpdatesPerSecond = 60;

    public GameLoopRunnable (MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void run () {

        LogUtil.log (LOGTAG, "Starting up");

        int fps = 0;
        long lastFrameTime = System.currentTimeMillis ();
        float fpsTimer = 0f;

        final float updateTimestep = 1.0f / (float) targetUpdatesPerSecond;
        int ups = 0;
        float upsTimer = 0f;
        float deltaAccumulator = 0f;

        while (true) {

            // Calculate delta time
            long now = System.currentTimeMillis ();
            float delta = (now - lastFrameTime) / 1000.0f;

            // Handle FPS counter
            fpsTimer += delta;
            lastFrameTime = now;
            if (fpsTimer >= 1f) {
                // LogUtil.log (LOGTAG, "FPS: " + fps);
                fps = 0;
                fpsTimer -= 1f;
            }

            // Handle update counter and UPS counter
            deltaAccumulator += delta;
            upsTimer += delta;
            if (upsTimer >= 1f) {
                ups = 0;
                upsTimer -= 1f;
            }

            // Update if necessary
            while (deltaAccumulator >= updateTimestep) {

                mainFrame.getGamePanel ().update (updateTimestep);
                deltaAccumulator -= updateTimestep;

                ++ups;

            }

            // Redraw
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
