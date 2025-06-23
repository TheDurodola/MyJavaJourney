import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class RotateMatrixTest{

	@Test
	
	public void testThatGet90ClockwiseTurnExist(){
		int[][] numbers = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		RotateMatrix.get90ClockwiseTurn(numbers);

	}
	
	@Test
	
	public void testThatGet90ClockwiseTurnWorks(){
		int[][] numbers = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
		int [][] actual = RotateMatrix.get90ClockwiseTurn(numbers);
		int [][] expected = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
		assertArrayEquals(expected, actual);
	}


}