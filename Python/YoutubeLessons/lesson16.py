"""
Now we consider importing a module

Go ahead and google "math python" to learn about what helpful constants and
functions this module provides. All you need to do is import it at the top
of your Python program

4 ways to use the sqrt function from the math class, 1 of which is not
described until a much later Youtube video (like 65 or 66):

1. import math --> math.sqrt(64)
2. from math import sqrt --> sqrt(64)
3. from math import sqrt as s --> s(64)
4. import math as M --> M.sqrt(64)  # NOT EXPLAINED IN THIS VIDEO BUT WORKS!

"""

import math as M  


print( M.sqrt(64) )  # math.sqrt(64), math.sqrt(x) always returns a float

print( M.exp(3) )  # e^3

print( M.ceil(2.27) )  # smallest integer not less than 2.27 is 3

print( M.ceil(-3) )  # smallest integer greater than or equal to -3 is -3

print( M.comb(8,4) )  # ways to select 4 items from a collection of 8

print( M.factorial(5) )  # 120

print( M.log10( 10.0 ) )

print( M.log10( 10.0 * 10.0 * 10.0 * 10.0 * 10.0 * 10.0 ) )

print( M.log( M.exp(5.11) ) )

print( M.cos(0) )

print( M.cos( M.pi ) )

print( M.tau / M.pi )

print( M.cosh(1.3) )

print( M.sinh(5.5) )
