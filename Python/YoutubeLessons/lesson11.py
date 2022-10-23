pizza = [ 24 , 21 , 19 , 18 , 24 ]

for number in pizza:
    print( number % 4 )

for s in range(6):
    print(3*s + 2)  # [2,5,8,11,14,17]

nesters = [ [ 3 , "apple " , False ] , [ "dog" , "cat" , 8.2 ] , [7.5,7.1,10] ]

for sublist in nesters:
    for element in sublist:
        print( element )


for firstSublist in nesters:
    if nesters.index(firstSublist) == 0:
        for notFirstElement in firstSublist:
            if not ( firstSublist.index(notFirstElement) == 0 ):
                print( "In the first sublist, not the first element though" )
                print( notFirstElement )
