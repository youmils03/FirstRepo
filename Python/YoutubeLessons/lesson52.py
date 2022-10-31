class Person:


    def __init__(a,b,c):
        a.__name = b
        a.__age = c

    @classmethod
    def linearSearch1( c , myList , myTarget ):  # c is just a signifier for the class method

        found = False

        index = 0

        while index < len(myList):
            if myList[index] == myTarget:
                found = True
                break
            else:  # unnecessary else since there's a break statement in the if block...
                index += 1

        if not found:
            throwOne = input( "Throw exception? Anything other than n or N will throw it!" )
            if throwOne in ("n","N"):
                print( "ok, you just get -1 then for the index position of the unfound element" )
                return -1
            else:
                raise ValueError( "Could not find element. You affirmed exception or gave bad input." )
        else:
            assert found  # meaningless, found is true by if/else setup
            print( "found it!" )
            return index

    @staticmethod
    def linearSearch2( myList , myTarget ):
        """
        Static method implementation that calls the linear search above on a list
        of names retrieved from a list of Person objects
        @param myList, a list of Person objects
        @param myTarget, the name of the Person desired
        @return the index position of the first occurrence of the Person whose
        name matches myTarget, within the list of myList Person objects
        """
        myNames = [ ]
        for k in myList:
            myNames.append( k.__name )

        return Person.linearSearch1( myNames , myTarget )

P1 = Person( "Bob" , 32 )
P2 = Person( "Cameron" , 34 )
P3 = Person( "Steve" , 30 )
P4 = Person( "John" , 29 )
P5 = Person( "Alyssa" , 38 )
P6 = Person( "Kate" , 51 )
P7 = Person( "Paul" , 22 )
P8 = Person( "Erin" , 36 )

P = P1,P2,P3,P4,P5,P6,P7,P8  # tuple

print( Person.linearSearch1( [6,4,6,8,9,3,8,10,0,2] , int(8.3) ) )
print( Person.linearSearch1( [6,4,6,8,9,3,8,10,0,2] , 19 ) )

print( Person.linearSearch2( P , "e".upper( ) + "RIN".lower( ) ) )
