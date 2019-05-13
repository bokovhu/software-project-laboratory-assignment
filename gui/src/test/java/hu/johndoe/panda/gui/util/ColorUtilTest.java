package hu.johndoe.panda.gui.util;

import org.junit.Test;

import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

public class ColorUtilTest {

    @Test
    public void whenInstantiating_shouldThrowException () {

        try {

            Constructor <ColorUtil> constructor = ColorUtil.class.getDeclaredConstructor ();
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

    @Test (expected = IllegalArgumentException.class)
    public void whenHexIsNull_shouldThrowException () {

        ColorUtil.hex (null);

    }

    @Test (expected = IllegalArgumentException.class)
    public void whenHexIsEmpty_shouldThrowException () {

        ColorUtil.hex ("");

    }

    @Test (expected = IllegalArgumentException.class)
    public void whenHexDoesNotMatchFormat_shouldThrowException () {

        ColorUtil.hex ("1234567");

    }

    @Test
    public void whenHexHas6Digits_shouldParseColorCorrectly () {

        Color color = ColorUtil.hex ("95e653");

        assertEquals (149, color.getRed ());
        assertEquals (230, color.getGreen ());
        assertEquals (83, color.getBlue ());
        assertEquals (255, color.getAlpha ());

    }

    @Test
    public void whenHexHas8Digits_shouldParseColorCorrectly () {

        Color color = ColorUtil.hex ("95e65387");

        assertEquals (149, color.getRed ());
        assertEquals (230, color.getGreen ());
        assertEquals (83, color.getBlue ());
        assertEquals (135, color.getAlpha ());

    }

}