public class ArrayKata2{

static int maximumIn(int [] numbers){
int max = numbers[0];
for(int counter=1;counter<=numbers.length-1;counter++){
if(numbers[counter]>max){
max = numbers[counter]; 
			}
							}
return max;
}


static int minimumIn(int [] numbers){
int min = numbers[0];
for(int counter=1;counter<=numbers.length-1;counter++){
if(numbers[counter]<min){
min = numbers[counter]; 
			}
							}

return min; 
}

static int sumOf(int [] numbers){
int sum = 0;
for(int counter=0;counter<numbers.length;counter++){
sum = sum + numbers[counter];
}

return sum;
}




static int sumOfEvenNumbersIn(int [] numbers){
int sum = 0;
for(int counter=0;counter<numbers.length;counter++){
if(numbers[counter]%2==0)sum = sum + numbers[counter];
}
return sum;
}





static int sumOfOddNumbersIn(int [] numbers){
int sum = 0;
for(int counter=0;counter<numbers.length;counter++){
if(numbers[counter]%2==1)sum = sum + numbers[counter];
}
return sum;
}





static int[] maximumAndMinimumOf(int [] numbers){

int min = numbers[0];
int max = numbers[0];
for(int counter=1;counter<=numbers.length-1;counter++){
if(numbers[counter]<min){
min = numbers[counter]; 
			}
if(numbers[counter]>max){
max = numbers[counter]; 
			}
}
int [] minMax = {min,max};
return minMax;
}


static int noOfOddNumbersIn(int [] numbers){
int sum = 0;
for(int counter=0;counter<numbers.length;counter++){
if(numbers[counter]%2!=0)sum = sum + 1;
}
return sum;
}

static int noOfEvenNumbersIn(int [] numbers){
int sum = 0;
for(int counter=0;counter<numbers.length;counter++){
if(numbers[counter]%2==0)sum = sum + 1;
}
return sum;
}


static int[] evenNumbersIn(int [] numbers){
int [] evenNumbers = new int [noOfEvenNumbersIn(numbers)];
int index=0;
for(int counter=0;counter<evenNumbers.length;counter++){
if(numbers[counter]%2==0) evenNumbers[index++] = numbers[counter];
}
return evenNumbers;
}



static int[] oddNumbersIn(int [] numbers){
int [] oddNumbers = new int [noOfOddNumbersIn(numbers)];
int index=0;
for(int counter=0;counter<oddNumbers.length;counter++){
if(numbers[counter]%2==1 && numbers[counter]!=1) oddNumbers[index++] = numbers[counter];
}
return oddNumbers;
}




static int[] squareNumbersIn(int [] numbers){
for(int counter =0;counter<numbers.length;counter++){
numbers[counter] = numbers[counter]*numbers[counter];
}
return numbers;
}


















}