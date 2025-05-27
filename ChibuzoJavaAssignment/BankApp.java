import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BankApp{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
ArrayList<String[]> bankDatabase = new ArrayList<>();


bankDatabase.add(createAccount("1234567890", "Abolaji", "08144194199"));
bankDatabase.add(createAccount("9876543210", "Aboluwatife", "07041941941"));

System.out.print(Arrays.toString(bankDatabase.get(1)));

}


static String[] createAccount(String accountNumber, String name, String phone){
String balance = "0";
String [] customerAccount = {accountNumber,name,phone, balance};
return customerAccount;
}

static String[] withdrawAmount(ArrayList<String[]> bankDatabase, String[] customerAccount){

for(int index = 0; index < bankDatabase.size(); index++){
	if (customerAccount == bankDatabase.get(index)[0]){
	return bankDatabase(index);
	}
}


}

}