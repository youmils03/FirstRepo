a = (lambda t:hex(t))

print( callable(a) )
print( callable(a(49)) )

print( a(62) )
print( a(-111) )
print( int(0x7b) )
print( a(int(0x7ddd)) )
print( float(0x3ea5) )
print( str(a(52)) + " burgers" )
print( f"{a(802)} hot dogs")
print( "{x} + {y} = {z}".format(x=a(24),y=a(53),z=a(24+53)))  # There is no "carry-over" digits in the hex case
  # 8+5=d in base 16, and 1 + 3 = 4

f , g = ord , chr  # tuple unpacking for function reference variables f and g, unpacking tuple (ord,chr)

for h in map( f , ["a","c","g","x","B","2","6","$","^"," "] ):  # map(function, iterable)
  print( h )

for k in map( g , (108,103,102,38,54,72,66,120) ):
  print(k)  # chr(x) accepts an ASCII code and returns the character with that ASCII value

print( chr(ord("M") ) )
print( ord(chr(116) ) )  # inverse functions


iterable1 = { 9 , 2 , 0 , 3 , 9 }  # 4 unique elements
iterable2 = ("soup","sun","beach","vegas")

print( zip( iterable1 , iterable2 ) )

print( list( zip( iterable1 , iterable2) ) )
print( sandwich := frozenset( zip( iterable2 , iterable1 ) ) )
print( type(sandwich) )

for s in zip(iterable1,iterable2):
  print(s)

# enumerate(x) == zip(list(range(len(x))),x)

values = [ 82 , 80 , 78, 77 ]

print( tuple( enumerate(values) ) )
print( tuple( zip( list( range( len(values) ) ) , values ) ) )
