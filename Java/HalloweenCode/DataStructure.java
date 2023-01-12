import java.util.*;
/**
 * 12 data structures:
 * 
 * LISTS
 * 1. ArrayList: iterator, list iterator
 * 2. LinkedList: iterator, list iterator
 * 3. Vector: iterator, list iterator, and basically useless enumeration
 * 
 * STACKS
 * 4. Stack: iterator, list iteartor, and enumeration because they're inherited from Vector!
 * 
 * QUEUES
 * 5. Queue implements a LinkedList: iterator
 * 6. ConcurrentLinkedQueue: iterator
 * 
 * SETS
 * 7. HashSet: iterator
 * 8. LinkedHashSet: iterator
 * 
 * DICTIONARIES
 * 9. HashMap: iterator on the keys, iterator on the values
 * 10. Hashtable: iterator on the keys, iterator on the values, enumeration on the hashtable
 * ( for some hashtable t, you can call t.keySet( ).iterator( ), t.values( ).iterator( ), 
 * or t.elements( ) --> has the effect of enumerating through the VALUES )
 * 11. LinkedHashMap: iterator on the keys, iterator on the values
 * 12. ConcurrentHashMap: iterator on the keys, iterator on the values, enumeration on the dictionary
 * (which has the effect of iterating through the values)
 * 
 * Today:
 * very brief review of threading
 * started to review iterators, list iterators, and enumerations
 * applied them to a few types of lists and a queue
 * reviewed queue methods: add vs. offer, poll vs. remove, peek vs. element
 * --> both Queue and ConcurrentLinkedQueue get these methods
 * 
 * What's left:
 * a little more review with iterator types, sets, and dictionaries
 * Git / version control
 * binary search trees
 * pass-by-value
 * Arrays class, Collections class --> helpful static methods
 * 2D matrices (determinant, sum/product
 * numeric types (Integer, Double, Float, Long, Short)
 */
