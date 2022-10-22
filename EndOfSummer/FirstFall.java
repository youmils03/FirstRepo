
/**
 * Write a description of class FirstFall here.
 *
 *  If an object is declared in class C and initialized in subclass D,
 *  then it can only use methods that were at least ACKNOWLEDGED (i.e. potentially
 *  ASBTRACT methods that were not yet defined but at least were called out)
 *  in C or any superclasses of C. However, for those methods, it will use
 *  the MOST OVERRIDDEN version of that method down to the subclass D.
 *  (polymorphism)
 *  
 *  System.out.printf( "a.bf" , c ), where c is some double
 *  if b==0 (true OR false) and (int)(a-0.5)=a-0.5, then c is printed as (int)(a-0.5) + 1
 *  If you do a formatted string with a double but cut out all the decimal places, then
 *  Java takes the half number and rounds it up to the greater number
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FirstFall
{
    public static void main( String args [ ] )
    {
        int a = 3 , b = 0;
        
        //System.out.println( (a+1)/(b*2) );
        
        /*
         * 1/x
         * 1/x^2
         * 
         * 1/x: x-->0 --> DNE 
         * 1/x^2 --> limit is 0
         */
        
        ArithmeticException A = new ArithmeticException( "bad arithmetic" );
        System.out.println( A );
        System.out.println( A.getMessage( ) );
        
        //throw new ArrayIndexOutOfBoundsException( "STOP DOING THAT" );
        
        throw new ArithmeticException( "Can't divide by zero" );        
        }
        
    public static void f( )
    {
        try
        {
            System.out.println(1/0);
        }
        catch( Exception zebra )
        {
            System.out.println( zebra.getMessage( ) );
        }
    }
    
    public static void g( )
    {
        try
        {
            System.out.println( "potato" );
            System.out.println( 500/(3-3) );
            System.out.println( "did we make it" );
            String p = "pizza";
            System.out.println( p.substring(10,13) );
            System.out.println( "goodbye" );
        }
        catch( Exception P )
        {
            System.out.println( "caught that one..." );
        }
        finally
        {
            System.out.println( "apple" );
        }
        System.out.println( "orange" );
        
        int c = 100;
        System.out.println( c );
        do
        {
            c++;
            System.out.println(c==100);
        }
        while( false );
        
        System.out.println( "STOP" );
        
        int s = 200;
        while( s % 2 == 0 )
        {
            System.out.println( "cloud" );
        }
        System.out.println( "storm" );
        }
        
    public static void h( )
    {
        /*
         * System.out.println( "x" ); //x --> new line
         * System.out.print( "x" ); //x --> NO NEW LINE AFTERWARDS
         * System.out.printf( "%s, 'sup'" );
         * 
         * structure:
         * String a = "dog";
         * int b = 300;
         * double c;
         * c = 42.311;
         * System.out.printf( "My %s 
         */
        System.out.printf( "My %s is %s%s%s" , "name" , "Tony", "\n", "I like pizza");
        
        double k = Math.PI;
        System.out.printf( "The ratio of a circumference to a diameter is %20.5f" , k );
        
        /*
         * System.out.printf( "some string %s is %a.bf% inches long and is %d years old" , 
         *      "the string after \"some string\"", someDoubleWhereYouWantASpacesBetweeNThe
         *      PreviousEntryAndTheEndOfThatFloutingPointNumberAndBDigitsAfterTheDecimalPoint ,
         *      dIsSomeIntegerThatYouWantToPrintOnTheConsoleSpecifyHere );
         */
        
        Object c = new String( "STOP THAT" );
        System.out.println( c instanceof Integer );
        System.out.println( c instanceof Character );
        System.out.println( c instanceof Object && c instanceof String );
        
        Object a = 32.5 , b = 16 , c5 = "sup" , d5 = "skateboard" ;
        double o1 = ( (Double)(a) ).doubleValue( );
        int o2 = ( (Integer)(b) ).intValue( );
        String o3 = (String)(c5);
        String o4;
        o4 = (String)(d5);
        
        System.out.println( );
        System.out.printf( "%s, my GPA is %8.1f but I'm only %d, I like riding my %s", o3 , o1 , o2 , o4 );
    }
    
    public static void q( )
    {
        Double s = new Double( 30.5 );
        System.out.println( s.intValue( ) );
    }
    }
