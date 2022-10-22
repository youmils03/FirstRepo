import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.LinkedHashMap;
/**
 * Write a description of class June30 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 * On your own, understand that space complexity is almost as important
 * as time complexity
 * With sorting algorithms, we wanted 96666to see how many steps a procedure
 * would take to complete
 * But every time we store a variable, it's more a question of space complexity
 * How much memory in the operating system are we taking up?
 * Create variables for important information, but don't create variables
 * that you won't use more than 4 or 5 times, just use the literal values
 * 
 * Understand: Google these
 * Integer java api --> integer that's based on 32 bits
 * Double java api --> floating point (decimal) number based on 64 bits
 * Long java api --> integer that's based on 64 bits
 * Short java api --> integer that's only based on 16 bits (small integer)
 * Float java api --> floating point (decimal) number based on only 32 bits\
 * 
 * Properties:
 * Integer.SIZE
 * Integer.MAX_VALUE
 * Integer.MIN_VALUE
 * Float.SIZE
 * Float.MAX_VALUE
 * Float.MIN_VALUE
 */
public class June30
{
     public static void main( String args [ ] )
     {
         short S = 41;
         System.out.println( S );
         
         Short shortObject = new Short( (short)(5) );
         System.out.println( shortObject * 2 );
         
         System.out.println( "Biggest short: " + Short.MAX_VALUE );
         
         Integer a = new Integer(52);
         Integer b = new Integer(49);
         
         System.out.println( a < b );
         
         System.out.println( Integer.SIZE );
         
         /*
          * 99% of the time, it's good practice to store values in variabels
          * Variables are commonly used
          * Just think about space complexity
          * 
          * Time complexity: we saw that merge sort is much better than
          * bubble sort, because merge sort requires fewer steps, and this
          * makes a difference with large static/dynamic arrays
          * 
          * Space: Every time you create a variable, you're telling Java
          * to carve out memory to keep track of that variable
          * So only create variables that you need to create
          * 
          * 5 classes: Integer, Double, Long, Short, Float
          * 
          * System.out.println( Integer.SIZE ); --> 32
          * 32 binaries that go into storing an int
          * 2^32 --> that's the size that an integer can take
          * 
          * 2^32 = 4 billion something
          * you can go from something  like -2 billion to +2 billion with 
          * an int
          * 
          */
         
         Integer k = new Integer( 500 ) , j = new Integer( 400 );
         int s = k.intValue( ) , t = j.intValue( );
         System.out.println( s - t ); //formalized way to retrieve arithmetic values
         System.out.println( k - j ); //manipulation, shortcut
         
         int w = 5;
         w += 200000000; //every integer takes the same amount of space
         // because it needs to be able to be re-allocated
         
         System.out.println( Integer.MAX_VALUE );
         
         int q = Integer.MAX_VALUE + 1;
         System.out.println( q );
         System.out.println( q == Integer.MIN_VALUE ); //true or false?
         
         double x = 5;
         System.out.println( x );
         
         System.out.println( "Number of bits for a Double: " +  Double.SIZE );
         System.out.println( "Maximum value for a Double: " +- Double.MAX_VALUE );
         
         double pizza = Double.MAX_VALUE;
         System.out.println( pizza + 1000000 );
         
         /*
          * We know that integers take up 32 bits --> 
          * - (2^31) --> 2^31 - 1 --> this is the numeric range
          * 
          * We know that doubles take up 64 bits -->
          * - (2^63) --> 2^63 - 1 --> this is ithe numeric range
          * 
          * Long
          * Short
          * Float
          */
         
         System.out.println( Long.MAX_VALUE );
         System.out.println( "Bits in a long: #" + Long.SIZE );
         
         Long v1 = new Long( 52 ), v2 = new Long( 22 );
         System.out.println( v1 + v2 ); 
         
         long p = Long.MIN_VALUE;
         System.out.println(p);
         
         Long soup = new Long( 82734 );
         System.out.println( Long.toBinaryString( soup ) );
         
         System.out.println( Long.toBinaryString ( new Long( 82735 ) ) );
         
         System.out.println( Long.toBinaryString( new Long( 82736 ) ) );
         
         System.out.println( Long.toBinaryString( new Long( 82741 ) ) );
         
         System.out.println( "separator" );
         System.out.println( Integer.SIZE );
         System.out.println( Double.SIZE );
         System.out.println( Long.SIZE );
         
         System.out.println( Short.SIZE );
         
         System.out.println( Short.MAX_VALUE );
         
         System.out.println( Short.MAX_VALUE + Short.MIN_VALUE );
         System.out.println( "noodles" );
         System.out.println( "Max value of float: " +  Float.MAX_VALUE );
         System.out.println( "Number of bits for a float: " + Float.SIZE );
         
         float a1 = 5, a2 = 7;
         System.out.println( v1 - v2 );
         
            System.out.println( "for integers: " + Integer.SIZE );
            System.out.println( "for doubles: " + Double.SIZE );
            System.out.println( "for longs: " + Long.SIZE );
            System.out.println( "for shorts: " + Short.SIZE );
            System.out.println( "for floats: " + Float.SIZE );
            
            Number basketball = new Integer( 500 );
            System.out.println( basketball.intValue( ) >= 500 );
     }
     
     public static void f( )
     {
         ConcurrentLinkedQueue< String > t6 = new ConcurrentLinkedQueue< String > ( );
        t6.add( "hockey" );
        t6.add( "soccer" );
        t6.add( "basketball" );
        
        int w = 0;
        
        Iterator< String > banana = t6.iterator( );
        
        while( banana.hasNext( ) )
        {
            String s = banana.next( );
            System.out.println( s.toUpperCase( ) );
            w += s.length( );
            banana.remove( );
        }
        
        System.out.println( w );
        System.out.println( t6.size( ) );
        
        /*
         * iterator: can check for a next element, can return a next element, can OPTIONALLY
         * remove the element from the underlying collection
         * enumeration: hasMoreElements( ), nextElement( ), and can't remove elements
         * list iterator: can traverse backwards, can add/set elements at a particular curose
         * position
         * 
         * ArrayList --> iterator, listIterator
         * LinkedList --> iterator, listIterator
         * 
         */
        
        LinkedHashMap< Integer , String > myDictionary = new LinkedHashMap< Integer, String >( );
        
        myDictionary.put( 52 , "sup" );
        myDictionary.put( 44 , "not much" );
        
        String a1 [ ] = { "sup" , "cookie" , "sun" };
        int a2 [ ] = { 72 , 100 , 97 };
        
        
     }
     
     public static LinkedHashMap< String , Integer > thisDictionary( String [ ] a1 , int [ ] a2 )
     {
         LinkedHashMap< String , Integer > newDictionary = new LinkedHashMap< String , Integer > ( );
         
         for( int q = 0 ; q < a1.length ; q = q + 1 )
         {
             newDictionary.put( a1[q] , a2[q] );
         }
         
         return newDictionary;
     }
}
