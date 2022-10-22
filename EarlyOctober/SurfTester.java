
/**
 * Write a description of class SurfTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SurfTester
{
    public static void main( String args [ ] )
    {
        Surf S;
        S = new Surf( "pasta" );
        int [ ] myList = {4,3,2,1,0};
        Surf T = new Surf( myList );
        S.start( );
        T.start( );
    }
}
