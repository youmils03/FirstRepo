class Vector:

    def __init__(v,x,y):
        v.x=x
        v.y=y


    def __add__(v,otherVector):  # defines P+Q for two instances P and Q of the Vector class
        return Vector(v.x+otherVector.x, v.y+otherVector.y)


    def __sub__(v,otherVector):  # defines P-Q
        return Vector( v.x - otherVector.x , v.y - otherVector.y )


    def __mul__(v,otherVector):  # defines P*Q
        return Vector( v.x * otherVector.x , v.y * otherVector.y )


    def __truediv__(v, otherVector):  # defines P/Q
        if otherVector.x == 0 or otherVector.y == 0:
            print( "Can't divide by zero, giving you a stupid point instead" )
            p = Vector(0,0)
            return p
        else:
            return Vector( v.x / otherVector.x , v.y / otherVector.y )


    def __floordiv__(v, otherVector):  # defines P//Q
        try:
            assert ( ( not otherVector.x == 0 ) and ( not otherVector.y == 0 ) )
            return Vector( v.x // otherVector.x , v.y // otherVector.y )
        except AssertionError as A:
            return Vector( 0 , 0 )

    def __mod__(v , otherVector ):  # defines P%Q
        return Vector( v.x % otherVector.x , v.y % otherVector.y )


    def __pow__(v , otherVector ):  # defines P**Q
        return Vector( v.x ** otherVector.x , v.y ** otherVector.y )


    def __lt__(v, otherVector):  # defines P<Q, a boolean
        if v.x < otherVector.x:
            return True
        elif v.x == otherVector.x:
            return v.y < otherVector.y
        else:
            return False

    def __gt__(v, otherVector):  # defines P>Q by Q<P, where Q<P is defined above
        return otherVector < v

    def __le__(v, otherVector):  # defines P<=Q
        if v.x < otherVector.x or ( (v.x==otherVector.x) and (v.y <= otherVector.y) ):
            return True
        else:
            return False

    def __ge__(v, otherVector):  # defines P>=Q by Q<=P, where Q<=P is defined above
        return otherVector <= v

    def __eq__(v, otherVector):  # defines P==Q as P<=Q but not P<Q
        return v <= otherVector and not v < otherVector


    def __str__(v):
        return "(x,y) = (" + str(v.x) + "," + str(v.y) + ")"

U = Vector(4,2)
V = Vector(3,5)

print( "U: " + str(U) )
print( "V: " + str(V) )
print( "Addition: " + str(U+V) )
print( "Subtraction: " + str(U-V) )
print( "Multiplication: " + str(U*V) )
print( "True Division: " + str(U/V) )
print( "Floor Division: " + str(U//V) )
print( "Modulus (Remainder): " + str(U%V) )
print( "Exponentiation, U^V: " + str(U**V) )
print( "U<V? " + str(U<V) )
print( "U>V? " + str(U>V) )
print( "U<=V? " + str(U<=V) )
print( "U>=V? " + str(U>=V) )
print( "U==V? " + str(U==V) )
print( "U==U? " + str(U==U) )
