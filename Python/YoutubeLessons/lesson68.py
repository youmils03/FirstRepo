print( hex(3) )   # 0 * 16^1 + 3 * 16^0
print( hex(10) )
print( hex(14) )
print( hex(16) )  # 1 * 16^1 + 0 * 16^0
eval( "print( hex(14+16) )" )
print( hex(32) )  # 2 * 16^1 + 0 * 16^0
print( hex(1600) )  # 6 * 16^2 + 4 * 16^1 + 0 * 16^0 == 1536 + 64 + 0 == 1600, so hex(1600) == 0x640
print( hex(-2) )
print( hex(eval("-" + "3" + "5") ) )

print( callable(hex) )  # hex is a function
print( callable(hex(2) ) )  #hex(2) is not a function

print( int(0x42) )  # 4*16 + 2*1 = 66
print( int(-0x5f) )  # -(5*16 + 15*1) = -95
print( float(0xaa) )  # 10 * 16 + 10 * 1 = 170 --> 170.0

print( bool(0x000) )  # bool(0) == False regardless of numeric type
print( bool( eval("-0xe") ) )  # bool(t) == True for hex t if t nonzero

print( str(0x2b) + " cookies" )  # can convert hex to str
print( f"the calculation is {int(0xd5a)}" )  # concise formatted string
print( "formatted string with the hex {k}".format( k = hex(299) ) )  # string formatting using format(x)
