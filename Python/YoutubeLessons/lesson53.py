def binarySearch( sortedTuple , target , left=0 , right="initial" ):
    """
    Iterative method using a while loop to search for the index position
    of a target element within a sorted list

    Binary search implementation REQUIRES that the list already be sorted

    Go view lessons 49-52 for discussions of sorting algorithms

    @param sortedTuple a sorted list or tuple to search
    @param target the element to search for
    @param the left endpoint of the subarray to search, initially 0
    @param the right endpoint

    @return the index position of the element within the sorted iterable
    """

    try:
        assert right == "initial"
    except AssertionError:  # runs if right is not "initial"...do nothing
        pass                # potentially wise use of pass keyword
    else:                   # runs if right is "initial"...reassign it
        right = len(sortedTuple) - 1

    result = -1

    while left <= right:
        mid = (left + right) // 2
        assert mid == int(mid), "something isn't getting computed correctly"

        if sortedTuple[mid] < target:
            left = mid + 1
    
        if sortedTuple[mid] > target:  # or elif, but mutually exclusive with above
            right = mid - 1

        if sortedTuple[mid] == target:  # or else/elif combining with above
            result = mid
            break

    return result


myList = [ 8 , 10 , 14 , 15 , 19 , 22 , 24 , 26 , 28 , 29 , 32 , 35 , 37 ]
print( binarySearch(myList,35) )

#  Challenge: On your own, adjust the code in lessons 52 and 53 to count
#  the steps taken by the linear and binary search algorithms
#  Compare and contrast for a relatively large (40-80 element) sorted
#  list or tuple. You should expect binary search to be quicker in general.
