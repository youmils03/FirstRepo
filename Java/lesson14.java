public class Lesson14
{
    public static void main( String args [ ] )
    {
        for( double countdown = 7 ; true ; countdown -= 1.0 )
        {
            if( countdown < -0.28 )
            {
                break;
            }
            System.out.println( "Countdown: " + countdown );
            System.out.println( "As an integer: " + (int)(countdown) );
        }
     
        int s = 10;
      
        while( true )
        {
            if( s > 100 )
            {
                break;
            }
            else
            {
                print(s);
            }
            s = 10 + s;
        }
      
        for( int k = 0 ; k < 40 ; k += 2 )
        {
            if( !( k % 4 == 0) ) //checks all even k
            {
                continue; //skips the rest of the loop for k that are even but not divisible by 4
            }
            System.out.println( "Multiple of 4: " + k ); //only runs for k % 4 == 0
        }
    }
}
