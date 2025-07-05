public class Account {
    private String name;
    private int accountNumber;
    private final String savedPassword;
    private int balance;

    Account(String savedPassword) {
        this.savedPassword = savedPassword;
    }

    public int getBalance(String inputPassword) {
        validate(inputPassword);
        return balance;
    }

    public void deposit(int amount) {
        validate(amount);
        balance += amount;
    }

    public void withdraw(int amount) {
        validate(amount);
        validateBalance(amount);
        balance -= amount;
    }




    public void validate(int amount) {
        if(amount <= 0) {
            throw new InvalidAmountException();
        }
    }

    public void validate(String inputPassword) {
        if (!inputPassword.equals((savedPassword)))  throw new IncorrectPinException();
    }
    public void validateBalance(int amount){
        if(balance < amount) {
            throw new InsufficientFundException();
        }
    }
}
