import json as pizza

"""
callable(x) == True if and only if x is a function
x is a function if and only if
1. it is a traditionally defined instance method, static method, or class method (lesson 13, 14)
2. it is a lambda function (lesson 25)
3. it is a function reference variable (lesson 15)
4. it is an instance of a class which specifies the __call__ magic method
Otherwise, callable(x) == False
"""

class A:

    def __init__(u):
        print( "sup" )
        
    def __str__(t):
        return "burger"
        
class B(A):  # subclass

    def __init__(r):
        super().__init__()  # invoke constructor from superclass
        print( "not much" )
        
    def __call__(y,z=5):  # example with default argument. See lessons 44 and 45
        for r in range(z):
            print( super().__str__() + " is yummy" )
        return False
        
    def __str__(t):
        return ( super().__str__() + " and hot dog" ).upper( )
        
print( k := pizza.loads( "{True: False}" ) ) 
print( len(k) )
print( False in k )
print( True in k )
print( len(k) == len( k := pizza.
print( type(k) )  # now a string via the walrus operator in the previous line
        
u1 = 42
u2 = range
u3 = float
u4 = A( )  # sup
u5 = B( )  # sup, then not much

for s in map( callable , [u1,u2,u3,u4,u5] ): 
    print( s )  # prints callable(u1), then callable(u2) on the next line, etc.

print( u4 )  # not callable but has an str method
print( u5 )  # callable and has an str method
print( u5() )  # invokes __call__ with default input z=5
#  also prints False which is the result of __call__
