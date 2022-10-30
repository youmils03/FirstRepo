def raiseException( ):
    """This function raises an exception automatically by performing
    an illegal operation"""

    print( (8+8) // (8-8) )

def throwException( ):
    """This function throws an exception manually, essentially generating
    an error without there being anything wrong with Python code

    @raise ZeroDivisionError
    """

    raise ZeroDivisionError

def throwExceptionWithMessage(s):
    """
    This function accepts a string and throws an exception manually, 
    with the string as the error message concated with itself, with
    a space in between
    For example, the input string "cat" would yield the error
    message "cat cat"

    @param s the error message for the upcoming IndexError
    @raise IndexError with s concatenated with s as the error message
    """

    raise IndexError( s + " " + s )


funcRefVariable = throwExceptionWithMessage
# funcRefVariable( "pizza" )


