a = 5  #creation of a variable
print( a + 20 )  # usage of a variable
b = 3
print( b - a )  # -2
c = 10
d = 2.0
print( c * d )  # 20.0, usage with a floating point number
e = 100
e = e + 3  # reassignment of a variable using its current/retiring value
print(e+1)  # 104, not 101
e -= 4  # shorthand for e = e - 4
print(e+1)  # 101, not 104
print( int(4.2) )  # explicit conversion using the int(x) function
print( float(-64) )  # explicit conversion using the float(x) function
print( str(5) + "2" )  # "52"
print( int( "2" * 3 ) - 22.0 )  # 200.0
