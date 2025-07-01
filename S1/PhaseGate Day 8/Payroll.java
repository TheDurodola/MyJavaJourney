import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Payroll{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the amount of staff(s): ");
int employeeSize = input.nextInt();

String [][] employeeRecords = new String[employeeSize][8];
int index = 0;

int mainMenuLoop = 0;
while(mainMenuLoop!=1){
	String mainMenuDisplay = """
<><><><><><><><><><><><><><><><><><>

WELCOME TO SEMICOLON

1. Add Employee Payroll
2. View Employee Payroll
3. Update Employee Payroll

4. Exit
	""";

	System.out.println(mainMenuDisplay);
	System.out.print("Enter input(1-4): ");

	int mainMenuInput = input.nextInt();
	System.out.println();

	switch(mainMenuInput){

		case 1:
			System.out.print("Enter Employee name:. ");
			String employeeName = input.next();
			System.out.print("Enter Number of Hours Worked in Week: ");
			double numberOfHours = input.nextInt();
			if(numberOfHours<=40 && numberOfHours>0){
				System.out.print("Enter Hourly Pay Rate: ");
				double hourlyPayRate = input.nextDouble();
				double grossPay = numberOfHours * (hourlyPayRate);
				System.out.print("Enter Federal Tax Withholding Rate: ");
				double federalTaxRate = input.nextDouble();
				double federalTax = grossPay * (federalTaxRate/100);
				System.out.print("Enter State Tax Withholding Rate: ");
				double stateTaxRate = input.nextDouble();
				double stateTax = grossPay * (stateTaxRate/100);
				double totalDeductions = stateTax + federalTax;
				double netPay = grossPay - totalDeductions;
				employeeRecords[index][0] = employeeName;
				employeeRecords[index][1] = Double.toString(numberOfHours);
				employeeRecords[index][2] = Double.toString(hourlyPayRate);
				employeeRecords[index][3] = Double.toString(grossPay);
				employeeRecords[index][4] = Double.toString(federalTax);
				employeeRecords[index][5] = Double.toString(stateTax);
				employeeRecords[index][6] = Double.toString(totalDeductions);
				employeeRecords[index][7] = Double.toString(netPay);
			}
			else{
				System.out.print("INVALID HOURS");
			}
			break;
		
		case 2:
			for(int counter = 0; counter<employeeRecords.length;counter++){
			System.out.printf("\n\nEmployee name: %s%nHours Worked: %s%nPay Rate: $%s%nGross Pay: $%s%nDeductions:%n\tFederal withholding: $%s%n\tState withholding: $%s%n\tTotal Deductions: $%s%nNet Pay: $%s%n",employeeRecords[counter][0],employeeRecords[counter][1],employeeRecords[counter][2],employeeRecords[counter][3],employeeRecords[counter][4],employeeRecords[counter][5],employeeRecords[counter][6],employeeRecords[counter][7]);
			}	
			break;

		case 3: 
			System.out.println("Update coming...");
			break;
		case 4: 
			System.out.println("Good Bye");
			mainMenuLoop = 1;
			break;
	
		default:
			System.out.println("~INVALID INPUT~\n");
			break;

}

index++;

};




}}