def f(x,y):
    # observe how x must be a string or a list
    # observe how y must be an int or float
    # observe how this function prints a number when it is called
    # observe how this function RETURNS a different number
    print( len(x) + y )
    return 2*y

s = f( "cat" , 5 )  # 8
t = f( [8,2,3,8] , 1.5 )  # 5.5
print( s )  # 10
print( t )  # 3.0

def addThree(x): # this function will be an input to another function
    return x+3  # addThree(x) is the output and x is the input

def addTwo(g,x):
    return g(x+2)

def u(x,y):
    return x + addTwo( addThree , y )  #addThree(x) is an input, not an output


print( u(10,2) )  # 17
