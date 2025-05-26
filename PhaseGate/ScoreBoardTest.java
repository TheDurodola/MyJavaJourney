import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class ScoreBoardTest{

	@Test
	
	public void testThatTotalInArrayExist(){
		
		int[][] scoresOfTheClass = {{3,3,4},{9,1,3}};
		int[]totalInArray = new int [scoresOfTheClass.length];

		ScoreBoard.getTotalOfScore(scoresOfTheClass, totalInArray);
	}
	
	@Test
	
	public void testThatAverageInArrayExist(){
		
		int[][] scoresOfTheClass = {{3,3,4},{9,1,3}};
		int[]totalInArray = new int [scoresOfTheClass.length];
		double[] averageInArray = new double [scoresOfTheClass.length];
		ScoreBoard.getAverageOfScore(totalInArray, scoresOfTheClass);
	}

	
	@Test

	public void testThatTotalInArrayExist(){

		int[][] scoresOfTheClass = {{3,3,4},{9,1,3}};
		int[]totalInArray = new int [scoresOfTheClass.length];
		int[] expected = {10,13};
		ScoreBoard.getTotalOfScore(scoresOfTheClass, totalInArray);

	
	

	}
	

}