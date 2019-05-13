package hu.johndoe.panda.gui.constants;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class ViewsTest {

    @Test
    public void whenInstantiating_shouldThrowException () {

        try {

            Constructor<Views> constructor = Views.class.getDeclaredConstructor ();
            constructor.setAccessible (true);
            constructor.newInstance ();

        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException e) {
            fail ();
        } catch (InvocationTargetException e) {
            if (!(e.getCause () instanceof UnsupportedOperationException)) {
                fail ();
            }
        }

    }

}