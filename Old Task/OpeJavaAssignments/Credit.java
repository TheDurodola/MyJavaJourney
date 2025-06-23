//Exercise 4.18
import java.util.Scanner;

public class Credit{
public static void main(String[]boj){


Scanner input = new Scanner(System.in);

System.out.print("Enter the account number: ");
int accNo = input.nextInt();

System.out.print("Enter the balance at the beginning of the month: ");
int initialBalance = input.nextInt();

System.out.print("Enter the total of all items charged by the customer this month: ");
int itemPrice = input.nextInt();

System.out.print("Enter the total of all credits applied to the customer’s account this month: ");
int totalCredit = input.nextInt();

System.out.print("Enter the allowed credit limit: ");
int creditLimit = input.nextInt();




int finalBalance = initialBalance + itemPrice - totalCredit;


System.out.printf("Your new balance is %d",finalBalance);


if(finalBalance<creditLimit){
System.out.print("%nCREDIT LIMIT EXCEEDED");}



























































































}}