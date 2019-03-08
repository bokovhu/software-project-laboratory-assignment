package hu.johndoe.panda.skeleton.model._internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ActionLogger {

    private static final AtomicInteger LOG_SEQUENCE = new AtomicInteger (1);
    private static final AtomicBoolean ENABLED = new AtomicBoolean (false);

    public static void enable () {
        ENABLED.set (true);
    }

    public static void disable () {
        ENABLED.set (false);
    }

    public static void reset () {
        LOG_SEQUENCE.set (1);
    }

    private static int index () {
        return LOG_SEQUENCE.getAndIncrement ();
    }

    public static void log (
            Object object,
            String event,
            Object ... args
    ) {

        if (ENABLED.get ()) {
            System.out.println (
                    index () + ". " + object + ": " + String.format (event, args)
            );
        }

    }

}
