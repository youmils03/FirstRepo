
/**
 * Write a description of class Lizard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lizard extends Entity
{
    Lizard( )
    {
        System.out.println( "creating a new lizard" );
    }
    
    public String getName( int u )
    {
        return "Johnny";
    }
    
    public String getName( )
    {
        return "Taylor";
        
    }
    
    public void doSomething( )
    {
        System.out.println( this.getName( ).length( ) );
    }
}
