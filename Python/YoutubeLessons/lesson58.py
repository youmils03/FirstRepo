print( a := list( "apple" ) )  # [ "a" , "p" , "p" , "l" , "e" ]
print( a := len(a) )  # 5 
print( a == int(a) )  # True 

x = { 3 , 4 , 9 , 4 , 4 }
y = frozenset( { 1 , 7 , 6 , 7 , 7 , 4 } )

print( x.union(y) )  # union(x) returns a set when called ON a set
print( y.intersection(x) )  # intersection(x) returns a frozen set when called ON a frozen set
print( ( {4,3} ).issubset( x ) )  # issubset(x)
print( ( {7,6,4} ).issuperset( y ) )  # issuperset(x)
print( ( frozenset( {3} ) ).issubset(x) )  # Can see whether a frozen set OR regular set is a subset OR superset of a frozen set OR regular set

print( float(len(y) ) )  #4.0, constantly 4 unique elements in the immutable (frozen) set. float(len(y)) == 4.0 forever! (Unless you call del y)

"""Callable instances"""

class Car:

    def __init__(car,color,price):
        car.__color = color
        car.__price = price
        
    def __call__(u,v):  # u is an instance method designation, v is an input to the function
        """Defines what it means to treat an instance of a class as though it were a function that could be called
        
        @param v the input to the function
        """
        
        try:
            assert v == int(v) and v > 0 #  verify that v is a positive integer
        except AssertionError as A:
            v = 5
        
        for s in range(v):
            print( "This color is " , u.__color , "and costs" , u.__price )
            
        return 64  # optional value to return if desired. Otherwise just call the function without printing its output
           
           
c = Car( "red" , 19000 )
d = c(3)  # CALL the instance. Treating it like a function by having parenthesis on the end of it. __call__ accepts one input.
print( d % 4 )  # 0, 64 is perfectly divisible by 4
