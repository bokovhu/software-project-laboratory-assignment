package hu.johndoe.panda.skeleton.model;

public class GameMachine extends Item {

    public GameMachine () {
    }

    public GameMachine (Tile placedOn) {
        super (placedOn);
    }

    @Override
    public void update () {

        // if (random) {
        //     JumpyWave wave = new JumpyWave ();
        //     wave.setOrigin (getPlacedOn ());
        //     getPlacedOn ().spawnWave (wave);
        // }

        throw new UnsupportedOperationException ();

    }

}
