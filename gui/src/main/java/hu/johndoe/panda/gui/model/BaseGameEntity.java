package hu.johndoe.panda.gui.model;

public abstract class BaseGameEntity extends BaseEntity implements Updatable, Drawable {

    private static final long serialVersionUID = 1L;

    protected float x, y;

    public float getX () {
        return x;
    }

    public void setX (float x) {
        this.x = x;
    }

    public float getY () {
        return y;
    }

    public void setY (float y) {
        this.y = y;
    }

}
