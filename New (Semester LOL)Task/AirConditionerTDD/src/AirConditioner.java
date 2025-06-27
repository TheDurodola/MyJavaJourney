public class AirConditioner {
    private boolean power;
    private int temperature;



    public boolean getPowerStatus() {
        return power;
    }

    public void turnOn() {
        power = true;
        temperature = 16;
    }

    public void turnOff() {
        power = false;
    }

    public int getTemp() {
        return temperature;
    }

    public void increaseTemp() {
        if (temperature < 30) temperature += 1;
    }

    public void decreaseTemp() {
        if(temperature > 16)  temperature -= 1;
    }
}
