
/**
 * Write a description of class Threading2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Threading2 extends Thread
{
    public static void main( String args [] ){
        Thread t;
        t = new Threading2( );
        t.run( );
        
    }
    
    public void run( )
    {
        System.out.println( "skiing" );
    }
}
