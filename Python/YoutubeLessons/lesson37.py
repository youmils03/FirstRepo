pass  # does nothing. Proceed with the code

for s in range(10):
    if s % 2 == 0:
        print( s )  #print the even s
    else:
        pass  # just don't do anything for the odd s
    continue  #useless continue statement which skips a useless pass statement
    pass 

t = [ 4 , 2 , 4 ]
print(t)
del t  # garbage collection via the del keyword
# print(t)  # would create a runtime error since t does not refer to anything in memory anymore

"""
MORE MAGIC METHODS

View lesson36.py for add/sub/mul/truediv/floordiv/mod/pow/lt/gt/le/ge/eq
"""

class Burger:

    def __init__(self,myToppings, myPrice):
        self.toppings = myToppings
        self.price = myPrice

    def __len__(self):  # defines what len(x) means, where x is an instance of the Burger class
        return len(self.toppings)  # implies that self.toppings must be a string or iterable

    def __getitem__(self,u):
        print( "Our get item method just returns your input multipled by 2!" )
        print( "But first, here's the toppings you got going on right now..." )

        for q in tuple( self.toppings ):
            print(q)

        return u*2

    def __setitem__(self,u,v):
        if bool(u) == True:  # as long as u isn't 0, 0.0, "", or False
            self.toppings.add(v)  # implies that self.toppings must be a SET
            #  you can't add to tuples, and lists and dictionaries can add elements but not
            #  with the add(x) method.
        else:  # useless else statement if it just contains the pass keyword
            pass  # another example with the pass keyword. 

    def __str__(sunshine):
        k = ""
        for j in sunshine.toppings:
            k += j
        k += " yummy toppings, costs $" + str(sunshine.price)
        return k

myToppings = { "cheese" , "cheese" , "lettuce" , "bacon" , "fried egg" , "french fries" , "cheese" }
g = Burger( myToppings , 7.50 )

print( len(g) )  # invokes __len__
print( g[ 22 ] )  # invokes __getitem__
g["False"] = "tomato"  # invokes __setitem__
print( g )  # invokes __str__
