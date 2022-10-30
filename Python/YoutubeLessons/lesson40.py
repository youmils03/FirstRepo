class Person:

    def __init__(s,n,a):
        s.__name = n
        s.__age = a

    
    @classmethod
    def calculateSum( C , x , y ):  # another example of a class method
        """Accepts two numbers and returns their sum
        @param x the first number (or string to concatenate)
        @param y the second number (or string to concatenate)
        @return x+y, the addition or concatenation of x and y depending on data type
        """
        return x + y

    @staticmethod
    def calculateProduct( x , y ):  # another example of a static method
        return x * y 

    @property  # property decorator, analogous to a getter method that de-privatizes a variable
    def name(t):
        return t.__name

    @property
    def age(x):
        return x.__age

    @name.setter  # v.setter decorator for a private instance variable v, allows you to change it
    def name(t,n):
        t.__name = n

    @age.setter
    def age(myPerson,a):
        myPerson.__age = a


A = 40
B = 10
print( Person.calculateSum(A,B) )
print( Person.calculateProduct(A,B) )

P = Person( "Pete" , 33 )
print( P.name )
print( P.age )
P.name = "William"
P.age = P.age + 1
print( P.name )
print( P.age )

