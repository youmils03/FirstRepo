import java.util.Vector;
import java.util.Iterator;

public class Lesson59
{
      public static void main( String args [ ] )
      {
            Vector< String > dynamicArray = new Vector< String >(); //basically the same thing as an ArrayList
        
            dynamicArray.add( "basketball" );
            dynamicArray.add( "bracket" );
            dynamicArray.add( "billboard" );
            dynamicArray.add( "brisket" );
            dynamicArray.set( 1 , dynamicArray.get(3) ); //["basketball","brisket","billboard","brisket"]
            dynamicArray.remove(3); //["basketball","brisket","billboard"]
            dynamicArray.add( "watermelon" );
            dynamicArray.add( "elephant" );
            dynamicArray.add( 0 , "iguana" ); //a poor operation for an vector (ArrayList)...
        
            Iterator< String > vectorParse;
            vectorParse = dynamicArray.iterator( );
        
            for( int u = 0 ; vectorParse.hasNext() && (true || false) ; u = u+2 )
            {
                  System.out.println( ( vectorParse.next( ) ).toUpperCase() );
                  vectorParse.remove( );
            }
        
            System.out.println( dynamicArray.size() > 0 ); //false
            System.out.println( dynamicArray.isEmpty( ) ); //true
            System.out.println( dynamicArray.contains("brisket") ); //false, doesn't contain anything
            if( dynamicArray.add( "dog" ) && dynamicArray.add( "cat" ) ) //both of these return true
            {
                System.out.println( dynamicArray ); //invoke the toString( ) method of the Vector class
            }
            else
            {
                System.out.println( "this won't run" );
            }
      }
}
