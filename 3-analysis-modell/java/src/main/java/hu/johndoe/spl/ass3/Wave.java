package hu.johndoe.spl.ass3;

public class Wave implements Updatable {

    public Tile origin;
    public WaveType type;
    public int life = 1;

    @Override
    public void update () {
        life -= 1;
    }

}
