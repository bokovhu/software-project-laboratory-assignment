package hu.johndoe.panda.gui.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class GameScreen extends JPanel {

    private float drawDelta = 0f;

    private long lastDrawTime = System.currentTimeMillis ();

    public abstract void onEnter ();
    public abstract void onExit ();
    public abstract void onDraw (Graphics2D g, float delta);
    public abstract void onUpdate (float delta);

    private void init () {

        setDoubleBuffered (true);

    }

    public GameScreen () {

        init ();

    }

    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponent (g);

        long now = System.currentTimeMillis ();
        long deltaMillisec = now - lastDrawTime;
        drawDelta = (float) (deltaMillisec) / 1000.0f;
        lastDrawTime = now;

        Graphics2D g2 = (Graphics2D) g;

        onDraw (g2, drawDelta);

    }

}
