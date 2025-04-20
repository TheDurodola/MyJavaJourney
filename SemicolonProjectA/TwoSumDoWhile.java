import java.util.Scanner;

public class TwoSumDoWhile{
public static void main(String[]args){

Scanner input = new Scanner(System.in);


int end=1;

do{
	System.out.print("Enter your first number: ");
		int num1 = input.nextInt();

	System.out.print("Enter your second number: ");
		int num2 = input.nextInt();

int sum = num1+num2;

System.out.printf("%nThe total of the two number is %d", sum);

System.out.print("\n\nIf you wish to end the program. Kindly enter 0. Else enter any other number to restart: ");
int endgame = input.nextInt();

if(endgame==0) {end = end-1;}
}
while(end!=0);

























































































}}