public enum GeopoliticalCategorizer {
    NORTHCENTRAL("BENUE", "FCT", "KOGI", "KWARA", "NASARAWA", "NIGER", "PLATEAU"),
    NORTHEAST("ADAMAWA", "BAUCHI", "BORNO", "GOMBE", "TARABA", "YOBE"),
    NORTHWEST("KANO", "KATSINA", "KADUNA", "JIGAWA", "KEBBI", "SOKOTO", "ZAMFARA"),
    SOUTHEAST("ABIA", "ANAMBRA", "EBONYI", "ENUGU", "IMO"),
    SOUTHSOUTH("ABIA", "AKWAIBOM", "BAYELSA", "CROSS RIVER", "DELTA", "EDO", "RIVERS"),
    SOUTHWEST("EKITI", "LAGOS", "OGUN", "OSUN", "OYO"),;

    private String[] location;

    GeopoliticalCategorizer(String... location) {
        this.location = location;
    }

    GeopoliticalCategorizer(){

    }



    public String getLocation(String userState) {
        for(GeopoliticalCategorizer zone : GeopoliticalCategorizer.values()) {
            for (String loc : zone.location) {
                if (loc.equals(userState)) {
                    return zone.name();
                }
            }
        }

        return null;
    }
}
