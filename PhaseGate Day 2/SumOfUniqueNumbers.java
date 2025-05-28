public class SumOfUniqueNumbers{
public static void main(String[]args){

int [] arrayOfNumber = {1,2,3,2};

System.out.print("The Total of Unique elements in the array is "+ getTheTotalOfUniqueElementsInAnArray(arrayOfNumber));
}



static int getTheTotalOfUniqueElementsInAnArray(int [] numbers){

int totalOfUniqueNumbers = 0;
int countOfOccurence = 0;

for(int counter = 0; counter<numbers.length; counter++){
	
	countOfOccurence = 0;
	
	for(int index = 0; index<numbers.length; index++){

		if(numbers[counter]==numbers[index]){
		countOfOccurence++;
		}

	}

	if(countOfOccurence==1){
		totalOfUniqueNumbers = totalOfUniqueNumbers + Math.abs(numbers[counter]);
	}

}

return totalOfUniqueNumbers;
}


}