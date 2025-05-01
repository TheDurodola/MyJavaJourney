"""
DISPLAY a message indicating that the program as started

COLLECT the principal amount and STORE it as principal
COLLECT the annual interest rate and STORE it as annual_rate
COLLECT the duration in years and STORE as duration_year


DIVIDE the annual_rate by 12 and 100(or simply 1200)and STORE the result as monthly_rate


MULTIPLY duration_year by 12, Store the result as duration_month

ADD 1 to the monthly_rate and raise the result by the duration_month(Exponential). MULTIPLY the result by monthly_rate and store the result as numerator.

ADD 1 to the monthly_Rate and raise the result by the duration_months(Exponential). MINUS 1 from the result and store the result as denominator.

DIVIDE the numerator by the denominator and store the result as fraction.

MULTIPY fraction by the principal STORE as mortgage

DISPLAY mortgage
"""


print("WELCOME TO THE MORTGATE CALCULATOR\n")

principal = float(input("Enter the PRINCIPAL AMOUNT: $"))
annual_rate = float(input("Enter the ANNUAL RATE: "))
duration_year = int(input("Enter the duration in YEARS: "))

monthly_rate = (annual_rate/100)/12
duration_month = duration_year*12


numerator = ((monthly_rate+1)**duration_month)*monthly_rate
denominator = ((monthly_rate+1)**duration_month)-1

fraction = numerator/denominator

mortgage = principal * fraction

print("\nYour monthly payment is $%.2f" % mortgage)
