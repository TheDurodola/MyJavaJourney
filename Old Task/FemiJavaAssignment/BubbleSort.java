import java.util.Arrays;

public class BubbleSort{
public static void main(String[]args){


int[] array = {34,45,32,21,45,2,45,30,2,};




for(var i = 0; i< array.length;i++){
	for(var j = 1; j<array.length;j++){
		if(array[j] < array[j-1]){
		var temp = array[j];
		array[j] = array[j-1];
		array[j-1] = temp;
}
}
}

System.out.print(Arrays.toString(array));





































}}