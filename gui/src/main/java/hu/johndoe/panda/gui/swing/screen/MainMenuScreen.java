package hu.johndoe.panda.gui.swing.screen;

import hu.johndoe.panda.gui.constants.Colors;
import hu.johndoe.panda.gui.swing.GameScreen;

import java.awt.*;

public class MainMenuScreen extends GameScreen {

    private float x = 0f;
    private float y = 0f;
    private float vx = 400.0f;
    private float vy = 400.0f;

    @Override
    public void onEnter () {

    }

    @Override
    public void onExit () {

    }

    @Override
    public void onDraw (Graphics2D g, float delta) {

        g.setColor (Colors.MenuBackground);
        g.fillRect (0, 0, getWidth (), getHeight ());

        g.setColor (Color.RED);
        g.fillRect ((int) x, (int) y, 16, 16);

    }

    @Override
    public void onUpdate (float delta) {

        float dx = vx * delta;
        float dy = vy * delta;

        if (x + dx >= getWidth () || x + dx <= 0f) {
            dx *= -1f;
            vx *= -1f;
        }

        if (y + dy >= getHeight () || y + dy <= 0f) {
            dy *= -1f;
            vy *= -1f;
        }

        x += dx;
        y += dy;

    }

}
