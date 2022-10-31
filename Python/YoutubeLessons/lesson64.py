# Return to the code for lesson 63 for adding and subtracting matrices and determining an extremum (minimum or maximum)
# This code will explore corner elements, number of elements, and transpose of a matrix
# We will also study eval(x) in this code

class Matrix:

    @staticmethod
    def topLeft(matrix):
        return matrix[0][0]  # at the beginning of the first list within the matrix
        
    @staticmethod
    def topRight(matrix):
        return matrix[0][len(matrix[0])-1]  # still in the first list, but at the end of it
        
    @classmethod
    def bottomLeft( C , matrix):
        return matrix[len(matrix)-1][0]  # last list, but at the beginning of it
        
    
    @classmethod
    def bottomRight( C , matrix ):
        return matrix[len(matrix)-1][len(matrix[0])-1]
        
    @staticmethod
    def numberOfEntries( matrix ):
        return len(matrix) * len(matrix[0])  # just multiply the number of rows by the number of columns
        
    @classmethod
    def transpose( C , matrix ):
        """Accepts a matrix and returns its transpose (i.e. the rows and columns are flipped)
        
        @param matrix the matrix to transpose
        @return the transpose of the matrix"""
        
        result = [ ]
        
        a = 0
        
        while a < len(matrix[0]):
            newRow = []
            b = 0
            while b < len(matrix):
                newRow.append( matrix[b][a] )
                b += 1
            result.append( newRow )
            a += 1
        
        return result
        
    @classmethod
    def evalExamples( e ):  # e is a class method designator, NOT an input
        u = eval("64")
        print( u + 6 )  # 70
        exec( "v = eval(\"92\")" )
        exec( "pr" + "int( v-u )" )  # 92 - 64
        
 
if __name__ == "__main__":  #  running a module as a script, review lesson 61
    k = [ [ 3,0 ] , [1,1] , [9,1] ]
    print( "Top Left: " , Matrix.topLeft(k) )
    print( "Top right: " , Matrix.topRight(k) )
    print( "Bottom left: " , Matrix.bottomLeft(k) )
    print( "Bottom right: " , Matrix.bottomRight(k) )
    print( "Number of entries: " , Matrix.numberOfEntries(k) )
    print( "Transpose: " , Matrix.transpose(k) )
    Matrix.evalExamples( )
        
        
