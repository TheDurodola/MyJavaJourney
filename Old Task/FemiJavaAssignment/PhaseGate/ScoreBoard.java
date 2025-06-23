import java.util.Arrays;

public class ScoreBoard{
public static void main(String[]args){

int[][] scoresOfTheClass = {{3,3,4},{9,1,3}};
int[]totalInArray = new int [scoresOfTheClass.length];
double[] averageInArray = new double [scoresOfTheClass.length];


totalInArray = getTotalOfScore(scoresOfTheClass, totalInArray);
averageInArray = getAverageOfScore(totalInArray, scoresOfTheClass);


System.out.println("Total: "+ (Arrays.toString(totalInArray)));
System.out.println("Average: "+ (Arrays.toString(averageInArray)));

}






static int[] getTotalOfScore(int [][] scoresOfTheClass, int [] totalInArray ){

int total = 0;
for(int j = 0; j<scoresOfTheClass.length;j++){
	total =0;
	for(int i = 0; i<=scoresOfTheClass.length;i++){
		total = total + scoresOfTheClass[j][i];
	}
	totalInArray[j] = total;
}
 return totalInArray;

}


static double[] getAverageOfScore(int []totalInArray, int scoresOfTheClass[][]){

double[] average = new double [scoresOfTheClass.length];

for(int i = 0; i < scoresOfTheClass.length; i++){
	average[i] = ((double)totalInArray[i])/scoresOfTheClass[0].length;
}

return average;
}



}