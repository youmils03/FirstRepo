
/**
 * Concrete classes: can have concrete methods but not abstract methods, can be instantiated
 * Abstract classes: can have concrete methods and abstract methods, cannot be instantiated
 * Interface: can have abstract methods but not concrete methods, cannot be instantiated
 */
public abstract class Entity
{
    public abstract String getName( );
    //this line mandates that any class that extends this abstract class Entity MUST
    //provide a definition/signature for getName( ), which will not accept any inputs
    //and which must return a String
    
    public abstract String getName( int t );
    //this mandates that any clas that extends Entity must provide a method called getName
    //that accepts an integer and returns a String
    
    public static int getNumber( )
    {
        return 8;
    }
    
    public static int getAnotherNumber( )
    {
        return 12;
    }
}
