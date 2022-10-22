import java.util.Queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.Iterator;
import java.util.Stack;
import java.util.LinkedHashSet;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Enumeration;
import java.util.ListIterator;

/**
 * Write a description of class QueueReview here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QueueReview
{
    public static void main( String args [ ] )
    {
        /*
         * ArrayList< X > myList = new ArrayList< X >( );
         * Vector< X > myVector = new Vector< X >( );
         * 
         * Stack< X > myStack = new Stack< X >( );
         * 
         * Person p = new Person( "Tony" , 70 );
         * 
         * Remember that all these data structures have
         * 1. at least one type of iterator
         * 2. toString( ) method --> string representation, you can just PRINT it
         * 3. remember to import the correct classes and then create the data structure
         * with the syntax commented above
         */
        Queue< String > myQueue = new LinkedList< String >( );
        
        try
        {
            System.out.println( myQueue.remove( ) );
        }
        catch( NoSuchElementException w )
        {
            System.out.println( "There's nothing in there..." );
        }
        
        if( myQueue.size( ) >= 1 )
        {
            System.out.println( myQueue.remove( ) );
        }
        else
        {
            System.out.println( "There's nothing in there..." );
        }
        
        LinkedList< Integer > myVals = new LinkedList< Integer >( );
        myVals.add( 3 );
        myVals.add( 8 );
        LinkedList< Integer > otherVals = new LinkedList< Integer >( myVals );
        
        Iterator< Integer > parse = otherVals.iterator( );
        
        System.out.println( myVals ); //System.out.println( myVals.toString() );
        
        while( parse.hasNext( ) )
        {
            System.out.println( ( parse.next( ) ) % 2 == 0 );
        }
        
        ConcurrentLinkedQueue< String > peopleInLine;
        peopleInLine = new ConcurrentLinkedQueue< String >( );
        
        peopleInLine.offer( "Amanda" );
        peopleInLine.add( "Tim" );
        peopleInLine.add( "Joseph" );
        int r = 0;
        
        while( ! peopleInLine.isEmpty( ) )
        {
            if( r == 2 )
            {
                break;
            }
            System.out.println( peopleInLine.element( ) );
            r += 1;
        }
        
        System.out.println( peopleInLine );
        
        Stack< Double > myStack = new Stack< Double >( );
        myStack.push( 4.2 );
        myStack.push( 8.7 );
        myStack.push( 8.8 );
        
        while( !myStack.empty( ) ) //OR, !myStack.isEmpty( ) --> SAME THING
        {
            System.out.println( myStack.pop( ) );
        }
        
        /*
         * iterator: hasNext( ), next( ), remove( )
         * list iterator: BETTER. 
         * hasPrevious( ), previous( ), set( ), add( ), plus ITERATOR functionality
         * enumeration: WORSE
         * a. longer method names --> hasMoreElements( ), nextElement( )
         * b. no functionality to remove elements from the underlying collection
         * 
         * Indexed lists: (similar to each other)
         * 1. ArrayList --> iterator, list iterator
         * 2. Vector --> iterator, list iterator, enumeration
         * 
         * LinkedList --> iterator, list iterator
         * 
         * Stack --> iterator, list iterator, enumeration
         * 
         * Queues:
         * 1. Queue/LinkedList --> iterator
         * 2. ConcurrentLinkedQueue --> iterator
         * 
         * Sets:
         * 1. HashSet --> iterator
         * 2. LinkedHashSet --> iterator
         * 
         * Dictionaries:
         * 1. HashMap --> iterator on keys, iterator on the values
         * 2. Hashtable --> iterator on keys, iterator on the values, enumeration on the hashtable itself
         * which would have the effect of parsing the values
         * 3. LinkedHashMap --> iterator on keys, iterator on the values
         * 4. ConcurrentHashMap --> like Hashtable, gets all 3
         */
        
        Food a = new Food( "chocolate" , 3.00 );
        Food b = new Food( "milk" , 2.75 );
        Food c;
        c = new Food( ); // <-- c.item = "pizza" , c.price = 6.25
        Food d;
        d = new Food( "chicken" );
        
        Hashtable< Food , String > myDictionary = new Hashtable< Food , String >( );
        
        myDictionary.put( a , "delicious" );
        myDictionary.put( b , "no thanks" );
        myDictionary.put( c , "delicious" );
        myDictionary.put( d , "sure" );
        
        /*
         * The keys in a dictionary have to be unique, but the values do not have to be unique
         * 
         * 3 ways to iterate through the values of a hashtable or concurrent hash map:
         * 1. iterator on the keys --> myDictionary.get( iterator.next( ) );
         * 2. iterator on the values --> iterator.next( )
         * 3. enumeration on the dictionary --> enumeration.nextElement( )
         * The third option can NOT be used to remove elements from the underlying collection, but the
         * iterators can
         * The third option is NOT available to HashMaps or LinkedHashMaps, only
         * Hashtables and ConcurrentHashMaps
         */
        
        Iterator< Food > foodParse = ( myDictionary.keySet( ) ).iterator( );
        
        for( int p = 0 ; foodParse.hasNext( ) ; p += 1 )
        {
            System.out.println( myDictionary.get( foodParse.next( ) ) );
            
            /*
             * If you want to use the key iterator to iterate on the values
             * Food currentItem = foodParse.next( );
             * System.out.println( myDictionary.get( currentItem ) );
             */
        }
        
        Iterator< String > valueParse = ( myDictionary.values( ) ).iterator( );
        
        while( valueParse.hasNext( ) )
        {
            System.out.println( ( valueParse.next( ) ).toUpperCase( ) );
        }
        
        Enumeration< String > dictionaryParse = myDictionary.elements( );
        
        while( dictionaryParse.hasMoreElements( ) )
        {
            System.out.println( ( dictionaryParse.nextElement( ) ).substring( 0 , 1 ) );
        }
        
        System.out.println( myDictionary );
        
        Food e = new Food( "burger" );
        
        Hashtable< Food , String > otherDictionary = new Hashtable< Food , String >( );
        
        otherDictionary.put( a , "awful" );
        otherDictionary.put( e , "awful" );
        
        myDictionary.putAll( otherDictionary );
        
        /*
         * Tricky: we're
         */
        
        System.out.println( myDictionary.get( a ) ); //awful REPLACES delicioous
        System.out.println( myDictionary.containsKey( e ) ); //true, because of the putAll( ) method
        System.out.println( otherDictionary.containsKey( b ) ); //false
        System.out.println( (double)( myDictionary.size( ) ) ); //5.0
        System.out.println( myDictionary.containsValue( "aw" + "ful" ) ); //true, after putAll( )
        System.out.println( otherDictionary.contains( "aw".concat( "ful" ) ) ); 
        //a.contains(x) is the exact same as a.containsValue(x)
        
        myDictionary.replace( d , "dog" );
        System.out.println( ( myDictionary.get( d ) ).length( ) * 3 );
        
        myDictionary.replace( c , "carrot" , "gross" );
        System.out.println( myDictionary.get( c ) ); //delicious
        
        System.out.println( myDictionary.replace( d , myDictionary.get( d ) , "downstairs" ) ); //true
        System.out.println( myDictionary.get(d) ); //downstairs
        
        if( otherDictionary.replace( e , "bad" , "peanuts" ) )
        {
            System.out.println( 5 );
        }
        else
        {
            System.out.println( 7 ); //7
        }
        
        myDictionary.remove( a );
        System.out.println( myDictionary.get( a ) ); //null
        
        Object s = new LinkedHashSet< String >( );
        LinkedHashSet< String > t = (LinkedHashSet< String >)(s); //polymorphism
        t.add( "hey there" );
        
        for( int u = 0 ; u < 0 ; u += 1 )
        {
            t.add( "sup".concat( Integer.toString(u) ) );
        }
        
        t.add( "what's up" );
        
        System.out.println( t.size( ) ); //1
        System.out.println( t.remove( "box" ) ); //false
        System.out.println( t ); 
        
        Iterator< String > setParse;
        setParse = t.iterator( );
        
        while( setParse.hasNext( ) )
        {
            System.out.println( (setParse.next( ) ).toUpperCase( ) );
            setParse.remove( );
        }
        
        System.out.println( t.size( ) > 0 ); //false, because the size( ) is in fact 0 now
        
        LinkedList< Integer > myList = new LinkedList< Integer >( );
        myList.add( 4 );
        myList.add( 4 );
        myList.add( 12 );
        myList.add( 3 );
        
        ListIterator< Integer > listParse = myList.listIterator( );
        
        for( int p = 0 ; p < myList.size( ) ; p += 1 )
        {
            listParse.next( );
        }
        
        while( listParse.hasPrevious( ) )
        {
            System.out.println( listParse.previous( ) );
        }
        
        /*
         * Reviewed iterators, list iterators, and enumerations
         * Briefly reviewed queues and sets, but spent most time on dictionaries
         * Applied those iterator types to a hashtable
         * 
         * Next time:
         * finalize all of this
         * start talking about: pass-by-value
         */
    }
    
    /*
     * Java developers have a Hashtable class that they built
     * 
     * public boolean containsValue( Object t )
     * {
     *     return contains(t);
     * }
     }
     */
}
