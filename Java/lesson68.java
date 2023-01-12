import java.util.LinkedHashMap;
import java.util.Iterator;

public class Lesson68
{
      public static void main( String args [ ] )
      {
            LinkedHashMap< String , String > C = new LinkedHashMap< String , String >();
            //here the keys and values happen to be the same data type, but they certainly don't have to be
            //remember that in all of these data structures, we must pass in Objects (e.g. Strings), not primitives (ints)
            //HashMap and Hashtable are 2 dictionaries already studied. Here's a third (but not even the last one!)
        
            C.put( "Seattle" , "Washington );
            C.put( "Spokane" , C.get("Seattle") ); //now Seattle and Spokane map to the same value which is allowed
            C.put( "Chicago" , "Illinois" );
            C.put( "Roanoke" , "Virginia" );
                  
            LinkedHashMap< String , String > D = new LinkedHashMap< String , String >( );
            D.put( "Boston" , "Massachusetts" );
            D.put( "Eugene" , "Washington" );
            
            C.putAll(D);
            System.out.println( C.size() + D.size() ); //6 key-value pairs + 2 key-value pairs = 8 key-value pairs
                  
            Iterator< String > keyParse = ( C.keySet() ).iterator( );
                  
            while( keyParse.hasNext( ) )
            {
                  String city = keyParse.next( );
                  System.out.println( "Pretty sure that " + city.concat( " is in " + C.get(city) ) );
                  keyParse.remove( );
            }
                  
            System.out.println( D.isEmpty() ); //false, still has elements in it
            System.out.println( C.isEmpty() ); //true, we used the iterator to remove each key-value pair
                  
      }
}
