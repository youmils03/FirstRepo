import re as regular  # import a module under a different name. Discussed in a later video

myPattern = r"Sun"  # patterns in regular expressions have r before the double quotes
myWord = "Saturday and Sunday"  # string to check

g = range(4)

if regular.match( myPattern , myWord ):  # equivalent to True if myWord begins with myPattern
    print( list(g) )

if regular.search( myPattern , myWord ):  # if myPattern is somewhere contained within myWord
    print( tuple(g) )

lambdaReview = ( lambda p , w : regular.findall( p , w ) )  #re.findall(x,y) returns a list

print( lambdaReview( r"ion" , "You can champion ionic bonds, because ions are ionic!" ) )
print( tuple( lambdaReview( r"S" , myWord ) ) + tuple(range(2) ) )  # ( "S" , "S" , 0 , 1 )

print( ( regular.search( r"ay" , myWord ) ).group( ) )  #returns the string that was matched, ay
print( ( regular.search( r"ay" , myWord ) ).start( ) )  #index position of beginning of first occurrence
print( ( regular.search( r"ay" , myWord ) ).end( ) )  # index position after end of first occurrence
print( ( regular.search( r"ay" , myWord ) ).span( ) )  # ( re.search(p,w).start() , re.search(p,w).end() )
