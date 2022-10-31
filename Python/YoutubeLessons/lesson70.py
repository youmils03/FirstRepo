print( chr(84) )
print( chr(85) )
print( chr(86) )

print( ord("$") )
print( ord("5") - ord("4") )  # the ASCII character codes for the digits "5" and "4" should only be off from one another by 1
print( ord("5") )

print( ord(chr(119)) )
print( chr(ord('t') ) )

def f(s,t):
  print( "just gonna return the frozen-set implementation of the zip generator" )
  return frozenset( zip(s,t) )  # unordered and immutable


a = f( (3,0,2) , [9,9,True] )

for k in range(3):
  print( a )


assert list(enumerate([4,4,2]) ) == list( zip( list( range( len( [4,4,2] ) )), [4,4,2]))  # throws an error if False

print( "yup, enumerate is just zip(list(range(len(x))),x)" )
