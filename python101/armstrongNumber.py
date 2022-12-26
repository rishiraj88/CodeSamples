n = int(input("Enter a number to check for being an Armstrong number: "))

sum = 0

temp = n

while temp != 0:
    digit = temp%10
    cube = digit**3
    sum += cube
    temp = temp//10

if sum == n:
    print("The entered number",n,"is an Armstrong number.")
else:
    print("The entered number",n,"is not an Armstrong number.")