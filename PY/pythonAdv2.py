# create an empty class called `Person`
# (NOTE: class names always begin with a capital letter!)
class Person:
    def say_hi(self):
        print("hello , how are you?")

# Create object `p` from class `Person`
p = Person()

# Print `p` 
p.say_hi()
""" 
Notice that the say_hi method takes no parameters when calling it in the object

but still has the self in the class function definition
self keyword

Class methods have only one specific difference from ordinary functions
they must have an extra first parameter that has to be added to the beginning of the parameter list
by convention, it is given the name self.
do not give a value for this parameter when you call the method
Python will automatically provide it
this particular variable refers to the object itself
 """

""" Data Fields
we have already discussed the functionality part of classes and objects (i.e. methods),

now let us learn about the data part.
the data part, i.e. fields, are nothing but ordinary variables that are bound to the namespaces of the classes and objects

recall scope of variables in functions, this works similar to that, but at class and object levels
__init__ method: the constructor function
There are many method names which have special significance in Python classes

We will see the significance of the __init__ method

The __init__ method is run as soon as an object of a class is instantiated (i.e. created)

The method is useful to do any initialization you want to do with your object

i.e. passing initial values to your object variables """

# create Class called `Person`
class Person:
    
    # create the __init__ constructor function 
    def __init__(self,name):
        self.name = name # object variable
    
    # create method called say_hi
    # this will be a built-in function for this class `Person`
    def say_hi(self):
        print('Hello, my name is ', self.name)

# instatiate an object `p` from class `Person`
# remember to input the `name` as Class argument
p = Person('Jill')

# call built-in method
p.say_hi()

# ASIDE #1:
# Docstrings:
# these are string literals that appear right after the definition of a function, method, class, or module
# they appear when help(function_name) is run

# Docstrings Example

def is_even(num):
  # Docstring
  """
  Input: an integer
  Output: if input is even (True for even, False for not)
  """
  return num % 2 == 0

help(is_even)

""" ASIDE #2:
.format()
used to fill in the blanks of a string in the print() statement """


# `.format()` example

pi_value = 3.14
print("The value of Pi is {}".format(pi_value))

# Define a class called Robot
class Robot:
  """Represents a robot, with a name.""" # Docstrings

  # Class Variable: population
  population = 0

  # Constructor Function: __init__()
  def __init__(self, name):
      """Initializes the data.""" # Docstrings
      self.name = name # Object Variable
      print("(Initializing {})".format(self.name))

      # When a new robot is created, the robot
      # adds to the population
      Robot.population += 1

  # Object Method: die()
  def die(self):
      """I am dying.""" # Docstrings
      print("{} is being destroyed!".format(self.name))

      Robot.population -= 1

      if Robot.population == 0:
          print("{} was the last one.".format(self.name))
      else:
          print("There are still {:d} robots working.".format(
              Robot.population))

  # Object Method: say_hi()
  def say_hi(self):
      """Greeting by the robot. 
      Yeah, they can do that.""" # Docstrings
      print("Greetings, my masters call me {}.".format(self.name))

  # Class Method: how_many() 
  @classmethod
  def how_many(cls):
      """Prints the    current population.""" # Docstrings
      print("We have {:d} robots.".format(cls.population))