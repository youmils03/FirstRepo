import java.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Enumeration;
/**
 * Java:
 * 1. printing statements / comments
 * 2. arithmetic expressions (addition, subtraction, floor division)
 * 3. variables, declaring/initializing, multiple variable declaration
 * 4. rounding, implicit casting, String methods, int-->double-->String
 * 5. boolean variables and expressions, true||false==true, true&&false==false
 * 6. if/elseif/else architecture
 * 7. switch/case statement (int and char) --> simple variable OR expression
 * 8. while loops
 * 9. for loops
 * 10. 1-D arrays, escape sequences, char data type, 2-D arrays, for-each loop
 * 11. Scanner class (user input)
 * 12. Math class (detailed mathematical operations)
 * 13. static methods, void methods, overloaded methods, inputs
 * 14. object-oriented programming (instance variables, constructors, getters,
 * setters, toString(), default constructors, this keyword)
 * 15. inheritance (subclasses and superclasses, polymorphism)
 * 16. abstraction (abstract classes and interfaces)
 * 17. recursion, Javadocs
 * 18. instanceof keyword
 * 19. sorting algorithms: bubble, insertion, selection
 * 20. searching algorithms: linear, binary
 * 21. file I/O
 * 22. do-while loops
 * 23. threading (2 approaches, 2 techniques)
 * 24. LinkedLists
 * 25. stacks
 * 26. queues
 * 27. iterators
 * 28. list iterators
 * 29. enumerations
 * 30. 2 types of sets
 * 31.4 types of maps (2 have enumerations, 2 don't): Hashtable, ConcurrentHashMap
 * *
 * *3 ways to retrieve values from a hashtable or concurrenthashmap:
 * *1. iterator on the keys --> myDictionary.get( keyParse.next() )
 * *2. iterator on the values --> valueParse.next( )
 * *3. enumeration on the dictionary --> ( myDictionary.elements() ).nextElement()
 * *
 * 32. Collections and Arrays classes
 * 33. 2D matrices (transpose, sum/difference, determinant)
 * 
 * Last 5 lessons:
 * 1. pass-by-value (tonight)
 * 2. binary search trees
 * 3. Git / version control (software engineering career)
 * 4. priority queues
 * 5. screenswap (Leetcode, coding challenges)
 * 
 */
public class Review
{
    private String variable; //private instance variable
    
    Review( String p )
    {
        this.variable = p;
    }
    
    public void solutionOne( )
    {
        this.variable += "s";
    }
    
    public static String solutionTwo( String u )
    {
        return u + "s"; 
    }
    
    public static void solutionThree( String [ ] x )
    {
        x[0] += "s";
    }
    
    public static void main( String args [ ] )
    {
        String d = "dog";
        Review.plural(d);
        System.out.println(d); //yields a counter-intuitive result
        
        Review e = new Review( d );
        e.solutionOne( );
        System.out.println( e.variable ); //dogs
        
        System.out.println( solutionTwo( d ) ); //dogs
         
        String [ ] pizza = { d , d , d , d };
        Review.solutionThree( pizza );
        System.out.println( pizza[0] );
        
        System.out.println( e instanceof Review );
        System.out.println( e instanceof Object );
        
        ConcurrentHashMap< String , Integer > w;
        w = new ConcurrentHashMap< String , Integer >( );
        
        w.put( "eggs" , 83 );
        w.put( "table" , 72 );
        w.put( "snake" , w.get("eggs") - w.get("table") );
        w.put( "cat" , w.get("snake") );
        
        System.out.println( "Approach 1" );
        
        Iterator< String > wKeys = w.keySet( ).iterator( );
        
        while( wKeys.hasNext() )
        {
            System.out.println( w.get( wKeys.next() ) );
        }
        
        Iterator< Integer > wValues = (w.values()).iterator( );
        
        System.out.println( "Approach 2" );
        
        while( wValues.hasNext() || false )
        {
            System.out.println( wValues.next() );
        }
        
        Enumeration< Integer > wParse = w.elements( );
        
        System.out.println( "Approach 3" );
        
        while( wParse.hasMoreElements() )
        {
            System.out.println( wParse.nextElement( ) );
        }
        
        System.out.println( "Approach 4" );
        
        for( String u : w.keySet() )
        {
            System.out.println( w.get(u) );
        }
        
        System.out.println( "Approach 5" );
        
        for( Integer v : w.values() )
        {
            System.out.println(v);
        }
        
        /*
         * 5 approaches:
         * 1. iterate on the keys, then call the get method
         * 2. iterate on the values, return them
         * 3. enumerate on the dictionary, in turn returns the values
         * 4. loop through the keys, then call the get method
         * 5. loop through the values, return them
         */
    }
    
    public static void plural( String t )
    {
        t += "s";
    }
}
