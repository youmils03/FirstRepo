import java.util.LinkedList;
import java.util.ListIterator;

public class Lesson63
{
      public static void main( String args [ ] )
      {
            LinkedList< String > x = new LinkedList< String >( );
            x.add( "January" );
            x.add( "March" );
            x.add( "April" );
            x.add( "May" );
            x.add( "June" );
            x.add( "Jult" );
            x.add( "August" );
        
            ListIterator< String > y = x.listIterator( ); //generate a list iterator on an array list or linked list
        
            int k = 0;
        
            while( y.hasNext( ) )
            {
                  k += 1;
                  y.next( ); //advances the cursor position of the linked list progressively to the end of the list
            }
        
            System.out.println( k == x.size() ); //true, should both be 7
        
            while( y.hasPrevious( ) ) //can iterate BACKWARDS using a list iterator, not with a traditional iterator
            {
                  String currentMonth;
                  currentMonth = y.previous( );
                  if( currentMonth.equalsIgnoreCase( "jult" ) )
                  {
                        y.set( "July" );
                  }
                  if( currentMonth.equals( "March" ) )
                  {
                        y.add( "February" );
                  }
            }
        
            for( String u : x )
            {
                  System.out.println(u); //print the months
            }
      }
}
