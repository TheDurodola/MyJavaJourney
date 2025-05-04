public class SundayMunchies{



static int findMultiple(int number){
int fifthMultiple = number *5;
return fifthMultiple;
}


static boolean isLeapYear(int year){

int checker1 = year%4;
int checker2 = year%100;
int checker3 = year%400;

return checker1==0 && (checker2!=0 || checker3==0);
}



/*
static String displayAge(int ageYears){

ageMonths = ageYears*12;
ageDays =  ageYears*365;
ageMinutes = ageDays*60*24;
ageSeconds = ageMinutes*60;

ageYears = Integer.toString(ageYears);
ageMonths = Integer.toString(ageMonths);
ageDays = Integer.toString(ageDays);
ageMinutes = Integer.toString(ageMinutes);
ageSeconds = Integer.toString(ageSeconds);

return ageSeconds;

}
*/



static int computeSumOfNumber(int number){
 
int sumOfNumber =0;

if(number>999 && number<10000){

int sum = 0;
for(int count=1000; count!=0; count/=10){
int divide = number/count;
sum = sum +divide;
number = number%count;

}

sumOfNumber = sum;			}


else{System.out.print("This is not a four digits number! ");}

return sumOfNumber;

}




































}