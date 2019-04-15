package java.internal;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * This class is used to assign unique numeric identifiers to objects
 */
public class IdGenerator {

    /** Responsible for holding the next assignable numeric ID */
    private static final AtomicInteger GENERATOR = new AtomicInteger (1);

    /** Resets the generator to its initial state */
    public static void reset () {
        GENERATOR.set (1);
    }

    /** Retrieves a new unique numeric identifier */
    public static int fetch () {
        return GENERATOR.getAndIncrement ();
    }

}
