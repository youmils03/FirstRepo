import java.util.Stack;
import java.util.ListIterator;

public class Lesson72
{
      public static void main( String args [ ] )
      {
            Stack< String > S;
            S = new Stack< String >( );
        
            S.push( "fish" );
            S.push( "whale" );
            S.push( "shark" );
            S.push( "dolphin" );
            S.push( "pearl" );
        
            System.out.println( S.empty() ); //from Stack
            System.out.println( S.isEmpty() ); //from Vector, the superclass
        
            System.out.println( (double)(S.size() * 2) ); //10.0
        
            ListIterator< String > T = S.listIterator( );
        
            /*
            * Be careful with iterating on stacks
            * They are actually positioned to run from the BOTTOM to the TOP of the stack (counter-intuitive)
            * To iterate through a stack, I recommend using a list iterator to traverse it backwards
            * That would be equivalent to removing elements from the top of the stack, top to bottom
            */
            while( T.hasNext() );
            {
                System.out.println( "Still gotta scoot towards the end, not there yet..." );
                T.next();
            }
        
            while( T.hasPrevious() )
            {
                  System.out.println( T.previous() );
                  T.remove(); //like traditional iterators, list iterators can also remove elements
            }
        
            System.out.println( S.size() == 0 ); //true
            System.out.println( S.contains("dolphin") ); //false, was removed by the list iterator on line 39
      }
}
