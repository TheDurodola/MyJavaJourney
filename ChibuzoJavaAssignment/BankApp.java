import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BankApp{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
ArrayList<String[]> bankDatabase = new ArrayList<>();


String accountNumber = input.next();
String name = input.next();
String phone = input.next();
String balance = input.next();

String [] customerAccount = {accountNumber,name,phone, balance};

bankDatabase.add(customerAccount);

System.out.print(Arrays.toString(bankDatabase.get(0)));





























}}