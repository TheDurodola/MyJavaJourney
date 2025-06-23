import java.util.Arrays;


public class MinMax{
public static void main(String...args){

int [] elements = {};

if(elements.length==0){
System.out.print("INVALID ARRAY!!!");}

else{
int [] collector = new int[elements.length];

int sum = 0;

for(int index = 0; index<elements.length; index++){

	for(int counter = 0; counter<elements.length; counter++){
	sum = sum + elements[counter];	
	}

collector [index] = sum- elements[index];;
sum =0; 
}
System.out.println(Arrays.toString(collector));




int min = collector[0];
int max = collector[0];


for(int counter=1;counter<=collector.length-1;counter++){
if(collector[counter]<min){
min = collector[counter]; 
			}
if(collector[counter]>max){
max = collector[counter]; 
			}
}

int [] minMax = {min,max};
System.out.println("The Minimum and Maximum of the array above is "+Arrays.toString(minMax));

}


}
}