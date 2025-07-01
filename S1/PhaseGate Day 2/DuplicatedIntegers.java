public class DuplicatedIntegers{
public static void main(String...args){

int [] numbers = {1,2,2,3,4,4,5,6,6,7};

int totalOfUniqueNumbers =0;
int countOfOccurence = 0;


for(int counter = 0; counter<numbers.length; counter++){
	
		countOfOccurence=0;
	for(int index = 0; index<numbers.length; index++){

		if(numbers[counter]==numbers[index]){
		countOfOccurence++;
		}

	}

	if(countOfOccurence!=3){
		totalOfUniqueNumbers = totalOfUniqueNumbers + 1;
	}


}


System.out.print(totalOfUniqueNumbers);










































}}