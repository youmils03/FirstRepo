"""
Steps for file I/O:
    1. Generate a text file using L'inux or with the GUI, and put text on it
    2. with open( "myFile.txt" , "r ) as x:
        3. print( x.read( ) )
        4. x.close( )

# you can also do x = open("myTextFile.txt",r) as done in the youtube video,
# but the context manager as coded above is preferred
"""
with open( "myTextFile.txt" , "r" ) as u:
    print( "sup" )
    print( u.read( ) )
    u.close( )

def writeText(f,t):
    """
    This function accepts a text file and some text, and appends the
    text onto the text file. 
    Note that appending functionality uses "a" and adds new text onto
    existing text
    It does not REPLACE the text, which would use the "w" instead of "a"
    for open(x,y). This is discussed in the Youtube video but NOT coded here
    For fun, it also happens to return the number 5, if desired

    @param f the file to append text to
    @param t the text to append to the file
    @return the number 5
    """

    with open( f , "a" ) as rollerCoaster:
        rollerCoaster.write( t )
        rollerCoaster.close( )

    return 5


def readText(f):
    """Just wraps up reading the file f into a function
    
    This uses the NAIVE approach of assigning a variable to open(f,"r")
    It is BETTER to use the with statement

    with open(f,"r") as t:
        t.read( )
        t.close( )

    @param f the file to read
    """

    z = open(f,"r")
    print(z.read())
    z.close()


b = writeText( "myTextFile.txt" , "let's add this thing on right here" )
print( b * b )  # 25
readText("myTextFile.txt")
    
