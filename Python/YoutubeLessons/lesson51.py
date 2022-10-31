class Person:

    def __init__(t,n,a):
        t.__name , t.__age = n , a  # tuple unpacking

    def __str__(t):
        return f"{t.__name} is {t.__age} years old"  # concise formatted string
    
    def __lt__(u,v):
        return len(u.__name) < len(v.__name)

    def __gt__(u,v):
        return v<u and True

    @staticmethod
    def selectionSort(myList):
        """Accepts a list and sorts it according to the selection sort algorithm
        @param myList the list to sort
        @return the sorted version of the list"""

        for a in range( len( myList ) ):
            index = a

            for b in range( a+1 , len(myList) ):
                if myList[b] < myList[index]:
                    index = b

            myList[a], myList[index] = myList[index] , myList[a]  # swaps the values

        return myList


a,b,c = Person( "Tony" , 80 ) , Person( "Kimberly" , 35 ) , Person( "John Peterson" , 52 )
d,e,f = Person( "Bo" , 64 ) , Person( "Billy" , 77 ) , Person( "Henry Jacobs" , 61 )
g = [a,b,c,d,e,f]

for k in Person.selectionSort(g):  # invoke the static method in Person
    print(k)  # invokes the __str__ magic method in Person
