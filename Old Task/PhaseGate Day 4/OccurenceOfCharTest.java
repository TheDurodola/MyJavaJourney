import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class OccurenceOfCharTest{

	@Test
	
	public void testThatCountOfOccExist(){
		String word = "Hello World";
		char letter = 'o';
		OccurenceOfChar.countOfOcc(word, letter);

	}
	
	@Test
	public void  testThatCountOfOccWorks(){
		String word = "Hello World";
		char letter = 'o';

		int actual = OccurenceOfChar.countOfOcc(word, letter);
		int expect = 2;
		assertEquals(actual, expect);
	}


	@Test
	public void  testThatCountOfOccWorksWithCapitalLetter(){
		String word = "OpenAi";
		char letter = 'e';
		int actual = OccurenceOfChar.countOfOcc(word, letter);
		int expect = 1;
		assertEquals(actual, expect);
	}


	
	@Test
	public void  testThatCountOfOccShowsZeroIfTheCharDoesntExistInTheWord(){
		String word = "Java";
		char letter = 'k';

		int actual = OccurenceOfChar.countOfOcc(word, letter);
		int expected = 0;
		assertEquals(actual, expected);
	}




}