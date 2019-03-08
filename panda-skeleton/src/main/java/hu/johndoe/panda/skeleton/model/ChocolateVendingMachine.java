package hu.johndoe.panda.skeleton.model;

public class ChocolateVendingMachine extends Item {

    public ChocolateVendingMachine () {
    }

    public ChocolateVendingMachine (Tile placedOn) {
        super (placedOn);
    }

    @Override
    public void update () {

        // if (random) {
        //     BeepWave wave = new BeepWave ();
        //     wave.setOrigin (getPlacedOn ());
        //     getPlacedOn ().spawnWave (wave);
        // }

        throw new UnsupportedOperationException ();

    }

}
