import java.util.Scanner;

public class Palindrome{
public static void main(String[]args){

Scanner input = new Scanner(System.in);
int num = input.nextInt();
int numfinal = num;
int rev = 0;

while(num>0){
	rev = rev *10 + num % 10;
	num = num/10;
}

if(numfinal==rev){
System.out.println("This is a palindrome");}
else{
System.out.println("This is NOT a palindrome");}









}}