public class ArrayKata{


public static int maximumIn(int arraySize){

int number[] = new int [arraySize];

java.util.Scanner input = new java.util.Scanner(System.in);

int largestNumber=0;
for(int count=0;count<arraySize;count++){
System.out.print("Enter next number: ");
int figure = input.nextInt();
number[count] = figure; 

if(number[count]>number[0]){largestNumber=figure;}
}

return largestNumber;
}




public static int minimumIn(int arraySize){

int number[] = new int [arraySize];

java.util.Scanner input = new java.util.Scanner(System.in);

int smallestNumber = number[0];

for(int count=0;count<arraySize;count++){
System.out.print("Enter number: ");
int figure = input.nextInt();
number[count] = figure; 

if(number[count]<smallestNumber){smallestNumber=number[count];}
}

return smallestNumber;
}





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