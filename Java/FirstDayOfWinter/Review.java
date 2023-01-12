import java.util.*;
import java.util.concurrent.*; //java.util.concurrent is a SEPARATE package than java.util

/**
 * Which of the following data structures does NOT carry an enumeration?
 * a. linked list
 * b. hashtable
 * c. vector
 * d. concurrent hash map
 * 
 * linked list has a list iterator. Vector does too. The other two don't
 * 
 * hashtable has 2 things you call iterator on
 * Iterator< KeyType > keyParse = ( myDictionary.keySet( ) ).iterator( );
 * Iterator< ValueType > valueParse = ( myDictionary.values() ).iterator( );
 * Enumeration< ValueType > valueParse2 = myDictionary.elements();
 * 
 * 2 types of indexed lists
 * 
 * 2 types of queues
 * 1. queue can instantiate a linkedlist: Queue< X > myQueue = new LinkedList< X >( );
 * 2. concurrent linked queue: ConcurrentLinkedQueue< X > myQueue = new ConcurrentLinkedQueue< X >( );
 * 
 * all abstract methods are instance methods, but not all methods in an abstract class are necessarily instance methods
 *
 * the Collections class provides static methods that are helpful for working with dynamic arrays / lists
 * the Arrays class provides static methods that are helpful for working with static arrays
 * 
 * We implemented sorting and searching algorithms, but as long your class includes a compareTo( ) method, you
 * can just call the sort(x) or binarySearch(x,y) methods from either of these classes above
 * 
 * On November 7th, we outlined 8 remaining lessons. There are now 6:
 * 1. numeric types (Integer, Double, Short, Long, Float), 11/14/22
 * 2. Collections and Arrays classes, 12/1/22
 * ---
 * 3. matrices (2D arrays, operations: transpose, inverse, sum/difference, etc.) (exception handling)
 * 4. pass by value
 * 5. binary search trees
 * 6. setting up a Github account / Linux / OS / software engineering, pull requests, merge, conflicts, etc.
 * 7. priority queues
 * 8. screen swap / Leetcod
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Review
{
    public static void main( String args [ ] )
    {
        ConcurrentHashMap< String , String  > citiesToStates = new ConcurrentHashMap< String , String > ( );
        
        ConcurrentHashMap<String,String> x = new ConcurrentHashMap<String,String>();
        x.put( "Boston" , "Massachusetts" );
        x.put( "Palo Alto" ,"California" );
        x.put( "San Diego" , x.get( "Palo Alto" ) );
        x.put( "Phoenix" , "Arizona" );
        x.put( "New York" , "New York" );
        
        System.out.println( x.get( "Boston" ) );
        System.out.println( x.containsKey( "California" ) );
        System.out.println( (x.get( "San ".concat( "Diego" ) ) ).substring(0,1) );
        System.out.println( (double)(x.size()) );
        System.out.println( x.get( "Atlanta" ) );
        
        System.out.println( citiesToStates.size() > 0 ); //false
        citiesToStates.putAll(x);
        System.out.println( citiesToStates.size() > 0 ); //
        
        /*
         * 3 ways to retrieve the values from a hashtable or concurrenthashmap using iterators/enumerations:
         * 1. keyParse = ( myDictionary.keySet() ).iterator( ); ...   myDictionary.get( keyParse.next() );
         * 2. valueParse = ( myDictionary.values() ).iterator( ); ... valueParse.next( );
         * 3. valueParse2 = myDictionary.elements( );  .............. valueParse2.nextElement( );
         */
        
        System.out.println( Long.MAX_VALUE );
        
        ArrayList< Integer > myNumbers = new ArrayList< Integer >( );
        myNumbers.add(7);
        myNumbers.add(2);
        myNumbers.add(0);
        myNumbers.add(4);
        myNumbers.add(3);
        myNumbers.add(9);
        
        System.out.println( Collections.min(myNumbers) ); //0
        Collections.sort(myNumbers);
        System.out.println( myNumbers.size() - 1 == myNumbers.indexOf(Collections.max(myNumbers)) );
        
        System.out.println( Collections.binarySearch( myNumbers , 3 ) ); //2
        
        Collections.reverse(myNumbers);
        System.out.println( myNumbers.get(0) );
        myNumbers.remove(0); //removes the element at index position 0
        System.out.println( myNumbers.contains(0) ); 
        
        ArrayList< Integer > z = new ArrayList< Integer >( );
        z.add(320);
        z.add(160);
        z.add(190);
        z.add(270);
        z.add(400);
        
        Collections.swap(z,1,4);
        Collections.addAll(z,700,800,520);
        
        ListIterator< Integer > w = z.listIterator( );
        
        while( w.hasNext( ) || false )
        {
            System.out.println( w.next() );
        }
        
        /*
         * Collections.shuffle(x) randomly switches up the index positions of the elements in the collection x
         * Collections.frequency(x,y) accepts a collection x and element y and returns the number of y in x
         */
        
        ArrayList< Integer > apple = new ArrayList< Integer >( );
        System.out.println( Collections.disjoint( apple , z ) ); //true
        apple.add( z.get(2) );
        System.out.println( Collections.disjoint(z,apple) ); //false
        
        Collections.fill(z,666);
        System.out.println( Collections.disjoint(z,apple) ); //true
        
        System.out.println( Collections.frequency(z,666) == z.size() ); //true
        
        String [ ] words = { "dog" , "snake" , "iguana" , "helicopter" , "pizza" , "cat" , "ax" };
        System.out.println( Arrays.toString(words) );
        
        String computer [ ] = Arrays.copyOf( words , 4 );
        System.out.println( words.length == computer.length );
        System.out.println( computer[2] );
        Arrays.fill(computer,"PC > Mac");
        
        System.out.println( computer[3] );
        System.out.println( ( computer[0] ).equalsIgnoreCase( (computer[1]).toString() ) );
        
        int [ ] values = { 4 , 8 , 9 , 2 , 0 , 6 , 10 };
        Arrays.sort(values);
        System.out.println( Arrays.equals(values,Arrays.copyOf(values,2)) ); //false
        System.out.println( values[1] ); //2
        System.out.println( Arrays.binarySearch( values , 6 ) ); //3
    }
    
    /**
     * This static method accepts two dictionaries, where all keys and values are strings
     * It adds all key-value pairs from the second dictionary into the first dictionary
     * @param x the dictionary into which to add the key-value pairs
     * @param y the dictionary with the key-value pairs to add
     */
    public static void putAll( ConcurrentHashMap<String,String> x , ConcurrentHashMap< String , String > y )
    {
        x.putAll(y);
    }
}
