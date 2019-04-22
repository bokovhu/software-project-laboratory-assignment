package hu.johndoe.panda.proto._internal;

import java.io.PrintStream;

public interface Printable {

    String toPrintableRepresentation ();
    default String reference (Referencable r) {
        if (r == null) return "(NULL)";
        return "(" + r.getTag () + " " + r.getId () + ")";
    }

}
