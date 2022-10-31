class Person:

    def __init__(s,n,a):
        s.__name , s.__age = n , a  # tuple unpacking, see lessons 44-46
        
    def __call__(s):
        return ( s.__name ).upper( )  # simply return the uppercase version of the current instance's name
        
    def __len__(s):  # __len__ MUST return an int.
        return s.__age # the "length" of a Person is simply their age, according to this method.
        
    def __str__(u):
        return u.__name  # string representation of a Person instance is simply their name
        
        
class Student(Person):

    def __init__(s,n,a,u):
        super( ).__init__(n,a)
        s.__university = u
        
    def __call__(s):
        return super( ).__call__() + " goes to " + s.__university
 
a = Person( "Chester" , 49 )       
b = Student( "Spencer" , 20 , "UT Austin" )

print( a )  # use __str__ in Person
print( b )  # inherit __str__ from Person

print( len(a) )  # magic method, defined
print( len(b) )  # Student inherits __len__ from Person

print( a( ) )  # __call__ magic method in Person takes no arguments
print( b( ) )  # __call__ magic method in Student takes no arguments
