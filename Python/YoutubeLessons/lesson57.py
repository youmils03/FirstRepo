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
