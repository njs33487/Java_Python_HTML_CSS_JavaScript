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

""" object variables

the name variable belongs to the object (it is assigned using self) and hence is an object variable

we refer to the object variable name using self.name notation in the methods of that object

NOTE: an object variable with the same name as a class variable will hide the class variable!

instead of Robot.population, we could have also used self.__class__.population because every object refers to its class via the self.__class__ attribute

object methods

in the say_hi built-in object method, the robot outputs a greeting

in the die built-in object method, we simply decrease the Robot.population count by 1

docstrings

in this program, we see the use of docstrings for classes as well as methods
we can access the class docstring using Robot.__doc__ and the method docstring as Robot.say_hi.__doc__
constructor function

observe that the __init__ method is used to initialize the Robot instance with a name
in this method, we increase the population count by 1 since we have one more robot being added
also observe that the values of self.name is specific to each object which indicates the nature of object variables
class variable

population belongs to the Robot class

hence is a class variable
thus, we refer to the population class variable as Robot.population and not as self.population

class function

the how_many is actually a method that belongs to the class and not to the object

this means we can define it as either a classmethod or a staticmethod depending on whether we need to know which class we are part of

since we refer to a class variable, let's use classmethod
we have marked the how_many method as a class method using a decorator

decorators can be imagined to be a shortcut to calling a wrapper function (i.e. a function that "wraps" around another function so that it can do something before or after the inner function), so applying the @classmethod decorator is the same as calling:

how_many = classmethod(how_many)
public vs. private attributes

all class members are public

One exception: if you use data members with names using the double underscore prefix such as __privatevar, Python uses name-mangling to effectively make it a private variable.
the convention followed is that any variable that is to be used only within the class or object should begin with an underscore and all other names are public and can be used by other classes/objects

remember that this is only a convention and is not enforced by Python (except for the double underscore prefix) 
"""

# Using the above Robot Class setup

#------------------------------------------------------
# Initialize Robot 1 called 'R2-D2' in `droid1`
droid1 = Robot("R2-D2")

# Call the Built-In Object Function for `droid1`
droid1.say_hi()

# Call the Class Function
Robot.how_many()

#------------------------------------------------------
# Initialize Robot 2 called 'C-3PO' 
droid2 = Robot("C-3PO")

# Call the Built-In Object Function for droid2
droid2.say_hi()

# Call the Class Function
Robot.how_many()

#------------------------------------------------------
# Print a note about Robots working
print("\nRobots can do some work here.\n")

# Print a note about destroying Robots
print("Robots have finished their work. So let's destroy them.")

#------------------------------------------------------
# Use Built-In Object Functions 
droid1.die()
droid2.die()

# Call the Class Function
Robot.how_many()

#  SchoolMember class 
class SchoolMember:
    '''Represents any school member.'''
    def __init__(self, name, age):
        self.name = name
        self.age = age
        print('(Initialized SchoolMember: {})'.format(self.name))

    def tell(self):
        '''Tell my details.'''
        print('Name:"{}" Age:"{}"'.format(self.name, self.age), end=" ")

#  Teacher is a child class of SchoolMember, the parent class
class Teacher(SchoolMember):
    '''Represents a teacher.'''
    def __init__(self, name, age, salary):
        SchoolMember.__init__(self, name, age)
        self.salary = salary
        print('(Initialized Teacher: {})'.format(self.name))

    def tell(self):
        SchoolMember.tell(self)
        print('Salary: "{:d}"'.format(self.salary))

#  Student is a child class of SchoolMember, the parent class
class Student(SchoolMember):
    '''Represents a student.'''
    def __init__(self, name, age, grade):
        SchoolMember.__init__(self, name, age)
        self.grade = grade
        print('(Initialized Student: {})'.format(self.name))

    def tell(self):
        SchoolMember.tell(self)
        print('Grade: "{:d}"'.format(self.grade))

# initialize `t` - teacher object 
# name: Mrs. Alyssa
# age: 40
# salary: 30000
t = Teacher('Mrs. Alyssa', 40, 30000)

# prints a blank line
print()

# initialize `s` - student object
# name: Daniel
# age: 25
# grade: 75
s = Student('Daniel', 25, 75)

# prints a blank line
print()

members = [t, s]
for member in members:
    # Works for both Teachers and Students
    member.tell()

## Encapsulation Example 
""" an attempt to access the Python enforced private variable yields an error as seen above

single underscore:

Private variable, it should not be accessed directly. But nothing stops you from doing that (except convention).
More specifically, a "protected" variable, if drawing parallels to other programming langauages
double underscore:

Private variable, harder to access but still possible.
Both are still accessible: Python only has private variables by convention. """

# initialize a new class 
class Robot:

  # constructor function
   def __init__(self):
      self.a = 123 # public object variable
      self._b = 123 # private object variable (by convention - not a hard variable)
      self.__c = 123 # Python enforced private variable

""" # instantiate a new object 
new_robot = Robot()


print(new_robot.a) # publicly accessible
print(new_robot._b) # publicly accessible, but private by convention
print(new_robot.__c) # Python enforced private variable, access throws error """

