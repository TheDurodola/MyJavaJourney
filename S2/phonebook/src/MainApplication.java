import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Phonebook phonebook = new Phonebook();

        while (true) {
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
                    String firstName = input.nextLine();
                    System.out.println("Enter last name:");
                    String lastName = input.nextLine();
                    System.out.println("Enter phone number:");
                    String phoneNumber = input.nextLine();
                    phonebook.addContact(firstName, lastName, phoneNumber);
                    break;
                }


                case 2:
                {
                    System.out.println("Enter contact first name, last name, or phone number:");
                    String userInput = input.nextLine();
                    System.out.println(phonebook.findContact(userInput));
                    break;
                }

                case 3:
                {
                    System.out.println("Enter contact first name, last name, and phone number:");
                    String userInput = input.nextLine();
                    
                }
            }



        }


    }

}
