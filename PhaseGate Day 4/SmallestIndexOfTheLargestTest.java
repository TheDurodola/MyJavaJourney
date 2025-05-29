import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SmallestIndexOfTheLargestTest{

	@Test
	
	public void testThatGetSmallestIndexOfTheFirstOccurenceOfTheLargestExists(){
		int[] numbers = {3,3,4};
		SmallestIndexOfTheLargest.getSmallestIndexOfTheFirstOccurenceOfTheLargest(numbers);

	}
	
	@Test
	
	public void testThatGetSmallestIndexOfTheFirstOccurenceOfTheLargestWorks(){
		int[] numbers = {1, 5, 3, 4, 5, 5};
		int actual = SmallestIndexOfTheLargest.getSmallestIndexOfTheFirstOccurenceOfTheLargest(numbers);
		int expected = 1;
		assertEquals(actual, expected);

	}
	
	@Test
	
	public void testThatGetSmallestIndexOfTheFirstOccurenceOfTheLargestWorksWithNegativeFigures(){
		int[] numbers = {-1, -5, -3, -4, -5, -5};
		int actual = SmallestIndexOfTheLargest.getSmallestIndexOfTheFirstOccurenceOfTheLargest(numbers);
		int expected = 0;
		assertEquals(actual, expected);

	}


}