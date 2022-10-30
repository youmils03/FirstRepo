"""
What is the output of the code below?
f1(100) --> you deal with the function call BEFORE the print statement
f1 starts by defining f2. You haven't called f2 yet so don't look at it yet
s = f2(10) --> you INVOKE f2 before assigning s. Now read f2
for f2(10), FIRST print 100 + 2 * 10 = 120. 120 is the first thing printed
Then, s is assigned to 100 + 3 * 10 = 130
So printing s is the next thing which f1 does, so print 130 after 120
Then, print 42 as you needed to print the result/output of f1, which is 42.
"""


def f1( x ):

    def f2( y ):  # inner function for f1(x)

        print( x + 2 * y )  # what f2(y) prints simply by calling it
        return x + 3 * y  # what the output of f2(y) is technically assigned to


    s = f2(10)  # call f2(y) first before worrying about the value of s
    print( s )  # the value of s was assigned to x + 3*10 in f2(10)
    return 42   # the value that f1(x) returns, if it is requested. A constant.


print( f1(100) )
