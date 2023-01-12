import java.util.*;
/**
 * Write a description of class MatrixTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MatrixTester
{
    public static void main( String args [ ] )
    {
        int [ ] [ ] matrix1 = { {3,0,4} , {1,1,2} };
        int [ ] [ ] matrix2 = { {5,2,2} , {9,3,7} };
        
        int [ ] [ ] mySum = Matrix.sum(matrix1,matrix2);
        
        for( int y [ ] : mySum )
        {
            System.out.println( Arrays.toString(y) );
        }
        
        int [ ] [ ] matrix3 = { { 4 , 0 , 2 , 3 } , { 1 , 9 , 4 , 1 } };
        
        for( int z [ ] : Matrix.transpose( matrix3 ) )
        {
            System.out.println( Arrays.toString(z) );
        }
        
        Matrix f = new Matrix( ); //uses Scanner input and random numbers to create matrix
        System.out.println(f); //invokes toString()
    }
}
