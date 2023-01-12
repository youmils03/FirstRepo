import java.util.Scanner;
import java.util.Arrays;
/**
 * Write a description of class Matrix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Matrix
{
    private int rows;
    private int columns;
    private int [ ] [ ] matrix;
    
    public static int f()
    {
        Scanner u = new Scanner(System.in);
        
        System.out.print( "One integer please: " );
        return u.nextInt( ) + u.nextInt( );
    }
    
    Matrix( int r , int c )
    {
        this.rows = r;
        this.columns = c;
    }
    
    Matrix( )
    {
        Scanner s = new Scanner( System.in );
        
        System.out.print( "Welcome! How many rows will your matrix have? " );
        rows = s.nextInt();
        System.out.print( "\n".concat( "How many columns? " ) );
        columns = s.nextInt( );
        
        matrix = new int[ rows ][ columns ];
        
        for( int k = 0 ; k < rows ; k += 1 )
        {
            for( int w = 0 ; w < columns ; w += 1 )
            {
                matrix[k][w] = (int)( 10 * Math.random() );
            }
        }
    }
    
    public String toString( )
    {
        String result = "";
        for( int [ ] g : this.matrix )
        {
            result += Arrays.toString(g) + "\n";
        }
        return result;
    }
    
    /**
     * This function accepts a matrix and returns its transpose
     * 
     * @param A, the matrix
     * @return the transpose of A
     */
    public static int [ ] [ ] transpose( int [ ] [ ] A )
    {
        int[][] result = new int[ A[0].length ][ A.length ];
        
        int row, column;
        row = 0;
        
        while( row < result.length )
        {
            column = 0;
            
            while( column < result[0].length )
            {
                result[row][column] = A[column][row];
                column += 1;
            }
            
            row += 1;
        }
        
        return result;
    }
    
    public static int [ ] [ ] difference( int [ ] [ ] A , int [ ] [ ] B )
    {
        return null; //use the Matrix.sum(A,B) and switch the + to a -
    }
    
    /**
     * This static method accepts two matrixes and returns the sum
     * 
     * @param A the first matrix
     * @param B the second matrix
     * @return the sum
     */
    public static int [ ] [ ] sum( int [ ] [ ] A , int [ ] [ ] B )
    { //square matrix if A.length == A[0].length
        try
        {
            int[][] result = new int[A.length][A[0].length];
            
            for( int row = 0 ; row < A.length ; row += 1 )
            {
                for( int column = 0 ; column < A[0].length ; column++ )
                {
                    result[row][column] = A[row][column] + B[row][column];
                }
            }
            
            return result;
        }
        catch( ArrayIndexOutOfBoundsException X )
        {
            System.out.println( "Sorry, your matrixes need to be the same size" );
            return null;
        }
    }
}
