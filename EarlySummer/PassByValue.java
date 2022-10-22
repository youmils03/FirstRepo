
/**
 * Write a description of class PassByValue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PassByValue
{
    private int value;
    public static int tony;
    
    /**
     * This method accepts an integer and tries to add one to it without returning anything
     * 
     * @param x the integer to try adding 1 to
     */
    public static void addOne( int x )
    {
        x += 1;
        System.out.println(x);
    }
    
    PassByValue( int value )
    {
        this.value = value;
    }
    
    public void solutionOne( )
    {
        this.value += 1;
    }
    
    public static int solutionTwo( int u )
    {
        return u + 1;
    }
    
    /**
     * We define what it means to print an instance of a class
     * For example
     * PassByValue P = new PassByValue( 50 );
     * System.out.println( P ); //what is meant by this code
     */
    public String toString( )
    {
        return "" + this.value;
        //return Integer.toString( value );
    }
    
    /*
     * there are 3 solutions to this:
     * 1. create an object out of it. You make it an instance method
     * Person s = new Person(52);
     * s.solutionOne( );
     * System.out.println( s ); //53
     * 
     * 2. return a number 1 larger for example instead
     * int g = 5;
     * System.out.println( solutionTwo(g) ); //6
     * 
     * 3. have an array with at least one element; keep track the first one instance
     * int state = new int[1];
     * state[0] = -4;
     * solutionThree(state);
     * System.out.println( state[0] <= -4 ); //false, it's -3 now
     * 
     * 4. make a change to the class variable using a static void method
     * class variable Tony --> 194
     * in the main method --> solutionFour(Tony); 
     * System.out.println(Tony); --> 195
     * 
     * Summary of the concepts:
     * printing statements and comments
     * arithmetic expressions System.out.println(10*12);
     * variables, change the value of two variables
     * implicit and explicit casting: int --> String, int --> double, double --> String
     * explicit casting: (int)  (double) numbers, Integer.toString(x), Double.toString(y)
     * String methods: length(), substring(4), substring(1,3), startsWith(), endsWith(), ...
     * look up the rest in the API
     * booleans: true/false, boolean logic, conditions. true, false
     * if/elseif/else logic
     * switch statements
     * while loops, for loops, do while
     * 1D arrays: index positions, how to create them
     * char data type, ASCII encoding
     * for-each loops
     * Scanner class: user input
     * Math class
     * static methods
     * object-oriented programming: constructors, getter/setter methods, toString( )
     * arrays of objects:
     * ArrayLists --> ArrayLists cannot hold primitives
     * recursion
     * inheritance and polymorphism
     * Javadocs
     * abstraction: abstract class or an interface
     * sorting algorithms: bubble, insertion, selection
     * searching algorithms: linear/sequential, binary
     * exceptions
     * threading / concurrent programming
     * linkedlists, vectors, stacks, queues, concurrent linked queues, hash sets, linked hash sets,
     * hash maps, and concurrent hashmaps, linked hash maps, hashtables
     * iterators, list iterators, enumerations
     * numeric storage of different numeric types, space complexity / memory
     * pass-by-value
     * 
     * remaining topics:
     * 1. priority queues
     * 2. trees
     * 3. final review
     */
    
    
    
    public static void main( String args [ ] )
    {
        int t = 45;
        PassByValue.addOne(t); //46
        System.out.println( t ); //45
        
        Object z = new PassByValue( 16 );
        PassByValue y = (PassByValue)(z);
        y.solutionOne( );
        System.out.println( y ); //17
        
        int pasta;
        pasta = 299;
        System.out.println( solutionTwo( pasta ) ); //static method called in its own class
        System.out.println( PassByValue.solutionTwo(pasta) ); //more general static method call
        
        int [ ] sun = {205};
        solutionThree(sun);
        System.out.println( sun[0] );
        
        Integer myNumber = 320;
        error( 320 );
        System.out.println( myNumber );
        
        tony = 194;
        addOne(tony);
        System.out.println(tony);
        
        System.out.println( "field" );
        burger();
        System.out.println( tony );
        
        int v1 = 6 , v2 = 2;
        int v3 = v1; //generate a temporary variable to refer to the old first value
        v1 = v2;
        v2 = v3;
        //Python: v2, v1 = v1, v2 //tuple unpacking
        System.out.println( v2 - v1 ); //desired result: 4
        
        double reviewVariable = 2;
        System.out.println( reviewVariable ); //2.0
        
        Integer v4 = 500 , v5 = 200;
        System.out.println( v4 + v5 ); //700
        System.out.println( v4.intValue( ) + v5.intValue( ) ); //700
        System.out.println( v4+v5.intValue() ); //700
    }
    
    public static void solutionThree( int [ ] a )
    {
        a[0] += 1;
    }
    
    public static void error( Integer q )
    {
        q += 1;
    }
    
    public static void burger( )
    {
        tony += 1;
    }
}
