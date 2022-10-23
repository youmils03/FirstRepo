u = [ 3 , 8 , 1 , 4 , 0 ]
print( u[u[2]] )
print( len( u + ["pizza", "pasta", False , False] ) )
print( [5,100] * 2 )
print( "banana" in u )
print( "sat" in "saturday" and False in [True,False] )

starter = [6,2,0]
starter.append(22)
starter.append(14)
print( len(starter) <= 4 )  # False

v = [2,0,9]
v.insert(1,v[0]*2)
print(v)  # [2,4,0,9]

a = [ 32 , 25 , 29 , 30 , 29 , 17 , 14 , 10 , 18 ]
print( a.index(29) + a.index(32) )

myMath = [ 80 , 64, 68 , 71 , 79 , 74 , 72 , 77 ]
print( myMath.index( max(myMath) ) )
print( min(myMath) < 70 or False )

frequencies = [300,280,300,320,310,310,310,300,280,320,290,300,320,310]
specificFrequency = frequencies.count(310)
print( "Number of 310's: " + str(specificFrequency) )

myFruit = [ "apple" , "orange" , "banana" , "hot dog" ]
myFruit.remove( "hot dog" )
print( not ( "hot dog" not in myFruit ) )  # False

T = [ "Train" , "Tapestry" , "Tickling" ]
T.reverse( )
print( T.index("Tr" + "ain") )  # 2
