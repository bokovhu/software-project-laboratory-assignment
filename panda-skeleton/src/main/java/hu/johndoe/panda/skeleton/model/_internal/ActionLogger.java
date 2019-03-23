package hu.johndoe.panda.skeleton.model._internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ActionLogger {

    private static final AtomicInteger LOG_SEQUENCE = new AtomicInteger (1);
    private static final AtomicBoolean ENABLED = new AtomicBoolean (false);
    private static final AtomicInteger LOG_LEVEL = new AtomicInteger (0);

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
            Object... args
    ) {

        if (ENABLED.get ()) {

            StringBuilder sb = new StringBuilder ();
            for (int i = 0; i < LOG_LEVEL.get (); i++) {
                sb.append ("\t");
            }
            sb.append (index ())
                    .append (". ")
                    .append (object)
                    .append (": ")
                    .append (String.format (event, args));

            System.out.println (
                    sb.toString ()
            );
        }

    }

    public static void push () {
        LOG_LEVEL.incrementAndGet ();
    }

    public static void pop () {
        LOG_LEVEL.decrementAndGet ();
    }

}
