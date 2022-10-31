g = list(range(3))
h = list(range(4))
print( g+h )

print( list(range(42,48) ) )

print( list(range(50,35,-3) ) )
print( list(range(50,34,-3) ) )

def f(x):
    return x+4

print( f(3) )

def g(h,j):
    print(h in j)

g( "e" , "eggplant" )  # True
g( [3,2] , [ [2,3] , [1,3] , [3,3] ] )  # False

def u(x,y,z):
    if x:
        return y + 2*z
    else:
        print( "pizza" )
        return 5

print( True , 10 , 4 )
print( [7] in [ 7 , 7 , 7 , [7] , [8] ] , "PE" , "UT" )
print( False , "ball" , True )
print( False , u(True,3,2) , u(False,5.2,"sssss") )

def noInput():
    print( "happy dog" )

noInput( )  # happy dog
