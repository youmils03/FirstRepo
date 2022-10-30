myTuple = ( 3 , 2 , 3 , 9 , (3,2,True) , ( (5,4) , [6] ) , 9 , 9 )

for s in myTuple:
    print( s )


print( myTuple.count(3) )  # there are 2 occurrences of 3 in myTuple

print( myTuple.index(9) )  # 9 first occurs at index position 3


"""

Suppose that a and b are two tuples, and c is formed by combining
a and b. That is, c = a + b
Then, len(c) = len(a) + len(b)

"""

easyTuple = 4 , 0 , 4
print( len( easyTuple + easyTuple ) )
# len(e+e)=len(e)+len(e)=3+3=6

print( [ 5 , 2 , True ] * 3 )
print( (0,1) * int(7.29) )


mySet = { 4 , 2 , 4 , 2 , 0 }
print( mySet ) 
print( len(mySet) )
mySet.add(16)
print( mySet )

try:
    mySet.remove(810)
except KeyError as K:
    print( "Can't remove an element not in a set, Jack" )


def createSet(t):
    """This method accepts an integer t and asks the user to create
    a set with t elements in it
    For each element, if the element is already in the set, the user
    will be warned that the element exists
    If re-added it would have no effect
    The user has one chance to change their choice, for each of the
    10 elements
    The set and resultant length are reported at the end
    
    @param t the "potential" length of the new set to create
    @return the resultant set
    """

    newSet = set( )

    try:
        assert t == int(t) and ( t >= 0 and t <= 10 )
    except AssertionError:
        t = 10

    for s in tuple(range(t)):  # tuple(range(t)) == (0,1,2,...,t-1)
        newVal = input( "Add an element: " )
        if newVal in newSet:
            print( """
                Are you sure?
                a. yes, has no effect on set
                b. no choose different
                c. end set here 
                """ )
            answer = input( )
            if answer == "a" or answer == "A":
                # newSet.remove(newVal)  # makes the add statement required
                newSet.add(newVal)  # has no effect
            elif answer == "b" or answer == "B":
                uniqueValue = input( "unique or I quit..." )
                if uniqueValue in newSet:
                    raise ValueError( "Too many issues!" )
                else:
                    newSet.add(uniqueValue)
            else:
                break
        else:
            newSet.add(newVal)

    myLength = len(newSet)
    print( "Set: " )
    print( newSet )
    print( "Length: " )
    print( myLength )
    return myLength


oneLength = createSet(6)

if oneLength < 6:
    print( "You definitely had a duplicate in there" )
    if oneLength < 5:
        print( "More than one!" )
    else:
        print( "Just one though" )