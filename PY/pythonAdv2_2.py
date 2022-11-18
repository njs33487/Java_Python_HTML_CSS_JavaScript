# imported abstract base class  
import abc
from abc import ABC, abstractmethod 

# Parent Abstract Method ---------------------------------------------------
class Polygon(ABC): 

	# abstract method inside the parent Abstract Class
	def noofsides(self): 
		pass

# Child Class #1 of Polygon Parent Abstract Class --------------------------
class Triangle(Polygon): 

	# overriding abstract method 
	def noofsides(self): 
		print("I have 3 sides") 

# Child Class #2 of Polygon Parent Abstract Class --------------------------
class Pentagon(Polygon): 

	# overriding abstract method 
	def noofsides(self): 
		print("I have 5 sides") 

# Child Class #3 of Polygon Parent Abstract Class --------------------------
class Hexagon(Polygon): 

	# overriding abstract method 
	def noofsides(self): 
		print("I have 6 sides") 

# Child Class #4 of Polygon Parent Abstract Class --------------------------
class Quadrilateral(Polygon): 

	# overriding abstract method 
	def noofsides(self): 
		print("I have 4 sides") 

# Create Objects from Children Classes 

# Triangle Child Class Object
R = Triangle() 
R.noofsides() 

# Quadilateral Child Class Object
K = Quadrilateral() 
K.noofsides() 

# Pentagon Child Class Object
R = Pentagon() 
R.noofsides() 

# Hexagon Child Class Object
K = Hexagon() 
K.noofsides() 

# Python program invoking a 
# method using super() 



# create a parent Abstract Class
class Parent(ABC): 
  # define concrete method in abstract class
	def rk(self): 
		print("Abstract Base Class") 

# create a child Concrete Class
class Child(Parent): 
  # extend 
	def rk(self): 
		super().rk() 
		print("subclass ") 

""" call the child class to instantiate a new object
in the above code, we can invoke the methods in abstract classes by using super()
 """
 # create new object from Concrete Class
new_object = Child() 
new_object.rk()

""" Abstract Properties
abstract classes includes attributes in addition to methods
you can require the attributes in concrete classes by defining them with @abstractproperty

 """
# Python program showing abstract properties 

# from abc import ABC, abstractmethod 

# # create a parent Abstract Class
# class parent(ABC): 
# 	@abc.abstractproperty # abstract property
# 	def geeks(self): 
# 		return "parent class"

# # create a child Concrete Class
# class child(parent): 
# 	@property # reference abstact property
# 	def geeks(self): 
# 		return "child class"

# try: 
# 	new_object = parent() 
# 	print(new_object.geeks) 
# except Exception as err: 
# 	print (err) 

# new_object = child() 
# print(new_object.geeks)  

""" Can't instantiate abstract class parent with abstract methods geeks
child class

in the above example, the Parent class cannot be instantiated because it has only an abstract 
version of the property getter method
Abstract Class Instantiation
abstract classes are incomplete because they have methods which have no body

if python allows creating an object for abstract classes, then using that object, if anyone calls the abstract method, 
there is no actual implementation to invoke
so we use an abstract class as a template and according to the need we extend it and build on it before we can use it.
due to the fact that an abstract class is not a concrete class, it cannot be instantiated
when we create an object from the abstract class, it raises an error
 """

# Python program showing 
# abstract class cannot 
# be an instantiation 

from abc import ABC,abstractmethod 

class Animal(ABC): 
	@abstractmethod
	def move(self): 
		pass

class Human(Animal): 
	def move(self): 
		print("I can walk and run") 

class Snake(Animal): 
	def move(self): 
		print("I can crawl") 

class Dog(Animal): 
	def move(self): 
		print("I can bark") 

class Lion(Animal): 
	def move(self): 
		print("I can roar") 

class Cat(Animal): 
	def move(self): 
		print("I can meow") 

""" Interface
it is like abstract classes but allows child classes to implement multiple classes

cannot define variables (data members) in an interface or constructor functions

only abstract methods
only public functions can be defined, no private and protected functions can be defined

an interface is a set of publicly accessible methods on an object which can be used by other parts of the program to interact with that object

Interfaces set clear boundaries and help us organize our code better
informal Interfaces - Dynamic Language and Duck Typing
There’s no explicit interface keyword in Python like Java/C++ because Python is a dynamically typed language

in the dynamic language world, things are more implicit
more focus on how an object behaves, rather than it’s type/class
if we have an object that can fly and quack like a duck, we consider it as a duck

this is called “Duck Typing”
to be safe, we often handle the exceptions in a try..except block or use hasattr to check if an object has the specific method

in the Python world, we often hear “file like object” or “an iterable”

if an object has a read method, it can be treated as a 'file like object'
if it has an __iter__ magic method, it is an iterable
so any object, regardless of it’s class/type, can conform to a certain interface just by implementing the expected behavior (methods)

these informal interfaces are termed as protocols
since they are informal, they can not be formally enforced
they are mostly illustrated in the documentations or defined by convention
 """

## define `apple` and `banana` parent classes
class Apple(abc.ABC):
  @abc.abstractmethod
  def apple_one(self):
    pass

class Banana(abc.ABC):
  @abc.abstractmethod
  def banana_one(self):
    pass

## define child class from Apple and Banana
class Fruits(Apple, Banana):
  
  def apple_one(self):
    print("Child Class - Apple")

  def banana_one(self):
    print("Child Class - Banana")
## instantiate objects

fruit_bowl = Fruits()
fruit_bowl.apple_one() # call function initialized in Apple Base Class
fruit_bowl.banana_one() # call function initialized in Banana Base Class