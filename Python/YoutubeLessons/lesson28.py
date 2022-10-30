myList = [ t * 2 for t in tuple(range(5,15)) if t // 2 > 4 or False ]

print( myList[0:2] )  # list slicing
print( myList[len(myList)//2:0:-1] )

myTuple = 5 , 9 , 2 , 3 
yourTuple = myTuple + tuple(range(4))  # (5,9,2,3,0,1,2,3)
tupleSlice = yourTuple[ 5:0:-2 ]  # tuple slicing

for s in map( lambda u : u + 400 , tupleSlice ):
    print( s )


s2 = "back" + "pack"  # concise formatted string
print( f"{524+100} cookies were in my {s2} yesterday" )

print( f"{300} + {200} = {300+200}")  # can accept int/floats, like format(x)
