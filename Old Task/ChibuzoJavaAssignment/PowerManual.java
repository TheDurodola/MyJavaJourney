public class PowerManual{
public static void main(String[]boj){

java.util.Scanner input = new java.util.Scanner(System.in);

System.out.print("Enter your base: ");
	int base = input.nextInt();

System.out.print("Enter your exponential: ");
	int expo = input.nextInt();


int result = 1;

for(int i =0; i< expo; i++){

result = result*base;
}
System.out.printf("Your result is %d",result);

}}