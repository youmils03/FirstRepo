
/**
 * Write a description of class Cat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cat implements Requirements
{
    private String name;
    
    Cat( String z )
    {
        this.name = z;
    }
    
    public void doSomething( )
    {
        System.out.println( "meow" );
    }
    
    public String getName( )
    {
        return this.name;//or, return name; <-- not what you will see in college
    }
    
    public int getFour( )
    {
        return 4;
    }
    
    public int getFive( )
    {
        return 5; //this is not mandated by the interface, but the class that implements the interface
        //is allowed to define its own methods that are not mandated by the interface
        
        //a little more advanced: return this.getFour( ) + 1; //or return getFour() + 1;
    }
}
