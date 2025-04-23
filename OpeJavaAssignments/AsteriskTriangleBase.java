import java.util.Scanner;

public class AsteriskTriangleBase{
public static void main(String...boj){

Scanner input = new Scanner(System.in);

System.out.print("Enter the base of the triangle(1-10): ");
int rows = input.nextInt(); 

if(rows<=10 && rows>0){
for(int i=1; i<=rows;i++){
	int p=1;
for(int j=1;j<=i;j++){
		System.out.print("*");
	}
	System.out.println();
}
}
}}