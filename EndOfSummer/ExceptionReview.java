
/**
 * Exceptions arise when there are unexpected breaks in our code
 * Java is able to parse what we wrote gramatically (compiles), but there's some issue
 * in the logic in the code which causes a runtime error before all of the code has a chance
 * to be executed
 * 
 * try:
 * {
 * execute as much of this code as you can
 * problematic code could arise
 * }
 * catch( wrong type of problem ):
 * {
 * doesn't run
 * }
 * catch( subclass of the exception thrown )
 * {
 * doesn't run
 * }
 * catch( superclass or class of exception thrown )
 * {
 *     starts running when the try block hits an error. 
 *     The exception is AVOIDED. NO ISSUES ARISE IN THE CODE :)
 * }
 * catch( broader superclass of the exception thrown )
 * {
 *     doesn't run
 * }
 * catch( more specific subclass of a class already listed )
 * {
 *     NOT ALLOWED. YOU CANNOT CATCH SPECIFIC EXCEPTIONS AFTER GENERAL EXCEPTIONS
 * }
 * finally
 * {
 *     this block runs REGARDLESS of whether an exception was actually thrown
 * }
 * //arrive here if 1 of 2 things happened:
 * //1. the try block was clean
 * //2. you successfully caught the exception thrown by the try block
 }
 * 
 }
 }
 }
 }
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExceptionReview
{
    public static void exceptionExample1( )
    {
        ArithmeticException E = new ArithmeticException( "hot dog" );
        System.out.println( E );
        
        throw new StringIndexOutOfBoundsException( "cookies are stale" );
    }
    
    public static void exceptionExample2( )
    {
        try
        {
            System.out.println( "apple" );
            throw new ArrayIndexOutOfBoundsException( "bad indexing on the array" );
        }
        catch( StringIndexOutOfBoundsException S )
        {
            System.out.println( "orange " );
            System.out.println( "caught the string exception" );
        }
        catch( IndexOutOfBoundsException I )
        {
            System.out.println( I );
            System.out.println( "moonlight" );
        }
        finally
        {
            System.out.println( "swimming" );
        }
        System.out.println( "surfing" );
        IndexOutOfBoundsException shark = new ArrayIndexOutOfBoundsException( );
    }
    
    public static void exceptionExample3( )
    {
        try
        {
            System.out.println(3/1);
            System.out.println(1/3);
            System.out.println(4/0);
            System.out.println(0/4);
        }
        catch( StringIndexOutOfBoundsException J )
        {
            System.out.println( J );
        }
        catch( IndexOutOfBoundsException K )
        {
            System.out.println( "pizza" );
        }
        catch( ArithmeticException P )
        {
            System.out.println( 5/2 );
        }
        catch( Exception T )
        {
            System.out.println( "potato" );
        }
        finally
        {
            System.out.println( "ice cream" );
        }
        System.out.println( "goodbye" );
    }
    
    public static int divideThese( int a , int b )
    {
        return a / b;
    }
    
    public static void main( String args [ ] )
    {
        double myNumbers [ ] = { 3.3 , 6.2 , 8.1 , 7.4 };
        
        System.out.println( "hot" );
        
        boolean b1 = myNumbers[0] > 2 , b2 = myNumbers[6] > 5;
        
        System.out.println( "dog" );
        
        System.out.println( b1 );
        System.out.println( b2 );
    }
}
