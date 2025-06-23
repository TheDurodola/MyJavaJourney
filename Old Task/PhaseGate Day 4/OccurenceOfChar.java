public class OccurenceOfChar{

public static void main(String[]args){

String word = "Hello World";
char letter = 'o';

System.out.print(countOfOcc(word,letter));


}


static int countOfOcc(String word, char alphabet){
word = word.toLowerCase();
//alphabet = alphabet.toLowerCase();
int count = 0;

for (int i =0; i<word.length();i++){

if(alphabet==word.charAt(i)){
count++;}

}

return count;

}


}