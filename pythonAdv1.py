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


