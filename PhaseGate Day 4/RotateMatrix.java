import java.util.Arrays;
public class RotateMatrix{
public static void main(String[]args){

int [][] initialMatrix = {{1,2,3},{4,5,6},{7,8,9}};

System.out.print(Arrays.deepToString(get90ClockwiseTurn(initialMatrix)));
}





static int[][] get90ClockwiseTurn(int [][] initialMatrix){

int [][] finalMatrix = new int [initialMatrix.length][initialMatrix.length];

for(int index = 0; index<initialMatrix.length; index++){
	int extraCondition = 2;
		for(int counter = 2; counter>= 0 ; counter--){
			finalMatrix[index][extraCondition] = initialMatrix[counter][index]; 
			 extraCondition--;
		
		}
	
}

return finalMatrix;
}


}