// Ex 4.17
import java.util.Scanner;

public class GasMileage{
public static void main(String[]boj){

Scanner input = new Scanner(System.in);

int end=1;
float total = 0;

while (end!=0){
System.out.print("Kindly enter the miles driven per trip: ");
int miles = input.nextInt();
System.out.print("Kindly enter the gallon used per trip: ");
int gallon = input.nextInt();

float milesPerGallon = (float)miles/(float)gallon;
System.out.println(milesPerGallon);

total = total + milesPerGallon;
System.out.print("\nEnter 0 for your result. Otherwise enter any other number to add more data: ");
int endgame = input.nextInt();
if(endgame==0) {end = end-1;

System.out.printf("%nThe total amount of Miles/Gallon during your trip(s) is %.2f miles/gallon",total);}
}

















































































}}