import java.util.Arrays;

public class AscendingSquares{
public static void main(String[]args){

int [] arrayOfNumbers = {9,2,7,0,5};

arrayOfNumbers = getArraySquaredInAscendingOrder(arrayOfNumbers);
System.out.print(Arrays.toString(arrayOfNumbers));
}









static int[] getArraySquaredInAscendingOrder(int [] arrayOfNumbers){

arrayOfNumbers = getSquareOfArray(arrayOfNumbers);
arrayOfNumbers = useBubbleSorting(arrayOfNumbers);

return arrayOfNumbers;
}









static int[] getSquareOfArray(int [] numbers){

for(int index = 0; index < numbers.length;index++){
	numbers[index] = numbers[index] * numbers[index];
}

return numbers;
}



static int[] useBubbleSorting(int [] array){

for(int index = 0; index < array.length;index++){
	for(int j = 1; j < array.length; j++){
		if(array[j] < array[j-1]){
			int temp = array[j];
			array[j] = array[j-1];
			array[j-1] = temp;
		}
	}
}

return array;
}




}