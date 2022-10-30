class Person:

    income = 0

    def __init__(s,n,a):
        s.__name = n
        s.__age = a

    def __getitem__(s,x):
        if x == "name" or x == "age":
            if x == "name":
                return s.__name
            else:
                return s.__age
        else:
            return None

    def __str__(p):
        return p.__name

    @staticmethod
    def calculateMonths( p ):
        """
        Static method which accepts a Person object P and returns the approximate number
        of months he or she has been alive
        @param p the Person object
        @return the months liave

        Observe the format of a static method

        class C:
            
            @staticmethod
            def function(x,y):
                # do Stuff

        C.function(a,b)
        """

        return p.__age * 12

    @classmethod
    def improveEconomyC(E):
        E.income += 10000

    @classmethod
    def calculateDays( cls , p ):
        """
        Class method which accepts a Person object P and returns the approximate number of days he or she has been alive
        @param p the Person object to determine the number of days alive
        @return the approximate number of days alive

        Observe the format of a class method

        class C:

            @classmethod
            def function(x,y):  # JUST ONE INPUT HERE. X IS A CLASS METHOD DESIGNATION
                #do stuff

        C.function(a)  # X IS NOT AN INPUT. ONLY Y IS
        """
        return p[ "age" ] * 365  # invokes the __getitem__ method on the Person input p

q = Person( "Cindy" , 15 )
print( Person.calculateMonths(q) )
print( Person.calculateDays(q) )
print( q.income )
Person.improveEconomyC( )
print( q.income )
