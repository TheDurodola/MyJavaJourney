public class SundayMunchies{


//Question 1
static int findMultiple(int number){
int fifthMultiple = number *5;
return fifthMultiple;
}


//Question 2

static void displayPrimeNumber(){

int primeCount =0;
int number = 1;

while(primeCount<=49){
int factorCount = 0;
for(int count=1;count<=number;count++){
int check = number%count;
if(check==0){factorCount= factorCount +1;}
}
if(factorCount<=2){System.out.println(number);
primeCount= primeCount+1;}
number++;
}
}




//Question 3
static String displayAge(int ageYears){

int ageMonths = ageYears*12;
int ageDays =  ageYears*365;
int ageMinutes = ageDays*60*24;
int ageSeconds = ageMinutes*60;

String years = Integer.toString(ageYears);
String months = Integer.toString(ageMonths);
String days = Integer.toString(ageDays);
String minutes = Integer.toString(ageMinutes);
String seconds = Integer.toString(ageSeconds);

String ageALL = String.format("Years: %s%nMonths: %s%nDays: %s%nMinutes: %s%nSeconds: %s",years,months,days,minutes,seconds);

return ageALL;

}


//Question 4

static void displayDogAge(String name, int humanYears){
int dogYears = humanYears * 7;

String newDogYears = Integer.toString(dogYears);
String result = String.format("Dog name: %s%nDog Age: %s years",name,newDogYears);

}



//Question 5




//Question 6
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



//Question 7
static boolean isLeapYear(int year){

int checker1 = year%4;
int checker2 = year%100;
int checker3 = year%400;

return checker1==0 && (checker2!=0 || checker3==0);
}




























}