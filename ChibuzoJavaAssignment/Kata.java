public class Kata{


static boolean isEven(int number1){

int parity = number1%2;

return parity==0;
}




static boolean isPrime(int number1){

int factorCount=0;

for(int count=2;count<=number1;count++){
int factor = number1%count;

if(factor==0){factorCount=factorCount+1;
	     }
					   }
return factorCount<=1;
}




static int subract(int number1, int number2){
if(number2<0) {
	number2 = number2/-1;
		   }
int subract = number1 - number2;
if(subract<0) {
	subract = subract/-1;
	      }
return subract;
}





static float divide(int number1, int number2){
if(number2==0){
		return 0;
		   }

	int division = number1/number2;
	return division;
}





static int factorOf(int number1){
int factorCount=0;

for(int count=1;count<=number1;count++){
int factor=number1%count;
if(factor==0){factorCount=factorCount+1;}

					}
return factorCount; }





static boolean isSquare(int number2){

double squareRoot = Math.sqrt(number2);

return squareRoot*squareRoot== number2;
}




static boolean isPalindrome(int number2){
int numfinal = number2;
int rev = 0;

if(number2>9999 && number2<=99999){

while(number2>0){
	rev = rev *10 + number2 % 10;
	number2 = number2/10;
	
	}

}
return numfinal==rev;
}

static long factorialOf(int number2 ){
int factorial =1;
for(int counter = number2; counter >= 2; counter--){
factorial = factorial * counter;
}
return factorial;
}









}