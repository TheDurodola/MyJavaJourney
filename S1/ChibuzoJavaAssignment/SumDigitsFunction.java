import java.util.Scanner;

public class SumDigitsFunction{
public static void main(String[]args){
 
Scanner input = new Scanner(System.in);

System.out.print("Enter the number between 1-10,000: ");
int number = input.nextInt();


System.out.print(addDigits(number));
}


static int addDigits(int numbers){
int finalnum = numbers;
int sum = 0;
int divisor = 10_000;
 
if (numbers>10_000 || numbers<1)System.out.print("INVALID INPUT!!!");

else{
while (divisor>0){
int collector = numbers/divisor;
numbers = numbers%divisor;
divisor = divisor/10;
sum = sum +collector;

}

}
return sum;



}}
	