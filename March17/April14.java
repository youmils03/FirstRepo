import java.util.Vector;
import java.util.LinkedList;
import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.Stack;
import java.util.Queue;
import java.util.concurrent.*;
import java.util.NoSuchElementException;
import java.util.LinkedHashSet;
//import java.util.concurrent.ConcurrentLinkedQueue;
/**
 * Write a description of class April14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class April14
{
    public static void main( String args [ ] )
    {
        /*
         * 6 essential data structures:
         * 1. indexed list --> ArrayList, Vector
         * 2. linked list --> LinkedList
         * 3. stack --> Stack
         * 4. queue --> Queue>LinkedList, ConcurrentLinkedQueue
         * 5. set --> HashSet, LinkedHashSet
         * 
         * array lists: elements are referenced by index positions
         * linked lists: elements have connectors to the next element
         * vector: same thing as an ArrayList, legacy data structure (vector also gets a useless enumeration)
         * stack: last-in-first-out data structure --> push(x), pop(x), peek( )
         * set: can only have unique elements. For any type of element, there's either 0 or 1 of them
         * 
         * can you reference linked lists by index position? yes, but it is horribly inefficient
         * can you add an element to the beginning of an array list? yes, but it is horribly inefficient
         * 
         * 2 different geometries:
         * ArrayLists: great at accessing elements, but they're not great at adding elements or removing elements at beginning
         * LinkedList: great at adding/removing elements from the beginning, but horrible at referencing by index position
         * 
         * iterator: hasNext( ), next( ), remove( ) 
         * Iterators can traverse FORWARDS through a data structure, and they can REMOVE elements in the underlying data structure
         * List iterators: can ALSO traverse backwards, you can ALSO add elemenets and change elements in the underlying data
         * structure
         * enumeration: similar to an iterator, but it's worse for 2 reasons
         * 1. the method names are longer. hasNext( ) --> hasMoreElements( ). next( ) --> nextElement( )
         * 2. no option to remove elements from the underlying data structure (can do with an iterator, list iterator)
         * 
         * For a ArrayList A, you can call A.iterator( ) to create an Iterator or A.listIterator( ) to create a list iterator
         * For a LinkedList L, you can do the same things: L.iterator( ), L.listIterator( )
         * For a vector V, you can ALSo call V.elements( ) to create an enumeration on the vector
         */
        
        Vector< Integer > myList = new Vector< Integer >( );
        myList.add( 7 );
        myList.add( 6 );
        myList.add( 4 );
        int b;
        b = 0;
        
        Enumeration< Integer > parseList = myList.elements( );
        
        while( parseList.hasMoreElements( ) )
        {
            int q = parseList.nextElement( );
            if( q % 2 == 0 )
            {
                b += q;
            }
        }
        
        b += myList.size( );
        System.out.println( b );
        
        for( int r = 0 ; r < myList.size( ) || false ; r = r + 1 )
        {
            if( !( myList.get(r) % 2 == 0 ) )
            {
                myList.remove( r ); //[7,6,4] --> [6,4] --> r is incremented to 1
                //fix: r -= 1;
            }
        }
        
        System.out.println( myList.get(1) );
        System.out.println( "linked list / list iterator example" );
        
        LinkedList< String > nodes = new LinkedList< String >( );
        nodes.add( "apple" );
        nodes.add( "banana" );
        nodes.add( "carrot" );
        nodes.add( "dog" );
        
        ListIterator< String > bothWays = nodes.listIterator( );
        
        while( bothWays.hasNext( ) )
        {
            bothWays.next( );
        }
        bothWays.add( "f" ); //here, the list iterator is used to add an element to the END of the underlying linked list
        int s = 0;
        while( bothWays.hasPrevious( ) )
        {
            System.out.println( (bothWays.previous( ) ).length( ) );
            //What would be printed by these System.out.printlns?
            s += 1;
        }
        System.out.println( false || s == nodes.size() );
        int z = 0;
        
        for( String j : nodes )
        {
            if( j.indexOf( "r" ) < 0 )
            {
                z = z + 1;
            }
        }
        
        System.out.println( "z = " + z );
        
        /*
         * LinkedList< Person > inALine = new LinkedList< Person > ( ); <--- better using a queue
         * //code to add Person objects to the list
         * ListIterator< Person > peopleParse = inALine.listIterator( );
         * 
         * while( peopleParse.hasNext( ) )
         * {
         *     System.out.println( (peopleParse.next( ) ).getAge( ) ); //getAge( ) is an instance method
         * }
         }
         */
        
        Stack< String > myStack = new Stack< String >( );
        String a = "zebra";
        myStack.push( a );
        myStack.push( "snake" );
        myStack.push( "elephant" );
        myStack.push( myStack.peek( ) );
        
        while( ! myStack.empty( ) ) //empty( ) from Stack, OR isEmpty( ) from the superclass (Vector)
        {
            System.out.println( myStack.pop( ) );
        }
        
        myStack.clear( );
        System.out.println( myStack.size( ) > 0 && true );
        
        System.out.println( "let's practice with a queue" );
        ConcurrentLinkedQueue< String > myQueue = new ConcurrentLinkedQueue< String >( );
        myQueue.offer( "Abby" );
        myQueue.offer( "Scott" );
        myQueue.add( "Tim" );
        myQueue.add( myQueue.poll( ) );
        
        //for a queue Q, Q.add(Q.poll()) takes the first person and sends them to the back
        
        Iterator< String > W = myQueue.iterator( );
        
        while( W.hasNext( ) )
        {
            System.out.println( W.next() );
        }
        
        Queue< Double > key = new LinkedList< Double >( );
        //System.out.println( key.poll( ) );
        //System.out.println( key.remove( ) );
        
        //How do you turn remove( ) into a poll( )
        
        try
        {
            int fork [ ] = { 3 , 2 , 9 , -1 };
            System.out.println( fork[ fork[3] ] );
        }
        catch( ArrayIndexOutOfBoundsException pizza )
        {
            System.out.println( "null" );
        }
        finally //finally runs regardless of whether an exception is thrown.
        { //It's the last code to be run if the code fails, but it still runs if the code passes.
            System.out.println( "goodbye" );
        }
        
        System.out.println( 3+5 );
        
        try
        {
            int array [ ] = {1,2,0};
            System.out.println( array[ array[2] ] ); //1
            System.out.println( 5 / 0 );
            System.out.println( "eerie".substring( 0 ) ); //this does not get printed
        }
        catch( ArrayIndexOutOfBoundsException A )
        {
            System.out.println( 600 - 100 );
        }
        catch( StringIndexOutOfBoundsException E )
        {
            System.out.println( "can't do that" );
        }
        catch( Exception X )
        {
            System.out.println( "bad math" ); //bad math
        }
        finally
        {
            System.out.println( "skateboard" ); //skateboard
        }
        
        System.out.println( "sun" ); //sun
        
        /*
         * To review for next time:
         * exception handling
         * String methods
         * 
         * try code runs as much as it can until there's a problematic statement
         * if called out by an exception, the catch code runs and then the finally code runs and then
         * the code continues
         * if not called out properly by an exception, the finally code runs and then the program crashes
         * if the try block is successful, no catch code runs, it just runs completely and then the
         * finally code runs and then the code continues
         * 
         * you can't have a superclass of a particular exception be caught before that particular exception
         * in other words, a more specific type of exception must come before a more general exception
         */
        
        /*
         * ArrayList< X > myList = new ... ( );
         * LinkedList< X > myList2 = new ... ( );
         * Vector< X > myList3 = new ... ( );
         * Stack< X > myStack = new Stack< X >( );
         * Queue< X > myQueue = new LinkedList< X >( ); queue is an interface, so it cannot be instantiated
         * ConcurrentLinkedQueue< X > myQueue2 = new ConcurrentLinkedQueue< X >( );
         * HashSet< X > mySet = new HashSet< X >( );
         * LinkedHashSet< X > mySet2 = new LinkedHashSet< X >( );
         * 
         * Hashtable< X , Y > myDictionary = new Hashtable< X , Y >( );
         * HashMap< X , Y > myDictionary2 = new HashMap< X , Y >( );
         * ConcurrentHashMap< X , Y > myDictionary3 = new ConcurrentHashMap< X , Y >( );
         * LinkedHashMap< X , Y > myDictionary4 = new LinkedHashMap< X , Y >( );
         */
        
        LinkedHashSet< Integer > uniqueElements = new LinkedHashSet< Integer >( );
        
        for( int t = 0 ; t < 300 ; t += 1 )
        {
            uniqueElements.add( 5 );
        }
        
        System.out.println( uniqueElements.size( ) == 300 ); //false
        System.out.println( uniqueElements.size( ) + "2" ); //12
        
        uniqueElements.remove( 5 + 2 ); //this doesn't throw an exception, it just has no effect
        System.out.println( uniqueElements.contains( 5 ) ); //true
        System.out.println( uniqueElements.isEmpty( ) ); //false
        
        uniqueElements.add( 10 );
        uniqueElements.add( 15 );
        
        Iterator< Integer > setParse;
        setParse = uniqueElements.iterator( );
        
        while( setParse.hasNext( ) )
        {
            System.out.println( setParse.next( ) * 10 ); 
            //just be a little careful with iterators for sets and dictionaries, because these data structures
            //are characteristically "unordered". You might get something like 100, 50, 150
            setParse.remove( );
        }
        
        System.out.println( uniqueElements.size( ) <= 0 || false ); //true
    }
}
