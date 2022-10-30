class Person:

    def __init__(t,n,a):
        t.name = n
        t.age = a

    def __str__(t):  # define what it means to print an instance of a class
        return t.name + " is " + str(t.age) + " years old"


x = Person( "Tony" , 30 )
print( x )  # calls x.str() 
