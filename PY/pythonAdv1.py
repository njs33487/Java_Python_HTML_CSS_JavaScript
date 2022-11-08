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
