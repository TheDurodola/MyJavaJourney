public class AirConditioner {
    private boolean power;
    private int temperature;



    public boolean getPowerStatus() {
        return power;
    }

    public void turnOn() {
        power = !power;
        if (power) {        temperature = 16;}

    }

    public void turnOff() {
        power = false;
    }

    public int getTemp() {
        return temperature;
    }

    public void increaseTemp() {
        if(power) if (temperature < 30) temperature += 1;
    }

    public void decreaseTemp() {
       if(power) if(temperature > 16)  temperature -= 1;
    }
}
