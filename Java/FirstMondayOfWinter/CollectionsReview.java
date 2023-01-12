import java.util.Collections;
import java.util.Vector;
import java.util.Enumeration;
/**
 * Write a description of class CollectionsReview here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CollectionsReview
{
    public static void main( String args [ ] )
    {
        Vector< String > myVector = new Vector< String >( );
        myVector.add( "pizza" );
        myVector.add( "pasta" );
        myVector.add( "cookies" );
        myVector.add( "ice cream" );
        myVector.add( "banana" );
        
        Enumeration< String > p;
        p = myVector.elements( );
        
        int g = 0;
        
        while( g < myVector.size() || p.hasMoreElements() )
        {
            System.out.println( p.nextElement() );
            g += 1;
        }
        
        System.out.println( p.hasMoreElements() );
        System.out.println( g == myVector.size() );
    }
}
