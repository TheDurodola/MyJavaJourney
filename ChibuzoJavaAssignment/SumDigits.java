import java.util.Scanner;

public class SumDigits{
public static void main(String[]args){
 
Scanner input = new Scanner(System.in);

System.out.print("Enter the number between 1-10,000: ");
int number = input.nextInt();

int finalnum = number;
int sum = 0;
int divisor = 10_000;
 
if (number>10_000 || number<1)System.out.print("INVALID INPUT!!!");

else{
while (divisor>0){
int collector = number/divisor;
number = number%divisor;
divisor = divisor/10;
sum = sum +collector;

}

System.out.printf("The Sum of the digits is %d",sum);
}

}}
	