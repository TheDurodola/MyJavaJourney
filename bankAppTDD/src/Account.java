public class Account {
    private int balance;
    private String password;

    public int getBalance() {
        return balance;
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
