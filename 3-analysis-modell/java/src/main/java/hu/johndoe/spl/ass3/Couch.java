package hu.johndoe.spl.ass3;

public class Couch extends Item {

    public Panda sleepingPanda;

    @Override
    public void update () {

        if (sleepingPanda == null) {

            Wave wave = new Wave ();
            wave.type = WaveType.SLEEPING;
            this.placedOn.spawnWave (wave);

        }

    }

    @Override
    public void use (Animal user) {

        // Problem: user is not of type Panda, but of type Animal. Should find a solution

    }

}
