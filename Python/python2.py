a = 10
b = 20
c = 0

c = a + b
print('Line 1 - Value of c is :' ,c )

c = a - b 
print('Line 2 - Value of c is :' ,c )

c = a * b 
print('Line 3 - Value of c is :' ,c )

c = b / a
print('Line 4 - Value of c is :' ,c )

c = a ** b
print('Line 5 - Value of c is :' ,c )

c = b % a 
print('Line 6 - Value of c is :' ,c )

c = a // b
print('Line 7 - Value of c is :' ,c )

bool1 = (a == b)
print (bool1)

bool2 = (a != b)
print (bool2)

bool3 = ( a >= b)
print (bool3)

bool4 = ( a <= b)
print (bool4)

a = 20 
b = 20 

if (a is b ):
    print (' line 1 - a and b have same identity')
else:
    print (' line 1 -a and b do not have the same identity')

if ( id(a) == id(b) ):
    print (' line 2 - a and b have same identity')
else:
    print (' line 2 - a and b do not have the same identity')

a = 30 

if (a is b ):
    print (' line 3 - a and b have same identity')
else:
    print (' line 3 - a and b do not have the same identity')


# a and b are true
a = True 
b = True

print(a and b)

# only a is true 
a = True 
b = False

print(a and b)

# only b is true 
a = False 
b = True

print(a and b)

# a and b are both false
a = False 
b = False

print(a and b)

## 'or' operator 

# a and b are true
a = True 
b = True

print(a or b)

# only a is true 
a = True 
b = False

print(a or b)

# only b is true 
a = False 
b = True

print(a or b)

# a and b are both false
a = False 
b = False

print(a or b)

# assignment operator 

x = 21
print(x)
# += operator

x += 3
print(x)
# -= operator

x -= 3
print(x)
# *= operator

x *= 3
print(x)
# /= operator

x /= 3
print(x)
# //= operator

x //= 3
print(x)
# %= operator

x %= 3
print(x)