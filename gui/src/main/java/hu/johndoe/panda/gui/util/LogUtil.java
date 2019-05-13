package hu.johndoe.panda.gui.util;

import hu.johndoe.panda.gui.constants.Errors;

public final class LogUtil {

    private LogUtil () {
        throw new UnsupportedOperationException (Errors.PandaGui_IllegalInstantiation ());
    }

    public static void log (String tag, String message) {
        System.out.printf ("[%s]: %s\n", tag, message);
    }

}
