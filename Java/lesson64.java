import java.util.Hashtable;
import java.util.Iterator;
import java.util.Enumeration;

public class Lesson64
{
      public static void main( String args [ ] )
      {
          Hashtable< String , Integer > myDictionary = new Hashtabel< String , Integer >( );
          myDictionary.put( "cat" , 100 );
          myDictionary.put( "computer" , 425 );
          myDictionary.put( "plant" , 8 );
          myDictionary.put( "table" , 35 );
        
          Hashtable< String , Integer > yourDictionary = new Hashtable< String , Integer >( );
          yourDictionary.put( "table" , 22 );
          yourDictionary.put( "chair" , 14 );
          yourDictionary.put( "car" , 11000 );
          yourDictionary.put( "dog" , 170 );
        
          myDictionary.putAll( yourDictionary );
        
          System.outprintln( myDictionary.size( ) ); //7 key-value pairs in the dictionary currently
        
          Enumeration< Integer > dictParse = myDictionary.elements( );
        
          while( false || dictParse.hasMoreElements( ) )
          {
                System.out.println( "Price: $".concat( Integer.toString( dictParse.nextElement( ) ) ) );
          }
        
          System.out.println( myDictionary.size( ) ); //unchanged, enumerations cannot remove elements
          //You could have also produced an iterator on the keys, or an iterator on the values
          //Hashtables have an enumeration, but HashMaps as studied in lesson 55 do not
      }
}
