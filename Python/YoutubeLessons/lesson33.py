q = 0

while q < 7:
    if q % 2 == 0:
        pass  # place-holder. Does nothing. Does NOT end the iteration
    else:
        print( q )
    q += 1


class Person:

    canSpeak = True  # class variables
    canFly = False
    income = 0
    
    def __init__(self,name,age):  # constructor. Generates an instance of a class
        self.name = name  # assigns an instance variable to the parameter
        self.age=age  # age is another instance variable

    def work(self):  # INSTANCE METHOD (has "self" as a parameter)
        print( "time to get things done" )  # print statement invoked by work( )
        self.income += 5000  # increment the income variable only for THIS instance

    def getBirthYear(p):  # INSTANCE METHOD (within a class)
        """
        Instance method which returns the year the current Person object
        was born

        Demonstrates that you don't HAVE to use "self" as the keyword, even
        though that is usually the norm

        @return the year that the current Person object was born
        """
        return 2022 - p.age

x = Person( "Abby" , 31 )
print( x.name )
print( x.age )
print( x.canSpeak )
print( x.canFly )
print( "Income: $" + str(x.income) )
print( x.getBirthYear( ) )
x.work( )
print( "New Income: $" + str(x.income) )
