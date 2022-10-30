print( None )

def g(x):
    print(x+2)
    return None  # happens by default without a return statement

def h(y):
    print(y%4)

u = g(3)
u = g(4)
u = g(5)
print( u )

print( "sandwich" )
print( h(37) )

z = h(100)  # remainder when 100 is divided by 4 is 0, so print 0
print( type(z) )  # type(x) will be studied in a future video

myTuple = (5, 2, 3, 4)

try:
    print( "gonna try to access elements of a tuple by index position" )
    print( myTuple[0] + myTuple[3] )
except IndexError:
    print( "can't index elements of a tuple" )
else:
    print( "no issues with that indexing!" )
# finally block not required

try:
    print( "gonna try changing a tuple" )
    myTuple[0] += 2
except Exception as E:
    print( "let's learn what the issue was" )
    print( E )  # learn the type of exception
finally:
    print( myTuple[0] )  # unchanged


def concatenateTuples( a , b ):
    return a + b


tuple_a = 7 , 2 , "sup"
tuple_b = (False, True, True)
burger = concatenateTuples( tuple_a , tuple_b )
print( "Length of combined tuple in floating point form: " + str( float( len( burger ) ) ) )

pizza = (2,2,2,2,3)

for slice in pizza:
    print( slice + 10 )

evens = 0

for piece in pizza:
    if not ( piece % 2 == 0 ):
        continue
    evens += 1

print( "Evens: " + str( evens ) )