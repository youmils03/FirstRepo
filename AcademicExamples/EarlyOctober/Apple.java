
/**
 * 2 options for threading - concurrent programming
 * We have two scripts that we'd like Java to process or look at simultaneously
 * Threading
 * 
 * 
 * Easier option:
 * 1. Create a class that extends Thread, call it Apple
 * 2. in Apple, define a void instance method called run( ) and give it code!
 * 3. create a class that tests the class created in step 1, call it AppleTester
 * 4. create a static main method in AppleTester
 * 5. in the main method, create an instance of Apple with a default constructor
 * (no parameters), call it P --> Apple P = new Apple( );
 * 6. in the main method, call P.start( )
 * 
 * Harder option:
 * 1. Create a class that implements Runnable, call it Banana
 * 2. in Banana, define a void instance method called run( ) and give it instructions
 * 3. create a class that tests the class created in step 1, call it BananaTester
 * 4. create a static main method in BananaTester
 * 5. in the main method, create an instance of Banana with a default constructor
 * call it Q
 * 6. in the main method, create an instance of Thread and pass in Q created in step 5,
 * call it R
 * 7. in the main method, call R.start( )
 */
public class Apple extends Thread
{
    public void run( )
    {
        System.out.println( "surfboard" );
        System.out.println( "ocean" );
    }
}
