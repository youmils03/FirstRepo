def f(a,b,*c,**d):
    print( len(c) ** len(d) )
    return "cat" in c or "cat" in d

print( f("cat","cat","dog",pet="cat") )  #len(c) == 1 here, len(d) == 1 here, 1^1 == 1
# "cat" and "cat" are assigned to the required arguments a and b, respectively
# "dog" is the one argument that comes into the arbitrary tuple c
# "cat" not in { "pet" : "cat" } because E in D if and only if E in D.keys( ), not D.values( )

myTuple = (4,5) + ("apple","banana")
a,b,c,d = myTuple  # tuple-unpacking
print( b * b - a * a )
print( c.upper( ) )
print( d.count("n" ) )

a = 82 if True else 80  # ternary operator
print( a < 82 )  # False

f = (lambda x : x ** 2 ) if 5 in tuple(range(4,9,2)) else ( lambda x : x % 3 )
print( f(10) )  # 1, since 5 not in (4,6,8)

# Else block in exception-handling, seen in previous code but not in previous videos

myTuple = 9 , 2 , 0 , 3 

a , b = myTuple[0:4:2]  # a == 9 , b == 0

try:
    print( "gonna try something" )
    print( myTuple[ b ] ) 
    print( "no problem!" )
except IndexError:
    print( "oops, there's an issue" )
else:
    print( "no issue!" )
finally:
    print( "runs regardless" )


try:
    print( "gonna try something else" )
    print( myTuple[ a - b ] )
    print( "no problem!" )
except IndexError as I:
    print( "the issue is this... " , I )
    print( "nice try tho" )
else:
    print( "there were no issues in the try block" )
finally:
    print( "runs regardless" )

