package hu.johndoe.panda.gui.swing;

import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.logic.GameDrawRunnable;
import hu.johndoe.panda.gui.logic.GameUpdateRunnable;
import hu.johndoe.panda.gui.util.LogUtil;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainFrame extends JFrame {

    private static final String LOGTAG = "Main Frame";

    private GamePanel gamePanel = null;
    private ExecutorService executorService;

    public MainFrame () {
        init ();
    }

    private void initScreen () {

        LogUtil.log (LOGTAG, "Initializing first game screen");

        gamePanel = new GamePanel ();

        addKeyListener (gamePanel);
        addMouseListener (gamePanel);
        addMouseMotionListener (gamePanel);

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

        setIconImage (Resources.Favicon ().getImage ());

        setContentPane (gamePanel);
        pack ();
        setVisible (true);

    }

    public GamePanel getGamePanel () {
        return gamePanel;
    }

}
