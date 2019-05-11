package hu.johndoe.panda.gui.constants;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResourcesTest {

    @Test
    public void whenInitializing_shouldCorrectlyLoadAssetsWithoutExceptions () {

        Resources.init ();

        assertNotNull (Resources.PandaTexture ());
        assertNotNull (Resources.OrangutanTexture ());
        assertNotNull (Resources.WardrobeTexture ());
        assertNotNull (Resources.GameMachineTexture ());
        assertNotNull (Resources.VendingMachineTexture ());
        assertNotNull (Resources.CouchTexture ());
        assertNotNull (Resources.Favicon ());

        assertNotNull (Resources.GameFont12 ());
        assertNotNull (Resources.GameFont18 ());
        assertNotNull (Resources.GameFont32 ());
        assertNotNull (Resources.GameFont48 ());
        assertNotNull (Resources.GameFont64 ());
        assertNotNull (Resources.GameFont96 ());

    }

}