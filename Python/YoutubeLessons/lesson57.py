"""
Recall that you should be comfortable implementing a Stack class and a Queue class:
1. Stacks and Queues should have length, can check to see if empty, can push elements, can pop elements, can peek at elements
2. Stacks are last-in-first-out, so you add and remove from the top
3. Queues are first-in-first-out, so you add to the end and remove from the beginning

A tuple is an immutable version of a list
A frozen set is an immutable version of a set
"""

a = frozenset( { 6 , 3 , True } )

try:
    a.add(27)
except AttributeError as sandwich:
    print( "can't add 27 to the frozen set..." )
    print( "In Python's words: " , sandwich )
else:
    print( "no issue adding 27" )

print( len(a) )
print( not False in a )
print( False not in a )
print( not False not in a )
print( False or 6 in a )

try:
    a.remove(bool(-15))  # try to remove True, which exists in the frozen set
except Exception as E:
    print( "can't remove elements from a frozen set" )

print( len(a) )  # for a list or set S, len(S) is variable. For a tuple or frozen set T, len(T) is constant.

"""More operations with frozen sets. Is duplicated in the code for lesson 58 for further review"""

x = { 3 , 4 , 9 , 4 , 4 }
y = frozenset( { 1 , 7 , 6 , 7 , 7 , 4 } )

print( x.union(y) )  # union(x) returns a set when called ON a set
print( y.intersection(x) )  # intersection(x) returns a frozen set when called ON a frozen set
print( ( {4,3} ).issubset( x ) )  # issubset(x)
print( ( {7,6,4} ).issuperset( y ) )  # issuperset(x)
print( ( frozenset( {3} ) ).issubset(x) )  # Can see whether a frozen set OR regular set is a subset OR superset of a frozen set OR regular set

print( float(len(y) ) )  #4.0, constantly 4 unique elements in the immutable (frozen) set. float(len(y)) == 4.0 forever! (Unless you call del y)

