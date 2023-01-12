import java.util.*;
/**
 * Write a description of class Sets here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 * Reviewed: file I/O, queues, sets, maps, iterators
 * 
 * Remaining:
 * numeric types
 * Collections and Arrays classes
 * matrices (2D arrays, operations: transpose, inverse, sum/difference of two matrices)
 *      --> exception-handling
 * pass by value
 * binary search trees
 * setting up a Github account (merge, push, pull / request, branch, cloning, repository)
 * priority queues
 * final lesson: screen swap
 */
public class Sets
{
    public static void main( String args [ ] )
    {
        LinkedHashSet< String > mySet = new LinkedHashSet< String >( );
        
        System.out.println( mySet.isEmpty( ) || mySet.contains("cat") );
        int g = 0;
        
        for( String u = "under" ; u.length( ) < 8 ; u += "s" )
        {
            g += 1;
            mySet.add( "dog" );
            mySet.add( "pizza" );
            mySet.add( Integer.toString( mySet.size() * 100 ) );
        }
        
        System.out.println(g); //3
        System.out.println( mySet.size() ); //1
        
        mySet.remove( "sunshine" );
        System.out.println( mySet );
        
        String b = "[";
        int h = 0;
        for( String v : mySet )
        {
            if( h < mySet.size() - 1 )
            {
                b += v + ", ";
                h += 1;
            }
            else
            {
                b += v.concat( "]" );
                
            }
        }
        //b = b.substring( 0 , b.length() - 2 ) + "]";
        System.out.println(b);
        
        
        for( String u : mySet )
        {
            System.out.println(u); //this prints the unique elements on different lines
        }
        
        /*
         * 4 types of dictionaries:
         * 1. hashmap
         * 2. hashtable --> gets an enumeration
         * 3. linkedhashmap
         * 4. concurrenthashmap --> gets an enumeration. Belongs to java.util.concurrent
         */
        
        Hashtable< String , String > x = new Hashtable< String , String >( );
        x.put( "San Francisco", "California" );
        x.put( "San Jose", "California" );
        x.put( "Phoenix" ,"Arizona" );
        x.put( "Boston" ,"Massachusetts" );
        x.put( "San Diego" , x.get( "San Francisco" ) );
        
        System.out.println( x.get( "Phoenix" ) );
        System.out.println( (x.get("San "+ "Diego")).toUpperCase() ); //CALIFORNIA
        
        System.out.println( x.containsValue( "Phoenix" ) ); //false
        
        Enumeration< String > y = x.elements( );
        //you can do this with a hastable or a concurrent hash map
        //you cannot produce an enumeration on a hashmap or a linked hash map
        //you would produce an iteraotr on the keys or an iterator on the values
        //but of course you can also do these things with a hashtable or CHM
        
        while( y.hasMoreElements( ) )
        {
            System.out.println( y.nextElement( ) );
        }
        
        Iterator< String > z = (x.values()).iterator( );
        System.out.println("**************");
        
        while( z.hasNext() )
        {
            System.out.println( z.next() );
        }
        
        System.out.println("*************");
        
        Iterator< String > w = (x.keySet()).iterator();
        
        while( w.hasNext() )
        {
            System.out.println( x.get( w.next() ) );
        }
        
        /*
         * Conc
         */
    }
}
