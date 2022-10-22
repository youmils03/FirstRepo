import java.util.Collections;
import java.util.Arrays;
import java.util.Vector;
/**
 * Write a description of class FoodTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FoodTester
{
    public static void main( String args [ ] )
    {
        Food a = new Food( "pizza" , 625 );
        Food b = new Food( "ice cream" , 575 );
        Food c = new Food( "lettuce" , 25 );
        Food d;
        d = new Food( "burger" , 575 );
        Food e = new Food( "brownie" , 200 );
        System.out.println( e.setItem( "milk" ) ); //sun, brownie
        System.out.println( e.getItem( ) ); //milk
        
        Food [ ] market = { a , b , c , d , e };
        
        Arrays.sort( market );
        
        int y = 0;
        
        while( true )
        {
            if( y < market.length )
            {
                System.out.println( ( market[y] ).getItem( ) );
                y++;
            }
            else
            {
                break;
            }
        }
        
        Vector< Integer > firstVector = new Vector< Integer >( );
        Vector< Integer > secondVector = new Vector< Integer >( );
        Vector< Integer > thirdVector = new Vector< Integer >( );
        Vector< Integer > fourthVector = new Vector< Integer >( );
        
        Vector< Integer > [ ] arrayOfVectors = new Vector[4];
        arrayOfVectors[0] = firstVector;
        arrayOfVectors[1] = secondVector;
        arrayOfVectors[2] = thirdVector;
        arrayOfVectors[3] = fourthVector;
        
        for( int z = 0 ; z < arrayOfVectors.length ; z+=1 )
        {
            for( int f = 0 ; f < 5 ; f = f+1 )
            {
                arrayOfVectors[z].add( f+1 );
            }
        }
        
        System.out.println( Arrays.toString( arrayOfVectors ) );
        
        double [ ] rat = new double[15];
        System.out.println( rat[10] ); //0.0
        
        boolean [ ] myArray = new boolean[3];
        System.out.println( myArray[ myArray.length - 1] ); //false
        
        /*
         * You can have an array of vectors
         * But when you initialize, there will be nothing in the index positions of the array
         * Each element will be "null", not even an empty vector
         * You must assign each index position of the array to SOME vector
         * before you can start manipulating that particular vector
         * 
         * This was not the case when we worked previously with primitives
         * Primitives are not objects, but vectors only store objects
         * int --> 0
         * double --> 0.0
         * boolean --> false
         * 
         * 1. Would an array of Strings be an array of empty strings by default, or would it
         * be an array of null objects like we saw with the exception thrown?
         *  --> Strings are OBJECTS. They do NOT default to legitimate empty strings.
         * 2. What if you had an array of Integer objects? Would they be 0, or would they be
         * null objects?
         */
        
        String [ ] myWords = new String[ 3 ];
        System.out.println( myWords[1].length( ) );
    }
}
