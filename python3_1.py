# 'if' conditional  
x = 5
y = 5

if x == y:
    print('x and y are equal')

# 'if... else...' conditional
x = 5
y = 6

if x == y:
    print('x and y are equal')
else:
    print('x and y are not equal')

# if elif else
x = 6
y = 3
if x == y:  
    print('x and y are equal')
elif x < y:
        print(' x is smaller')
else:
    print(' y is smaller') 

is_single = True
message = 'You can date.' if is_single else 'You cannot date.'
print(message) 

# get user input for variables 'x' and 'y'
x = float(input("Enter a number for x: ")) # `=` is an assignment operator
y = float(input("Enter a number for y: ")) # `=` is an assignment operator

# compare values of x and y 
if x == y: # `==` is a comparison operator
  print("x and y are equal") # if equality testest passed
  if y != 0: 
    print("therefore, x / y is", x/y) 
elif x < y: 
  print("x is smaller") # if x is less than y
else:
  print("y is smaller") # if y is less than x

print("thanks!")

# while loop example #1
n = 0 
while n < 5:
  print(n)
  n += 1

# while loop example #2
n = 0 
while n < 5:
  print(n)
  n += 1
else:
  print('n is not less than 5 anymore')

for n in range(5):
    print(n)
for n in range(2, 6):
  print(n)
for x in range(2, 30, 3):
  print(x)
text = "TECH I.S."
for letter in text:
  print(letter)

# define a list
fruits_list = ["apple", "banana", "cherry"]

# run a for loop to print the elements of the list
for fruit in fruits_list:
  print(fruit)

# define a tuple
animals_list = "dog","cat","elephant","otter"

# run a for loop to print the elements of the tuple
for animal in animals_list:
  print(animal)
# define a set 
names = {'oliva','caleb','kaseem'}

# loop over the set with for 
for name in names:
  print(name)
# define a dicitonary
translations = {'a':1, 'b':2, 'c':3}

# loop over the dicitonary with for

# keys:
for entry in translations:
  print(entry)

# values:
for entry in translations.values():
  print(entry)


for i in range(1, 6):
    for j in range(1, i+1):
        print(j, end="")
    print()

# create a new list of powers of 0 to 9
powers = [num**2 for num in range(10)] # a for loop defined with list comprehension
print(powers)
next(powers) # call the first value in the generator 
next(powers) # call the next value in the generator 
next(powers) # call the next value in the generator 
next(powers) # call the next value in the generator 

adjectives = ["juicy", "big", "tasty"] # list 1
fruits = ["apple", "banana", "cherry"] # list 2

for fruit in fruits: # looping over list 2 - outer loop
  for adjective in adjectives: # looping over list 1 - inner loop
    print(adjective, fruit)

n = 0
while n < 6:
  print(n)
  if n == 3:
    break # break loop when it is equal to 3
  n += 1

fruits = ["apple", "banana", "cherry"]
for fruit in fruits:
  print(fruit)
  if fruit == "banana":
    break # break loop after after printing banana

n = 0
while n < 6:
  n += 1
  if n == 3: # skip 3
    continue
  print(n)
  
fruits = ["apple", "banana", "cherry"]
for x in fruits:
  if x == "banana":
    continue # skip banana
  print(x)