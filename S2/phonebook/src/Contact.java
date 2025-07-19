public class Contact {
    private int id;
    private String firstName;
    private String lastName;
    private String phoneNumber;

    public Contact(int id, String firstName, String lastName, String phoneNumber) {
        validateName(firstName);
        validateName(lastName);
        validateNo(phoneNumber);
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
    }


    public void updateContact(String firstName, String lastName, String phoneNumber) {
        validateName(firstName);
        validateName(lastName);
        validateNo(phoneNumber);
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

    private void validateName(String name){
        try{
            Integer.parseInt(name);
            throw new IllegalArgumentException("Name cannot consist of numbers");
        }
        catch (NumberFormatException _){
        }

    }

    private void validateNo(String phoneNumber) {

        if(!phoneNumber.startsWith("0") || phoneNumber.startsWith("2")){
            throw new IllegalArgumentException("Phone number must start with 0");
        }
        if(phoneNumber.length() != 11){
            throw new IllegalArgumentException("Number size must either be 11");
        }
        try {
            Long.parseLong(phoneNumber);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Phone number can only contain numbers");
        }
    }
}
