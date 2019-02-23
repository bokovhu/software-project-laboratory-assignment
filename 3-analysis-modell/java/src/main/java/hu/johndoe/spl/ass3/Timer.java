package hu.johndoe.spl.ass3;

// Stereotype: <<singleton>>
// TODO: Missing from DOCUMENT.md
public class Timer {

    private static final Timer INSTANCE = new Timer ();

    public static Timer getInstance () {
        return INSTANCE;
    }

    public void tick () {

        for (Updatable updatables : Game.getInstance ().updatables) {
            updatables.update ();
        }

    }

}
