import java.util.Arrays;
public class FactorInArrays{
public static void main(String[]args){



int numbers = 7;
int count = 0;


int factor = 1;

while(factor<=numbers){
int result = numbers%factor;

if(result==0){
count = count+1;}
factor= ++factor;
}

int [] factorsInArray = new int [count];


for(int index = 0; index < factorsInArray.length; index++){
 factor = 1;
while(factor<=numbers){
int result = numbers%factor;

if(result==0){
factorsInArray[index] = factor;}
factor= ++factor;
}



}

System.out.print(Arrays.toString(factorsInArray));

}


}

