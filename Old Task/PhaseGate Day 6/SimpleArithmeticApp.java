import java.util.Random;
import java.util.Scanner;

public class SimpleArithmeticApp{
public static void main(String[] args){

Random random = new Random();
Scanner input = new Scanner(System.in);


int loopCondition = 0;
int score = 0; 
while(loopCondition<10){
	int number1 = random.nextInt(100);
	int number2 = random.nextInt(100);

	int minuend = 0;
	int subtrahend = 0;


	if(number1 > number2){
		minuend = number1;
		subtrahend = number2;
	}

	if(number2 > number1){
		minuend = number2;
		subtrahend = number1;
	}

	int tries = 0;
	while(tries<2){
		int result = minuend - subtrahend;
		System.out.printf("%d - %d ",minuend,subtrahend);


		System.out.print("What is your answer: ");
		int userInput = input.nextInt();



		if(userInput == result){
			System.out.println("Correct!!!\n");
			tries+=2;
			score++;
		}

		if(userInput != result){
			System.out.println("Incorrect. Try again.\n");
			tries++;
		}

	}

loopCondition++;
}

System.out.printf("Your total score is %d", score);























}}