public class DataStructure
{
    public static void main( String args [ ] )
    {
        ArrayList< Integer > x = new ArrayList< Integer >( );
        LinkedList< Integer > y = new LinkedList< Integer >( );
    
        /*
         * ArrayLists are particularly well suited for retrieveing elements at INDEX POSITIONS
         * Since they can access those elements quickly, they can also change them quickly!
         * 
         * LinkedLists have a different geometry
         * The elements are NOT accessed by index position characteristically / in general
         * Instead, the nodes are linked together and point to the next node
         * 
         * This makes adding and removing elements from the beginning or end of a linked list
         * much more efficient than doing those operations on an arraylist
         * 
         * But, technically, if you google "arraylist java api" and "linked list java api",
         * you will see the same collection of methods
         * list.add(x) --> appends element x to the end of the list
         * list.add(x,y) --> adds element y at index position x, shifts all subsequent elements
         * list.get(x) --> retrieves the element at index position x. (ARRAYLISTS)
         * list.set(x,y) --> replaces the element currently at index position x with y
         * list.clear( ) --> removes all elements from the list
         * list.isEmpty( ) --> returns true if and only if the number of elements is zero
         * list.size( ) --> returns the number of elements in the arraylist or linkedlist
         * list.iterator( ) --> create a traditional ("slightly weaker") iterator on the list
         * list.listIterator( ) --> create a LIST iterator (more functionality) on the list
         * 
         * Arraylists and linkedlists do NOT have an enumeration, but vectors do!
         * vector.elements( ) --> creates an enumeration on the vector.
         * 
         * Vector: an ArrayList
         * A vector is a resizable collection of elements which are accessed by index position
         * 
         * A fake argument/benefit of a vector is that it gets an enumeration
         * This is worth basically nothing, since the enumeration cannot do anything that the
         * iterator cannot. In fact, the ArrayList and LinkedList have not just the iterator
         * but the list iterator which is much, much, much stronger than Vector's enumeration
         * But of course Vector can also use iterator and list iterator
         */
        
        Vector< String > myWords = new Vector< String >( );
        myWords.add( "summer" );
        myWords.add( "hot" );
        myWords.add( "swimming" );
        myWords.add( myWords.lastIndexOf( "summer" ) , "winter" );
        
        Iterator< String > wordParse;
        wordParse = myWords.iterator( );
        
        for( int k = 0 ; wordParse.hasNext( ) ; k += 1 )
        {
            System.out.println( wordParse.next( ) );
        }
        
        Vector< Integer > nums = new Vector< Integer >( ); //enumerations can only be applied
        //either on vectors, hashtables, or concurrent hash maps
        
        nums.add(3);
        nums.add(2);
        nums.add(1);
        nums.add(0);
        nums.remove(0); //tricky: remove(x) will assume that x is an int index position
        
        Enumeration< Integer > numParse;
        numParse = nums.elements( ); //you can NOT call this on an ArrayList or a LinkedList
        
        while( false || numParse.hasMoreElements( ) )
        {
            System.out.println( "Number: " + numParse.nextElement( ) );
        }
        
        Vector< Person > group = new Vector< Person >( );
        group.add( new Person( "John" ) );
        group.add( new Person( "Kimberly" ) );
        group.add( new Person( "Scott" ) );
        group.add( new Person( "Jake" ) );
        group.add( new Person( "Christina" ) );
        
        ListIterator< Person > groupParse = group.listIterator( );
        //listIterator( ) is an instance method which is called on an INSTANCE of a 
        //Vector, ArrayList, or LinkedList
        //the method accepts no inputs and returns a list iterator
        
        /*
         * Iterators can 
         * 1. check for a next element ( hasNext( ) )
         * 2. return the next element ( next( ) )
         * 3. remove the element that was most recently referred to by next( ), from the
         * underlying collection ( remove( ) )
         * 
         * Enumerations can ONLY
         * 1. can check for a next element ( hasMoreElements( ) )
         * 2. return the next element ( nextElement( ) )
         * 
         * List iterators can do a lot, and you should practice with some of their functionality:
         * 1. can check for a next element ( hasNext( ) )
         * 2. return the next element ( next( ) )
         * 3. remove the element you just referred to (remove())
         * 4. can check for a previous element ( hasPrevious( ) )
         * 5. return the previous element( previous() )
         * 6. nextIndex( ): returns an int giving the index position of the NEXT element
         * 7. previousIndex( ): index position of the PREVIOUS element
         * 8. add(x): add the element specified to the underlying collection
         * wherever the cursor currently is (cursor is always between 2 elements)
         * 9. set(x): if you just called next() or previous(), then that element
         * is replaced with whatever x is
         */
        
        while( true )
        {
            if( groupParse.hasNext( ) )
            {
                ( groupParse.next( ) ).run( );
            }
            else
            {
                break;
            }
        }
        
        boolean c = groupParse.hasPrevious( );
        System.out.println( c && true );
        
        LinkedList< String > moreWords = new LinkedList< String >( );
        moreWords.add( "January" );
        moreWords.add( "February" );
        moreWords.add( "April" );
        moreWords.add( "May" );
        moreWords.add( "June" );
        moreWords.add( "Jult" );
        moreWords.add( "August" );
        
        ListIterator< String > w = moreWords.listIterator( );
        
        while( w.hasNext( ) )
        {
            w.next( ); //cursor starts before element 0, then is between 0 and 1
            //then between 1 and 2, then ... eventually it will be 
            //after the last element. To the "right" of the last element
        }
        
        System.out.println( false == w.hasNext( ) ); //true
        System.out.println( moreWords.size( ) == w.nextIndex( ) ); //true
        
        for( int j = 0 ; w.hasPrevious( ) ; j+=1 )
        {
            String currentMonth = w.previous( );
            if( currentMonth.equalsIgnoreCase( "jult" ) )
            {
                w.set( "July" ); //uses the list iterator to update the 
                //underlying linked list
            }
            else if( currentMonth.equalsIgnoreCase( "ap" + "r".concat("il" ) ) ) //case-insensitive
            {
                w.add( "March" );
                //add(x) --> x goes into the underlying collection either AFTER the element 
                //you just referred to with previous(), or BEFORE the element you just referred
                //to with next
            }
        }
        
        //Right now, the cursor is BEFORE index position 0 
        System.out.println( w.nextIndex( ) );  //0
        System.out.println( w.previousIndex( ) ); //-1
        
        //In general, w.nextIndex() == w.previousIndex() + 1
        
        for( String u : moreWords )
        {
            System.out.println(u);
        }
    }
}
