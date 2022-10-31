import re as great

myPattern = r"(?P<apple>abc)(d(ef))(?P<orange>gh)ijk(l(?P<yum>mn))(?:opq)(?:rst)(uv)(?:wx)"
myWordToCheck = "abcdefghijklmnopqrstuvwxyz"


# Named groups using (?P<nameOfGroup>groupContent) instead of (groupContent)
print( great.match( myPattern , myWordToCheck ).group( "apple" ) )
print( great.match( myPattern , myWordToCheck ).group( "orange" ) )
print( great.match( myPattern , myWordToCheck ).group( "yum" ) )
print( great.match( myPattern , myWordToCheck ).groups( ) )

# Non-capturing groups using (?:groupContent) instead of (groupContent)
# Doesn't affect the numbering, non-capturing groups are "hard to see"

u = 0

while True:
    try:
        print( "u = " , u )
        print( great.match( myPattern , myWordToCheck ).group(u) )
        u += 1
    except Exception as E:  # eventually we run out of groups
        print( "Issue: " , E )
        break

# KEYWORD arguments

def keywordFunction( a , b = 2 , *c , **d ):
    """
    This function accepts one mandatory argument, one optional
    argument b (which must be specified as b), arbitrary remaining
    arguments fed in as a tuple c, and a collection of keyword
    arguments d
    Keyword arguments are treated as a dictionary {K:V, ...}, where
    the argument is specified as keywordFunction(K=V, ...)
    """
    print( len(a) )  # mandates that a is an iterable
    print( "b = " , b )
    print( len(c) )  # number of non-a, non-d, non-keyword arguments
    print( len(d) )  # number of K=V assignments that were brought in

    print( list( d.keys( ) ) )

    for g in d.items( ):
        print( g )

    print( c.count(10) )  # number of unlabeled 10's


keywordFunction( summer = "awesome" , winter = "awful" , a = "100" )

