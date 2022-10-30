class Person:

    income = 0

    def __init__(me,n,a):
        me.name = n
        me.age = a

    def work(me):
        me.income += 5000

    def getIncome(x):
        return "$" + str(x.income)

class Student(Person):  # subclass for Person

    def __init__(self,n,a,u):
        super( ).__init__(n,a)
        self.university = u

    def work(me):
        print( "My degree at " + me.university + " helps me earn 4 times as much!" )
        for u in range(4):
            super( ).work( )


    def study(g):  # instance method which does NOT have parameters...
        print( "time to study, since I'm an awesome student at " + g.university )


u = Student( "Sam" , 23 , "Cornell" )
print( u.getIncome() )
u.work( )
u.study( )
print( u.getIncome() )
