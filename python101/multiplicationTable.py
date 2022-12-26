n = int(input("Enter a number to see the multiplication table of: "))

# method 1 (using for range() loop)
for i in range(1,11):
    print(n,"x",i,"=", n*i)

# method 2 (using while loop)
i = 1
while i<=10:
    print(n,"x",i,"=", n*i)
    i += 1;
