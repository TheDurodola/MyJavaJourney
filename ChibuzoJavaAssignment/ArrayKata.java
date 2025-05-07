public class ArrayKata{

//Question 1
public static int maximumIn(int arraySize){

int number[] = new int [arraySize];

java.util.Scanner input = new java.util.Scanner(System.in);

System.out.print("Enter number: ");
number[0] = input.nextInt();
int largestNumber= number[0];

for(int count=1;count<arraySize;count++){
System.out.print("Enter number: ");
int figure = input.nextInt();
number[count]=figure;

if(figure>largestNumber)largestNumber=number[count];
}
return largestNumber;
}



//Question 2
public static int minimumIn(int arraySize){

int number[] = new int [arraySize];

java.util.Scanner input = new java.util.Scanner(System.in);

System.out.print("Enter number: ");
number[0] = input.nextInt();
int smallestNumber= number[0];

for(int count=1;count<arraySize;count++){
System.out.print("Enter next number: ");
int figure = input.nextInt();
number[count]=figure;

if(figure<smallestNumber)smallestNumber=number[count];
}


return smallestNumber;}




//Question 3
static int sumOf(int arraySize){
java.util.Scanner input = new java.util.Scanner(System.in);
int number[] = new int [arraySize];

int total = 0;
for(int count=0;count<arraySize;count++){

System.out.print("Enter your "+(count+1)+" number: ");
int figure = input.nextInt();
number[count]=figure;
total = total + number[count];

}
System.out.println();
System.out.print("The total of all numbers is: ");

return total;

}



//Question 4
static int sumOfEvenNumbersIn(int arraySize){
java.util.Scanner input = new java.util.Scanner(System.in);
int number[] = new int [arraySize];

int total = 0;
for(int count=0;count<arraySize;count++){

System.out.print("Enter your "+(count+1)+" number: ");
int figure = input.nextInt();
number[count]=figure;
if(number[count]%2==0)total = total + number[count];

}
System.out.println();
System.out.print("The total of all EVEN numbers is: ");

return total;

}



//Question 5
static int sumOfOddNumbersIn(int arraySize){
java.util.Scanner input = new java.util.Scanner(System.in);
int number[] = new int [arraySize];

int total = 0;
for(int count=0;count<arraySize;count++){

System.out.print("Enter your "+(count+1)+" number: ");
int figure = input.nextInt();
number[count]=figure;
if(number[count]%2!=0)total = total + number[count];

}
System.out.println();
System.out.print("The total of all ODD numbers is: ");

return total;

}



//Question 6
static int[] maximumAndMinimumOf(int arraySize){

int number[] = new int [arraySize];

java.util.Scanner input = new java.util.Scanner(System.in);

System.out.print("Enter number: ");
number[0] = input.nextInt();
int largestNumber= number[0];
int smallestNumber= number[0];

for(int count=1;count<arraySize;count++){
System.out.print("Enter number: ");
int figure = input.nextInt();
number[count]=figure;

if(figure>largestNumber)largestNumber=number[count];
if(figure<smallestNumber)smallestNumber=number[count];


}

return new int[] {largestNumber,smallest};
}


//Question 7
static int noOfOddNumbersIn(int arraySize){
java.util.Scanner input = new java.util.Scanner(System.in);
int number[] = new int [arraySize];

int total = 0;
for(int count=0;count<arraySize;count++){

System.out.print("Enter your "+(count+1)+" number: ");
int figure = input.nextInt();
number[count]=figure;
if(number[count]%2!=0)total = total + 1;

}
System.out.println();
System.out.print("The total of all ODD numbers is: ");

return total;

}





//Question 8
static int noOfEvenNumbersIn(int arraySize){
java.util.Scanner input = new java.util.Scanner(System.in);
int number[] = new int [arraySize];

int total = 0;
for(int count=0;count<arraySize;count++){

System.out.print("Enter your "+(count+1)+" number: ");
int figure = input.nextInt();
number[count]=figure;
if(number[count]%2==0)total = total + 1;

}
System.out.println();
System.out.print("The total of all EVEN numbers is: ");

return total;

}


































}