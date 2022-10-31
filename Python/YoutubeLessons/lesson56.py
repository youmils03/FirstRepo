"""
Any data structure:
1. can have mixed data types
2. has a length represented by an integer >= 0
3. can be checked for an element, use keyword: in
"""

myList = [ 3 , 2 , 2 , True , "watermelon" , 1.111 ]
print( myList[0] )
print( myList + [4,4,4] )
myList[1] = myList[0]
print( myList[1] )
print( myList.count(64) )
print( myList.index(not False) )
print( tuple( myList ) )
print( set( myList ) )
myList.pop(3)
print( myList )

#  Recall that sets are characteristically unordered
print( set( enumerate( myList ) ) ) # recall enumerate(x) from lesson 24, which returns tuples (I,E) for each index position I and element E

"""
Lists: elements accessed by index position, mutable
Tuples: elements accessed by index position, immutable
Sets: unordered collection of unique elements, mutable
Dictionaries: unordered collection of unique key-value pairs, mutable
Strings: a collection of characters, can be accessed by index position
Frozen Sets: unordered collection of unique elements, immutable (discussed in the next lesson) 
Frozen Dictionaries: unordered collection of unique key-value pairs, immutable (discussed in a future lesson)
Generators: memory-conscious mechanism for yielding a sequence of elements, is not itself a collection

SETS AND LISTS CANNOT BE ELEMENTS IN SETS OR KEYS IN DICTIONARIES (explored in lessons 71 and 72)
"""

myDictionary = { "Monday" : 92 , "Tuesday" : 91 , "Wednesday" : 91 , "Thursday" : 89.53 , "Friday" : 94 }
myDictionary[ "Saturday" ] = 97
myDictionary.update( { "Sunday" : myDictionary["Monday"] } )

print( myDictionary.get( "Saturday" ) - myDictionary.get( "Tuesday" ) )
print( 91 in myDictionary )
print( "Fri" + "day" in myDictionary )
print( myDictionary[ "Sunday" ] * 10 )

w = "some string"
print( w[2] )
print( w[0:4] )

for s in range(5,len(w)):
    print( w[s] )
    
print( w := w.upper( ) )
print( w.index( "S" ) )  # first occurrence occurs at index position 0

print( tuple(w) )
print( set(w) )
