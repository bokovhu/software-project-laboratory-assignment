package hu.johndoe.panda.gui.swing;

import java.awt.*;

public interface View {

    void onEnter ();

    void onExit ();

    void onDraw (Graphics2D g, float delta);

    void onUpdate (float delta);

    GamePanel getGamePanel ();

    default void onKeyDown (int keyCode) {}
    default void onKeyUp (int keyCode) {}
    default void onMousePressed (int button, float x, float y) {}
    default void onMouseReleased (int button, float x, float y) {}
    default void onMouseMoved (float x, float y) {}
    default void onMouseDragged (float x, float y) {}
    default void onMouseScrolled (int amount) {}

}
