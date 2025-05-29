import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class MergingAndSortingOfTwoUnsortedListsTest{

	@Test
	
	public void testThatGetMergingAndSortingOfTwoArraysInDescendingExist(){
		int [] list1 = {3,1,5};
		int [] list2 = {8,6,4};
		MergingAndSortingOfTwoUnsortedLists.mergingAndSortingOfTwoArraysInDescending(list1, list2);

	}
	
	@Test
	
	public void testThatGetMergingAndSortingOfTwoArraysInDescendingWorks(){
		int [] list1 = {3,1,5};
		int [] list2 = {8,6,4};
		int [] actual = MergingAndSortingOfTwoUnsortedLists.mergingAndSortingOfTwoArraysInDescending(list1, list2);
		int [] expected = {8,6,5,4,3,1};
		assertArrayEquals(actual, expected);
	}

	@Test

	public void testThatGetMergingAndSortingOfTwoArraysInDescendingWorksWithDifferentFigures(){
		int [] list1 = {7,4,1};
		int [] list2 = {9,3,2};
		int [] actual = MergingAndSortingOfTwoUnsortedLists.mergingAndSortingOfTwoArraysInDescending(list1, list2);
		int [] expected = {9,7,4,3,2,1};
		assertArrayEquals(actual, expected);
	}




}