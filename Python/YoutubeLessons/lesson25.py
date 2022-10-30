a = 7
b = 0.0
c = "3"
d = 7 in [ 9,8,2 ]  # False
  
print( int(a) )  # 7
print( float(a) )  # 7.0
print( str(a) )  # "7"
print( bool(a) )  # True

print( int(b) )  # 0 
print( float(b) )  # 0.0
print( str(b) )  # "0.0"
print( bool(b) )  # False

print( int(c) )  # 3
print( float(c) )  # 3.0
print( str(c) )  # "3"
print( bool(c) )  # True

print( int(d) )  # 0
print( float(d) )  # 0.0
print( str(d) )  # "False"
print( bool(d) )  # False


print( "y$e$s".split( "$" ) + [ "n" , "o" ] )
print( " - ".join( [ "3" , "4" , "3" , "0" , "2" ] ) )


print( max( 5 , 2 , 9 , 2, 7 ) )

print( sum( [ 5 , 0 , -5 , -5 , 2 ] ) )

print( any( [ b > 2 for b in range(3) ] ) )
print( all( True for x in range(10) if x % 2 == 0 ) )


drumstick = [ "a" , "apple" , True , 52 , 42 ]
print( list( enumerate( drumstick ) ) + [ "random element on the list" ] )

u = tuple( enumerate(drumstick) )

try:
    u[0] = u[1]
    print( u[0] == u[1] )
except Exception as E:
    print( E )
    print( u )


def f(x):
    return x + 8

def doThisTwice( g , y ):
    return g(g(y))


print( doThisTwice( f , 10 ) )


W = ( lambda wall : f(wall) )
print( W(650) )

brewster = ( lambda x , y , z : "rat" )
print( len( brewster( 23 , True , "Chicago" ) ) )

wallace = ( lambda : 42 )
print( wallace( ) // 7 )


def addHundred( t ):
    return 100+t


myIterable = ( 1 , 2 , 3 , 9 , 1 )

print( map( addHundred , myIterable ) )

print( list( map( addHundred , myIterable ) ) )
print( tuple( map( addHundred , myIterable ) ) )
print( set( map( addHundred, myIterable ) ) )

print( "hot dog" )

for s in map(addHundred,myIterable):
    print( s )


myFilter = ( lambda u : u % 3 == 0 )

otherIterable = [ 7 , 9 , 6 , 5 , 1 , 8 , 9 ]

print( filter( myFilter , otherIterable ) )

print( list( filter( myFilter , otherIterable ) ) )
print( set( filter( myFilter , otherIterable ) ) )


#can accept regular or lambda functions

def M(s):
    return myFilter(s)


for N in filter( M , otherIterable ):
    print( N )


