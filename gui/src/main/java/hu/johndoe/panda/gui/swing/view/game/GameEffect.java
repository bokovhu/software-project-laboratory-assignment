package hu.johndoe.panda.gui.swing.view.game;

import hu.johndoe.panda.gui.model.Drawable;
import hu.johndoe.panda.gui.model.Updatable;

public abstract class GameEffect implements Drawable, Updatable {

    protected final float lifespan;
    protected float life;

    protected GameEffect (float lifespan) {
        this.lifespan = lifespan;
    }

    public boolean isAlive () {
        return life < lifespan;
    }

    @Override
    public void update (float delta) {

        life += delta;

    }

}
