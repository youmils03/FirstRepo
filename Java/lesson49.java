//this class introduces functionality for linked lists, keeping it to more "primitive" types (integers, strings)
//for use in an object-oriented environment, as was discussed heavily from lessons 22-42, refer to the next lesson (50)

import java.util.LinkedList;

public class Lesson49
{
    public static void main( String args[] )
    {
        LinkedList< String > linkedWords = new LinkedList< String >();
        linkedWords.add( "snake" );
        linkedWords.add( "zebra" );
        linkedWords.add( "unicorn" );
        linkedWorks.add( "rhino" );
        linkedWords.add( "jackal" );
        linkedWords.add( "unicorn" );
      
        System.out.println( linkedWords.contains( "zebra" ) );
        System.out.println( linkedWords.contains( "JACKAL" ) ); //false, case-sensitive
      
        System.out.println( ! linkedWords.isEmpty( ) ); //true, size()>0
        System.out.println( ( linkedWords.getLast() ).substring(3) ); //corn
      
        System.out.println( linkedWords.lastIndexOf( "unicorn" ) ); //5
        System.out.println( linkedWords.lastIndexOf( "leo" + "pard" ) ); //-1, leopard is not in the linked list
      
        System.out.println( linkedWords.remove( "snake" ) ); //true, as snake is removed as a result of this function
        System.out.println( linkedWords.remove( "water" ) ); //false, water was never in the list so wasn't removed
      
        for( String u : linkedWords )
        {
            System.out.println( "Next word: " + u.toUpperCase() );
        }
      
        linkedWords.clear( ); //clears all elements
        System.out.println( "tree".indexOf( "t" ) == linkedWords.size() * 10 )  // true, 0 == 0*10
    }
}
