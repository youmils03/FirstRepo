from string import digits as z

otherDictionary = {3:2,2:True,5:True,8:False,False:6}

print( bool(3) )
print( bool(0.0) )
print( bool("False") )
print( bool(False) )

otherDictionary[2]=otherDictionary[3] ** 4
print( otherDictionary[2] - 10 )

print( otherDictionary.get(8) and True )

print( 5 in otherDictionary )
print( 6 in otherDictionary )
print( 6 in otherDictionary.values( ) )
print( (3,2) in otherDictionary.items( ) )

print( list( otherDictionary.keys( ) ) + [902,903,902] )

print( [ u + 10 for u in list(range(23,29,2)) if True ] )  # tuple comprehension

print( [ v for v in range(30) if v % 2 == 0 ] )  # list comprehension


print( "{a}, {b}! {a}!".format( a="sup", b="dawg" ) )


print( z + z )

p = "Saturday And Sunday"
print( p.upper( ) )  # SATURDAY AND SUNDAY
print( p.lower( ) )  # saturday and sunday

print( p[1] )  # a
print( p[5:9] )  # letters at index positions 5, 6, 7, and 8
print( p[6:0:-2] )

q = p.replace( "Saturday" , "Monday" )
q = q.replace( "Sunday" , "Tuesday" )
print( q )

print( p.startswith( "Saturday" ) )
print( p.endswith( "Saturday" ) )
print( p.endswith( "sunday" ) )
print( p.endswith( "Sunday" ) )


myCharacters = [ "a" , "p" , "p" , "l" , "e" ]
mySeparator = "+"
myString = mySeparator.join( myCharacters )
print( mySeparator == "a+p+p+l+e" )  # True


yourString = "PIZZAsquirrelPASTAsquirrelCOOKIESsquirrelYUMsquirrelPIZZA"
yourSeparator = "squir" + "REL".lower( )
yourWords = yourString.split( yourSeparator )
print( yourWords )
print( tuple( yourWords ) )
print( len( set( yourWords ) ) )