import java.util.*;
/**
 * Write a description of class StackQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StackQueue
{
    public static void main( String args [ ] )
    {
        Queue< Integer > numberLine = new LinkedList< Integer >( );
        
        numberLine.offer(12);
        numberLine.offer(18);
        numberLine.offer(numberLine.peek());
        numberLine.offer(numberLine.size());
        
        Iterator< Integer > parser = numberLine.iterator( );
        
        while( parser.hasNext( ) )
        {
            System.out.println( parser.next( ) / 2 );
            parser.remove( ); //iterators and list iterators allow you to optionally remove elements
            //enumerations do not
        }
        
        System.out.println( numberLine.isEmpty( ) );
        
        System.out.println( numberLine.peek( ) ); //null
        
        /*
         * equivalent to if you did this
         * 
         * try:
         *      System.out.println( numberLine.element( ) );
         * catch NoSuchElementException N:
         *      System.out.println( null );
         * 
         * 
         */
        
        System.out.println( numberLine.poll( ) );
        
        /*
         * equivalent to if you did this
         * 
         * try:
         *      System.out.println( numberLine.remove( ) );
         * catch NoSuchElementException W:
         *      System.out.println( null );
         *      
         */
    }
}
