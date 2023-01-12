import java.util.*;
/**
 * 6 essential data structures:
 * 1. indexed list - collection of elements which are accessed by INDEX POSITIONS
 * 1a. ArrayList: iterator and list iterator
 * 1b. Vector: iterator, list iterator, and an enumeration
 * 
 * 2. linked list - collection of nodes which sequentially point to the next node
 * (-) harder to retrieve and change elements
 * (+) easier to add and remove elements from the beginning
 * 2a. LinkedList - iterator and list iterator
 * 
 * 3. stacks - last-in-first-out data structure, push(x), peek(), pop(). Subclass of Vector
 * 3a. Stack - iterator, list iterator, and enumeration
 * 
 * 4. queues - first-in-first-out data structure, 
 * adding a LAST element --> add(x) [exception-possible] or offer(x) [no exceptions]
 * return and remove FIRST --> remove() [exception-possible] or poll() [no exceptions]
 * return FIRST without removing --> element() [exception-possible] or peek() [no exceptions]
 * 4a. Queue< X > myQueue = new LinkedList< X >(); --> iterator
 * 4b. ConcurrentLinkedQueue< X > myQueue = new ConcurrentLinkedQueue< X >( ); --> iterator
 * (import java.util.concurrent.ConcurrentLinkedQueue)
 * 
 * 5. sets - unique elements (no duplicates) which are characteristically unordered
 * adding an already existing element and removing a nonexisting element have no impact
 * (in contrast to throwing an exception...they do not do that)
 * 5a. HashSet - iterator
 * 5b. LinkedHashSet - iterator (subclass of HashSet)
 * 
 * 6. maps/dictionaries - a collection of unordered key-value pairs where the keys map to values
 * the keys have to be unique, but the values do not have to be unique
 * the keys are one data type, and the values are another data type
 * in general they are different data types but they do not have to be
 * 6a. HashMap - iterator on keys, iterator on values
 * 6b. Hashtable - iterator on keys, iterator on values, enumeration 
 * 6c. LinkedHashMap - iterator on keys, iterator on values
 * 6d. ConcurrentHashMap - iterator on keys, iterator on values, enumeration
 * 
 * if you want to iterate through the values in a hashtable or concurrent hash map 
 * using some type of iterator, you have 3 options:
 * 1. iterator on the keys called keyParse --> myDictionary.get( keyParse.next() )
 * 2. iterator on the values called valueParse --> valueParse.next()
 * 3. enumeration on the dictionary itself called apple --> apple.nextElement()
 * 
 * think about general functionality with data structures
 * methods like: add(x), size(), contains(x), remove(x), isEmpty() , toString()
 * dictionary: containsKey(x), containsValue(x), putAll(x)
 * 
 * Wrapping up:
 * 1. linear algeabra / matrix / determinant / transpose
 * 2. pass by value
 * 3. binary search trees
 * 4. PROFESSIONAL/IMPORTANT - Git/version control
 * 5. priority queues
 * 6. screenshare / Leetcode / final lesson
 */
public class Iterables
{
    public static void main( String args [ ] )
    {
        System.out.println( "Maximum short: " + Short.MAX_VALUE );
                System.out.println( "Maximum integer: " + Integer.MAX_VALUE );
        System.out.println( "Maximum long: " + Long.MAX_VALUE );

        System.out.println( "Minimum short: " + Short.MIN_VALUE );
                System.out.println( "Minimum integer: " + Integer.MIN_VALUE );
        System.out.println( "Minimum long: " + Long.MIN_VALUE );

        System.out.println( "Most precise float: " + Float.MIN_VALUE );
        System.out.println( "Most precise double: " + Double.MIN_VALUE );
        
        System.out.println( Float.MIN_VALUE < Double.MIN_VALUE );
        
        /*
         * with integer types, MIN_VALUE gives the most negative result
         * with decimal types, MIN_VALUE gives the "puniest" result (result closest to 0)
         * 
         * Double takes up more memory in Java because it keeps track of more decimal places
         * after the decimal point. Therefore, it can attain a number even closer to 0
         * (i.e. a "smaller" number) than the floats could
         */
        
        Hashtable< String , String > y = new Hashtable< String , String >( );
        y.put( "Phoenix" , "California" );
        y.put( "San Francisco" , "California" );
        y.put( "Boston" , "Massachusetts" );
        y.put( "New York" , "New York" );
        y.put( "Los Angeles" , y.get( "San Francisco" ) );
        
        Hashtable< String , String > citiesToStates = new Hashtable< String , String >( );
        citiesToStates.put( "Phoenix" , "Arizona" );
        
        citiesToStates.putAll(y);
        
        System.out.println( citiesToStates.size( ) );
        System.out.println( citiesToStates.get( "Phoenix" ) );
        
        //Option 1: use a loop without an iterator to iterate through the keys
        //and call the get method each time
        System.out.println( "************OPTION 1**********" );
        for( String a : citiesToStates.keySet() )
        {
            System.out.println( citiesToStates.get( a ) );
        }
        
        //Option 2: use a loop without an iterator to iterate through the values
        System.out.println( "************OPTION 2**********" );

        for( String b : citiesToStates.values() )
        {
            System.out.println( b );
        }
        
        //Option 3: use an iterator on the keys, call the get method
        System.out.println( "************OPTION 3**********" );
        Iterator< String > KP = citiesToStates.keySet().iterator( );
        
        while( KP.hasNext( ) )
        {
            System.out.println( citiesToStates.get( KP.next() ) );
        }
        
        //Option 4: use an iterator on the values
                System.out.println( "************OPTION 4**********" );
        Iterator< String > VP = citiesToStates.values().iterator( );
        
        while( VP.hasNext( ) )
        {
            System.out.println( VP.next() );
        }
        
        //Option 5: use an enumeration on the dictionary which PARSES THE VALUES
                System.out.println( "************OPTION 5**********" );
        Enumeration< String > valueParse2 = citiesToStates.elements( );
        
        while( valueParse2.hasMoreElements( ) )
        {
            System.out.println( valueParse2.nextElement( ) );
        }
    }
}
