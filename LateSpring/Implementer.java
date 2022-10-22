
/**
 * Write a description of class Implementer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Implementer implements MyInterface
{
    Implementer( )
    {
        System.out.println( "creating a new instance" );
    }
    
    public void doSomething( boolean banana )
    {
        if( banana )
        {
            System.out.println( "that variable was true" );
        }
        else
        {
            System.out.println( "that variable was false" );
        }
    }
    
    public void doSomething( )
    {
        try
        {
            System.out.println( 4/0 );
        }
        catch( ArithmeticException E )
        {
            System.out.println( "can't do that" );
        }
        finally
        {
            System.out.println( "runs" );
        }
    }
    
    public int getNumber( int s )
    {
        return s * 200;
    }
    
    public int getNumber( )
    {
        return 168;
    }
}
