import java.util.*; //import the entire java.util package
/**
 * Remember that there are 6 fundamental data structures:
 * 1. indexed list (list of elements referenced by index position) --> ArrayList, Vector
 * 2. linked list (a collection of elements that each point to the next element) --> LinkedList
 * ArrayLists and LinkedLists have the exact same methods
 * They do not have the exact same time complexity. So do not use them "equivalently"
 * ArrayLists and Vectors have way more in common than ArrayLists and LinkedLists
 * 3. stack (last-in-first-out data structure) --> Stack
 * 4. queue (first-in-first-out data structure) --> Queue>LinkedList, ConcurrentLinkedQueue
 * 5. set (unordered collection with no duplicate elements) --> HashSet, LinkedHashSet
 * 6. dictionary (unordered collection of key-value pairs) --> Hashtable, HashMap, LinkedHashMap, ConcurrentHashMap
 * 
 * This leaves us with a total of 12 data structures, which exhibit different types of iterators
 * Iterator< X > myIterator = C.iterator( ) for some colleciton C
 * iterator: can check for a next element, can return the next element, can remove that element from the underlying
 * collection
 * list iterator (way more): iterator abilities + can check for a previous, can return the previous, can add an
 * element to the underlying collection, can change an element at the current cursor position
 * enumeration (worse): can only check for a next element and return the next element. No ability to remove elements from
 * the underlying collection, and the method names are longer than they'd be for an iterator
 * 
 * 12 data structures:
 * 1. ArrayList --> iterator, list iterator --> list.iterator( ), list.listIterator( )
 * 2. Vector --> iterator, list iterator, enumeration --> vector.iterator( ), vector.listIterator( ), vector.elements( )
 * 3. LinkedList --> iterator, list iterator
 * 4. Stack --> iterator, list iterator, enumeration
 * 5. Queue>LinkedList --> iterator
 * 6. ConcurrentLinkedQueue --> iterator
 * 7. HashSet --> iterator
 * 8. LinkedHashSet --> iterator
 * 9. Hashtable --> iterator on the keys, iterator on the values, and an enumeration on the hashtable which would parse
 * through the VALUES
 * 10. HashMap --> iterator on the keys, iterator on the values
 * 11. LinkedHashMap --> iterator on the keys, iterator on the values
 * 12. ConcurrentHashMap --> iterator on keys, iterator on values, and enumeration on dictionary ("iterating" on values)
 */
public class PersonTester
{
    public static int t = 400;
    private static final double f = 5;
    
    public static void main( String args [ ] )
    {
        Person a = new Person( 15 );
        
        a.throwException( );
        System.out.println( "cat" );
        
        a.haveBirthday( );
        
        try
        {
            System.out.println( "uncomment and try some exception handling examples" );
            //a.throwException( );
        }
        catch( ArrayIndexOutOfBoundsException F )
        {
            System.out.println( "I wouldn't recommend that..." );
        }
        finally
        {
            System.out.println( "always get this" );
        }
        
        
        System.out.println( "dog" );
        
        Person b = new Person( "Julia" , 19 );
        Person c = new Person( "George" , 33 );
        Person d = new Person( "Tony" , 15 );
        Person e = new Person( "Ned" , 12 );
        
        LinkedList< Person > myLinks = new LinkedList< Person >( );
        
        Person [ ] people = { b , c , d , e };
        
        for( Person u : people )
        {
            myLinks.add( u );
        }
        
        for( int u = 0 ; true ; u += 1 ) //the u above is simply a loop variable...doesn't affect int u
        {
            if( u == myLinks.size( ) )
            {
                break;
            }
            
            System.out.println( myLinks.get( u ) );
        }
        
        System.out.println( "let's sort and then use an iterator or list iterator to see the results" );
        System.out.println( "of the sorted list" );
        
        Collections.sort( myLinks ); //We discussed implementations of bubble, selection, and insertion sort
        //But Java has its own sort method with much better time-complexity
        //The only thing you need to do is define the ORDERING --> compareTo( ) method
        
        ListIterator< Person > personParse = myLinks.listIterator( );
        
        while( personParse.hasNext( ) )
        {
            System.out.println( ( personParse.next( ) ).getName( ) );
        }
        
        System.out.println( t > 400 );
        System.out.println( PersonTester.t >= 400 );
        
        System.out.println( PersonTester.f + 2 );
        
        //f = 8.8; --> compile-time error
        
        /*
         * For a CLASS VARIABLE x which is private, you can only call x or C.x in that class
         * if it's protected, you can call x or C.x in that class OR C.x in any subclass
         * if it's public, you can call x or C.x in that class OR C.x in any other class
         */
        
        System.out.println( "We're studying the Collections class now. We've already seen" );
        System.out.println( "Collections.sort(x), now let's do Collections.fill(x,y)" );
        
        Person z;
        z = new Person( "Zoe" );
        
        Collections.fill( myLinks , z );
        
        int zoe = 0;
        
        for( Person s : myLinks )
        {
            if( s.getName().equals( "Zoe" ) )
            {
                zoe += 1;
            }
        }
        
        System.out.println( zoe == myLinks.size( ) ); //4
        System.out.println( ( myLinks.get(2) ).getAge( ) ); //26, find the constructor that accepts a String
        
        Vector< Person > potato = new Vector< Person >( );
        Person p1 = new Person( "Scott" , 32 ) , p2 = new Person( "Yolanda" , 29 );
        Person p3, p4;
        p3 = new Person( 10 );
        p4 = new Person( p1.getAge( ) - 1 );
        
        potato.add( p1 );
        potato.add( p2 );
        potato.add( p3 );
        potato.add( p4 );
        
        System.out.println( ( Collections.max( potato ) ).getName( ) + " is so old!" );
        
        Collections.swap( potato , 1 , 2 );
        
        Enumeration< Person > K = potato.elements( );
        
        for( int g = 0 ; K.hasMoreElements( ) ; g+= 1 )
        {
            System.out.println( ( K.nextElement( ) ).getAge( ) );
        }
        
        ArrayList< String > a1 = new ArrayList< String >( );
        ArrayList< String > a2 = new ArrayList< String >( );
        a1.add( "apple" );
        a1.add( "orange" );
        a1.add( "cactus" );
        a2.add( "cactus" );
        a2.add( "tree" );
        a2.add( "leaf" );
        
        boolean b1 = ! ("tree".indexOf( "e" ) == 2 );
        boolean b2 = Collections.disjoint( a1, a2 );
        
        System.out.println( b1 == b2 ); //true
    }
}
