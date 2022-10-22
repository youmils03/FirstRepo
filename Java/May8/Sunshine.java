
/**
 * 3 types of variables:
 * 1. method variables, just defined within the context of a function (yellow)
 * 2. instance variables, which are object attributes that are not static
 * --> every instance of a class has its own VALUES for its instance variables
 * --> one Person object has a name of Tony and an age of 15
 * --> another Person object has a name of Alex and an age of 26
 * --> name and age are considered INSTANCE variables
 * --> initialized in the constructor. The values that these variables take depend
 * --> on which object you're referring to
 * 3. static/class variables 
 * If you create a static variable outside of any methods but inside of a class,
 * any methods in the class can use that variable
 * If you're in that class C with a variable x, either write x or C.x
 * --> these don't really change with the object that you're referring to
 * 
 * 3 types of variables X:
 * 1. public: can be accessed by ANY class within your project
 * --> if you're outside of the class C that it's created in, you must write C.X
 * 2. private: can only be accessed in the class in which it is defined
 * 3. protected: can be accessed only in the class in which it is defined or any classes
 * that are subclasses (direct subclasses, OR subclasses of subclasses, etc.)
 * 
 * final: can only be initialized, can only take one permanent value
 * 
 */
public class Sunshine
{
    protected static int r = 5; //class variable, static class variable
    
    /*
     * 
     */
    
    public static void main( String args [ ] )
    {
        System.out.println( r * r );
        
        final String myWord = "dog";
        //myWord = myWord.substring(1,2); --> compile-time error
        String otherWord = myWord;
        otherWord += "s";
        System.out.println( otherWord );
        
        int s [ ] = {3,2,3};
        try
        {
            System.out.println( "dog".substring(900) );
            System.out.println( s[s[0]] );
            
            System.out.println( "Does this get printed?" );
        }
        catch( StringIndexOutOfBoundsException A )
        {
            System.out.println( A );
        }
        catch( IndexOutOfBoundsException I )
        {
            System.out.println( "p".concat( "ie" ) );
        }
        finally
        {
            System.out.println( 10+2 );
        }
        
        System.out.println( "pizza" );
    }
}
