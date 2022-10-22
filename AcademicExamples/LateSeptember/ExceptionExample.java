
/**
 * Write a description of class ExceptionExample here.
 *
 * Reviewed:
 * 
 * MAIN METHOD PROGRAMMING - THE BASICS 
 * 
 * printing statements, comments, println() vs. print()
 * arithmetic expressions. Remainder, order of operations
 * variables, declaration and initialization, multiple variable declarations
 * implicit casting. Int and double. Explicit casting
 * rounding, changing the values of two variables
 * String methods. int <--> double <--> String. Integer.parseInt(String s)
 * boolean expressions and variables
 * if/elseif/else logic
 * switch statement with int input
 * while loops
 * for loops
 * break, continue keywords
 * 1-D static arrays
 * for-each loops
 * char data type, escape sequences
 * Scanner class, Math class
 * 
 * static methods, void methods, overloaded methods
 * object-oriented fundamentals: instance variables, constructors, getter/setter
 * toString method, this keyword, default constructor
 * static class variables vs. local method variables vs. instance variables
 * final keyword
 * arrays of objects
 * wrapper classes: Integer, Double, Boolean, Character
 * Javadocs (formal documentation)
 * ArrayLists (dynamic arrays)
 * recursion
 * inheritance and polymorphism, super keyword, public/private/protected
 * abstraction: abstract classes and interfaces
 * sorting algorithms
 * searching algorithms
 * do-while loops
 * exception handling
 * 
 * WHAT'S LEFT
 * file I/O
 * threading
 * LinkedLists
 * stacks, queues, sets, and maps (alternative data structures)
 * iterators, enumerations, and list iterators
 * matrices, 2D arrays: mathematical operations for matrices
 * pass by value
 * binary search trees
 */
public class ExceptionExample
{
    public static void main( String args [ ] )
    {
        String e;
        e = "egg";
        
        try
        {
            System.out.println( e.substring(5,8) );
        }
        catch( ArrayIndexOutOfBoundsException A )
        {
            System.out.println( "monday" );
        }
        catch( ArithmeticException B )
        {
            System.out.println( B.getMessage( ) );
        }
        //catch( RuntimeException C )
        //{
        //    System.out.println( C.getMessage( ) );
        //}
        catch( Exception E )
        {
            System.out.println( E.getMessage( ) );
        }
        finally
        {
            System.out.println( "summer" );
        }
        
        System.out.println( "boat" );
        
        try
        {
            System.out.println( "boat" );
            System.out.println( 3/0 );
            System.out.println( "water" );
            System.out.println( "ham".substring(20) );
        }
        catch( ArrayIndexOutOfBoundsException A )
        {
            System.out.println( A.getMessage( ) );
        }
        catch( IndexOutOfBoundsException B )
        {
            System.out.println( "dog" );
        }
        catch( ArithmeticException C )
        {
            System.out.println( C );
        }
        catch( Exception D )
        {
            System.out.println( 10 + 2 );
        }
        finally
        {
            System.out.println( "sup" );
        }
        
        System.out.println( "not much" );
        
        try
        {
            System.out.println( 1 );
            throw new ArithmeticException( "stop that" );
        }
        catch( Exception F )
        {
            System.out.println( F );
            System.out.println( F.getMessage( ) );
            System.out.println( F instanceof Object );
            System.out.println( F instanceof ArithmeticException );
            System.out.println( F instanceof Throwable );
        }
    }
}
