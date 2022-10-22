
/**
 * Write a description of class AnotherImplementer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnotherImplementer implements MyInterface
{
    public void doSomething( boolean cucumber )
    {
        if( cucumber )
        {
            System.out.println ("I love cucumbers" );
        }
        else
        {
            System.out.println( "I hate cucumbers" );
        }
    }
    
    public void doSomething( )
    {
        System.out.println( "pizza" );
    }
    
    public int getNumber( int u )
    {
        return u / 2;
    }
    
    public int getNumber( )
    {
        return -4;
    }
}
