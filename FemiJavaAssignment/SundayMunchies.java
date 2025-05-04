public class SundayMunchies{

static int findMultiple(int number){
int fifthMultiple = number *5;
return fifthMultiple;
}


static boolean isLeapYear(int year){

int check = year%4;
int checker2 = year%100;
int checker3 = year%400;

return check==0 && (checker2!=0 || checker3==0);



}





































}