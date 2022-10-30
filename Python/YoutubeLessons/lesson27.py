def generateSunday(x,y,z):
    """
    This generator accepts an arbitrary input x, and either two 
    numeric or two string inputs y and z
    It prints the value of x, then yields the sum or concatenation of y and z
    on three separate lines, then yields the value of z 

    @param x the first input
    @param y the second input, a int/float or string
    @param z the third input, a int/float or string (same type as y)
    @yield y+z three times, then z once
    """
    print(x)
    for s in range(3):
        yield y+z
    yield z


for s in generateSunday( 10 , "Sun" , "day" ):  # invokes print(x), 10
    print( s )  # runs Sunday, Sunday, Sunday, day

y = ( lambda a , b , c : generateSunday( a , b , c ) )
#  lambda functions for a generator! (Lambda generator?)

for z in y( 4 , 2 , 0 ):
    print( z )

print( list(y(100,200,300) ) )
print( tuple(y("a","b","c") ) )


