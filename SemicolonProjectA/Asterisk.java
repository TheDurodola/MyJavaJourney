public class Asterisk{
public static void main(String...boj){

int rows = 10; 
for(int i=1; i<=rows;i++){
	int p=1;
for(int j=1;j<=i;j++){
		System.out.print("*");
	}
	System.out.println();
}
System.out.println();

rows = 10; 
for(int i=1; i<=rows;i++){
	int p=1;
for(int j=1;j<=i;j++){
		System.out.print("");
for(j=i;j<=rows;j++){
System.out.print("*");}
	
}
	System.out.println();
}

rows = 10;

for(int i = 1; i<=rows; i++){
	int p = 1;
	for(int j = 1;j<=i;j++){
		System.out.print(" ");
	}
	for(int j = i; j<=rows; j++){
		System.out.print("*");
	}
System.out.println();
}
System.out.println();

rows = 10;

for(int i = 1; i<=rows; i++){
	int p = 1;
	for(int j = i;j<=rows;j++){
		System.out.print(" ");
	}
	for(int j = 1; j<=i; j++){
		System.out.print("*");
	}
System.out.println();
}

























}}