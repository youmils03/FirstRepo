import java.util.HashMap;
import java.util.Iterator;

public class Lesson55
{
    public static void main( String args [] )
    {
        HashMap< String , String > cityToState = new HashMap< String , String >( );
        System.out.println( cityToState.size() == 0 && cityToState.isEmpty() ); //true
        
        cityToState.put( "Phoenix" , "Arizona" );
        cityToState.put( "Albuquerque" , "New Mexico" );
        cityToState.put( "Santa Fe" , "New Mexico" );
        cityToState.put( "Las Cruces" , "New Mexico" );
        
        cityToState.put( "San Francisco" , "Oregon" );
        String wrongCity = cityToState.replace( "San Francisco" , "California" );
        System.out.println( "Dummy! San Francisco is not in ".concat( wrongCity ) );
        System.out.println( "San Francisco is actually in " + cityToState.get( "San " + "Francisco" ) );
        
        cityToState.remove( "Phoenix" , "Washington" ); //no effect since Washington was not Phoenix's value
        
        HashMap< String , String > morePairs = new HashMap< String , String >( );
        
        morePairs.put( "Omaha" , "Nebraska" );
        morePairs.put( "Miami" , "Florida" );
        morePairs.put( "Tampa" , morePairs.get( "Miami" ) ); //Tampa and Miami have the same value (state)
        
        cityToState.putAll( morePairs ); //adds all key-value pairs from morePairs into cityToState
        
        Iterator< String > keyParse = ( cityToState.keySet() ).iterator( );
        
        for( int s = 222 ; keyParse.hasNext() ; s -= 8 ) //don't pay attention to s, pay attention to the boolean
        {
            System.out.println( "****************" );
            String currentCity = keyParse.next();
            System.out.println( currentCity + " is in " + cityToState.get( currentCity ) );
        }
        
        System.out.println( cityToState.size() != 0 ); //true
        cityToState.clear();
        System.out.println( cityToState.size() != 0 ); //false
    }
}
