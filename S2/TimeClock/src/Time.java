public class Time {
    private int hour;
    private int minute;
    private int second;

    Time(){
        this.hour = 0;
    }

    Time(int hour){
        this.hour = hour;
        this.minute = 0;
    }

    Time(int hour,int minute){
        this.hour = hour;
        this.minute = minute;
        this.second = 0;
    }



    Time(int hour, int minute, int second) {
        validateTime(hour, minute, second);

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    private static void validateTime(int hour, int minute, int second) {
        validateHour(hour);
        validateMinute(minute);
        validateSecond(second);
    }

    private static void validateSecond(int second) {
        boolean validateSecond = second < 0 || second >= 60;
        if (validateSecond) { throw  new IllegalArgumentException("Second must be between 0 and 60"); }
    }

    private static void validateMinute(int minute) {
        boolean validateMinute = minute < 0 || minute >= 60;
        if (validateMinute) { throw  new IllegalArgumentException("Minute must be between 0 and 60"); }
    }

    private static void validateHour(int hour) {
        boolean validateHour = hour < 0 || hour >= 24;
        if (validateHour) { throw  new IllegalArgumentException("Hour must be between 0 and 24"); }
    }

    public int gethour() {

        return hour;
    }

    public void sethour(int hour) {
        validateHour(hour);
        this.hour = hour;
    }

    public int getminute() {

        return minute;
    }

    public void setminute(int minute) {
        validateMinute(minute);
        this.minute = minute;
    }

    public int getsecond() {
        return second;
    }

    public void setsecond(int second) {
        validateSecond(second);
        this.second = second;
    }
}
