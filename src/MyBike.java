public class MyBike {
    private boolean power;
    private int gear;
    private int speed;


    public void isOn() {
        power = true;
        speed = 0;
        gear = 1;
    }

    public void isOff() {

        power = false;
    }

    public boolean isPower() {

        return power;
    }

    public int currentSpeed() {
        return speed;
    }

    public int currentGear() {
        return gear;
    }

    public int accelerate() {
                if (speed < 20) {
                    speed ++;
                    gear = 1;
                }
                else if (speed > 20 && speed <= 30) {
                    speed += 2;
                    gear = 2;
                }
                else if (gear > 30 && gear <= 40) {
                    speed += 3;
                    gear = 3;
                }
                else if (gear > 40 && gear <= 50) {
                    speed += 4;
                    gear = 4;
                }
    }


}
