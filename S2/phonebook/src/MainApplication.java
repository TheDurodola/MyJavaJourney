import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Phonebook phonebook = new Phonebook();
        boolean loopCondition = true;
        while (loopCondition) {
            String mainMenu = """
                    \t\tPhonebook
                    1) Add Contact
                    2) Find Contact
                    3) Delete Contact
                    4) Edit Contact
                    5) Exit
                    
                    Enter Choice""";
            System.out.println(mainMenu);
            int navigate = input.nextInt();

            switch (navigate) {
                case 1:
                {
                    System.out.println("Enter first name:");
                    String firstName = input.next();
                    System.out.println("Enter last name:");
                    String lastName = input.next();
                    System.out.println("Enter phone number:");
                    String phoneNumber = input.next();
                    try {
                        phonebook.addContact(firstName, lastName, phoneNumber);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }

                    break;
                }


                case 2:
                {
                    System.out.println("Enter contact first name, last name, or phone number:");
                    String userInput = input.next();
                    try {
                        System.out.println(phonebook.findContact(userInput));
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                }

                case 3:
                    {
                    System.out.println("Enter contact first name:");
                    String firstName = input.next();
                    System.out.println("Enter contact last name:");
                    String lastName = input.next();
                    System.out.println("Enter contact phone number:");
                    String phoneNumber = input.next();
                    try {
                        phonebook.deletedContact(firstName,  lastName, phoneNumber);
                    } catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                    }
                case 4:
                    {
                    System.out.println("Enter contact ID:");
                    int contactID = input.nextInt();
                    System.out.println("Enter new first name:");
                    String firstName = input.next();
                    System.out.println("Enter new last name:");
                    String lastName = input.next();
                    System.out.println("Enter new phone number:");
                    String phoneNumber = input.next();
                    try {
                        phonebook.editContact(contactID, firstName, lastName, phoneNumber);
                    }catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                    break;
                    }

                case 0:
                    loopCondition = false;

                default:
                    {
                        System.out.println("Invalid input!");
                        break;
                    }
            }



        }


    }

}
