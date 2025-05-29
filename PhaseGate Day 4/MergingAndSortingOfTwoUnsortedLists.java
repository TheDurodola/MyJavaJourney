import java.util.Arrays;

public class MergingAndSortingOfTwoUnsortedLists{
public static void main(String[]args){

int [] list1 = {3,1,5};
int [] list2 = {8,6,4};

System.out.print(Arrays.toString(mergingAndSortingOfTwoArraysInDescending(list1, list2)));
}



static int[] mergingAndSortingOfTwoArraysInDescending(int [] list1, int [] list2){

int [] finalList = new int [list1.length + list2.length];

for(int counter = 0; counter < list1.length; counter++){

finalList [counter] = list1[counter];

}


for(int counter = 0; counter < list2.length; counter++){

finalList [counter+list1.length] = list2[counter];
}

finalList = useBubbleSortingDescending(finalList);
return finalList;
}





static int[] useBubbleSortingDescending(int [] array){

for(int index = 0; index < array.length;index++){
	for(int j = 1; j < array.length; j++){
		if(array[j] > array[j-1]){
			int temp = array[j];
			array[j] = array[j-1];
			array[j-1] = temp;
		}
	}
}

return array;
}

}