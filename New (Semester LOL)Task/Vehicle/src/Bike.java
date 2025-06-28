public class Bike {
    private boolean isOn;
    private int speed;

    public boolean isOn() {
        return isOn;
    }

    public void useSwitch() {
        isOn = !isOn;
    }

    public void accelerate() {
        if (isOn) {
            if(speed>=0 && speed<=20){
                speed += 1;
                return;
            }
            if(speed>=21 && speed <=30){
                speed += 2;
                return;
            }
            if(speed>=31 && speed <=40){
                speed += 3;
                return;
            }
            if(speed>=41) speed += 4;
        }

    }

    public void decelerate() {
        if (isOn) {
            if(speed>0 && speed<=20){
                speed -= 1;
                return;
            }
            if(speed>=21 && speed <=30){
                speed -= 2;
                return;
            }
            if(speed>=31 && speed <=40){
                speed -= 3;
                return;
            }
            if(speed>=41) speed -= 4;
        }

    }
    public int getSpeed() {
        return speed;
    }
}
