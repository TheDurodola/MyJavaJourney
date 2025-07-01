import java.util.Arrays;

public class PositionOfLargest{
public static void main(String[]args){


double [][] array = {{1.5, 2.3, 3.7, 4.6}, {5.1, 6.2, 7.3, 8.4},{9.5, 10.1, 11.8, 12.7}};


double largest = array[0][0];


int row = 0;
int column = 0;

for(int counter = 0; counter < array.length; counter++){

	for(int index = 0; index< array.length; index++){	
	if(array[counter][index]>largest){
	largest = array[counter][index+1];
	System.out.println(largest);
	row = counter;
	column = index;
	}

	
	}
}


int [] location = {row, column};


System.out.print(Arrays.toString(location));

































}}