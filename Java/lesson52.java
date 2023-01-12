import java.util.LinkedList;
import java.util.Stack;
import java.util.Iterator;

public class Lesson52
{
     public static void main( String args [ ] )
     {
          //practice applying this functionality not just to Strings/Integers, but to objects of ANY CLASS CREATED
          //consider the principles of toString(), compareTo(), etc.
       
          /*
          * additional review with linked lists and iterators
          */ 
       
          LinkedList< Double > floaters = new LinkedList< Double >( );
          floaters.add( 3.1 );
          floaters.add( 64.4 );
          floaters.add( -1.2 );
          floaters.add( floaters.size() ); // [3.1, 64.4, -1.2, 3.0]
          floaters.add( floaters.getFirst() ); // [3.1, 64.4, -1.2, 3.0, 3.1]
          floaters.add(0,5.99); //[5.99, 3.1, 64.4, -1.2, 3.0, 3.1]
       
          Collections.sort( floaters ); //sorts the Doubles according to Double's compareTo() method
          //[-1.2,3.0,3.1,3.1,5.99,64.4]
       
          Iterator< Double > parser; //declare an iterator on the newly sorted linked list
          parser = floaters.iterator( ); //initialize an iterator
       
          int w = 0, oldSize = floaters.size( );
       
          while( parser.hasNext() )
          {
                System.out.println( "Integer value: " + (int)( (parser.next()).doubleValue() ) ); //[-1,3,3,3,5,64]
                parser.remove(); //"optional" operation available to iterators: remove from the underlying collection
                w += 1;
          }
       
          System.out.println( w != oldSize ); //false, w == oldSize == 6
          System.out.println( floaters.size() != oldSize ); //true, floaters.size() == 0 and oldSize == 6
          System.out.println( true && floaters.isEmpty() ); //true
       
          /*
          * NEW: stack functionality
          */
          Stack< String > wordStack = new Stack< String >( ); //or Stack<Person>, Stack<X>, Stack<Integer>, etc.
          String firstAdd = wordStack.push( "plate" );
          System.out.println( "Just added " + firstAdd + " to the stack by invoking stack.pop(x)" );
       
          wordStack.push( "elephant" );
          wordStack.push( "tennis" );
          wordStack.push( "line" );
          wordStack.push( "services" );
       
          System.out.println( wordStack.peek( ) ); //services, returns the top of the stack without removing it
          System.out.println( wordStack.size( ) ); //still has 5 elements
          System.out.println( wordStack.pop() ); //services, which is now being removed from the stack
          System.out.println( wordStack.size( ) < 5 ); //true, wordStack.size() == 4 now
          System.out.println( wordStack.peek( ) ); //line is now at the top of the stack. Returned, not removed
       
          System.out.println( wordStack.empty() ); //option 1 for checking emptiness of a stack
          System.out.println( wordStack.isEmpty() ); //option 2 for checking emptiness, inherited from superclass
       
          System.out.println( wordStack.search( "elephant" ) ); //3rd down from the top, currently
          
          double q = wordStack.search( "dog" ); //-1.0, not in the stack
          System.out.println( q * q ); //1.0
        
     }
}
