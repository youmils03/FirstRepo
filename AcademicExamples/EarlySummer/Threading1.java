
/**
 * Write a description of class Threading here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Threading1 extends Thread implements Runnable
{
    public void run( )
    {
        System.out.println( "skateboard" );
    }
    
    public static void main( String args [ ] )
    {
        Thread c = new Threading1( );
        Thread d = new Threading2( );
        c.run( );
        d.run( );
    }
}
