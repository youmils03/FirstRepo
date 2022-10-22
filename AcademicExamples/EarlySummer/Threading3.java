
/**
 * Write a description of class Threading3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Threading3 implements Runnable
{
    public void run( )
    {
        System.out.println( "sup" );
    }
    
    public static void main( String args [ ] )
    {
        Object s = new Threading3( );
        Runnable w = (Threading3)(s);
        w.run( );
    }
}
