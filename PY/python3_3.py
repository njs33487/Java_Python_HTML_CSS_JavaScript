# setup an error handling block 
try:
  print(x_val) # without defining x_val before, we try to print the value of x_val
except:
  print('in the exception block, An exception has occurred.')

# here, since the try block code throws an error because of x_val not being defined, the except block is executed
# lets try this without a try block
print(x_val) # this raises a NameError

# multiple exceptions handling
try:
  print(x_val)
except NameError: # exception handling #1
  print("x_val is not defined")
except: # exception handling #2
  print("Something else went wrong")

# `finally` block example #1
try:
  print(x)
except: # this executes if the try block has an error
  print("Something went wrong")
finally: # this is executed whether an error is raised or not
  print("The 'try except' is finished!")

# finally block example #2

try: # define try block
  f = open("file.txt") # open a file that exists, but with no write permission
  f.write("text to write") # try to write to file
except: # respond to error 
  print("Something went wrong when writing to file")
finally: # run this code regardless of the outcome of the try-error outcome
  f.close()

## raise exception example #1
x = -1

if x < 0:
  raise Exception("Sorry, number below zero!")
## raise exception example #2
# you can choose the specific type of Exception to raise
x = "hello"

if not type(x) is int:
  raise TypeError("Only integers are allowed!")

"""
functions are reusable pieces of code
they only run when called
they may take input arguments
they may return processed values
def keyword is used at the begeinning of a function to start defining a function
return keyword is used to send some value back after processing

def function name(arguments)
"""
# define a function to test for even numbers 
  # takes one integer number as an argument
  # and returns true if even and false if not 

def is_even(num):
  return num % 2 == 0

# test evenness of 55 by calling the function is_even()
print(is_even(55)) # call function and print output

# test evenness of 100 by calling the function is_even()
print(is_even(100)) # call function and print output
# define function to calculate area of a circle
# input argument is radius 

def area_circle(radius):
  ''' # start doc string 
  input: radius of circle 
  return value: computed value of area
  '''
  area = (22.0/7.0)*radius**2
  return area

print(area_circle(5))

"""
Scope
a variable is only available from inside the region it is created
this is called scope
Local Scope
a variable created inside a function belongs to the local scope of that function
and can only be used inside that function
"""
def myfunc():
  inside_variable = 300 # inside_variable is available only inside myfunc() and not accessible outside
  print(inside_variable)

myfunc() # call the function myfunc()
print(inside_variable) # throws error
# however, the local variable can be accessed from a function within the function
def myfunc():

  inside_variable = 300

  def myinnerfunc(): # this is the inner function
    print(inside_variable) # this line accesses the inside_variable value

  myinnerfunc() # call the function myinnerfunc()

myfunc() # call the function myfunc()

print(inside_variable) # but this still throws error