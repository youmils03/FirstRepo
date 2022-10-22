
/**
 * Write a description of class Lawyer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lawyer extends Occupation
{
    Lawyer( )
    {
        System.out.println( "generating a lawyer" );
    }
    
    public String getOccupation( )
    {
        String oldOccupation = super.getOccupation( );
        System.out.println( oldOccupation.length( ) );
        return "lawyer";
    }
}
