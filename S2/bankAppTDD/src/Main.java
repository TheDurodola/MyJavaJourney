import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        boolean loopCondition = true;
        while (loopCondition) {
            String mainMenu = """
                    \nWELCOME TO YRSD BANK
                    
                    1) Create Account
                    2) Login
                    0) Exit
                    """;
            System.out.println(mainMenu);
            int navigator = input.nextInt();
            switch (navigator) {
                case 1: {

                    try {
                        System.out.println("Welcome to Create Account");
                        System.out.println("Please enter your first name");
                        String firstName = input.next();
                        System.out.println("Please enter your last name");
                        String lastName = input.next();
                        System.out.println("Please enter your PIN");
                        String pin = input.next();
                        String accountNumber = Long.toString(rand.nextLong(1000000000, 9999999999L));
                        bank.createAccount(firstName, lastName, accountNumber, pin);
                        System.out.println("Account Created!");
                        System.out.println("\nHi " + firstName + ", Your account number is " + accountNumber);
                    }catch (InvalidNameInputException e){
                        System.out.println("Incorrect name entered!");
                    }catch (IncorrectPinException e) {
                        System.out.println("Failed. Enter a valid PIN!");
                    }catch (Exception e){
                        System.out.println("Failed. Please try again!");
                    }
                    break;
                }
                case 2: {

                    try {
                        System.out.println("Welcome to Login");
                        System.out.println("Enter your account number");
                        String accountNumber = input.next();
                        System.out.println("Enter your pin");
                        String pin = input.next();
                        bank.accessAccount(accountNumber, pin);
                        System.out.println("Account Logged in!");

                    }catch (IncorrectPinException e){
                        System.out.println("Failed. Enter a valid PIN!");
                        break;
                    }catch (AccountNotFoundInDatabaseException e){
                        System.out.println("Account not found!");
                        break;
                    }catch (Exception e){
                        System.out.println("Failed. Please try again!");
                    }
                    boolean subMenuLoop = true;
                    while (subMenuLoop) {
                        System.out.printf("\nWelcome %s\n", bank.getName());
                        String subMenu = """
                                
                                1) Balance
                                2) Deposit
                                3) Withdraw
                                4) Transfer
                                0) Exit""";
                        System.out.println(subMenu);
                        int navigation = input.nextInt();
                        switch (navigation) {
                            case 1:
                                System.out.println("Please enter your pin");
                                String balancePin = input.next();
                                try {
                                    System.out.printf("Your current balance is N%.2f ",bank.getBalance(balancePin));
                                }catch (IncorrectPinException e){
                                    System.out.println("Failed. Enter a valid PIN!");
                                }catch (Exception e){
                                    System.out.println("Failed. Something went wrong!");
                                }
                                break;
                            case 2: {
                                System.out.println("Please enter your amount to deposit");
                                try {
                                    int amount = input.nextInt();
                                    bank.deposit(amount);
                                    System.out.println("Deposited!");
                                }catch (InvalidAmountException e){
                                    System.out.println("Incorrect amount entered!");
                                }catch (Exception e){
                                    System.out.println("Failed. Please try again!");
                                }
                                break;
                            }
                            case 3: {
                                System.out.println("Please enter your amount to withdraw");
                                int amount = input.nextInt();
                                System.out.println("Please enter your pin");
                                String password = input.next();
                                try {
                                    bank.withdrawn(password, amount);
                                    System.out.println("Withdrawn!");
                                }catch (IncorrectPinException e) {
                                    System.out.println("Incorrect Pin!");
                                }catch (InvalidAmountException e){
                                    System.out.println("Incorrect Amount!");
                                }catch (InsufficientFundException e){
                                    System.out.println("Insufficient Fund!");
                                }catch (Exception e){
                                    System.out.println("Failed. Something went wrong!");
                                }
                                break;
                            }
                            case 4: {
                                try {
                                    System.out.println("Please enter receiver's account number");
                                    String receiver = input.next();
                                    System.out.println("Enter amount to transfer");
                                    int amount = input.nextInt();
                                    System.out.println("Please enter your pin");
                                    String pinTransfer = input.next();
                                    bank.transfer(pinTransfer, receiver, amount);
                                    System.out.println("Transfer Completed!");
                                }catch (IncorrectPinException e){
                                    System.out.println("Failed. Enter a valid PIN!");
                                }catch (InvalidAmountException e){
                                    System.out.println("Incorrect Amount entered!");
                                }catch (AccountNotFoundInDatabaseException e){
                                    System.out.println("Account not found!");
                                }catch (InsufficientFundException e){
                                    System.out.println("Insufficient Fund!");
                                }catch (Exception e){
                                    System.out.println("Failed. Something went wrong!");
                                }

                                break;
                            }
                            case 0: {
                                System.out.println("Signing Out...");
                                subMenuLoop = false;
                                break;
                            }

                            default: System.out.println("Invalid option!");
                        }
                    }
                    break;
                }
                case 0: {
                    System.out.println("Good Bye!");
                    loopCondition = false;
                    break;
                }

                default:
                    System.out.println("Wrong Input");
            }


        }
    }

}
