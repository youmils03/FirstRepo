
/**
 * Write a description of class Perseon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person extends Thread
{
    private String name;
    
    Person( String s )
    {
        this.name = s;   
    }
    
    Person( )
    {
        this( "Jake" ); //uses the constructor with one parameter, default value "Jake"
    }
    
    public void run( ) // instance method which does not accept any inputs
    {
        System.out.println( name.toUpperCase( ) ); //equivalent Python method is called upper( )
    }
}
