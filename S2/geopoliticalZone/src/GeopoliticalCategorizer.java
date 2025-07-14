import java.util.Arrays;

public enum GeopoliticalCategorizer {
    NORTHCENTRAL("BENUE", "FCT", "KOGI", "KWARA", "NASARAWA", "NIGER", "PLATEAU"),
    NORTHEAST("ADAMAWA", "BAUCHI", "BORNO", "GOMBE", "TARABA", "YOBE"),
    NORTHWEST("KANO", "KATSINA", "KADUNA", "JIGAWA", "KEBBI", "SOKOTO", "ZAMFARA"),
    SOUTHEAST("ABIA", "ANAMBRA", "EBONYI", "ENUGU", "IMO"),
    SOUTHSOUTH("AKWAIBOM", "BAYELSA", "CROSS RIVER", "DELTA", "EDO", "RIVERS"),
    SOUTHWEST("EKITI", "LAGOS", "OGUN", "OSUN", "OYO"),;

    private String[] location;

    GeopoliticalCategorizer(String... location) {
        this.location = location;
    }


    public String[] getGeoZoneLocation() {
        return location;
    }

    public static String getLocation(String userState) {
        for (GeopoliticalCategorizer zone : GeopoliticalCategorizer.values()) {
            for (String location : zone.getGeoZoneLocation()) {
                if (location.equalsIgnoreCase(userState)) {
                    return "Your Zone is "+zone.name();
                }
            }
        }
        return "State does not exist";
    }


}
