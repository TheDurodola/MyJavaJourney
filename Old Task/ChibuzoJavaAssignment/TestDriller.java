public class TestDriller{

public static int price(int copies){

int price = 0; 

if(copies>=1&&copies<=4){
price = 2000;
}
if(copies>=5&&copies<=9){
price = 1800;
}
if(copies>=10&&copies<=29){
price = 1600;
}
if(copies>=30&&copies<=49){
price = 1500;
}
if(copies>=50&copies<=99){
price = 1300;
}
if(copies>=100&&copies<=199){
price = 1200;
}
if(copies>=200&&copies<=499){
price = 1100;
}
if(copies>500){
price=1000;}


int pricePerCopies =price*copies;

return pricePerCopies;
}
}