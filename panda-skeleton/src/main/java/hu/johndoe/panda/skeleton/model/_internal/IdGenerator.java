package hu.johndoe.panda.skeleton.model._internal;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator {

    private static final AtomicInteger GENERATOR = new AtomicInteger (1);

    public static int fetch () {
        return GENERATOR.getAndIncrement ();
    }

}
