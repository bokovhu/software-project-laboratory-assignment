package hu.johndoe.panda.gui.swing;

import hu.johndoe.panda.gui.constants.Resources;
import hu.johndoe.panda.gui.util.LogUtil;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainFrame extends JFrame {

    private static final String LOGTAG = "Main Frame";

    private static final String TITLE = "Panda Plaza!";
    private static final Dimension PREFERRED_SIZE = new Dimension (1280, 720);

    private GamePanel gamePanel = null;
    private ExecutorService executorService;

    public MainFrame () {
        init ();
    }

    private void initScreen () {

        LogUtil.log (LOGTAG, "Initializing game panel");

        gamePanel = new GamePanel ();

        addKeyListener (gamePanel);
        addMouseListener (gamePanel);
        addMouseMotionListener (gamePanel);
        addMouseWheelListener (gamePanel);

    }

    private void initExecutor () {

        LogUtil.log (LOGTAG, "Initializing game threads");

        executorService = Executors.newFixedThreadPool (1);

        executorService.submit (new GameLoopRunnable (this));

    }

    private void init () {

        LogUtil.log (LOGTAG, "Initializing");

        initScreen ();
        initExecutor ();

        setResizable (true);
        setPreferredSize (PREFERRED_SIZE);
        setTitle (TITLE);
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
