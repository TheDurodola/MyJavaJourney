//Ex 4.34

import java.util.Scanner;

public class SumSpecified{
public static void main(String[]boj){

Scanner input = new Scanner(System.in);

System.out.print("Enter your first figure: ");
int num1 = input.nextInt();

int result = 0;
while(num1>result){
System.out.print("Enter your next figure: ");
int num2 = input.nextInt();
result = result + num2;
}

System.out.printf("The sum of the additional figures are equal to %d which is greater than your initial figure %d",result, num1);



























































































}}