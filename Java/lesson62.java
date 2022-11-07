import java.util.Vector;
import java.util.Enumeration;

public class Lesson62
{
      public static void main( String args [ ] )
      {
            Vector< String > animals;
            animals = new Vector< String >( );
        
            animals.add( "snake" );
            animals.add( "zebra" );
            animals.add( "lion" );
            animals.add( "dog" );
            animals.add( "horse" );
        
            Enumeration< String > animalParse; //can be used by Vectors but not by ArrayLists or LinkedLists
            animalParse = animals.elements( ); //instantiate the enumeration
        
            while( animalParse.hasMoreElements( ) )
            {
                  System.out.println( ( animalParse.nextElement( ) ).toUpperCase( ) );
                  //no remove functionality for an enumeration
            }
        
            System.out.println( animals.isEmpty( ) ); //false
            System.out.println( animals.contains( "lion" ) ); //true
            System.out.println( animals ); //invoke the toString( ) method of the Vector class
      }
}
