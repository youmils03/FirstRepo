import java.util.LinkedList;
/**
 * We know that a static array is accessed by index positions and has a fixed
 * number of elements
 * A dynamic array is accessed by index positions and has a variable number of elements
 * 
 * A linked list is a data structure of nodes where each node carries a value and
 * also has a pointer to the next node
 * They are LINKED together
 * 
 * Don't think about elements in a linked list as having index positions
 * Technically they do, but it is not efficient to access elements at index positions
 * of a linked list
 * 
 * We use linked lists for adding and removing elements near the beginning or end
 * of the list; this has much better time complexity than arraylists
 * 
 * In this lesson, we briefly reviewed exception handling and discussed file I/O
 * We also reviewed threading briefly: 2 options
 * We also skimmed the surface of linkedlists
 * 
 * We will have a few examples with linked lists but will primarily be talking about
 * iterators and other types of data strucutres
 * 
 * Other remaining topics for the last few lessons:
 * 1. 2D matrices, static array of dynamic arrays
 * 2. switch statement with char data type instead of int
 * 3. pass by value
 * 4. binary search trees
 */
public class ListExample
{
    public static void main( String [ ] args )
    {
        LinkedList< String > myList = new LinkedList< String >( );
        myList.add( "dog" );
        myList.add( "snake" );
        myList.add( "horse" );
        myList.add( "neptune" );
        
        System.out.println( myList );
    }
}
