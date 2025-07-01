import java.util.Scanner;

public class BankAtmSimulation{
public static void main(String[] args){

double balance = 0;

Scanner input = new Scanner(System.in);
//ArrayList <String>() transactionsLog = new ArrayList<String>();
String mainMenuDisplay = """
\t\tBANK ATM SIMULATION


1) DEPOSIT
2) WITHDRAWAL
3) VIEW ALL TRANSACTIONS
0) EXIT

Enter your choice: """;


int loopConditions = 0;
while(loopConditions!=1){
	System.out.print(mainMenuDisplay);

	int mainMenuNavigator = input.nextInt();

	switch(mainMenuNavigator){
		case 1:
			System.out.print("DEPOSIT\n");
			System.out.print("Enter amount to be deposited: N");
			double depositedAmount = input.nextDouble();
			balance = depositIntoAccount(balance,depositedAmount);
			System.out.println("Your current balance: N" + balance);
			break;
		case 2:
			System.out.print("WITHDRAWAL\n");
			System.out.print("Enter amount to be withdrawn: N");
			double withdrawnAmount = input.nextDouble();
			balance = withdrawFromAccount(balance, withdrawnAmount);
			System.out.println("Your current balance: N" + balance);
			break;

		case 3: 
			System.out.println("VIEW ALL TRANSACTIONS");
			System.out.print("Update coming soon...");
			break;
		case 0 :
			loopConditions=1;
			break;
		default:
			System.out.print("INVALID OPTIONS");
	
	}

}

}

static double depositIntoAccount(double balance, double amount){
if(amount >= 500){
balance += amount;
}
if(amount>=0 && amount<500){
System.out.print("Amount less than N500 can't be deposited.");
}
if(amount < 0){
System.out.println("INVALID AMOUNT. Negative amount can't be withdrawn.");
}
return balance;
} 


static double withdrawFromAccount(double balance, double amount){
double maxWithdrawalAmount = balance * 0.9;
if(balance>100){
if(amount<maxWithdrawalAmount && amount <=20_000){
if(amount%500==0 || amount%1000==0){balance -= amount;
balance -= 100;}
else{
System.out.println("INVALID. Amount entered is not a multiple of N500 or N1000.");}
}
else{
System.out.println("AMOUNT ENTERED EXCEEDS THE WITHDRAWABLE AMOUNT!");
}
}
else{
System.out.println("INSUFFICIENT FUNDS.");}
return balance;

} 

}