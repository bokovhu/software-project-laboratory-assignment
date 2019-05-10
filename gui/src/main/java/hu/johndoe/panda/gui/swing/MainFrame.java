package hu.johndoe.panda.gui.swing;

import hu.johndoe.panda.gui.logic.GameDrawRunnable;
import hu.johndoe.panda.gui.logic.GameUpdateRunnable;
import hu.johndoe.panda.gui.swing.screen.MainMenuScreen;
import hu.johndoe.panda.gui.util.LogUtil;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainFrame extends JFrame {

    private static final String LOGTAG = "Main Frame";

    private GameScreen currentScreen = null;
    private ExecutorService executorService;

    private void initScreen () {

        LogUtil.log (LOGTAG, "Initializing first game screen");

        currentScreen = new MainMenuScreen ();

    }

    private void initExecutor () {

        LogUtil.log (LOGTAG, "Initializing game threads");

        executorService = Executors.newFixedThreadPool (2);

        executorService.submit (new GameDrawRunnable (this));
        executorService.submit (new GameUpdateRunnable (this));

    }

    private void init () {

        LogUtil.log (LOGTAG, "Initializing");

        initScreen ();
        initExecutor ();

        setResizable (true);
        setPreferredSize (new Dimension (1280, 720));
        setTitle ("Panda Plaza");
        setDefaultCloseOperation (WindowConstants.EXIT_ON_CLOSE);

        setContentPane (currentScreen);
        pack ();
        setVisible (true);

    }

    public MainFrame () {
        init ();
    }

    public GameScreen getCurrentScreen () {
        return currentScreen;
    }

}
