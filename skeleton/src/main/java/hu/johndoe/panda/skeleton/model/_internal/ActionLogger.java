package hu.johndoe.panda.skeleton.model._internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Used to log skeleton events, such as function calls
 */
public class ActionLogger {

    /** Responsible for indexing log entries */
    private static final AtomicInteger LOG_SEQUENCE = new AtomicInteger (1);

    /** Defines whether or not the logger is currently enabled */
    private static final AtomicBoolean ENABLED = new AtomicBoolean (false);

    /** Defines the indentation level of the next log entry */
    private static final AtomicInteger LOG_LEVEL = new AtomicInteger (0);

    /** Enables the logger */
    public static void enable () {
        ENABLED.set (true);
    }

    /** Disables the logger */
    public static void disable () {
        ENABLED.set (false);
    }

    /** Resets the logger to its initial state */
    public static void reset () {
        LOG_SEQUENCE.set (1);
    }

    private static int index () {
        return LOG_SEQUENCE.getAndIncrement ();
    }

    /**
     * Creates, and if the logger is enabled outputs a new log entry
     * @param object the object where the log entry originates from
     * @param event a textual representation of the event that's being logged
     * @param args format parameters for the "event" string
     */
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
