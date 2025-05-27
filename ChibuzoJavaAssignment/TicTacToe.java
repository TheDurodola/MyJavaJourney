import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe{
public static void main(String[]args){



Scanner input = new Scanner(System.in);

char[][] board = {{' ','|',' ', '|'}, 
		{'-','+','-', '+','-'}, 
		{' ','|',' ', '|',' '}, 
		{'-','+','-', '+','-'}, 
		{' ','|',' ', '|',' '}};

getBoard(board);

System.out.print("Enter your move: ");
int postion = input.nextInt();


switch(postion){
	case 1:
		board[0][0] = 'X';
		break;
	case 2:
		board[0][2] = 'X';
		break;
	case 3:
		board[0][4] = 'X';
		break;
	case 4:
		board[2][0] = 'X';
		break;
	case 5:
		board[2][2] = 'X';
		break;
	case 6:
		board[2][4] = 'X';
		break;
	case 7:
		board[4][0] = 'X';
		break;
	case 8:
		board[4][2] = 'X';
		break;
	case 9:
		board[4][4] = 'X';
		break;
}



getBoard(board);
























}



static void getBoard(char[][]board){ 
for (int rows = 0; rows < board.length; ++rows) {
        for(int columns = 0; columns < board[rows].length; ++columns) {
           System.out.print(board[rows][columns]);
        }
	System.out.println();
     }
System.out.println();
}}