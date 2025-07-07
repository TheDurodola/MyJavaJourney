import java.util.ArrayList;

public class Bank {
    @SuppressWarnings("FieldMayBeFinal")
    private ArrayList<Account> bankDatabase;
    private Integer currentAccount;

    Bank(){
        bankDatabase = new ArrayList<>();
    }


    public void createAccount(String firstName, String lastName, String accountNumber, String password){
        bankDatabase.add(new Account(firstName, lastName, accountNumber, password));

    }

    public boolean accessAccount(String accountNumber, String password) {
        for(Account account: bankDatabase){
            if(account.getAccountNumber().equals(accountNumber)){
                if(account.getSavedPassword().equals(password)){
                    currentAccount = bankDatabase.indexOf(account);
                    return true;
                }
            }
        }
        throw new AccountNotFoundInDatabaseException();
    }

    public double getBalance(String password){
        return bankDatabase.get(currentAccount).getBalance(password);
    }

    public String getName(){
        return bankDatabase.get(currentAccount).getName();
    }

    public void deposit(int amount){
        bankDatabase.get(currentAccount).deposit(amount);
    }

    public void withdrawn(String password, int amount) {
        bankDatabase.get(currentAccount).withdraw(password, amount);
    }

    public void transfer(String password, String number, int amount) {
        withdrawn(password, amount);
        int receiver = findReceiverAccount(number);
        bankDatabase.get(receiver).deposit(amount);
    }

    private int findReceiverAccount(String number){
        for(Account account: bankDatabase){
            if(account.getAccountNumber().equals(number)){
                return bankDatabase.indexOf(account);
            }
        }
        throw new AccountNotFoundInDatabaseException();
    }
}
