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
        if(power) {
            if (speed < 20) {
                speed++;
                gear = 1;
            } if (speed >= 20 && speed <= 30) {
                speed += 2;
                gear = 2;
            }
            } if (speed >= 31 && speed <= 40) {
                speed += 3;
                gear = 3;
            } if (speed >= 41)  {
                speed += 4;
                gear = 4;
            }
        }

    public void decelerate() {
        if (power){
        if (speed <= 20) {
            speed--;
            gear = 1;
        } else if (speed >= 21 && speed <= 30) {
            speed -= 2;
            gear = 2;
        } else if (speed >= 31 && speed < 40) {
            speed -= 3;
            gear = 3;
        } else {
            speed -= 4;
            gear = 4;
        }if(speed < 0) speed = 0;
    }
}

    public void adjustSpeed(int count) {
        if (count >= 0) speed = count;
        else if (speed <= 30) gear = 2;
        else if (speed <= 40) gear = 3;
        else gear = 4;
    }

    }
