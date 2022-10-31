class Person:

    def __init__(s,n,a):
        s.__name , s.__age = n , a  # tuple unpacking
        
    def __contains__(k,v):  # k is an instance method designator, v is the element to check for within the instance
        return v in range(k.__age)  # 32-year-old Abby "contains" 27, but 32-year-old Abby does not "contain" 35
        #  just as __len__ must return an int, __contains__ must return a boolean
        

v = Person( "Victor" , 64 )
print( 52 in v )
print( 68 in v )
print( -3 in v )
