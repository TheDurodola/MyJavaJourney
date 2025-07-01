import java.util.*;

public class ScissorRockPaper{
public static void main(String[]args){

Random random = new Random();
Scanner input = new Scanner(System.in);

int counter = 0;
int user = 0;
int computer = 0;
while(counter!=2){

System.out.print("Enter 0 for Scissor, 1 for Rock, and 2 for Paper: ");
int user = input.nextInt();
int computer = random.nextInt(3);

System.out.printf("The computer's pick: %d ",computer);

if(user==0 && computer==0){
System.out.print("\nDRAW! nice try.");}

if(user==1 && computer==1){
	System.out.print("\nDRAW! nice try.");}

if(user==2 && computer==2){
	System.out.print("\nDRAW! nice try.");}

if(user== 0 && computer == 2){
	System.out.print("\nYou have won");
	user = user + 1;}

if(user==1 && computer==0){
	System.out.print("\nYou have won");
	user = user +1;}

if(user==2 && computer==1){
System.out.print("\nYou have won");
user = user + 1;}

if(user== 2 && computer == 0){
System.out.print("\nLOST!!!");
counter= counter+1;}

if(user==0 && computer==1){
System.out.print("\nLOST!!!");
counter= counter+1;}

if(user==1 && computer==2){
System.out.print("\nLOST!!!");
counter= counter+1;}

if(counter>=2){
System.out.print("\nGAME OVER!!!");}
} }}