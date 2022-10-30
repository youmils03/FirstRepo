try:
    print( "begin" )
    myList = [3,2,4,4]
    print( myList[myList[3]] )  # myList[4] is undefined, throws IndexError
    print( "did we make it here?" )
except ValueError as V:
    print( "wrong value" )
    print( V )
    print( "caught the exception! No runtime errors here" )
except IndexError as I:
    print( "wrong indexing, buddy" )
    print( I )  # prints Python's official error message for IndexError
except Exception as E:  # exceptions that are NOT ValueError or IndexError
    print( "some error that was not a value error or an index error" )
    print( "no problem, caught it!" )
    for s in [ "s" , "o " , "u" , "p" ] + [ " y " , "u" , "m" ]:
        print(s)  # prints soupyum, with each letter on a different line
else:  # would run if print( myList[myList[3]] ) had been commented out
    print( "there were no issues in the try block" )
    print( "this code runs if the except blocks didn't have to catch \
    any exceptions" )
    
    try:
        assert 6 < 9-3
    except ArithmeticError:
        print( "bad math" )
    except AssertionError:
        print( "bad logic" )
    finally:  # this code runs regardless, but only within THIS try block...
        print( "this will not run because there was an index error....." )

finally:  # THIS finally block runs regardless of exceptions thrown
    #  There is a 100% chance that the code in the finally block will run
    print( "nested try/except/else/finally blocks are neat, huh!" )


