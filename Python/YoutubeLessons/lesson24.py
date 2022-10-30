import math as greenHat

print( "butterfly"[0:3] )

listComp = [ (2*t+2) for t in tuple(range(3,10)) if t - 5 > 0 ]
tupleComp = tuple(listComp)
print( tupleComp )

a = "tornado"
print( a.count("o") )
print( a.index("n") )
print( len(a) )
print( a == a.lower( ) )
print( a.upper( ) )
print( a.startswith("to") )
print( a.endswith("DO") )
print( "n" in a )
print( a.replace( "o" , a[ a.index("a") ] ) )


"""
NUMERIC FUNCTIONS (new content in lesson 24)
"""

myList = [ 2 , 9 , 3 , 0 , 12 , 7 , 8 , 4 , -2 , 1 ]
print( max( myList ) )
print( myList.index( min( myList ) ) )

print( min( -5, -2, -5, -5 , -6 , -6 , -2 ) )

myTuple = ( "T" , "U" , "S" , "Y" , "R" )
print( max(myTuple) * 5 )

print( abs(4) + abs(-1) )

print( round( 5.2352039 , 4 ) )

print( round( greenHat.pi , greenHat.ceil(1.8888) ) )

myNumbers = [ 82 , 84 , 89 , 85 , 81 ]  # can sum a list
otherNumbers = ( 79 , 82 , 85 , 90 , 83 )  # can sum a tuple 
print( sum(myNumbers) - sum(otherNumbers) ) 


sampleVals = [ 1 , 6 , 3 ] + list(range(3) )  # [1,6,3,0,1,2]


"""
any[ f(s) for s in u ] 
--> f(s) is a predicate (true/false statement) regardnig s
--> s is each element in an iterable u
--> u is the iterable (list, set, tuple)
--> returns True if f(s) is true for at least one value of s
--> all[ f(s) for s in u ] returns False if f(s) is false for at least 
one value of s
"""

b1 = any( [ s * 2 > 8 for s in sampleVals ] )
b2 = all( [ steel > 0 for steel in sampleVals ] )
print( b1 )
print( b2 )

for s in enumerate( [ 5 , 2 , "True" , 9 , "no" , True ] ):
    print( s )


print( list(enumerate((6,3,0)) ) ) 