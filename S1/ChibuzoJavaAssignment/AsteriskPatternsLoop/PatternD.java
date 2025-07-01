public class PatternD{
public static void main(String[]boj){


int rows = 6;

for(int i = 1; i<=rows; i++){
	int p = 1;
	for(int j = 1;j<=i;j++){
		System.out.print("  ");
	}
	for(int j = i; j<=rows; j++){
		System.out.print(p++ +" ");
	}
System.out.println();
}








}}