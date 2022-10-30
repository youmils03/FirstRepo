"""
Important things to know from lessons 41, 42, and 43 before proceeding onto lesson 44:
    1. re.match(pattern,wordToCheck)
    2. re.search(pattern,wordToCheck)
    3. re.findall(pattern,wordToCheck)
    4. metacharacters . ^ $
    5. character classes [ ], inverting a character class with ^ 
    6. groups ( )
    7. ( re.search(p,w) ).start( ), end( ), span( )
    8. ( re.match(p,w) ).group( ), groups( ), group(0), group(1), ...
    9. | or metacharacter
    10. special sequences, with code BELOW

"""

import re

f = ( lambda p , w : re.match(p,w) )

def g(p,w):
    """Function which accepts a regular expression p and a string to check w and returns True
    if there is a match at the beginning of the string
    @param p the regular expression r"someString"
    @param w the string to check, can be any length
    @return True if the word begins with the specified pattern, false otherwise
    """
    if f(p,w):
        return True
    else:
        return False

print( g( r"\d\d\d-\d" , "804-422-2109" ) )  # True, begins with 3 digits then a dash then a digit
print( g( r"...\D" , "804-422-2109" ) )  # True, begins with 3 characters then a non-digit

"""
Recall:
    nested functions
    inner functions
    generators
    decorators
    recursive functions
    instance methods, class methods, and static methods
"""

def f(x=4):  # give x the default value of 4 if one is not specified
    return x**2


print( f(10) )  # 100
print( f() )  # 16, uses the default input of 4

def g( a , b = True ):  # inputs with default values must come AFTER inputs without
    if b:
        return abs(a)
    else:
        return 0 - abs(a)

print( g( -22 , True ) )  # explicitly specifying both inputs
print( g( 45 ) )  # default value assigned to b
print( g( a = -100 , b = bool(0) ) )  # specify both inputs, properly naming them
print( g( a = 2 ) )  # "a=" is unnecessary, but the variable a does need a value
print( g( b = False , a = 1 ) )  # order of inputs doesn't matter if you name them properly

def h(*x):  # x comes in as a tuple, regardless of how many inputs are passed into h
    return len(x)

print( h( 4, 2 , 3) )
print( h( ) )

def u(a, *b, c=2, d=3):
    """
    Tricky example to show the workings of default arguments AND positional arguments
    This function REQUIRES a MINIMUM of one input, specified for a
    If you don't explicitly specify "c=something, d=something" when you call the function,
    ALL remaining arguments are treated as the tuple b
    This function returns the number of arguments beyond the first required argument
    (whether or not the user specifies it as a) that are not specified as c or d
    @param a, the required argument
    @param b, all other unspecified arguments that are not c or d
    @param c, an optional value that can be overridden but doesn't count toward the tuple b
    @param d, another optional value
    @return the number of arguments to u:
    1. all arguments not specified as c or d, minus one
    2. do NOT specify "b=" in the arguments. It is implied to be all remaining/pickup arguments
    """
    return len(b)

print( u(2,2,2,2) )
print( u(a=2,c=3) )
print( u(5,1,d=9) )
print( u(10,12,14,15,12,14,15,15,14,12,10) )
print( u(10) )
print( u(d=2,a=5,c=3) )
print( u(a=6,c=2,d=1) )
