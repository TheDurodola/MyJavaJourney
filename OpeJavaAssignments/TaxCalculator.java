// Ex 4.20
import java.util.Scanner;

public class TaxCalculator{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the name: ");
String name = input.nextLine();

System.out.print("\nEnter earnings: ");
double earnings = input.nextInt();
 
if(earnings<30000){
earnings = earnings*0.15;
System.out.printf("%n%s total tax to be paid is $%.2f",name ,earnings);} 

else{
earnings = earnings*0.20;
System.out.printf("%n%s total tax to be paid is $%.2f",name ,earnings);}






























































































}
}