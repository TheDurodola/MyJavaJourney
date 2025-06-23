import java.util.Scanner;

public class MultiplicationTable{

public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the value of a: ");
int a = input.nextInt();

System.out.print("Enter the value of b: ");
int b = input.nextInt();


for(int counter=a;counter<=b;counter++){
System.out.print(" "+ counter+ "   ");}

System.out.println(" ");

for(int counter=a;counter<=b;counter++){
System.out.println(counter);
System.out.println(" ");}





}

}