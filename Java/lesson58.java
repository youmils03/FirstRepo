import java.util.*;

public class Lesson58
{
    public static void main( String args [ ] )
    {
        int [ ] [ ] M1 = { {3,0,4,2} , {9,1,6,3}, {8,4,7,7} }; //2D array with 3 elements (4-element 1D arrays)
        int [ ] [ ] M2 = { {5,1,6,1} , {6,2,0,8}, {4,9,7,5} };
      
        System.out.println( "Printing the sum: " );
        Lesson58.printSum( M1 , M2 );
        System.out.println( "Printing the difference: " );
        Lesson58.printDifference( M1 , M2 );
      
        int [ ] [ ] toTranspose = { {4,9} , {2,6} };
        
        for( int [ ] s : Lesson58.transpose(toTranspose) )
        {
            System.out.println( Arrays.toString(s) );
        }
    }
  
    public static void printSum( int [ ] [ ] x , int [ ] [ ] y )
    {
          int [] [] sumMatrix = new int[ x.length ][ x[0].length ];
      
          try
          {
                for( int w = 0 ; w < x.length ; w += 1 )
                {
                      for( int k = 0 ; k < x[0].length ; k = k+1 )
                      {
                            sumMatrix[w][k] = x[w][k] + y[w][k];
                      }
                      System.out.println( Arrays.toString( sumMatrix[w] ) );
                }
          }
          catch( ArrayIndexOutOfBoundsException Quentin )
          {
                System.out.println( Quentin.getMessage() );
          }
          finally
          {
                System.out.println( "Second matrix has " + Integer.toString(y.length*y[0].length) + " elements" );
          }
    }
    
    public static void printDifference( int [ ] [ ] x , int [ ] [ ] y )
    {
          int [] [] differenceMatrix = new int[ x.length ][ x[0].length ];
      
          try
          {
                for( int w = 0 ; w < x.length ; w += 1 )
                {
                      for( int k = 0 ; k < x[0].length ; k = k+1 )
                      {
                            differenceMatrix[w][k] = x[w][k] - y[w][k];
                      }
                      System.out.println( Arrays.toString( differenceMatrix[w] ) );
                }
          }
          catch( ArrayIndexOutOfBoundsException Quentin )
          {
                System.out.println( Quentin.getMessage() );
          }
          finally
          {
                System.out.println( "Second matrix has " + Integer.toString(y.length*y[0].length) + " elements" );
          }
    }
  
    public static int [ ] [ ] transpose( int [ ] [ ] matrix )
    {
          int [ ] [ ] result = new int[ matrix[0].length ][ matrix.length ]; //flip the # of rows and columns
      
          int b;
      
          for( int a = 0 ; a < result.length ; a += 1 )
          {
              b = 0;
              while( b < result[0].length )
              {
                    result[a][b] = matrix[b][a]
              }
          }
      
          return result;
    }
}
