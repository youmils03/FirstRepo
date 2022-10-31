import keyword as hot

class Person:

    def __init__(s):
        pass  # empty constructor. Don't do anything formal when creating an instance of the class...just create it.

f = ( lambda t : type(t) )  # lambda functions...remember? (lesson 25)

"""Running a module as a script with
if __name__ == "__main__":
"""

if __name__=="__main__": 

    print( f(204) )
    print( f(3.3) )
    print( f("dog") )
    print( f(not True) )
    print( f( [3,3,2] ) )
    print( f( (5,1,5) ) )
    print( f( {9,2,9,2,9} ) )
    print( f( frozenset( { 5, True, "sneakers" } ) ) )
    print( f( q := Person( ) ) )  # creates q=Person( ) AND prints its type on the console

    """Don't forget the keyword.iskeyword(x) function either"""

    print( hot.iskeyword( "def" ) )
    print( hot.iskeyword( "RANGE".lower( ) ) )
    print( hot.iskeyword( "if I were a moose, where would I go?"[0:2] ) )   
