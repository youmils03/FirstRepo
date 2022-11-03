public class Lesson15
{
    public static void main( String args [ ] )
    {
        int [ ] values = new int[4];
        System.out.println( values.length );
        System.out.println( values[2] );
        
        double x [];
        x = new double[9];
        System.out.println( x[4] + x[2] + x[1] );
        
        boolean [ ] logic = new boolean[5];
        
        if( logic[2] )
        {
            System.out.println( "yes" );
        }
        else
        {
            System.out.println( "no" );
        }
        
        String [ ] words = { "happy" , "sad" , "frustrated" , "scared" , "excited" , "hungry" };
        System.out.println( words[0] + " and " + words[1] );
        
        int sum;
        sum = 0;
        int data [ ] = { 5 , 1 , 9 , 3 , 3 , 4 , 7 };
        
        int index = 0;
        
        while( !false )
        {
            if( index == data.length )
            {
                break;
            }
            sum += data[index];
            index += 1;
        }
        
        System.out.println( "Sum of values: " + sum );
    }
}
