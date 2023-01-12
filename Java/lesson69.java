import java.util.concurrent.ConcurrentHashMap;
import java.util.Enumeration;

public class Lesson69
{
    public static void main( String args [ ] )
    {
        ConcurrentHashMap< String , String > finalDictionary = new ConcurrentHashMap< String , String >( );
        
        finalDictionary.put( "Reno" , "Nevada" );
        finalDictionary.put( "Las Vegas" , finalDictionary.get( "Re" + "no" ) );
        finalDictionary.put( "Sacramento" , "Cali" + "fornia" );
        finalDictionary.put( "Austin" , "Texas" );
        finalDictionary.put( "Savannah" , "Alabama" );
        
        finalDictionary.replace( "Austin" , "Oklahoma" , "New York" ); //no effect
        finalDictionary.replace( "Savannah" , "Alabama" , "Georgia" ); //changes the value associated with Savannah
        
        Enumeration< String > states = finalDictionary.elements( );
        
        while( states.hasMoreElements() ) //can use enumerations on concurrent hash maps or hashtables...
        { //...not hash maps or linked hash maps
              System.out.println( states.nextElement() );
        }
        
        System.out.println( finalDictionary.containsKey( "Austin" ) ); //true
        System.out.println( finalDictionary.containsValue( "Alabama" ) ); //false, was replaced
        System.out.println( finalDictionary.size( ) != 0 ); //true, the enumeration could not remove elements
        finalDictionary.clear();
        System.out.println( finalDictionary.size( ) != 0 ); //false, finalDictionary.size() == 0 now
    }
}
