package hu.johndoe.spl.ass3;

public class Panda extends Animal {

    public PandaTrait trait;
    public Couch sleepingIn;

    @Override
    public void collideWithAnimal (Animal animal) {

        if (sleepingIn == null) {
            // Only care about collision if the panda is not sleeping
            animal.collideWithPanda (this);
        }

    }

    @Override
    public void collideWithOrangutan (Animal orangutan) {

        if (sleepingIn == null) {

            // Start to be lead by the orangutan if not sleeping
            startLeading (orangutan);

        }

    }

    // TODO: Missing from DOCUMENT.md
    private void jump () {

        this.standingOn.damage ();
        this.stopLeading ();

    }

    @Override
    public void update () {

        if (sleepingIn == null) {

            for (Wave wave : this.standingOn.waves) {

                if (trait == PandaTrait.COWARD && wave.type == WaveType.RINGING) {
                    stopLeading ();
                } else if (trait == PandaTrait.JUMPY && wave.type == WaveType.BEEPING) {
                    jump ();
                } else if (trait == PandaTrait.SLEEPY && wave.type == WaveType.SLEEPING) {

                    if (wave.origin.accept (this)) {

                        Couch couch = (Couch) wave.origin.currentItem;
                        couch.sleepingPanda = this;
                        this.sleepingIn = couch;

                    }

                }

            }

            if (leaderAnimal != null) {
                // Follow leader animal
            } else {
                // Wander around randomly
            }

        } else {
            // Panda is sleeping, do nothing
        }

    }

}
