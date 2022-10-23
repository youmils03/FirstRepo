x = 24
x += len(str(x))  # 26
x *= 10  # 260
x // = 129  # 2
x += (3*x + 5)  # 2 + (3*2+5) = 2+(6+5) = 13
x += x // 10  # 14
print( 24 - x )  # 10

# above: IN-PLACE OPERATORS
# below: BOOLEAN VARIABLES

print( 8 + 2 > 5 )
print( 16 < 24 - 8 )
print( 36 + 2 == 44 )
print( 8 - 9 >= -124 )
print( not ( 3 + 3 == 100 ) )
print( "s" in "sara" )
print( "t" > "b" )
print( "tater" >= "taters" )
print( (8*9 == 73) or (4*4 <= 16) )
print( ( not True ) or ( "e" not in "picks" ) )
print( True and False )
