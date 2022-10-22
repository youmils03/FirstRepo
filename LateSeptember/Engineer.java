
/**
 * Write a description of class Engineer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 * Every class gets a blank default constructor by default.
 */
public class Engineer extends Occupation
{
    public int getNumber( )
    {
        System.out.println( 100 );
        return super.getNumber( ) % 3;
    }
    
    public void buildSomething( String s )
    {
        System.out.println( "building " + s );
    }
}
