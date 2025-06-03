import java.util.Scanner;
import java.util.ArrayList;

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
			System.out.print("Enter amount to be deposited: ");
			double depositedAmount = input.nextDouble();
			balance = depositFromAccount(balance,depositedAmount);
			System.out.println("Your current balance: " + balance);
			break;
		case 2:
			System.out.print("WITHDRAWAL\n");
			System.out.print("Enter amount to be withdrawn: ");
			double withdrawnAmount = input.nextDouble();
			balance = withdrawFromAccount(balance, withdrawnAmount);
			System.out.println(balance);

			break;

		case 3: 
			System.out.print("VIEW ALL TRANSACTIONS");
			break;
		case 0 :
			loopConditions=1;
			break;
		default:
			System.out.print("INVALID OPTIONS");
	
	}

}

}

static double depositFromAccount(double balance, double amount){
if(amount > 0){
balance += amount;
}
if(amount <= 0){
System.out.println("INVALID AMOUNT!!!");
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
System.out.println("INVALID");}
}
else{
System.out.println("Invalid value");
}
}
else{
System.out.println("INSUFFICIENT FUNDS");}
return balance;

} 

}