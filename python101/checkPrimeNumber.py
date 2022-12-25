num = int(input("Enter a number to check for being prime: "))


status = "prime"
if num <= 1:
    status = "not prime"

for i in range(2,num):
    if num%i == 0:
        status = "not prime"
        break

print("The number",num,"is",status)