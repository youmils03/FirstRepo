a = [ 3 , True , "sneakers" , "f" , "cookies" , 9.2 , "peanuts" ]

u = iter  # function reference variable, discussed in lessons 15/16

print( u(a) )  # printing a sheer iterator object is usually not constructive

for b in u(a):  # iterating through the iterator object using a for loop. Iterators are an example of generators
  print( b )
  
# Remember: exec(s) accepts a string s, undoes the quotes on it, and executes that instruction as a Python command
exec( "print( list(u(a)) )" )  # could also just convert an iterator object to a data structure explicitly

print( min( "apple" ) )  # minimum lexicographically
print( max( ( 5,2,900,16) ) )  # extremum of a tuple

"""
New content:

A mathematical matrix can be implemented in Python as a mutable list of listS
Could also have tuples, but recall that they are immutable (cannot be changed)

Be comfortable with:
1. sum and difference of two matrices
2. minimum or maximum element within a matrix
3. in this code - I show how to compute the determinant of a numerical 2x2 matrix (all entries must be ints or floats)
"""

class Matrix:

  @classmethod
  def sumMatrix( notAnInput , matrix1 , matrix2 ):
    """Returns the sum of two matrices

    @param matrix1 the first matrix
    @param matrix2 the second matrix
    @return the sum of the matrices, element-wise

    Assume len(matrix1) == len(matrix2) and that each list within each matrix has the same length (e.g. both matrices have 8 rows and 5 columns)
    """

    result = [ ]

    for k in range(len(matrix1)):
      newRow = [ ]

      for w in range(len(matrix1[0])):
          newRow.append( matrix1[k][w] + matrix2[k][w] )

      result.append( newRow )

    return result

  @staticmethod
  def differenceMatrix( matrix1 , matrix2 ):
    """Returns the difference of two matrices

    @param matrix1 the first matrix
    @param matrix2 the second matrix
    @return the difference of the matrices, element-wise

    Assume len(matrix1) == len(matrix2) and that each list within each matrix has the same length (e.g. both matrices have 8 rows and 5 columns)
    """

    result = [ ]

    for k in range(len(matrix1)):
      newRow = [ ]

      for w in range(len(matrix1[0])):
          newRow.append( matrix1[k][w] - matrix2[k][w] )

      result.append( newRow )

    return result
      
  @classmethod
  def determinant2x2( C , matrix ):
      return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]

  @classmethod
  def minimumEntry( C , matrix ):
      """Returns the minimum entry in a matrix
      @param matrix the matrix to search
      @return the minimum element"""
      
      minValues = [ ]
      for k in matrix:
        minValues.append(min(k))
        
      return min(minValues)
      
      
A = [ [3,0,1,4] , [2,2,6,9] , [5,1,4,7] ]
B = [ [9,1,3,2] , [8,3,7,5] , [8,1,1,2] ]

for g in Matrix.sumMatrix(A,B):
    print( g )
    
print( "Difference: " )

for g in Matrix.differenceMatrix(A,B):
    print( g )
    
print( "Minimum element in A: " , Matrix.minimumEntry(A) )
print( "Minimum element in B: " , Matrix.minimumEntry(B) )
        
