year = int(input("Enter a year number to check for being leap or non leap: "))
# handle invalid inputs like negative or zero year number, non-numeric strings input
status = "non leap"

if year%400 == 0:
    status = "leap"
elif year%100 == 0:
    status = "non leap"
elif year%4 == 0:
    status = "leap"
print("The year",year, "is a",status,"year.")
