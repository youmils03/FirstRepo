def insertionSort( myList ):

    for q in range( 1 , len(myList)):  # q=1, q=2, q=3, ..., q=len(myList)-1

            key = myList[q]
            r = q-1

            while r >= 0 and myList[r] > key:
                myList[r+1] = myList[r]
                r -= 1

            myList[1+r] = key


    return myList


sampleList = [ 4.42 , 4.16 , 3.41 , 3.39 , 3.90 , 5.02 , 2.79 , 4.80 , 3.86 , 3.09 ]
chosenSort = insertionSort  # function reference variable, remember?
mySort = ( lambda t : chosenSort(t) )  # lambda function, remember?
sortedList = mySort( sampleList )

k = 0

while True:
    if k == len(sampleList):
        break
    pass  # useless, usually if not being used as an actual placeholder
    print( sortedList[k] )  # iterate through the sorted array
    k = k + 1  # or k += 1
    continue  # useless continue since it is at the end of the loop



