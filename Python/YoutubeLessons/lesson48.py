class Person:

    def __init__(s,n,a):
        s.__name = n
        s.__age = a

    def __lt__(u,v):
        return u.__age < v.__age

    def __str__(s):
        result = "{a} = {b}".format( a = s.__name , b = s.__age )
        return result  # a string with the name and age of the instance

def bubbleSort( myList ):
    """This function accepts a list and returns a version of the iterable where the elements
    are sorted in order of ascending order. This can apply either to ints/floats, or to
    any object which is SORTABLE (as discussed in the next lesson)

    @param myList the list to sort
    @return a sorted version of the list

    """

    for w in range( len( myList ) - 1 , 0 , -1 ):
        for x in range(w):
            if myList[x] > myList[x+1]:
                myList[x] , myList[x+1] = myList[x+1], myList[x]

    return myList


a = [ 42 , 49 , 45, 40 , 47 , 46, 50 , 43, 41, 44 , 48 ]
print( tuple( bubbleSort( a ) ) )  # must sort and THEN convert to a tuple, not vice versa...

c = [ Person( "Abby" , 35 ) , Person( "Bob" , 31 ) , Person( "Cameron" , 33 ) ]
c = c + [ Person( "Dave" , 34 ) , Person( "Edith" , 29 ) , Person( "Finnegan" , 30 ) ]

for d in bubbleSort(c):
    print( d )
