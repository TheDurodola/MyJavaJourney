public class User {
    private String age;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private Addresses homeAddress;

    public User(int age, String firstName, String lastName, String email, String password, String phoneNumber, Addresses homeAddress) {
        validateAge(age);
        validateEmail(email);
        validatePassword(password);
        validatePhoneNumber(phoneNumber);
        validateName(firstName);
        validateName(lastName);
        this.age = String.valueOf(age);
        this.name = firstName +" "+ lastName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
    }





    private void validateAge(int age){
        if(age<=12 || age>80) {
            throw new IllegalArgumentException("Age must be between 12 and 100");
        }
    }

    private void validateEmail(String email){
        if(!email.contains("@")) {
            if (!email.endsWith(".com")) {
                throw new IllegalArgumentException("Email address must end with .com");
            }
            throw new IllegalArgumentException("Email address must contain @");
        }
    }

    private void validatePassword(String password){
        if(password.length()<6){
            throw  new IllegalArgumentException("Password length must be greater than 6 characters");
        }
    }

    private void validatePhoneNumber(String phoneNumber){
        if(!((phoneNumber.length()==11 && phoneNumber.startsWith("0")) || (phoneNumber.length()==13 && phoneNumber.startsWith("234")))) {
            throw  new IllegalArgumentException("INVALID PHONE NUMBER. ENTER A VALID NIGERIAN PHONE NUMBER");
        }
    }

    private void validateName(String name){
        if(name.isBlank() || name.length()<2){
            throw  new IllegalArgumentException("INVALID NAME. ENTER NAME");
        }
    }

}
