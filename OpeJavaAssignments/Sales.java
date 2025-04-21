// Ex 4.19
import java.util.Scanner;

public class Sales{
public static void main(String[]boj){

Scanner input = new Scanner(System.in);

int end=1;
double commision = 0;
double salary = 200;

do{

System.out.println("Want to end the program enter any other number than 1-4");
System.out.print("What item did you sell ");
int sold = input.nextInt();

if(sold==1){
System.out.print("You have added item 1\n\n");
commision = commision + 239.99;}

if(sold==2){
System.out.print("You have added item 2\n\n");
commision = commision + 129.75;}

if(sold==3){
System.out.print("You have added item 3\n\n");
commision = commision + 99.95;}

if(sold==4){
System.out.print("You have added item 4\n\n");
commision = commision + 350.89;}

if(sold!=1 && sold!=4 && sold!=2 && sold!=3){
int endgame = 0;
if(endgame==0) {end = end-1;}

commision = commision * 0.09;
salary = salary + commision;
System.out.printf("Your salary plus sale bonus is $%.2f",salary);
}

}

while(end!=0);


































}}