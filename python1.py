str = 'Hello World'
test = 'TEST'

print(str)
print (str [0])
print (str [2:5])
print (str [2:])
print (str * 2)
print (str + test )

#  list 
list = ['abcd' , 786 , 2.23 , 'john', 70.2]
tinylist = [123 , 'john']

print(list)
print(list[0])
print(list[1:3])
print(list[2:])
print(tinylist *2)
print(list + tinylist)

#  tuple
tuple = ('abcd' , 856 , 5.56 , 'john')
tinytuple = (123 , 'john')

print(tuple)
print(tuple[0])
print(tuple[1:3])
print(tinytuple * 2)
print (tuple + tinytuple)

#  dictionary 
dict = {}

dict['one'] = 'This is one'
dict[2] = 'This is two'
tinydict = {'name': 'john' , 'code':1234, 'dept': 'sales'}

print(dict['one'])
print(dict[2])
print(tinydict)
print(tinydict.keys())
print(tinydict.values())

###################################################################

# define a string 
s = "abc"

# indexing starts from 0 in Python
# use square brackets and the index number to access data
print(s[0]) # output: a
print(s[1]) # output: b
print(s[2]) # output: c

print(s[-1]) # output: c
print(s[-2]) # output: b
print(s[-3]) # output: a

# print(s[3]) # output: index error
# define a new string 
s = 'abcdefgh'

print(s[3:6])     #output: def
print(s[3:6:1])   #output: def
print(s[3:6:2])   #output: df
print(s[::])      #output: abcdefgh (useful for copying string content into new memory location)
print(s[::-1])    #output: hgfedbca (reverse string command)
print(s[4:1:-2])  #output: ec


# define a list
new_list = [3,7,20,'@','TECH I.S.', 'makes learning fun!']


print(new_list[0]) # zeroth element
print(new_list[1]) # first element
print(new_list[2]) # second element
print(new_list[3]) # third element

print(new_list[-1]) # last element
print(new_list[-2]) # last but one element
print(new_list[-3]) # last but two element
print(new_list[-4]) # last but three element

# APPEND TO A LIST
# define a list
new_list = [3,7,20,'@','TECH I.S.', 'makes learning fun!']

# print new list
print(new_list)

# append 'wohoo' to new_list
new_list.append('wohoo!')

# check apended value
print(new_list)

# define a list
new_list = [3,7,20,'@','TECH I.S.', 'makes learning fun!']

# print new list
print(new_list)

#  EXTEND A LIST
# extend new_list with multiple elements in an array
new_list.extend(["Let's", "do", "this","!"])
# NOTE: multiple elements have to be input in array

print(new_list)

#  INSERT INTO A LIST
# define list
new_list = [3,7,20,'@','TECH I.S.', 'makes learning fun!']

# insert element 'Chocolate' at spot 3 in new_list
new_list.insert(3,'Chocolate')

# check insertion
print(new_list)

# define list
new_list = [3,7,20,'@','TECH I.S.', 'makes learning fun!']

# without modifying the original list
print(new_list[::-1])
print(new_list) # unmodified original list

# modify the original list
new_list.reverse() # modify original list
print(new_list) 

# define list
new_list = [3,7,20,'@','TECH I.S.', 'makes learning fun!']

# extract combinations of new_list extracts
print(new_list[:4])
print(new_list[2:])
print(new_list[1:5])
print(new_list[:])

# define list
new_list = [3,7,20,'@','TECH I.S.', 'makes learning fun!']

# print length of new_list
len(new_list)

# define list
new_list = [8,12,7,10,52,33,21,99]

# check min and max of new_list
print(min(new_list))
print(max(new_list))

# define list
new_list = ['x','10','99','twenty','%$','--']

# check min and max of new_list
print(min(new_list))
print(max(new_list))

# define list
new_list = [8,12,7,10,7,33,21,7]

# count the number of occurences of 7
print(new_list.count(7))

# count the number of occurences of 10
print(new_list.count(10))

# define two lists
list_first = ['three','hundred']
print(list_first)

list_second = ['words','in','a','paragraph']
print(list_second)

# concatenate lists
list_combined = list_first + list_second
print(list_combined)

#  INDEX AND SEARCH

# define list
new_list = [3,7,20,'@','TECH I.S.', 'makes learning fun!']

# search index of 'TECH I.S.'
print(new_list.index('TECH I.S.'))

# search '@' with optional arguments
print(new_list.index('@',1,4))


#  SORT A LIST

# define list
new_list = [4, 2, 6, 5, 0, 1] 

# check unsorted list
print(new_list)

# sort list
new_list.sort()

# check sorted list
print(new_list)


#  MAKE A COPY OF THE LIST

# define list
new_list = [4, 2, 6, 5, 0, 1] 

# print sorted list
new_sorted_list = sorted(new_list)

# check original list
print(new_list)

# check sorted list
print(new_sorted_list)

# Erase List Content
# define list
new_list = [4, 2, 6, 5, 0, 1] 

# check unsorted list
print(new_list)

# clear list
new_list.clear()

# check cleared list
print(new_list)