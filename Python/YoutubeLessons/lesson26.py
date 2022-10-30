f = ( lambda x , y , z : 2 * x + 3 * y )
print( f(4,5,4) )

g = ( lambda r : "October" )

for u in map( g , [5,2,5] ):
    print( u.upper( ) )


for h in filter( lambda u : u <= 0 or False , [ -3 , 9 , 0 , 1 , -1 ] ):
    print( h )

"""
NEW CONTENT: GENERATORS
"""

def myGenerator(u):
    yield u
    yield u+2
    yield u+5


print( myGenerator(18) )

for v in myGenerator(4):
    print( v )


print( tuple( myGenerator(2) ) )


def generateWords( ):
    for t in ( "top" , "cup" , "tip" , "pit" , "bot" , "cot" , "dip" ):
        yield t.upper( )


for c in generateWords( ):
    print( c[0:2] )



