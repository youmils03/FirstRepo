
/**
 * Every class gets a blank default constructor by default
 * You can always instantiate a class even if it doesn't formally have a constructor
 * 
 * This is usually not practical, since we use constructors to assign values to 
 * instance variables for objects that are being created for the first time
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Body implements Entity
{
    private int value;
    
    Body( int x )
    {
        value = x/2;
    }
    
    public int getValue( )
    {
        return this.value; //return value;
    }
    
    Body( )
    {
        this(40); //calls the constructor with parameter 40, assigns value to 20
        System.out.println( "you called the default constructor!" );
    }
    
    Body( String e )
    {
        this(6);
        System.out.println( e.lastIndexOf("e") );
    }
    
    /**
     * This method is optional. You are allowed to have it, but it does not satisfy
     * the requirements of any of the abstract methods in the interface
     * 
     * @return false
     */
    public boolean logic( )
    {
        return this.value<0;
    }
    
    /**
     * This is one of three methods that would be required due to implementing
     * the interface
     * This instance method accepts a String and returns true if the length is even
     * 
     * @param y the String whose length to check
     * @return true if the length is even, false otherwise
     */
    public boolean logic( String y )
    {
        if( y.length() % 2 == 0 )
        {
            return this.value % 2 == 0;
        }
        else
        {
            return this.value % 3 == 0;
        }
    }
    
    public double logic( int watermelon )
    {
        return this.value + (double)(watermelon);
    }
    
    public String toString( )
    {
        return Integer.toString(this.value);
        //return this.value + "";
    }
    
    public static void printBody( Body a , Body b )
    {
        System.out.println(b);
    }
}
