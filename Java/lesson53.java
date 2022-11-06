import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Iterator;

public class Lesson53
{
     public static void main( String args [ ] )
     {
          //practice applying this functionality not just to Strings/Integers, but to objects of ANY CLASS CREATED
          //consider the principles of toString(), compareTo(), etc.
       
          /*
          * additional review with arraylists and iterators
          */ 
       
          ArrayList< Integer > numbers = new ArrayList< Integer >( );
          numbers.add(3);
          numbers.add(5);
          numbers.add(9);
          numbers.add(3);
          numbers.add(7);
       
          Iterator< Integer > numParse;
          numParse = numbers.iterator();
       
          for( int s = 0 ; numParse.hasNext() || false ; s += 1 )
          {
              if( false )
              {
                  continue; //would end the current iteration of the loop. But obviously this never runs
              }
              int val = (numParse.next()).intValue();
              System.out.println( "Number: " + val );
              if( val == 3 )
              {
                  numParse.remove();
              }
          }
       
          System.out.println( numbers.size() < 5 ); //true, numbers.size() == 3 after removing the 3's
          System.out.println( numbers.size() < 3 ); //false
       
          /*
          * NEW: queue functionality
          */
          Queue< String > wordLine; //a queue is declared in its interface...
          wordLine = new LinkedList< String >( ); //...but instantiated as a linked list
       
          wordLine.offer( "andrew" ); //adding an element to the end of a queue, which is currently empty
          wordLine.offer( "basket" );
          wordLine.offer( "camera" );
          wordLine.offer( "darren" );
          wordLine.add( "eucher" ); //another method for adding an element to the end of the queue
       
          System.out.println( wordLine.element() ); //peeking at the front of the queue without removing it
          System.out.println( wordLine.peek() ); //another way to peek at the front element
       
          System.out.println( wordLine.pop() ); //returns "andrew" a third time, this time removing it
          System.out.println( wordLine.remove() ); //another way to remove the front element, this time "basket"
       
          System.out.println( wordLine.size() == 5 ); //false, two elements have been removed
          System.out.println( wordLine.isEmpty() ); //false, wordLine.size() > 0
          System.out.println( wordLine.contains( "eucher" ) ); //true
          System.out.println( wordLine.contains( "an".concat("drew") ) ); //false, was removed via line 59
       
          wordLine.offer( wordLine.peek() ); //put another "camera" at the end of the queue
          wordLine.offer( "fallen" ); //Queue == [ "camera", "darren", "eucher", "camera" , "fallen" ]
       
          Iterator< String > wordParse = wordLine.iterator( );
       
          if( ! wordParse.hasNext() )
          {
                System.out.println( "uh, already empty. Nothing to iterate through" );
          }
          else
          {
              int originalSize = wordLine.size();
              for( int e = 0 ; e < originalSize ; e += 1 ) //runs just enough times to iterate through all elements
              {
                    System.out.println( ( wordParse.next() ).toUpperCase( ) );
              }
          }
     }
}
