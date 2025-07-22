public class Contact {
    private final int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(int id, String firstName, String lastName, String phoneNumber) {
        validateInput(firstName, lastName, phoneNumber);
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }


    public void updateContact(String firstName, String lastName, String phoneNumber) {
        validateInput(firstName, lastName, phoneNumber);
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private void validateInput(String firstName, String lastName, String phoneNumber) {
        validateName(firstName);
        validateName(lastName);
        validateNo(phoneNumber);
    }

    private void validateName(String name){
        try{
            Integer.parseInt(name);
            throw new IllegalNameException("Name can't consist of number");
        }
        catch (NumberFormatException _){
        }
        if(name.isBlank()) throw new IllegalNameException("Name input can't be empty");

    }

    private void validateNo(String phoneNumber) {

        if (phoneNumber.startsWith("+")) {
            phoneNumber = phoneNumber.substring(1);

            if(phoneNumber.length() < 8) {
                throw new IllegalPhoneNumberException("Phone number must be at least 8 digits");
            }
        }

        if (!phoneNumber.startsWith("+")){
            if(phoneNumber.length() < 3) {
                throw  new IllegalPhoneNumberException("Phone number must be at least 3 digits");
            }
        }

        try {
            Long.parseLong(phoneNumber);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Phone number can only contain numbers");
        }
    }
}
