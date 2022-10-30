class Person:

    def __init__(s,n,a):
        s._n = n  # weakly private instance variable, bad etiquette to call it directly
        s.__age = a  # strongly private instance variable, impossible to call it directly

    def __getitem__(s,x):
        if x=="name":
            return s._n
        elif x=="age":
            return s.__age
        else:
            return None

v = Person( "Scott" , 66 )
print( v.n )  # Scott
# print( v.age )  # will not run
print( v["name"] )  # Scott
print( v["age"] )  # 66, allows you to access a private instance variable using __getitem__
