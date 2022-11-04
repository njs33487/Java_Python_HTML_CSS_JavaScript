x = 3
print (x)
print(type(x))

y = float(x)
print(y)
print(type(y))

#convert float to int
y = 56.75
print(y)
print(type(y))

z = int(y)
print(z)
print(type(z))

#convert string to int

x = '50'
print(x)
print(type(x))

y = int(x)
print(y)
print(type(y))

## convert int to string 
intX = 2020
print(intX)
print(type(intX))

y = str(intX)
print(y)
print(type(y))

## convert str to float
x = '3.14'
print(x)
print(type(x))

y = float(x) # converting x to float
print(y)
print(type(y))

## convert float to string 
x = 37.5
print(x)
print(type(x))

y = str(x) # converting x to string
print(y)
print(type(y))

## convert list to tuple
new_list = [3,7,20,'@','TECH I.S.', 'makes learning fun!']
print(new_list)
print(type(new_list))

new_tuple = tuple(new_list) # converting new_list to new_tuple
print(new_tuple)
print(type(new_tuple))

## convert tuple to list
new_tuple = 4,1,45,92,31,60,84
print(new_tuple)
print(type(new_tuple))

new_list = list(new_tuple) # converting new_tuple to new_list
print(new_list)
print(type(new_list))

# define list
new_list = ["olivia","kaseem","caleb","olivia","owen", "olivia"]
print(new_list)
print(type(new_list))

# convert to set 
new_set = set(new_list) # extracts only the unique values
print(new_set)
print(type(new_set))

#define a set 
new_set = {'kaseem', 'olivia', 'caleb', 'owen'}
print(new_set)
print(type(new_set))

# convert this set to a list
new_list = list(new_set) 
print(new_list) 
print(type(new_list))

# ex1
num = 7
print(type(num))

# conv to str
num = str(num)
print(type(num))

discount = '3.77'
print(type(discount))
discount = float(discount)
print(type(discount))

grocery = 'egg','milk','mango' 
print(type(grocery))

grocery = list(grocery)
print(type(grocery))
