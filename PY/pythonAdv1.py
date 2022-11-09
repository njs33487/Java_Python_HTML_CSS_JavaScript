car_info_dict = {
    "brand": "Ford"     #key-value 1
    ,"model": "Mustang" #key-value 2
    ,"year": 1964       #key-value 3
}
print(car_info_dict)
print(type(car_info_dict))

# use dict() constructor
car_model_info = dict(brand = "Tesla"
, model= "Model 3"
, year = "2017")

#  print the dictionary
print(car_model_info)

# get the value of the model key 
model_value = car_info_dict["model"]
print(model_value)

# .get() to get values get the value of the "model" key using `.get()`
model_value = car_info_dict.get("model")

# print the value
print(model_value)


# CHANGE VALUES

# create dictionary 
car_info_dict = {
  "brand": "Ford", # key-value pair #1
  "model": "Mustang", # key-value pair #2
  "year": 1964 # key-value pair #3
}

# check the dictionary 
print(car_info_dict)

# change the value for year  
car_info_dict["year"] = 2018 

# check the dictionary 
print(car_info_dict)


print("")
print("#################")

# Print all key names in the dictionary, one by one
# print only the keys of the dictionary
for entry in car_info_dict:
  print(entry)

# Print all values in the dictionary, one by one
# print only the values of the keys of the dictionary
for entry in car_info_dict:
  print(car_info_dict[entry])

# Use the ".values()" method to return values of a dictionary
for entry in car_info_dict.values():
  print(entry)

# Loop through both keys and values, by using the ".items()" method:
for key,value in car_info_dict.items():
  print(key,value)

print("")
print("#################")
# to determine if a specified key is present in a dictionary use the "in" keyword

# create dictionary 
car_info_dict = {
  "brand": "Ford", # key-value pair #1
  "model": "Mustang", # key-value pair #2
  "year": 1964 # key-value pair #3
}

# check if brand key exists
if "brand" in car_info_dict:
  print("Brand info is available.")

# to determine how many items (key-value pairs) a dictionary has, use the "len()" function
# create dictionary 
car_info_dict = {
  "brand": "Ford", # key-value pair #1
  "model": "Mustang", # key-value pair #2
  "year": 1964 # key-value pair #3
}

# get length of the dictionary
print(len(car_info_dict))

print("")
print("#################")
# adding an item to the dictionary is done by using a new index key and assigning a value to it

# create dictionary 
car_info_dict = {
  "brand": "Ford", # key-value pair #1
  "model": "Mustang", # key-value pair #2
  "year": 1964 # key-value pair #3
}

# check the dictionary
print(car_info_dict)

# add color entry into car_info_dict dictionary
car_info_dict["color"] = "green"

# check the updated dictionary
print(car_info_dict)

"""  
there are several methods to remove items from a dictionary
".pop()" method
""" 
# initialize dictionary 
car_model_info = {
                  "brand":"Tesla",
                  "model":"Model 3", 
                  "year":"2017"
                  }

# print car model dictionary
print(car_model_info)

# remove item with specified key name
car_model_info.pop("model")

# print car model dictionary after pop
print(car_model_info)

# .popitem()" method
# removes the last inserted item
# in versions before Python 3.7, a random item is removed instead
# initialize dictionary 
car_model_info = {
                  "brand":"Tesla",
                  "model":"Model 3", 
                  "year":"2017"
                  }

# print car model dictionary
print(car_model_info)

# remove dictionary last added entry with popitem()
car_model_info.popitem()

# print car model dictionary after removing last added item
print(car_model_info)

# "del" method
# removes the item with the specified key name
# initialize dictionary 
car_model_info = {
                  "brand":"Tesla",
                  "model":"Model 3", 
                  "year":"2017"
                  }

# print car model dictionary
print(car_model_info)

# remove entry with specified key name using del command
del car_model_info["model"]

# print car model dictionary after del command
print(car_model_info)

"""
# you cannot copy a dictionary simply by typing dict2 = dict1, because:
# dict2 will only be a reference to dict1
# this way, changes made in dict1 will automatically also be made in dict2
# there are ways to make copy of a dictionary
# ".copy()" method:
"""  
# initialize dictionary 
car_model_info = {
                  "brand":"Tesla",
                  "model":"Model 3", 
                  "year":"2017"
                  }

# print car model dictionary
print(car_model_info)

# copy car model info into a new dictionary using .copy()
new_car_model_info = car_model_info.copy()

# print new car model dictionary after copy
print(new_car_model_info)

# "dict()" constructor method:
# initialize dictionary 
car_model_info = {
                  "brand":"Tesla",
                  "model":"Model 3", 
                  "year":"2017"
                  }

# print car model dictionary
print(car_model_info)

# copy car model info into a new dictionary using dict()
new_car_model_info = dict(car_model_info)

# print new car model dictionary after copy
print(new_car_model_info)
"""
# Nested Dictionaries
# a dictionary can also contain many dictionaries, this is called nested dictionaries
"""

# create a nested dictionary 
family = {
  "child1" : {
    "name" : "Emil",
    "year" : 2004
  },
  "child2" : {
    "name" : "Tobias",
    "year" : 2007
  },
  "child3" : {
    "name" : "Linus",
    "year" : 2011
  }
}

# print the family dictionary
print(family)

"""
# another way is to create three dictionaries separately
# then create one dictionary that will contain the other three dictionaries
"""

# create three separate dictionaries 
child1 = {
  "name" : "Emil",
  "year" : 2004
}
child2 = {
  "name" : "Tobias",
  "year" : 2007
}
child3 = {
  "name" : "Linus",
  "year" : 2011
}

# create parent dicitonary 
family = {
  "child1" : child1,
  "child2" : child2,
  "child3" : child3
}

# print the parent dicitonary 
print(family)