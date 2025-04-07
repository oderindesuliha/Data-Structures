import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyBikeTest {

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
        assertEquals(0, bike.currentSpeed());
    }

    @Test
    public void testDefaultGearOfMyBike() {
        MyBike bike = new MyBike();
        bike.isOn();
        assertTrue(bike.isPower());
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());
    }

    @Test
    public void testThatMyBikeCanBeAcceleratedAndCannotExceed20() {
        MyBike bike = new MyBike();
        bike.isOn();
        assertTrue(bike.isPower());
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());
        for(int index = 0; index <= 20; index++){
            bike.accelerate();
        }
        assertEquals(2, bike.currentGear());
    }

    @Test
    public void testThatMyBikeCanBeDecelerated() {
        MyBike bike = new MyBike();
        bike.isOn();
        assertTrue(bike.isPower());
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());
        bike.decelerate();
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());
    }

    @Test
    public void testThatMyBikeChangesInGearOne() {
        MyBike bike = new MyBike();
        bike.isOn();
        assertTrue(bike.isPower());
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());
        bike.adjustSpeed(15);
        bike.accelerate();
        assertEquals(16, bike.currentSpeed());
        assertEquals(1, bike.currentGear());
    }

    @Test
    public void testThatMyBikeChangesSpeedFromGearOneToGearTwo() {
        MyBike bike = new MyBike();
        bike.isOn();
        assertTrue(bike.isPower());
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());
        for (int index = 0; index <= 20; index++) {
        bike.accelerate();
    }
        assertEquals(2, bike.currentGear());

    }

    @Test
    public void testThatMyBikeChangesSpeedInGearTwo() {
        MyBike bike = new MyBike();
        bike.isOn();
        assertTrue(bike.isPower());
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());
        bike.adjustSpeed(24);
        bike.accelerate();
        assertEquals(26, bike.currentSpeed());
        assertEquals(2, bike.currentGear());
    }

    @Test
    public void testThatMyBikeChangesToGearThree() {
        MyBike bike = new MyBike();
        bike.isOn();
        assertTrue(bike.isPower());
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());
        for(int index = 0; index < 20  ; index++) {
            bike.accelerate();
        }
        //assertEquals(2, bike.currentGear());
        assertEquals(20, bike.currentSpeed());


    }


    @Test
    public void testThatMyBikeDeceleratesInGearFour() {
        MyBike bike = new MyBike();
        bike.isOn();
        assertTrue(bike.isPower());
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());

        bike.adjustSpeed(44);
        bike.decelerate();

        assertEquals(40, bike.currentSpeed());
        assertEquals(4, bike.currentGear());
    }

//    @Test
//    public void testThatMyBikeDeceleratesFromGearFourToGearThree() {
//        MyBike bike = new MyBike();
//        bike.isOn();
//        assertTrue(bike.isPower());
//        assertEquals(0, bike.currentSpeed());
//        assertEquals(1, bike.currentGear());
//
//        bike.adjustSpeed(41);
//        bike.decelerate();
//
//        assertEquals(37, bike.currentSpeed());
//        assertEquals(3, bike.currentGear());
//    }

    @Test
    public void testThatMyBikeDeceleratesInGearThree() {
        MyBike bike = new MyBike();
        bike.isOn();
        assertTrue(bike.isPower());
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());

        bike.adjustSpeed(35);
        bike.decelerate();

        assertEquals(32, bike.currentSpeed());
        assertEquals(3, bike.currentGear());
    }

//    @Test
//    public void testThatMyBikeDeceleratesFromGearThreeToGearTwo() {
//        MyBike bike = new MyBike();
//        bike.isOn();
//        assertTrue(bike.isPower());
//        assertEquals(0, bike.currentSpeed());
//        assertEquals(1, bike.currentGear());
//
//        bike.adjustSpeed(31);
//        bike.decelerate();
//
//        assertEquals(28, bike.currentSpeed());
//        assertEquals(2, bike.currentGear());
//    }

    @Test
    public void testThatMyBikeDeceleratesInGearTwo() {
        MyBike bike = new MyBike();
        bike.isOn();
        assertTrue(bike.isPower());
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());

        bike.adjustSpeed(24);
        bike.decelerate();

        assertEquals(22, bike.currentSpeed());
        assertEquals(2, bike.currentGear());
    }

//    @Test
//    public void testThatMyBikeDeceleratesFromGearTwoToGearOne() {
//        MyBike bike = new MyBike();
//        bike.isOn();
//        assertTrue(bike.isPower());
//        assertEquals(0, bike.currentSpeed());
//        assertEquals(1, bike.currentGear());
//
//        bike.adjustSpeed(22);
//        bike.decelerate();
//
//        assertEquals(18, bike.currentSpeed());
//        assertEquals(1, bike.currentGear());
//    }

    @Test
    public void testThatMyBikeDeceleratesInGearOne() {
        MyBike bike = new MyBike();
        bike.isOn();
        assertTrue(bike.isPower());
        assertEquals(0, bike.currentSpeed());
        assertEquals(1, bike.currentGear());

        bike.adjustSpeed(15);
        bike.decelerate();

        assertEquals(14, bike.currentSpeed());
        assertEquals(1, bike.currentGear());
    }
}
