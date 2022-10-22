
/**
 * Write a description of class SwimTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SwimTester
{
    public static void main( String args [ ] )
    {
        Swim S;
        S = new Swim( );
        Thread T;
        T = new Thread( S );
        T.start( );
    }
}
