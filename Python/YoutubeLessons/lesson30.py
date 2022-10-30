""" ***********DECORATORS********** """

def decorateThis( f ):
    def wrapFunction( ):  # wrap function is an inner function for the decorator
        print( "Decoration before...yay!" )
        f()
        print( "Decoration after...yay!" )
    try:
        return wrapFunction( )
    except TypeError:
        pass


@decorateThis  # decoration of printFavorite
def printFavorite( ):
    """This native function prints a simple string, but it is decorated
    to print additional text before and after that"""
    print("pizza")


printFavorite = decorateThis(printFavorite)  # SECOND decoration of printFavorite

printFavorite( )
