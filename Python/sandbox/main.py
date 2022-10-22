class Concatenator:

    def __init__(self, v):
        """Constructor to assign a value to the myVal instance variable
        :param v the value for the new Concatenator object"""
        self.myVal = v

    @classmethod
    def tryConcatenating(c, x):
        """Class [think static] method which accepts a string and tries
        to concatenate text to it. Unsuccessful outside the function
        :param x - the variable to add text to"""
        print( "Ok, I'll try to add on something about pizza")
        x += " Pizza is delicious"

    @staticmethod
    def concatenateObject( myObject ):
        """Static method which accepts a Concatenator object and
        appends text its myVal instance variable
        :param myObject - the Concatenator object whose instance variable
        to modify"""
        print( "This is a static method" )
        myObject.myVal += " Pizza is delicious"

    def concatenateMe(self):
        """Instance method acting on a Concatenator object, which
        successfully updates its myVal instance variable.
        For a Concantenator object C, C.concatenateMe( ) has an effect
        similar to Concanator.concatenateObject( C )"""
        print( "This is an instance method" )
        self.myVal += " Pizza is delicious"

    def __str__(me):
        """String representation of a Concatenator object, given by returning
        its myVal instance variable
        :return - the myVal instance variable"""
        return me.myVal

    def __len__(s):
        """Length of a Concantenator object, given by the length of the myVal
        instance variable
        @:return the length of the myVal instance variable"""
        return len(s.myVal)

    @staticmethod
    def returnConcatenate( t ):
        """Function which accepts a string and returns a string with text
        added onto the original string
        :param t - the string to add text to
        :returns t but with extra text on it"""
        return t + " Pizza is delicious"

    def __call__(self):
        """Defines what it means to treat an instance of the Concatenator
        class as a function
        :return - the number 6"""
        return 6


    @classmethod
    def concatenateList(myClass, myList):
        """Function which accepts a list with at least one element, the first
        being a String, and successfully adds text to that element
        @:param myList - the list with a String element at index position zero"""
        myList[0] += " Pizza is delicious"


class SubclassConcatenator( Concatenator ):

    def __init__(self, v):
        """Creates a SubclassConcatenator object similar to a Concatenator object,
        but with Hello at the beginning for the myVal instance variable
        @:param v - the text to add after Hello"""
        super( ).__init__( "Hello " + v )

    def __str__(self):
        """String representation of the SubclassConcatenator class
        @return a string representation of a SubclassConcatenator object"""
        return super().__str__() + " good night"


x = Concatenator( "Cookies and " )
y = SubclassConcatenator( "Pasta and " )

print( t := 400 )

print( callable( x ) and callable( t ) )
print( callable( x ) and callable( y ) )
print( callable( callable ) and callable( len ) )

print( x() )
print( y() )

print( x )
print( y )

print( s := "sunset" )
Concatenator.tryConcatenating( s )
print( s )

x.concatenateMe( )

print( x )

Concatenator.concatenateObject( y )

print( y )

print( network := "My network " )
print( Concatenator.returnConcatenate( network ) )

L = ["something else "]

print( L[0] )

Concatenator.concatenateList( L )

print( L[0] )


def myHex( ):
    """Review hex(x) and int(y) for some int x or hex number y"""
    print( barry := 253 )
    print( int( barry ) )
    print( float( barry ) )
    print( len( str( barry ) ) )
    print( bool( barry ) )
    print( bool( barry-253 ) )
    print( hex( barry ) )
    print( hex( barry-1) )
    print( hex( barry-16) )
    print( hex( barry+32) ) # 253 + 32 = 285 = 256*1 + 16*1 + 1*13
    print( hex( barry + 16*100 ) )
    print( hex( barry + 16*382 ) )
    u = 0xba
    print( int(u) )
    print( float(u) )
    print( callable( u ) )
    print( callable( a := (lambda potato : bool(u) ) ) )
    print( a(725) and True )
    u = 0x00
    print( False or a(328) )


def myASCII( ):
    """Review chr(x) and ord(y) for an ASCII code x or character y"""
    a , b = chr , ord
    print( b('4') )
    print( b( '$' ) )
    exec( "pri" + "nt( b('M'))" )
    print( eval( "a(73)" ) )
    print( eval( "a(" + "33)" ) )
    print( b(a(33)))
    print( b(a(60) ) )


def setTheory( ):
    """Reminder that sets have shorthand notation for union, intersection, and
    set difference."""
    mySet1 = set( myTuple := (9,2,3,9,9,19,9,5) )
    mySet2 = frozenset( {5,2,5} )
    print( mySet1 )
    print( mySet2 )
    print( mySet1.union( mySet2 ) )
    print( mySet2.intersection( mySet1 ) )

    print( mySet2 | mySet1 )
    print( mySet1 & mySet2 )
    print( mySet1 - mySet2 )
    print( mySet2 - mySet1 )


def dictionaryTheory( ):
    """Reminder that dictionaries can only have immutable keys, like tuples,
    frozen sets, or frozen dictionaries, instead of lists, sets, or dictionaries"""
    myTuple = 8,3,"apples"
    myFrozenSet = frozenset( {6,7,6,7,6} )
    myList = [9 , 5 , True]
    mySet = {7,9,7,False,0}

    myDictionary = { myTuple : myList , myFrozenSet : mySet }
    for s in myDictionary.items( ):
        print( s )


    try:
        otherDictionary = { myList : myTuple , mySet : myFrozenSet }
        print( len( otherDictionary ) )
    except TypeError:
        print( "Can't have mutable keys in a dictionary")

    for u in myDictionary.keys( ):
        print( myDictionary.get( u ) )

    print( myDictionary.keys( ) )
    print( tuple( myDictionary.keys( ) ) )

    for w in myDictionary.keys( ):
        print( myDictionary[ w ] )


    t1 = { 9 , 90 , 2 , 3 , 2 }
    print( iter(t1) )  # GENERATOR
    print( list( iter(t1) ) )  # convert generator to data structure
    for kangaroo in iter(t1):  # use generator in a for loop
        print( 2 * kangaroo )
    p , y = len(t1) , iter(t1)
    warm = eval("range(p)")
    print( warm )
    for q in warm:
        exec( "print( next( y ) - 2 )" )


myHex( )
myASCII()
setTheory()
dictionaryTheory()

lastWord = """Class methods require some sticker on them like instance methods do,
but otherwise they function more like static methods
Just use the proper decorator in either case. Otherwise you've got yourself
an instance method
you don't have to use self and cls, but those are considered good etiquette
A subclass inherits all the methods from the superclass
A class that implements __call__ returns True for callable(x), some instance x
hex(x) returns the hexadecimal representation of the number x
int(0xQ), where Q represents a hexadecimal number, gives the base-10 form
chr(x) accepts an ASCII code x and returns the character
ord(x) accepts a character x and returns the ASCII code
pass-by-value means that Python passes information by value, not reference
Use an instance variable, return something, or use a one-element list
Sets can use shorthand -, |, and & rather than a.union(b) and a.intersection(b)
Dictionaries can only have immutable keys (tuples not lists, frozen sets not sets)
Treat iter(x) as a generator. Can convert to a data structure or use in for loop
"""

print( lastWord )