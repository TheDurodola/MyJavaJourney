public class Power{
public static void main(String[] args){


int base = 0;
int expo = 1;

System.out.print("a    b    expo(a,b)");

while(base<5){
expo= expo+1;
base = base+1;
double pow = Math.pow(base, expo);
int pow2 = (int)pow;
System.out.printf("%n%d    %d    %d", base, expo, pow2);
}






































































}}