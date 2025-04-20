public class Factorial{
public static void main(String[]boj){

java.util.Scanner input = new java.util.Scanner(System.in);
int factorial = 1;

System.out.printf("Enter postive figure: ");
int number = input.nextInt();

if(number<=0){
System.out.println("This is not a positive figure");}

else{
for(int counter = number; counter >= 2; counter--){
factorial = factorial * counter;
}
System.out.printf("%d! = %d",number, factorial);
}




















































































}}