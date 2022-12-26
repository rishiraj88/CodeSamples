num = int(input("Enter a count of the terms of Fibonacci series to print: "))

a = 0
b = 1


if num == 1:
    print(a,end=" ")
elif num >= 2:
    print(a,end=" ")
    print(b,end=" ")
    for i  in range(1,num-1):
       c = a+b
       a = b
       b = c
       print(c,end=" ")