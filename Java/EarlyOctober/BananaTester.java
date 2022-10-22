
/**
 * Write a description of class BananaTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BananaTester
{
    public static void main( String args [ ] )
    {
        Banana B = new Banana( );
        Thread C = new Thread( B );
        C.start( );
    }
}
