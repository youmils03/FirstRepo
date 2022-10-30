def f(x,y,z):
    print(x+z)
    print(z-y)
    return y*z

a = f(3,2,0)  #this line prints 3, then -2 on the next line
a += f(1,3,2)  #this line prints 3, then -1 on the next line
print( f(5,5,5) )  # this line prints 10, then 0, then 25
print( a )  # this line prints 6

"""
3
-2
3
-1
10
0
25
6
"""

def g(t):
    print(t+4)

h = g  # h(t) becomes a function reference variable for g(t)

h(5)  # prints 9 on the console


def h(x,y):
    print( len(x) + len(y) )
    return len(x) + 2 * len(y)


u = h

print( u( [2,3,[2,3]] , "no" ) )  # prints 5, then 7 on the next line



def sumTheirLengths( a , b , c , d ):
    """
    This function accepts four iterables (each of them can be a string
    or a list) and returns the sum of the lengths of them. While running,
    it also prints a few random food items

    @param a the first iterable
    @param b the second iterable
    @param c the third iterable
    @param d the fourth iterable

    @return the sum of the four iterables
    """

    myFoods = [ "pizza" , "pasta" , "cookies" , "sauce" , "lettuce" ]

    k = 0

    while True:
        if k >= len(myFoods):
            break
        print( myFoods[k] )
        k = k+1

    return len(a) + len(b) + len(c) + len(d)


N = sumTheirLengths( "no" , "yes" , "maybe" , [ 3 ] + [ 5 ] )  #prints foods
print( N )  #prints 12
