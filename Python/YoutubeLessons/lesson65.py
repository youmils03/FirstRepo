import json as J

"""
frozen sets are immutable sets. Like sets, no duplicates allowed. Unlike sets, no adding or removing elements.
(Think of it as the offspring produced if a tuple mated with a set. Unique elements from the set, immutability from the tuple)

Call magic method allows you to define x(*args), where x is an instance of a class

Contains magic method allows you to define y in x, where y is some element/value and x is an instance of a class

Writing if __name__ == "__main__": allows you to run your module as a script

y=iter(x) creates an iterable which is a type of generator on the data structure x
use a for loop on iter(x), use the next(iter(x)) function, or simply convert iter(x) to an iterable like a list or tuple

exec(x) executes string x, which is a string containing executable Python code
eval(x) returns the literal value of the experssion or variable within the string x

The sum or difference of two matrices is given by finding the sum or difference of each element in the corresponding positions
The two matrices must have the same number of rows and the same number of columns
We also show how to determine minimum/maximum element, determinant of a 2x2 matrix, corner elements, number of elements, and transpose
Transpose simply flips the rows and columns

NEW CONTENT:

JSON is a dictionary wrapped inside of a string
Blackle: Json python. Two important functions: 1. json.loads(x), 2. json.dumps(x)

4 ways to import these two necessary functions:
1. import json --> use json.loads(x) and json.dumps(x) in your code
2. from json import loads, dumps --> use loads(x) and dumps(x) in your code
3. from json import loads as L, dumps as D --> use L(x) and D(x) in your code
4. import json as J --> use J.loads(x) and J.dumps(x)
"""

myDictionary = " {\"summer\" : 92 , \"fall\": 66 , \"winter\": 40 , \"spring\": 66} "
print( len( myDictionary ) )
print( len( myDictionary := J.loads(myDictionary) ) )
print( 66 in myDictionary )
print( "summer" in myDictionary )
print( "summer" in myDictionary.values( ) )
print( tuple( myDictionary.items( ) )
myDictionary["fall"] -= 2
print( myDictionary.get( "fa" + "ll" ) )
