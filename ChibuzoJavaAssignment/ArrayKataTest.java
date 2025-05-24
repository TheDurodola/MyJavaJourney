import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ArrayKataTest{

	@Test
	public void testMaximumAndMinimum(){
	ArrayKata2 testing = new  ArrayKata2();
	
	int numbers[]= {5,6,10,15,20};
		
	 int[] expected = {5,20};
		
	int [] array  = testing.maximumAndMinimumOf(numbers);

	assertArrayEquals(expected,array);	
	} 
	
	@Test
	public void testSquareNumbersIn(){
	ArrayKata2 test = new ArrayKata2();
	
	int numbers[] ={2,3,4,5,6,7,8};
	
	int [] expected = {4,9,16,25,36,49,64};

	int [] array = test.squareNumbersIn(numbers);

	assertArrayEquals(expected,array);
	}
	
	@Test
	public void testNoOfEvenNumbersIn(){
	ArrayKata2 test = new ArrayKata2();
	
	int numbers[] ={1,2,3,4,5,6,7,8,9,10};
	
	int expected = 5;

	int array = test.noOfEvenNumbersIn(numbers);

	assertEquals(expected,array);
	}

	@Test
	public void testNoOfOddNumbersIn(){
	ArrayKata2 test = new ArrayKata2();
	
	int numbers[] ={1,2,3,4,5,6,7,8,9,10};
	
	int expected = 5;

	int array = test.noOfOddNumbersIn(numbers);

	assertEquals(expected,array);
	}




}