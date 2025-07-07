public class Account {
    private final String name;
    private final String accountNumber;
    private final String savedPassword;
    private int balance;

    Account(String firstName, String lastName, String accountNumber, String savedPassword) {
        validateName(firstName);
        validateName(lastName);
        validateAccountNumber(accountNumber);
        validateSavedPassword(savedPassword);
        this.name =  lastName+ " "+ firstName ;
        this.accountNumber = accountNumber;
        this.savedPassword = savedPassword;
    }


    public int getBalance(String inputPassword) {
        validateInputPassword(inputPassword);
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getSavedPassword() {
        return savedPassword;
    }

    public String getName() {
        return name;
    }

    public void deposit(int amount) {
        validateAmount(amount);
        balance += amount;
    }

    public void withdraw(String inputPassword, int amount) {
        validateInputPassword(inputPassword);
        validateAmount(amount);
        validateBalance(amount);
        balance -= amount;
    }

    private void validateSavedPassword(String savedPassword) {
        if (savedPassword.length() != 4) throw new IllegalArgumentException("Password length exceeded");
        if(isNotInteger(savedPassword)) throw new IllegalArgumentException("Password must Contain Number Only");
    }

    private void validateAccountNumber(String accountNumber) {
        if (accountNumber.length() != 10) throw new IllegalArgumentException("Password length exceeded");
        if(isNotInteger(accountNumber)) throw new IllegalArgumentException("Password must Contain Number Only");
    }

    private void validateAmount(int amount) {
        if(amount <= 0) {
            throw new InvalidAmountException();
        }
    }

    private void validateInputPassword(String inputPassword) {
        if (!inputPassword.equals((savedPassword)))  throw new IncorrectPinException();
    }

    private void validateBalance(int amount){
        if(balance < amount) {
            throw new InsufficientFundException();
        }
        if (balance-amount < 100) {
            throw new InsufficientFundException();
        }
    }

    private boolean isNotInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }

    private void validateName(String name) {
        if(name.contains("1") || name.contains("2") || name.contains("3") || name.contains("4") || name.contains("5")|| name.contains("6") || name.contains("7") || name.contains("8")|| name.contains("9") || name.contains("0") ){throw new InvalidNameInputException();
        }
    }
}
