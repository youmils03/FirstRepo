import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.ListIterator;
/**
 * This lesson: reviewed Comparable interface / sorting
 * This lesson: investigation --> static array of dynamic arrays
 * This lesson: reviewed the Arrays class
 * This lesson: reviewed the Collections class
 * 
 * Lessons ahead:
 * 1. memory in Java, how data is stored --> numeric data types (Integer, Double, Long, Short, Float)
 * 2. pass by value, phenomenon
 * 3. priority queues
 * 4. trees --> binary search trees, how they're implemented (STRONG understanding of recursion)
 * 5. final lesson just for review, questions, and challenges/examples
 * 
 * 1. --> simple module import, then call M.f()
 * import math
 * print( math.sqrt(16) )
 * 2. --> function import from a module, then call f()
 * from math import sqrt
 * print( sqrt(16) )
 * 3. --> function import from a module and rename to g, then call g()
 * from math import sqrt as f
 * print( f(16) )
 * 4. --> module import and rename to N, N.f()
 * import math as pizza
 * print( pizza.sqrt(16) )
 */
public class CollectionsReview
{
    public static void main( String args [ ] )
    {
        Double a = new Double(3.2);
        Double b = new Double(3.7);
        Double c = new Double(1.9);
        Double d = new Double(10.0);
        Double e = new Double(3.0);
        
        Double [ ] myDoubleObjects = { a , b , c , d , e };
        
        Arrays.sort( myDoubleObjects );
        
        System.out.println( ( myDoubleObjects[0] ).doubleValue( ) ); //1.9
        //For a Double d which wraps/objectifies/represents a primitive floating point number f,
        //d.doubleValue() yields f
        
        int t = (int)( myDoubleObjects[4].doubleValue() );
        //t: takes the object representing 10.0, turns it first into the primitive 10.0, then
        //casts the primitive to an int
        System.out.println( t ); //10
        
        Arrays.fill(myDoubleObjects,new Double(0.5));
        
        System.out.println( myDoubleObjects[3] ); //0.5
        
        int [ ] myArray = {4,1,4,5};
        int [ ] yourArray = {4,1,4};
        System.out.println( Arrays.equals( myArray , yourArray ) ); //false
        
        boolean [ ] b1 = {false,false,true,true,false};
        boolean b2 [ ] = Arrays.copyOf( b1 , 10 );
        System.out.println( b2[1] ); //false
        System.out.println( b2[0] == b2[8] ); //true (false==false)
        
        ArrayList< Food > myFoods = new ArrayList< Food >( );
        myFoods.add( new Food( "soup" , 180 ) );
        myFoods.add( new Food( "broccoli" , 50 ) );
        myFoods.add( new Food( "milkshake" , 600 ) );
        myFoods.add( new Food( ) ); // "pizza" , 400
        myFoods.add( new Food( "pasta" ) ); //"pasta" , 250
        
        Collections.sort( myFoods );
        
        ListIterator< Food > foodParse = myFoods.listIterator( );
        
        while( foodParse.hasNext( ) )
        {
            System.out.println( (foodParse.next()).getItem( ) );  //
            foodParse.remove( );
        }
        
        System.out.println( myFoods.size( ) > 0 ); //false
        
        /*
         * enumeration: can check for next, can return next
         * iterator: can ALSO remove elements
         * list iterator: can ALSo check for previous, return previous, can ALSO add/change elements
         * in the underlying collection. Much more powerful than an iterator, which is slightly
         * more powerful than an enumeration
         */
        
        Collections.swap( myFoods , 2, 4 );
        System.out.println( (myFoods.get(4)).getItem( ) ); //pasta
        
        Collections.shuffle(myFoods);
        System.out.println( (myFoods.get(0)).getItem( ) ); //?
        
        /*
         * Collections.disjoint(x,y) : returns true if and only if you would pool the elements of
         * x and y together and find NO duplicates (i.e. they have NOTHING in common)
         * 
         */
        
        ArrayList< Double > myList = new ArrayList< Double >( );
        myList.add( 3.2 );
        myList.add( 4.3 );
        myList.add( 5.4 );
        
        Collections.reverse( myList );
        
        System.out.println( myList.get(0).doubleValue( ) < myList.get(1).doubleValue( ) ); //false
        
        /*
         * Collections.replaceAll(x,y,z)
         * overview of this lesson and figure out the remaining lessons
         */
        
        boolean s = Collections.replaceAll(myList,5.5,7.7); //false, no replacements were made
        System.out.println( !s ); //true
        
        boolean sky = Collections.replaceAll(myList,3.2,5.4); //made a replacement --> true
        boolean plane =Collections.replaceAll(myList,4.3,5.4); //true
        System.out.println( sky&&plane ); //true&&true==true
    }
}
