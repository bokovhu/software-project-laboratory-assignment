package hu.johndoe.panda.proto.model;

import hu.johndoe.panda.proto._internal.ActionLogger;

import java.io.Serializable;

/**
 * A sleepy wave. Couches emit sleepy waves, and when they are perceived by an animal, their internal instincts warn
 * their whole body, that they should be sleeping. With the exception of sleepy pandas, all animals are naturally
 * resistant to the dangerous nature of this kind of anesthetics, thus in case of most animals, the wave has no
 * noticable effect.
 */
public class SleepyWave extends Wave implements Serializable {

    public SleepyWave () {
    }

    public SleepyWave (Tile origin) {
        super (origin);
    }

    /**
     * Makes the wave hit the parameter animal, causing it to perceive the wave, and instructs the animal to go to sleep
     * The only kind of animal that actually reacts to this wave is the sleepy panda.
     * @param animal
     */
    @Override
    public void hit (Animal animal) {

        ActionLogger.log (this, "Hitting animal %s, making it use origin's placed item", animal.toString ());
        ActionLogger.push ();
        getOrigin ().getPlacedItem ().use (animal);

        ActionLogger.pop ();

    }

    @Override
    public String toString () {
        return "SleepyWave{" +
                "id=" + id +
                '}';
    }

}
