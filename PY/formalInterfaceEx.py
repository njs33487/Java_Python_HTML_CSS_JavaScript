"""  Formal Interface - Example
theres the abc module which has a metaclass named ABCMeta

ABCs (Abstract Base Classes) are created from this metaclass
we can either use it directly as the metaclass of our ABC i.e. something like this
class Bird(metaclass=abc.ABCMeta):
or we can subclass from the abc.ABC class which has the abc.ABCMeta as its metaclass already
then we have to use the abc.abstractmethod decorator to mark our methods abstract
 """
import abc

class Bird(abc.ABC):
    @abc.abstractmethod
    def fly(self):
        pass

# if any class derives from our base Bird class, it must implement the fly method too

class Parrot(Bird):
    def fly(self):
        print("Flying")

p = Parrot()

# check if p is an instance of Bird Class
isinstance(p, Bird)

class Aeroplane(abc.ABC):
  @abc.abstractmethod
  def fly(self):
    pass

class Boeing(Aeroplane):
  def fly(self):
    print("Flying!")

b = Boeing()

isinstance(p, Aeroplane)
isinstance(b, Bird)
