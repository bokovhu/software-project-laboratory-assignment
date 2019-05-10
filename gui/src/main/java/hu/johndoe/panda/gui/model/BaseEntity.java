package hu.johndoe.panda.gui.model;

import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class BaseEntity implements Serializable {

    private static final AtomicInteger ID_GENERATOR = new AtomicInteger (1);

    protected final int id = ID_GENERATOR.getAndIncrement ();

    public int getId () {
        return id;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass () != o.getClass ()) {
            return false;
        }
        BaseEntity that = (BaseEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode () {
        return Objects.hash (id);
    }

}
