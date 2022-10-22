myIterable = 4 , True , 2.5 , "ice cream" , not True

counter = 0

while counter < len( myIterable ):
    print( myIterable[ counter ] )
    counter += 1


counter = 0

while True:
    if counter >= len( myIterable ):
        break
    else:
        print( "sup" )
        counter += 1


for s in range( len( myIterable ) ):
    print( s )


print( range(5) )
print( frozenset( range(5) ) )

w = iter( myIterable )

print( w )
print( tuple( w ) )
for u in iter(myIterable):
    print( u )


class PassByValue:

    def __init__(tornado, myVal):
        tornado.value = myVal


    def addOne(myself):
        myself.value += 1

    @staticmethod
    def addOneStatic(w):
        w += 1

    @classmethod
    def returnOneHigher(myClass, e):
        return e + 1

    @classmethod
    def addOneToElement(x,y):
        y[0] += 1


print( myTwenty := 20 )
PassByValue.addOneStatic( myTwenty )
print( myTwenty )
myObject = PassByValue( myTwenty )
myObject.addOne()
print( myObject.value )
print( PassByValue.returnOneHigher( myObject.value ) )

r = [20]
print( r[0] - 20 )
PassByValue.addOneToElement(r)
print( r[0] - 20 )

set1, set2 = {5,5,5,5,4}, frozenset( {5,6} )
print( set1.union(set2) )
print( set2.union(set1) )
print( set1 | set2 )
print( set2 & set1 )
print( set2.intersection(set1) )
print( len(set1) )
print( type(set2) )
print( list(set1) + [3,0] )
print( tuple(set2) + (9,1,1) )


def generateThis(x="pizza"):
    yield x


print( generateThis(3) )
for s in generateThis():
    print( s )


