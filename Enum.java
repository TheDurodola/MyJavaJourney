import java.util.Scanner;
import java.util.Random;

public class Enum{
public static void main(String[] args){

Scanner input = new Scanner(System.in);
Random random = new Random();


//int questionGenerator = arrayOfPicks.sort(() => Math.random()-1)

int correctScore = 0;
int attempts = 0;

for(int loopOfDeath = 0; loopOfDeath < 9; loopOfDeath++){
int index = 0;

int questionGenerator = random.nextInt(9);

System.out.print("\nChoose your question: ");
int userQuestion = input.nextInt();



userQuestion = questionGenerator;

String arrayOfQuestions[] = {"Is the capital of Germany, Berlin?", "Is 2 a alphabet?", "Is A an alphabet?", "Is Nigeria a country?", "Is the capital of France, Paris?", "is the full name of the Acroynm AC called Air Cuban?", "Is the name of Lagos State Governor Durodola Abolaji Toliat?", "Is the name of this planet Mars?", "Is the currency used in Nigeria called Dollars?", "Is 10 x 9 = 88?"};


while(index!=3){



if(arrayOfQuestions[userQuestion]==arrayOfQuestions[0]){
	System.out.println("\n"+arrayOfQuestions[0]);

	String [] arrayOfAnswers = {"a","b"};

	System.out.println("a) True b) False");
	System.out.print("Choose your Answer: ");
	String userAnswer = input.nextLine();

	if(userAnswer.equals(arrayOfAnswers[0])){
		System.out.println("Correct");
		index = 3;
		correctScore += 1;
		
	};

	if(userAnswer.equals(arrayOfAnswers[1])){
		System.out.println("Incorrect");;
		index +=1;
	};
	
	if(userAnswer!=arrayOfAnswers[1] && userAnswer!=arrayOfAnswers[0]){
		System.out.println("Invalid options");
	};

};



if(arrayOfQuestions[userQuestion]==arrayOfQuestions[1]){
	System.out.println(arrayOfQuestions[1]);

	String [] arrayOfAnswers = {"a","b"};


	System.out.println("a) True b) False");

	System.out.print("Choose your Answer: ");
	String userAnswer = input.nextLine();

	if(userAnswer.equals(arrayOfAnswers[0])){
		System.out.println("Correct");
		index = 3;
		correctScore += 1;

	};

	if(userAnswer.equals(arrayOfAnswers[1])){
		System.out.println("Incorrect");;
		index +=1;

	};
	
	if(userAnswer!=arrayOfAnswers[1] && userAnswer!=arrayOfAnswers[0]){
		System.out.println("Invalid options");
	};

};



if(arrayOfQuestions[userQuestion]==arrayOfQuestions[2]){
	System.out.println(arrayOfQuestions[2]);

	String [] arrayOfAnswers = {"a","b"};


	System.out.println("a) True b) False");
	System.out.print("Choose your Answer: ");
	String userAnswer = input.nextLine();

	if(userAnswer.equals(arrayOfAnswers[0])){
		System.out.println("Correct");
		index = 3;
		correctScore += 1;
	};

	if(userAnswer.equals(arrayOfAnswers[1])){
		System.out.println("Incorrect");;
		index +=1;

	};
	
	if(userAnswer!=arrayOfAnswers[1] && userAnswer!=arrayOfAnswers[0]){
		System.out.println("Invalid options");
	};

};



if(arrayOfQuestions[userQuestion]==arrayOfQuestions[3]){
	System.out.println(arrayOfQuestions[3]);

	String [] arrayOfAnswers = {"a","b"};


	System.out.println("a) True b) False");
	System.out.print("Choose your Answer: ");
	String userAnswer = input.nextLine();

	if(userAnswer.equals(arrayOfAnswers[0])){
		System.out.println("Correct");
		index = 3;
		correctScore += 1;

	};

	if(userAnswer.equals(arrayOfAnswers[1])){
		System.out.println("Incorrect");;
		index +=1;

	};
	
	if(userAnswer!=arrayOfAnswers[1] && userAnswer!=arrayOfAnswers[0]){
		System.out.println("Invalid options");
	};

};



if(arrayOfQuestions[userQuestion]==arrayOfQuestions[4]){
	System.out.println(arrayOfQuestions[4]);

	String [] arrayOfAnswers = {"a","b"};


	System.out.println("a) True b) False");
	System.out.print("Choose your Answer: ");
	String userAnswer = input.nextLine();

	if(userAnswer.equals(arrayOfAnswers[0])){
		System.out.println("Correct");
		index = 3;
		correctScore += 1;

	};

	if(userAnswer.equals(arrayOfAnswers[1])){
		System.out.println("Incorrect");;
		index +=1;

	};
	
	if(userAnswer!=arrayOfAnswers[1] && userAnswer!=arrayOfAnswers[0]){
		System.out.println("Invalid options");
		index +=1;

	};

};



if(arrayOfQuestions[userQuestion]==arrayOfQuestions[5]){
	System.out.println(arrayOfQuestions[5]);

	String [] arrayOfAnswers = {"a","b"};


	System.out.println("a) True b) False");
	System.out.print("Choose your Answer: ");
	String userAnswer = input.nextLine();

	if(userAnswer.equals(arrayOfAnswers[0])){
		System.out.println("Incorrect");;
		index +=1;

	};

	if(userAnswer.equals(arrayOfAnswers[1])){
		System.out.println("Correct");
		index = 3;
		correctScore += 1;

	};
	
	if(userAnswer!=arrayOfAnswers[1] && userAnswer!=arrayOfAnswers[0]){
		System.out.println("Invalid options");
	};

};



if(arrayOfQuestions[userQuestion]==arrayOfQuestions[6]){
	System.out.println(arrayOfQuestions[6]);

	String [] arrayOfAnswers = {"a","b"};


	System.out.println("a) True b) False");
	System.out.print("Choose your Answer: ");
	String userAnswer = input.nextLine();

	if(userAnswer.equals(arrayOfAnswers[0])){
		System.out.println("Incorrect");;
		index +=1;

	};

	if(userAnswer.equals(arrayOfAnswers[1])){
		System.out.println("Correct");
		index = 3;
		correctScore += 1;

	};
	
	if(userAnswer!=arrayOfAnswers[1] && userAnswer!=arrayOfAnswers[0]){
		System.out.println("Invalid options");
	};

};



if(arrayOfQuestions[userQuestion]==arrayOfQuestions[7]){
	System.out.println(arrayOfQuestions[7]);

	String [] arrayOfAnswers = {"a","b"};


	System.out.println("a) True b) False");
	System.out.print("Choose your Answer: ");
	String userAnswer = input.nextLine();

	if(userAnswer.equals(arrayOfAnswers[0])){
		System.out.println("Incorrect");;
		index +=1;

	};

	if(userAnswer.equals(arrayOfAnswers[1])){
		System.out.println("Correct");
		index = 3;
		correctScore += 1;

	};
	
	if(userAnswer!=arrayOfAnswers[1] && userAnswer!=arrayOfAnswers[0]){
		System.out.println("Invalid options");
	};

};



if(arrayOfQuestions[userQuestion]==arrayOfQuestions[8]){
	System.out.println(arrayOfQuestions[8]);

	String [] arrayOfAnswers = {"a","b"};


	System.out.println("a) True b) False");
	System.out.print("Choose your Answer: ");
	String userAnswer = input.nextLine();

	if(userAnswer.equals(arrayOfAnswers[0])){
		System.out.println("Incorrect");;
		index +=1;

	};

	if(userAnswer.equals(arrayOfAnswers[1])){
		System.out.println("Correct");
		index = 3;
		correctScore += 1;


	};
	
	if(userAnswer!=arrayOfAnswers[1] && userAnswer!=arrayOfAnswers[0]){
		System.out.println("Invalid options");
	};

};



if(arrayOfQuestions[userQuestion]==arrayOfQuestions[9]){
	System.out.println(arrayOfQuestions[9]);

	String [] arrayOfAnswers = {"a","b"};


	System.out.println("a) True b) False");
	System.out.print("Choose your Answer: ");
	String userAnswer = input.nextLine();

	if(userAnswer.equals(arrayOfAnswers[0])){
		System.out.println("Incorrect");;
		index +=1;

	};

	if(userAnswer.equals(arrayOfAnswers[1])){
		System.out.println("Correct");
		index = 3;
		correctScore += 1;

	};
	
	if(userAnswer!=arrayOfAnswers[1] && userAnswer!=arrayOfAnswers[0]){
		System.out.println("Invalid options");
	};

};
if(index==3){
attempts += 1;
}
};

System.out.print("\nEnter 0 to end the program and collate result: ");
int continuationQuestion = input.nextInt();
if(continuationQuestion==0){

loopOfDeath=9;

};



}

System.out.println("CorrectScore/Attempts = " + correctScore + "/" + attempts);










}


}