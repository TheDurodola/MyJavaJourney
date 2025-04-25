import java.util.Scanner;

public class FactorOfNumber{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the number: ");
int num = input.nextInt();

System.out.printf("The Factor of %d are as listed below;%n",num);

int factor = 1;
while(factor<=num){
int result = num%factor;

if(result==0){
System.out.println(factor);}
factor= ++factor;
}
}}