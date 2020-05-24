import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConeTest {

    Cone cone = new Cone(5,10);

    @org.junit.Test
    public void whenRadius5AndHeight10ThenBaseArea78point54() {
        Assert.assertEquals(78.54, cone.getBaseArea(), 0.001);
    }

    @Test
    public void whenRadius5AndHeight10ThenDiameter10() {
        Assert.assertEquals(10, cone.getDiameter());
    }

    @Test
    public void whenRadius5AndHeight10ThenPerimeter31point41() {
        Assert.assertEquals(31.41, cone.getPerimeter(), 0.01);
    }

    @Test
    public void whenRadius5AndHeight10ThenConeForming11point18() {
        Assert.assertEquals(11.18, cone.getConeForming(), 0.01);
    }

    @Test
    public void whenRadius5AndHeight10ThenSurfaceArea175point62() {
        Assert.assertEquals(175.62, cone.getSurfaceArea(), 0.01);
    }

    @Test
    public void whenRadius5AndHeight10ThenArea254point16() {
        Assert.assertEquals(254.16, cone.getArea(), 0.01);
    }

    @Test
    public void whenRadius5AndHeight10ThenVolume261point80() {
        Assert.assertEquals(261.80, cone.getVolume(), 0.01);
    }

    @Test
    public void whenRadius5AndHeight10ThenIsConeTrue() {
        Assert.assertTrue(cone.isCone());
    }

    @Test
    public void whenRadius0AndHeight10ThenIsConeFalse() {
        cone.setRadius(0);
        Assert.assertFalse(cone.isCone());
    }

    @Test
    public void whenRadius5AndHeight0ThenIsConeFalse() {
        cone.setHeight(0);
        Assert.assertFalse(cone.isCone());
    }
}