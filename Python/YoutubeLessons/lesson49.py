class Car:

    def __init__(u,volume):
        u.volume = volume

    def __gt__(a,b):
        return a.volume > b.volume

    def __lt__(pizza,pasta):
        return pasta > pizza

    def __str__(g):
        return "Volume for this car: {pencil}".format( pencil = g.volume )

    @classmethod
    def bubbleSort(cls,cars):
        for w in range(len(cars)-1, 0, -1):
            for x in range(w):
                if cars[x+1] < cars[x]:
                    cars[x], cars[x+1] = cars[x+1], cars[x]

        return cars


a = [ Car(42) , Car(36) , Car(39) , Car(44) , Car(45) , Car(32) , Car(20) ]

def yieldCars(myCars):
    """Accepts an iterable or generator and makes a generator out of its elements
    @param myCars, a list or tuple or set or dictionary or string or generator
    @yield the elements in myCars
    """
    for s in myCars:
        yield s


print( yieldCars( Car.bubbleSort( a ) ) )

for b in yieldCars( Car.bubbleSort(a) ):
    print( b )
