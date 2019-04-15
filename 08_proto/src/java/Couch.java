package java;

import hu.johndoe.panda.skeleton.model._internal.ActionLogger;

public class Couch extends Item {

    private boolean isTaken;

    public Couch () {
    }

    public Couch (Tile placedOn) {
        super (placedOn);
    }

    @Override
    public void use (Animal user) {

        ActionLogger.log (this, "Getting used by %s", user.toString ());
        ActionLogger.push ();

        if (!isTaken) {
            ActionLogger.log (this, "I am not yet taken, making user go to sleep");
            user.goToSleep (getPlacedOn ());
            isTaken = true;
        }

        ActionLogger.pop ();

    }

    @Override
    public void update () {

        ActionLogger.log (this, "Updating");

        if (!isTaken) {
            ActionLogger.log (this, "I am not yet taken, spawning a sleepy wave");
            SleepyWave wave = new SleepyWave ();
            wave.setOrigin (getPlacedOn ());

            getPlacedOn ().spawnWave (wave);
        }

    }

    @Override
    public String toString () {
        return "Couch{" +
                "id=" + id +
                '}';
    }

}
