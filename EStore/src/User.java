public class User {
    private String age;
    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private Addresses homeAddress;

    public User(int age, String name, String email, String password, String phoneNumber, Addresses homeAddress) {
        if(age>=12 && age<100){
            this.age = String.valueOf(age);
        }
        else{
            throw new IllegalArgumentException("Age must be between 12 and 100");
        }
        this.name = name;
        if(email.contains("@")){
            if(email.endsWith(".com")){
                this.email = email;
            }
            else{
                throw  new IllegalArgumentException("Email address must end with .com");
            }
        }
        else{
            throw  new IllegalArgumentException("Email address must contain @");
        }
        if(password.length()>6){
            this.password = password;
        }
        else{
            throw  new IllegalArgumentException("Password length must be greater than 6 characters");
        }
        if(phoneNumber.length()==11 && phoneNumber.startsWith("0")) {
            this.phoneNumber = phoneNumber;
        }
        if(phoneNumber.length()==13 && phoneNumber.startsWith("234")) {
            this.phoneNumber = phoneNumber;
        }
        else {
            throw  new IllegalArgumentException("INVALID PHONE NUMBER. ENTER A VALID NIGERIAN PHONE NUMBER");
        }
        this.homeAddress = homeAddress;
    }

}
