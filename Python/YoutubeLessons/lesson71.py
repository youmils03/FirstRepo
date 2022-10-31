a = { 5 , 2 , True , frozenset( {9,1,9} ) , (5.7,8.7,9.7) }  # elements in a set must be immutable. No lists or sets, only tuples and frozen sets

b = frozenset( { 2 , True , False , "yes" , 88 } )

print( a.union(b) )  # returns regular set since was called on a regular set
print( b.intersection(a) )  # returns frozenset since was called on a frozenset

print( a | b )  # concise set notation for a.union(b)
print( b & a )  # consise set notation for b.intersection(a)

print( a.difference(b) )  # all elements x in a such that x is not in b
print( a-b )  # concise set notation for a.difference(b)

print( a.issubset( frozenset( {5,2,True,frozenset({9,1,9}),(5.7,8.7,9.7),12,16,22,20} ) ) )
print( b.issuperset( a ) )  # can see whether a frozen set or regular set is a superset or subset of a frozen set or regular set

validkey1 = 8
validkey2 = 2.2
validkey3 = "horse"
validkey4 = 4 , 10 , 3
validkey5 = frozenset( {9,1,1} )  # 2 unique elements

invalidkey1 = list(range(5))  # lists cannot be keys
invalidkey2 = { 2 , 4 , 6 , 8 }  # sets cannot be keys

myDict = dict()

myDict[validkey1] = invalidkey1
myDict[validkey2] = invalidkey1
myDict[validkey3] = invalidkey2
myDict[validkey4] = invalidkey2
myDict[validkey5] = invalidkey1

print( tuple( myDict.items( ) ) )
