package hu.johndoe.panda.gui.logic;

import hu.johndoe.panda.gui.swing.MainFrame;
import hu.johndoe.panda.gui.util.LogUtil;

public class GameUpdateRunnable implements Runnable {

    private static final String LOGTAG = "Game Update Thread";

    private static final int targetUpdatesPerSecond = 60;
    private final MainFrame mainFrame;
    private float deltaAccumulator = 0f;
    private long lastUpdateTime = System.currentTimeMillis ();

    public GameUpdateRunnable (MainFrame mainFrame) {
        this.mainFrame = mainFrame;
    }

    @Override
    public void run () {

        LogUtil.log (LOGTAG, "Starting up");

        lastUpdateTime = System.currentTimeMillis ();
        final float updateTimestep = 1.0f / (float) targetUpdatesPerSecond;

        while (true) {

            long now = System.currentTimeMillis ();
            long deltaMillisec = now - lastUpdateTime;
            deltaAccumulator += deltaMillisec / 1000.0f;
            lastUpdateTime = now;

            while (deltaAccumulator >= updateTimestep) {

                mainFrame.getGamePanel ().update (updateTimestep);
                deltaAccumulator -= updateTimestep;

            }

            try {
                Thread.sleep (1L);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }

        }

    }

}
