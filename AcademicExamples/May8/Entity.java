
/**
 * Abstraction:
 * 1. abstract classes
 * 2. interface
 * 
 * concrete class: can have concrete methods but not abstract methods, can be instantiated
 * abstract class: can have concrete methods and abstract methods, cannot be instantiated
 * interface: can have abstract methods but not concrete methods, cannot be instantiated
 * 
 * abstract method: a method with only a signature. It doesn't have a DEFINITION. It just has:
 * 1. public/private/protected determination
 * 2. return type (int/double/String/boolean/Person/etc.)
 * 3. name (getName(), setAge(int x))
 * 4. parameters ---> specify what kinds of arguments the function is expected to accept
 * That's it. Abstract methods have no body
 * 
 * Abstract methods: less about information, more about REQUIREMENTS that the class that extends
 * an abstract class or implements an interface needs to specify some level of functionality in that
 * class
 * 
 */
public abstract class Entity
{
    public int getSeven( )
    {
        return 7;
    }
    
    public abstract int getEight( ); //semicolon on the method header, because it's abstract, no body
    
    public abstract String getName( );
    
    public abstract void setName( String w );
}
