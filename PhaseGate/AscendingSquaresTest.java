import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class AscendingSquaresTest{

	@Test
	
	public void testThatUseBubbleSortingExist(){

	int[] arrays = {3,53,45};
	
	AscendingSquares.useBubbleSorting(arrays);
	}


	@Test
	
	public void testThatGetSquareOfArrayExist(){

	int[] arrays = {3,53,45};
	
	AscendingSquares.getSquareOfArray(arrays);
	}


	@Test
	
	public void testThatGetArraySquaredInAscendingOrderExist(){

	int[] arrays = {3,53,45};
	
	AscendingSquares.getArraySquaredInAscendingOrder(arrays);
	}



	@Test
	
	public void testThatGetArraySquaredInAscendingOrderWorks(){
	int[] arrays = {9,2,7,0,5};
	int[] expected = {0, 4, 25, 49, 81};
	int[] test = AscendingSquares.getArraySquaredInAscendingOrder(arrays);
	assertArrayEquals(expected, test);
	}


	@Test
	
	public void testThatGetSquareOfArrayWorks(){
	int[] arrays = {9,2,7,0,-5};
	int[] expected = {81, 4, 49, 0, 25};
	int[] test = AscendingSquares.getSquareOfArray(arrays);
	assertArrayEquals(expected, test);
	}


	

	

}