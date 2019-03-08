package hu.johndoe.panda.skeleton.model;

public class Couch extends Item {

    private boolean isTaken;

    @Override
    public void use (Animal user) {

        if (!isTaken) {
            user.goToSleep (getPlacedOn ());
            isTaken = true;
        }

    }

    @Override
    public void update () {

        if (!isTaken) {
            SleepyWave wave = new SleepyWave ();
            wave.setOrigin (getPlacedOn ());

            getPlacedOn ().spawnWave (wave);
        }

    }

}
