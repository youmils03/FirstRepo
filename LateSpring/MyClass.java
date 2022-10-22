
/**
 * 3 types of vareiables in 2 different sensees:
 * 1. method variable --> declared and initialized within a function
 * 2. class/static variable --> declared at the top of the class, and any
 * methods in the class can use that variable
 * 3. instance variable --> kind of like a class variable, but this would 
 * be SPECIFIC to an INSTANCE of a class
 * one Person's name and age values might be different from another
 * Person's name and age values, but these are instance variables
 * 
 * constructor: the method that creates an instance of a class
 * usually, it does this by assigning instance variables
 * you could also print something in a constructor
 */
public class MyClass
{
    MyClass( )
    {
        //every class gets a blank default constructor by default
        System.out.println( "creating a new object" );
    }
    
    public String toString( )
    {
        return Integer.toString( 22 + 10 );
    }
    
    private static boolean r = (30 < 62);
    protected static final double u = 3.5;
    protected static int [ ] s = { 8 , 2 , 4 , 1 };
    
    /*
     * r is an example of a static/class variable
     * this variable can be used by ANY methods in the class, not just one method
    */
    
    public static void main( String args [ ] )
    {
        MyClass a;
        a = new MyClass( );
        System.out.println( a );
        
        //u += 1.1; --> compile-time error
        
        System.out.println( r == (80 == 70+10) );
        
        if( MyClass.testR( ) ) 
        {
            System.out.println( 10 );
        }
        else
        {
            System.out.println( 20 );
        }
        
        
    }
    
    public static boolean testR( )
    {
        return MyClass.r; //true
    }
    
    public int getNumber( )
    {
        return 10;
    }
}
