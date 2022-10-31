set1 = { 4 , 0 , "bucket" , "tennis" }
set2 = frozenset( {0,4,0} )

print( set1.difference(set2) )
print( set1 - set2 )

print( set1.issuperset(set2) )
print( set2.issubset(set1) )
print( set1 | set2 ) # union
print( set2 & set1 ) # intersection

# Recall from the previous lesson that keys in a dictionary cannot be lists or sets. They must be immutable (tuples or frozen sets)

colle = ( 9 , 19 , 12 , 10 , "soup" , "eggs" , "lettuce" , False )

print( n := iter(colle) )

j = range(len(colle))

try:
  for k in j:
    print( next(n) )
except StopIteration:
  print( "no next element" )
else:
  print( "never hit stop iteration did we" )
finally:
  print( "fun stuff!" )
