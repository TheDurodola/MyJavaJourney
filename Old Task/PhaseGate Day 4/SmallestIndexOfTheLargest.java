import java.util.Arrays;
public class SmallestIndexOfTheLargest{
public static void main(String[]args){

int [] numbers = {1, 2, 8, 20, 20, 5};

System.out.print("The smallest index of the largest element in the array is "+ getSmallestIndexOfTheFirstOccurenceOfTheLargest(numbers));
}







static int getSmallestIndexOfTheFirstOccurenceOfTheLargest(int [] numbers){

int largest = numbers[0];
int indexHolder = 0;


for(int index = 1; index<numbers.length;index++){

	if(numbers[index] > largest && numbers[index] != largest){
	largest = numbers[index];
	indexHolder=index;
	}
}

return indexHolder;
}











}