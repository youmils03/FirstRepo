# Lambda function that can print but cannot return anything

y = ( lambda **x : print( list( x.values( ) ) ) )
y( california = "sacramento", massachusetts = "boston", arizona = "phoenix" )
s = y( )  # Invokes y(**x) again, this time with an empty dictioanry
print( s )  # None, y(**x) doesn't return anything

"""
map(function,iterable) yields function(x) for each x in iterable
filter(predictate,iterable) evaluates each x in iterable and yields it if predicate(x) is true

mapFiltered(predicate,function,iterable) will filter input values and will yield the 
values of the function applied to those filtered inputs

filterMapped(predictae,function,iterable) will yield the values of the function for all
inputs in the iterable but then will filter those outputs by predicate
"""

def mapFiltered( p , f , i ):
    """
    Accepts a predicate p, function f, and iterable i and yields the values of the function
    f for which the predicate applies to the input in the iterable
    @param p the predicate to check regarding each value x in the iterable i
    @param f the mapping to perform on each input if it passes the predicate
    @param i the iterable of potential input values
    @yield the output values for which the input values passed the predicate
    """

    g = list( filter( p , i ) )
    for h in map( f , g ):
        yield h


def filterMapped( p , f , i ):
    # Perform docstrings on your own for good practice

    g = tuple( map( f , i ) )
    for h in filter( p , g ):
        yield h


print( list( mapFiltered( lambda y : y in range(3,7) , lambda t : t * 10 , tuple(range(10)) ) ) )

def min64(x):
    return x >= 64

print( tuple( filterMapped( min64 , lambda dayTime : dayTime - 20 , [82,89,86,84,84,81] ) ) )

print( a := sum( ( (20 , 30) + (0,-10) ) + (10,0,0,0) ) ) 
print( a := a + a )
print( a := str(a) )
print( a := len(str(a)) ** ( len(str(a)) - 1 ) )
print( b := bool(a) )
print( b := float(c := not b) )
print( d := 1 + (e := 1 + (f := 200) ) )
print( e )
print( f )
