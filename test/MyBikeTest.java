import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyBikeTest {
    MyBike bike = new MyBike();

    @Test
    public void testThatMyBikeCanBeTurnedOn() {
        MyBike bike = new MyBike();
        bike.isOn();
        assertTrue(bike.isPower());
    }

    @Test
    public void testThatMyBikeCanBeTurnedOff() {
        MyBike bike = new MyBike();
        bike.isOff();
    }

    @Test
    public void testThatMyBikeCanBeTurnedOnAndLaterOff() {
        MyBike bike = new MyBike();
        bike.isOn();
        bike.isOff();
        assertFalse(bike.isPower());
    }

    @Test
    public void testThatMyBikeCanBeTurnedOffAndLaterOn() {
        MyBike bike = new MyBike();
        bike.isOff();
        bike.isOn();
        assertTrue(bike.isPower());
    }

    @Test
    public void testDefaultSpeedOfMyBike() {
        MyBike bike = new MyBike();
        bike.isOn();
        assertTrue(bike.isPower());
        assertEquals(0,bike.currentSpeed());
    }

    @Test
    public void testDefaultGearOfMyBike() {
        MyBike bike = new MyBike();
        bike.isOn();
        assertTrue(bike.isPower());
        assertEquals(0,bike.currentSpeed());
        assertEquals(1,bike.currentGear());
    }

    @Test
    public void testThatMyBikeCanBeAccelerated(){
        MyBike bike = new MyBike();
        bike.isOn();
        assertTrue(bike.isPower());
        assertEquals(15,bike.currentSpeed());
        assertEquals(1,bike.currentGear());
        assertEquals(16,bike.accelerate());
    }
}
