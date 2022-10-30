myTuple = 4,4,4,7,5
mySet=set(myTuple)
print( len(mySet) )

yourSet = {2,2,3,2,0,"soup","stop",2}
print( list(yourSet) + list( (4,4,4) ) )


print( 5 in {2,0,(5,5)} )

"""
We will not discuss this until a future Youtube lesson, but lists and
sets CANNOT be the elements in a set.
"""

try:
    assert [2] in { (2) , 2 }
except AssertionError:
    print( "was a false boolean" )
except TypeError:
    print( "can't even run the assertion statement" )
else:
    print( "you can have a list or set in a set" )  # not true...
finally:
    print( "runs regardless" )


myDictionary = { 0 : 100 , 2 : 200 , 3 : 200 , 200 : False }
myDictionary[8] = myDictionary[2] - 150

print( myDictionary.get(0) )
print( myDictionary.get(8) )
print( len( myDictionary ) )

myDictionary.pop(0)
print( 3 in myDictionary )
print( False in myDictionary )
print( 0 in myDictionary )

myDictionary.update( { 15 : "pizzas" } )
print( len( myDictionary[15] ) )
print( "s" in myDictionary.get(15) )
print( "s" in myDictionary )

"""
myDictionary.keys( ) is a generator which yields the keys of myDictionary
myDictionary.values( ) yields the values of myDictionary
myDictionary.items( ) is a generator which yields tuples (a,b), where
a is a key and b is a value, for each key-value pair a:b in myDictionary
"""

print( list( myDictionary.keys( ) ) )  # a list containing the keys
print( tuple( myDictionary.values( ) ) )  # tuple containins the values
print( set( myDictionary.items( ) ) )  # set containing key-value tuples
 

listComprehension1 = [ 3 * x for x in range(5) ]
print( listComprehension1 )

listComprehension2 = [ "$" + y for y in ("100","200","400") if int(y) >= 200 ]
for z in listComprehension2:
    print(z)


print( "{0} and {1} and {2}, oh my!".format( "lions" , "tigers" , "bears" ) )

a = "apples"
o = "oranges"
s = "it's {x} and {y}, not {x} or {y}".format( y = o , x = a )
print( s )

u = 400
v = 200
print( "{soup} + {bread} = {b}".format( soup=u,bread=v,b=u+v) )
