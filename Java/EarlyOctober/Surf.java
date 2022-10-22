import java.util.Arrays;
/**
 * Write a description of class Surf here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Surf extends Thread
{
    private String message;
    
    Surf( String s )
    {
        message = s;
    }
    
    Surf( int [ ] x )
    {
        System.out.println( Arrays.toString(x) );
        Arrays.sort(x);
        System.out.println( Arrays.toString(x) );
    }
    
    public void run( )
    {
        for( int k = 0 ; k < 100000 ; k += 1 )
        {
            System.out.println( this.message );
        }
    }
}
