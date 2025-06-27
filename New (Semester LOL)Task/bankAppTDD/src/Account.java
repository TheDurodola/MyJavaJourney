public class Account {
    private int balance;
    private final String savedPassword;

    Account(String savedPassword) {
        this.savedPassword = savedPassword;
    }
    public int getBalance(String inputPassword) {
        if (inputPassword.equals(savedPassword))return balance;

        return 0;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }
}
