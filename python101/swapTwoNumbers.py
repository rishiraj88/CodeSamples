# method 1 (using the third variable)
x = 10
y = 20

print("The number are: ",x," and ",y)
temp = x
x = y
y = temp
print("The number are: ",x," and ",y)

# method 2 (without the third variable)
x = 11
y = 22

print("The number are: ",x," and ",y)
x,y = y,x
print("The number are: ",x," and ",y)

