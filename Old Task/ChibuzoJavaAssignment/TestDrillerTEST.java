public class Driver{
public static void main(String[]args){

java.util.Scanner input = new java.util.Scanner(System.in);

System.out.print("Enter the number of copies you would like to purchase: ");
int numberOfCopies = input.nextInt();

if(numberOfCopies>=1){
System.out.print("The amount you are to pay is: $");
System.out.print(TestDriller.price(numberOfCopies));}

else {System.out.print("INVALID AMOUNT!!!");}
}}