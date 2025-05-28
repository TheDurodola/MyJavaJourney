import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SumOfUniqueNumbersTest{

	@Test
	
	public void testThatGetTheTotalOfUniqueElementsInAnArrayExist(){
		int[] numbers = {3,3,4};
		SumOfUniqueNumbers.getTheTotalOfUniqueElementsInAnArray(numbers);

	}
	
	@Test
	
	public void testThatGetTheTotalOfUniqueElementsInAnArrayWorksCorrectlyWithOneUniqueFigure(){
		int[] numbers = {3,3,4,0,1,5,1,2};
		int actual = SumOfUniqueNumbers.getTheTotalOfUniqueElementsInAnArray(numbers);
		int expected = 11;
		assertEquals(expected, actual);
	}


@Test
	
	public void testThatGetTheTotalOfUniqueElementsInAnArrayWorksWithMoreThanOneUniqueFigure(){
		int[] numbers = {3,3,4,7,14,6};
		int actual = SumOfUniqueNumbers.getTheTotalOfUniqueElementsInAnArray(numbers);
		int expected = 31;
		assertEquals(expected, actual);
	}

@Test

public void testThatGetTheTotalOfUniqueElementsInAnArrayWorksWithNegativeUniqueFigure(){
		int[] numbers = {3,3,-6};
		int actual = SumOfUniqueNumbers.getTheTotalOfUniqueElementsInAnArray(numbers);
		int expected = 6;
		assertEquals(expected, actual);
	}



}