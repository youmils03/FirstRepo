
/**
 * Options:
 * 1. Class extends Thread, define run( ), tester class creates an instance and calls start( )
 * 2. Class implements Runnable, define run( ), tester class creates an instance and then
 * a thread with that instance as the one parameter/argument/input, call start( ) on the thread
 */
public class StudentTester
{
    public static void main( String args [ ] )
    {
        Student A;
        A = new Student( "Kimberly" , "Stanford" );
        //Student must implement Runnable (and provide run()) in order for you to invoke the
        //start( ) method in the tester class
        
        Thread T;
        T = new Thread(A);
        T.start( );
    }
}

