package hu.johndoe.panda.proto.util;

import java.util.List;

public final class StringListUtil {

    private StringListUtil () {
        throw new UnsupportedOperationException ();
    }

    public static boolean listContainsIgnoreCase (final List<String> list, String needle) {

        for (String s : list) {
            if (s.equalsIgnoreCase (needle)) return true;
        }
        return false;

    }

}
