import java.util.*;
/**
 * Write a description of class June2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class June2
{
    public static void main( String args [ ] )
    {
        Vector< Integer > myList = new Vector< Integer >( );
        
        myList.add( 5 );
        myList.add( 3 );
        myList.add( 6 );
        myList.add( 1 );
        myList.add( 0 );
        
        Collections.sort( myList );
        
        Enumeration< Integer > listParse = myList.elements( );
        
        for( int y = 0 ; listParse.hasMoreElements( ) || false ; y+= 1 )
        {
            System.out.println( listParse.nextElement( ) );
        }
        
        ArrayList< Car > myCars = new ArrayList< Car >( );
        
        Car a = new Car( "yellow" , 13000 );
        Car b = new Car( "red" , 9000 );
        Car c = new Car( "green" , 8000 );
        Car d;
        d = new Car( "black" , 12000 );
        
        Car [ ] myArray = { a , b , c , d };
        
        for( Car e : myArray )
        {
            myCars.add( e );
        }
        
        Collections.sort( myCars );
        
        for( int r = 0 ; r < myCars.size( ) ; r = r + 1 )
        {
            System.out.println( myCars.get( r ) );
        }
        
        System.out.println( ( Collections.min( myCars ) ).getPrice( ) < 10000 );
        
        ArrayList< String > myWords = new ArrayList< String >( );
        myWords.add( "pizza" );
        myWords.add( "cookie" );
        myWords.add( "egg" );
        myWords.add( "banana" );
        myWords.add( "soup" );
        
        Collections.sort( myWords );
        
        Iterator< String > wordParse = myWords.iterator( );
        
        while( false || wordParse.hasNext( ) )
        {
            System.out.println( ( wordParse.next( ) ).toUpperCase( ) );
        }
        
        System.out.println( (Collections.min( myWords ) ).substring(0,1) ); //b
        
        Collections.fill( myWords , "potato" );
        int potatoes = 0;
        
        for( int s = 0 ; s < myWords.size( ) ; s += 1 )
        {
            if( "potato".equals( myWords.get( s ) ) )
            {
                potatoes += 1;
            }
        }
        
        System.out.println( potatoes ); //5
        System.out.println( potatoes == myWords.size( ) ); // true
        
        Vector< Integer > myNums = new Vector< Integer >( );
        myNums.add( 4 );
        myNums.add( 10 );
        myNums.add( 8 );
        myNums.add( 0 );
        myNums.add( 2 );
        
        Collections.shuffle( myNums );
        
        int r = 0;
        
        while( r < myNums.size( ) )
        {
            System.out.println( myNums.get( r ) );
            r += 1;
        }
        
        ArrayList< String > myStrings = new ArrayList< String >( );
        myStrings.add( "table" );
        myStrings.add( "apple" );
        myStrings.add( 0 , "book" );
        
        try //Collections.swap( myList , x , x ) really would have no effect
        {   
            Collections.swap( myStrings , 2 , 2 );
        }
        catch( IndexOutOfBoundsException I )
        {
            System.out.println( "You need both index positions to be at least 0 and less than the size of the list" );
        }
        
        for( String s : myStrings )
        {
            System.out.println( s );
        }
        
        Vector< String > V = new Vector< String >( );
        V.add( "apple" );
        V.add( "cookie" );
        V.add( "apple" );
        V.add( "orange" );
        V.add( "potato" );
        boolean f = Collections.replaceAll( V , "apple" , "chocolate" ); //true
        
        for( int s = 0 ; f && s < V.size( ) ; s += 1 )
        {
            System.out.println( V.get(s) );
        }
        
        boolean g = Collections.replaceAll( V , "car" , "truck" );
        System.out.println( g ); //false
        
        Car c1 = new Car( );
        Car c2 = new Car( 5000 );
        Car c3 = new Car( "purple" );
        Car c4 = new Car( "black" , 8000 );
        
        Car [ ] carLot = { c1 , c2 , c3 , c4 };
        Vector< Car > carVector = new Vector< Car >( );
        
        for( Car w : carLot )
        {
            carVector.add( w );
        }
        
        Collections.reverse( carVector );
        
        for( int u = 0 ; u < carVector.size( ) ; u += 1 )
        {
            System.out.println( carVector.get( u ) );
        }
    }
    
    /**
     * This method accepts an ArrayList of strings and two index positions and swaps the elements at those
     * two index positions
     * 
     * @param x the ArrayList of Strings
     * @param y the first index position to swap
     * @param z the second index position to swap
     * @throws IndexOutOfBoundsException thrown if either of the index positions are invalid
     */
    public static void swapElements( ArrayList< String > x , int y , int z )
    {
        if( y<0 || z<0 || y >= x.size( ) || z >= x.size( ) )
        {
            throw new IndexOutOfBoundsException( "Sorry, those are invalid index positions" );
        }
        else
        {
            Collections.swap( x , y , z );
        }
    }
}
