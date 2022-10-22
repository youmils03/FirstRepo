import java.util.*;
import java.util.concurrent.*;
/**
 * Write a description of class March24 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class March24
{
    /*
     * Every class gets a blank default constructor...by default
     */
    
    private static int myVariable = 4; //global variable that can be accessed anywhere in this class (so by any methods),
    //but not by any other classes because it's private
    
    //global variables require the static keyword if they're not associated with one INSTANCE of a class
    
    public static final String constantClassVariable = "pizza";
    
    public static void main( String [ ] args )
    {
        /*
         * 2 indexed lists:
         * 1. ArrayList
         * 2. Vector
         * 
         * 1 linked list:
         * LinkedList
         * 
         * 1 stack:
         * Stack
         * 
         * 2 queues:
         * 1. Queue interface --> LinkedList
         * 2. ConcurrentLinkedQueue
         * 
         * 2 sets:
         * 1. HashSet
         * 2. LinkedHashSet
         * 
         * 4 dictionaries:
         * 1. HashMap
         * 2. Hashtable (enumeration)
         * 3. ConcurrentHashMap (enumeration)
         * 4. LinkedHashMap
         * 
         * for a hashtable or concurrent hash map, there are 3 ways to iterate on the values
         * 1. iterate on the keys --> myDictionary.get( iterator.next( ) )
         * 2. iterate on the values --> iterator.next( )
         * 3. enumeration on the dictionary --> enumeration.nextElement( )
         */
        
        Car a = new Car( "Mercedes" , 2020 , "black" );
        Car b = new Car( "Ford" , 2005 );
        Car c = new Car( );
        
        System.out.println( a.getYear() ); //2020
        System.out.println( c ); //This is a 2006 red Civic
        
        ConcurrentHashMap< Car , Integer > myDictionary = new ConcurrentHashMap< Car , Integer >( );
        
        System.out.println( March24.myVariable ); //4
        System.out.println( myVariable ); //4
        
        /*
         * We already know
         * 1. variables belonging to a method --> int x = 4; System.out.println(x);
         * 2. instance variables --> For a particular Car c, we could call c.model (as long as we're in the Car class)
         * 
         * We can also have static class variables (otherwise known as global variables)
         * They are defined at the top of a class. They include the keyword static
         * For a particular class C with static variable x, you could call System.out.println(x) or
         * System.out.println( C.x ) in ANY of the methods in the class C
         * 
         * public: accessed by any class
         * private: accessed only by the class in which it is defined
         * protected: accessed only by the class or any of the class's subclasses
         * 
         * final: constant variable, you cannot change it after it is created
         */
        
        final int t = 52;
        System.out.println( constantClassVariable ); //pizza
        System.out.println( March24.constantClassVariable ); //pizza
        
        int x = t + 5;
        x += 1;
        System.out.println( x ); //58
        
        System.out.println( ( Integer.toString(t) ).length( ) ); //2, "52" is a string that's 2 characters long
        
        System.out.println( t + "2" ); //522
        System.out.println( t - Integer.parseInt( "1" + "5" ) ); //37
        
        myDictionary.put( a , 15000 );
        System.out.println( myDictionary.put( a , 17000 ) ); //15000
        System.out.println( myDictionary.get( a ) ); //17000
        
        System.out.println( myDictionary.contains( 15000 ) ); //false
        System.out.println( myDictionary.contains( 15000 + 2000 ) ); //true
        System.out.println( myDictionary.contains(a) ); //false, contains(x) is
        System.out.println( myDictionary.containsKey(a) || false ); //true
        
        myDictionary.put( b , myDictionary.get(a) );
        System.out.println( myDictionary.get(b) ); //17000
        
        myDictionary.replace( c , 20000 );
        System.out.println( myDictionary.size( ) ); //2
        myDictionary.put( c , 26000 );
        System.out.println( myDictionary.size( ) ); //3
        
        System.out.println( true && myDictionary.isEmpty( ) ); //false
        
        Hashtable< Car , Integer > otherDictionary = new Hashtable< Car , Integer >( );
        otherDictionary.put( a , 10000 );
        
        /*
         * For ANY dictionary types A and B, A.putAll(B) takes all the key-value pairs from B and merges them
         * into the A dictionary
         * It seems like you can mix up the dictionary types
         * (e.g. A could be a ConcurrentHashMap, but B is a Hashtable)
         * 
         * Hashtable.putAll( LinkedHashMap )
         * ConcurrentHashMap.putAll( HashMap )
         * it seems like you have the flexibility of merging in a dictionary type that's slightly different from
         * the dictionary type that you're CALLING the putAll method on
         */
        
        myDictionary.putAll( otherDictionary );
        System.out.println( myDictionary.get( a ) ); //10000
        
        LinkedHashMap< Car , Integer > thirdDictionary = new LinkedHashMap< Car , Integer >( );
        thirdDictionary.put( a , 9000 );
        
        myDictionary.putAll( thirdDictionary );
        System.out.println( myDictionary.get( a ) >= 10000 );
        
        thirdDictionary.put( b , 12000 );
        thirdDictionary.put( c , 14000 );
        
        otherDictionary.put( b , 20000 );
        otherDictionary.put( c , 21000 );
        
        System.out.println( "There are 3 ways to iterate through the values in a hashtable or concurrent hash map" );
        System.out.println( "The third way does not work for HashMaps or LinkedHashMaps" );
        
        System.out.println( "Method 1: Iterate on the values with an iterator" );
        System.out.println( "Method 2: Iterate on the keys, myDictionary.get( iterator.next( ) )" );
        System.out.println( "Method 3: Enumerate on the DICTIONARY --> parse through the values" );
        
        Iterator< Integer > methodOne = ( otherDictionary.values( ) ).iterator( );
        
        while( methodOne.hasNext( ) )
        {
            System.out.println( "The price is $" + methodOne.next( ) );
        }
        
        System.out.println( "Now let's iterate on the keys and call the get method to retrieve the values" );
        
        Iterator< Car > methodTwo = ( otherDictionary.keySet( ) ).iterator( );
        
        while( methodTwo.hasNext( ) )
        {
            System.out.println( "This car costs $" + otherDictionary.get( methodTwo.next( ) ) );
        }
        
        System.out.println( "Now let's use an enumeration, even though in reality we probably shouldn't" );
        System.out.println( "Because iterators can remove elements and have improved method names" );
        Enumeration< Integer > methodThree = otherDictionary.elements( );
        
        /*
         * enumeration is worse than an iterator for 2 reasons:
         * 1. longer method names
         * 2. no functionality to remove elements
         */
        
        while( methodThree.hasMoreElements( ) )
        {
            System.out.println( "This car is gonna set me back $" + methodThree.nextElement( ) );
        }
        
        System.out.println( otherDictionary );
        
        /*
         * 4 dictionaries:
         * 1. HashMap
         * 2. Hashtable
         * 3. LinkedHashMap (subclass of HashMap)
         * 4. ConcurrentHashMap
         * 
         * Methods to be familiar with:
         * 1. clear( ): removes all key-value pairs
         * 2. contains(x): same as containsValue(x)
         * 3. containsKey(x): returns true if and only if x is a key
         * 4. containsValue(x): returns true if and only if x is a value
         * 5. elements( ): method called to generate an enumeration
         * --> only works for Hashtable and ConcurrentHashMap, but it's a basically useless operation
         * 6. get(x): returns the value for the key x
         * 7. isEmpty( ): returns true if and only if the dictionary is empty
         * 8. keySet( ): method called before you can iterate on the keys
         * 9. put(x,y): assigns the value y to the key x
         * 10. putAll(x): merges all key-value pairs from x into the dictionary
         * 11. remove(x): removes the key-value pair associated with the key x
         * 12. remove(x,y): removes the key-value pair associated with key x only if the value is currently y
         * 13. replace(x,y): reassigns the key x to the value y, replaces the old value
         * 14. replace(x,y,z): reassigns the key x to the value z only if the value for x is currently y
         * 15. size( ): returns the number of key-value pairs in the dictionary
         * 16. toString( ): " {K=V, K=V, K=V, ... }" for each key K, value V pairing in the dictionary
         * 17. values( ): method called befor eyou can iterate on the values
         */
        
        LinkedHashMap< String , String > lastDictionary = new LinkedHashMap< String , String >( );
        lastDictionary.put( "first name" , "Bobby" );
        lastDictionary.put( "favorite food" , "pizza" );
        lastDictionary.put( "last name" , "Simmons" );
        
        lastDictionary.replace( "first name" , "Christina" );
        System.out.println( ( lastDictionary.get( "first name" ) ).substring( 0 , 5 ) ); //Chris
        lastDictionary.remove( "favorite food" );
        System.out.println( (double)( lastDictionary.size( ) ) ); //2.0
        
        lastDictionary.replace( "last " + "name" , "Johnson" , "Robinson" );
        System.out.println( lastDictionary.get( "last ".concat( "NAME".toLowerCase( ) ) ) ); //Simmons
        lastDictionary.replace( "last name" , "Simmons" , "Williams" );
        System.out.println( ( lastDictionary.get( "last name" ) ).substring( 45-45 ) ); //Williams
        
        lastDictionary.remove( "first name" , "Peter" );
        System.out.println( lastDictionary.size( ) ); //2
        
        System.out.println( March24.isEmpty( lastDictionary ) ); //false
        /*
         * static method: static methods are called on a class
         * You don't HAVE to write the class name if you're in that class
         */
        
        System.out.println( isEmpty( lastDictionary ) ); //equivalent to lastDictionary.isEmpty( ), INSTANCE method
        
        March24 myObject = new March24( );
        System.out.println( myObject.isEmpty( 67 , lastDictionary ) ); //false
        
        lastDictionary.clear( );
        
        Object lastObject = new March24( );
        March24 polymorph = (March24)( lastObject );
        
        System.out.println( polymorph.isEmpty( 91 , lastDictionary ) ); //truee
    }
    
    public static boolean isEmpty( LinkedHashMap< String , String > w )
    {
        return w.size( ) == 0;
    }
    
    public boolean isEmpty( int x , LinkedHashMap< String , String > w )
    {
        return w.isEmpty( );
    }
}
