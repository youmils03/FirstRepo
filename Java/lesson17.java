public class Lesson17
{
    public static void main( String args [] )
    {
        
        System.out.println( 'F' + 4 );
      
        int u = 'u';
        System.out.println(u);
      
        System.out.println( (char)(104) );
      
        System.out.println( (char)(105) );
      
        System.out.println( "these" + "\n" + "words" + "\n" + "are" + "\n".concat("separated".concat("\n")) + "by\nnew\nlines" );
      
        for(int e=0;e<6;e++)
        {
            System.out.print( "TAB" );
            System.out.print( "\t" );
        }
      
        System.out.println( );
      
        int [ ] array1 = { 3 , 0 , 4 };
        int [ ] array2 = { 9 , 1 , -1 };
        int [ ] array3 = { 5 , 2 , 0 };
        int [ ] array4 = { 8 , 3 , -2 };
        int [][] matrix = { array1 , array2 , array3 , array4 };
      
        int counter;
        for( int s = 0 ; s < matrix.length ; s+=1 )
        {
            counter = 0;
            while( counter < matrix[s].length )
            {
                System.out.println( "Value: " + matrix[s][counter] );
                counter = counter + 1;
            }
            System.out.println( "reached the end of this array." );
        }
        System.out.println( "reached the end of this matrix" );
    }
}
