public class MyBike {
    private boolean power;
    private int speed;
    private int gear;


    public void isOff() {

        power = false;
    }

    public void isOn() {
        power = true;
        speed = 0;
        gear = 1;
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

    public void accelerate() {
        if (speed < 20) {
            speed++;
        } else if (speed >= 20 && speed <= 30) {
            speed += 2;
        } else if (speed >= 31 && speed <= 40) {
            speed += 3;
        } else {
            speed += 4;
        }
    }

    public void decelerate() {
        if (speed >= 0 && speed < 20) {
            speed--;
        } else if (speed >= 20 && speed <= 30) {
            speed -= 2;
        } else if (speed >= 31 && speed < 40) {
            speed -= 3;
        } else {
            speed -= 4;
        }if(speed < 0) speed = 0;
    }

    public void adjustSpeed(int count) {
        if(count >= 0) speed = count;
        else if(speed <= 30) gear = 2;
        else if(speed <= 40) gear = 3;
        else gear = 4;


    }
}