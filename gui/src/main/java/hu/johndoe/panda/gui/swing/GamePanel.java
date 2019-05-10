package hu.johndoe.panda.gui.swing;

import hu.johndoe.panda.gui.swing.view.MainMenuView;
import hu.johndoe.panda.gui.swing.view.ViewFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GamePanel extends JPanel implements KeyListener, MouseListener, MouseMotionListener {

    private static final String MAIN_TITLE = "Panda Plaza!";

    private float drawDelta = 0f;
    private float screenTime = 0f;

    private long lastDrawTime = System.currentTimeMillis ();

    private View currentView;

    public GamePanel () {

        init ();

    }

    public void update (float delta) {

        currentView.onUpdate (delta);

    }

    private void init () {

        setDoubleBuffered (true);

        currentView = new MainMenuView (this);

    }

    @Override
    protected void paintComponent (Graphics g) {
        super.paintComponent (g);

        long now = System.currentTimeMillis ();
        long deltaMillisec = now - lastDrawTime;
        drawDelta = (float) (deltaMillisec) / 1000.0f;
        lastDrawTime = now;
        screenTime += drawDelta;

        Graphics2D g2 = (Graphics2D) g;

        currentView.onDraw (g2, drawDelta);

    }

    public float getScreenTime () {
        return screenTime;
    }

    public void switchView (int viewId) {

        currentView = ViewFactory.createView (this, viewId);

    }

    @Override
    public void keyTyped (KeyEvent e) {

        // Unhandled on purpose

    }

    @Override
    public void keyPressed (KeyEvent e) {

        currentView.onKeyDown (e.getKeyCode ());

    }

    @Override
    public void keyReleased (KeyEvent e) {

        currentView.onKeyUp (e.getKeyCode ());

    }

    @Override
    public void mouseClicked (MouseEvent e) {

        // Unhandled on purpose

    }

    @Override
    public void mousePressed (MouseEvent e) {

        currentView.onMousePressed (e.getButton (), e.getX (), e.getY ());

    }

    @Override
    public void mouseReleased (MouseEvent e) {

        currentView.onMouseReleased (e.getButton (), e.getX (), e.getY ());

    }

    @Override
    public void mouseEntered (MouseEvent e) {

        // Unhandled on purpose

    }

    @Override
    public void mouseExited (MouseEvent e) {

        // Unhandled on purpose

    }

    @Override
    public void mouseDragged (MouseEvent e) {

        currentView.onMouseDragged (e.getX (), e.getY ());

    }

    @Override
    public void mouseMoved (MouseEvent e) {

        currentView.onMouseMoved (e.getX (), e.getY ());

    }

}
