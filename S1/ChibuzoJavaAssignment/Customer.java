public class Customer {
private String name;
private String phoneNumber;
private String accountNumber;
private double balance;

public Customer(String name, String phoneNumber, String accountNumber, double balance) {
this.name = name;
this.phoneNumber = phoneNumber;
this.accountNumber = accountNumber;
this.balance = balance;
}

public String getName() {
return name;
}

public String getPhoneNumber() {
return phoneNumber;
}

public String getAccountNumber() {
return accountNumber;
}

public double getBalance() {
return balance;
}

public void deposit(double amount) {
if (amount > 0) {
balance = balance + amount;
}
}

public boolean withdraw(double amount) {
if (amount > 0 && amount <= balance) {
balance = balance - amount;
return true;
}
return false;
}

}