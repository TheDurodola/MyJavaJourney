/*
DISPLAY a message indicating that the program as started

COLLECT the principal amount and STORE it as principal
COLLECT the annual interest rate and STORE it as annualRate
COLLECT the duration in years and STORE as durationYear


DIVIDE the annualRate by 12 and 100(or simply 1200)and STORE the result as monthlyRate


MULTIPLY durationYear by 12, Store the result as durationMonths

ADD 1 to the monthlyRate and raise the result by the durationMonths(Exponential). MULTIPLY the result by monthRate and store the result as numerator.

ADD 1 to the monthlyRate and raise the result by the durationMonths(Exponential). MINUS 1 fromthe result and store the result as denominator.

DIVIDE the numerator by the denominator and store the result as equation.

MULTIPY equation by the principal STORE as result

DISPLAY the result
*/




import java.util.Scanner;

public class MortgageCalculator{
public static void main(String[]args){

Scanner input = new Scanner(System.in);


System.out.println("WELCOME TO THE MORTGAGE COLLECTOR\n");

System.out.print("Enter the PRINCIPAL AMOUNT: $");
double principal = input.nextDouble();


System.out.print("Enter the ANNUAL INTEREST RATE: ");
double annualRate = input.nextDouble();


System.out.print("Enter the duration in YEARS: ");
int durationYear = input.nextInt();

double monthlyRate = (annualRate/100)/12;

double durationMonths = durationYear *12;


double numerator = monthlyRate * (Math.pow(1+monthlyRate,durationMonths));

double denominator = (Math.pow(1+monthlyRate,durationMonths))-1;

double equation = numerator/denominator;

double result = principal * equation;

System.out.printf("%nYour monthly payment is $%.2f",result);









































}}