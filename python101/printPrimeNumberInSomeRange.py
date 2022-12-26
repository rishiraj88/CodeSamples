lower = int(input("Enter the lower number for range: "))
higher = int(input("Enter the higher number for range: "))

for num in range(lower,higher+1):
    if num>1:
        status = "prime"
        for i in range(2,num):
            if num%i == 0:
                status = "not prime"
                break
        if status == "prime":
            print(" ",num)