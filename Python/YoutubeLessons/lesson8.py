myList = [ 8 , 3 , 1 , 1 , 7 ]
print( myList[0] )
print( myList[3] )
print( len( myList ) )
print( myList )
print( myList + [ 3 , 0 , "soup" , False , 1.6 , 2.23 , 9 ] )

myList[2] = myList[4] + 3 
print( myList[1] + myList[2] )

myNesters = [ [4,0,3] , [3,2,4,2] , [5,1,"hey"] ]
print( myNesters[2][0] )  # 5
print( not ( myNesters[1][2] == myNesters[2][1] ) )  # True

w = "my word"
print( w[1] )
print( w[0] + w[3] )
print( "o" in w AND "p" in w )
print( False or len(w) >= 0 )

print( 45 in [ 42 , 44 , 49 ] or "e" not in "book" )
print( [ 3 , 0 , "pa" ] * 2 )
