import java.util.*;
/**
 * We understand that the Collections class provides static methods for operating with dynamic arrays 
 * (arraylists, linkedlists, vectors, in some cases the other data structures --> stacks, queues, sets, maps)
 * 
 * Recall that a static array also has index positions, and its elements can be changed, but its size is constant
 * You cannot add or remove elements from a static array
 * 
 * Just as Collections provides methods for working with dynamic arrays, Arrays class provides methods for
 * working with static arrays
 * 1. Arrays.sort(x) --> take array x and use the compareTo method from the corresponding class to sort the elements
 * --> Arrays does not provide min and max, but after sorting you would just use array[0] and array[array.length-1]
 * 2. Arrays.fill(x,y) --> takes array x and fills each index position with whatever y is
 * 3. Arrays.toString(x) --> STATIC method which simply accepts a static array and provides a string [v1, v2, v3, ...]
 * 4. Arrays.equals(x,y) --> accepts two arrays x and y and returns true if they are "equal" (defined in Java API)
 * 5. Arrays.copyOf(x,y) --> accepts an array x and some length y
 * Returns another array where if y == x.length, then the array is identical
 * if y < x.length, then only the first y elements are returned in the new array
 * if y > x.length, then the end of the new array is padded with 0's
 * 
 * Today: talked about Collections and Arrays classes, some important static methods that they provide
 * 1 class from now: numeric data types (Long, Short, Float) --> how memory works in Java
 * 2 classes from now: pass by value
 * 3 classes from now: PriorityQueues
 * 4 classes from now: final review (questions about anything. User input to recursion to inheritance to 
 * iterators to data structures, etc.)
 */
public class ArrayOperations
{
    public static void main( String args []  )
    {
        Car c1 = new Car( "red" , 12000 );
        Car c2 = new Car( "orange" , 11000 );
        Car c3 = new Car( "yellow" , 9000 );
        Car c4 = new Car( "black" , 12500 );
        Car c5 = new Car( "black" , 10000 );
        
        Car [ ] arrayOfCars = { c1 , c2 , c3 , c4 , c5 };
        
        Arrays.sort( arrayOfCars );
        
        for( int e = 0 ; e < arrayOfCars.length ; e += 1 )
        {
            System.out.println( arrayOfCars[e] );
        }
        
        int [ ] myNums = { 5 , 2 , 3 , 9 , 1 };
        Arrays.fill( myNums , myNums[0] % 10 );
        
        int sum = 0;
        
        for( int J : myNums )
        {
            sum += J;
        }
        
        System.out.println( sum );
        
        double [ ] values = { 4.2 , 3 , 1.7 , 1.9 };
        System.out.println( Arrays.toString( values ) );
        
        int [ ] p1 = { 4 , 2 , 3 , 9 , 1 };
        int [ ] p2 = { 4 , 2 , 3 , 1 , 9 };
        System.out.println( Arrays.equals( p1 , p2 ) ); //false
        int [ ] p3 = { 4 , 2 , 3 , 9 };
        System.out.println( Arrays.equals( p1 , p3 ) ); //false
        
        System.out.println( ArrayOperations.equalsFirstN( p1 , p3 , 4 ) );
        
        boolean [ ] b1 = { true , false , false , true };
        boolean b2 [ ] = Arrays.copyOf( b1 , 2 );
        boolean b3 [ ] = Arrays.copyOf( b1 , 6 );
        
        System.out.println( Arrays.toString( b2 ) ); //[true, false]
        System.out.println( Arrays.toString( b3 ) ); //[true, false, false, true, false, false]
        
        boolean b4 [ ] = Arrays.copyOf( b1 , b1.length );
        System.out.println( Arrays.equals( b1 , b4 ) ); //true
    }
    
    /**
     * This method accepts two int arrays and a value of n
     * It returns true if the two arrays have equal  values for the first n spaces within them
     * 
     * @param a1 the first array
     * @param a2 the second array
     * @param n the number of elements to check for equality, starting from index position 0
     * 
     * @return true if the arrays agree for the first n index positions, false otherwise
     * 
     * [[can change the method here to throw an exception]]
     * [[not implemented this way right now, but imagine throwing an exception if n is too large]]
     * @throws IndexOutOfBoundsException if n exceeds the length of either of the two arrays
     */
    public static boolean equalsFirstN( int [ ] a1 , int [ ] a2 , int n )
    {
        if( n > a1.length || n > a2.length )
        {
            if( a1.length < a2.length )
            {
                n = a1.length;
            }
            else
            {
                n = a2.length;
            }
        }
        
        boolean result = true;
        
        for( int j = 0 ; j < n ; j+=1 )
        {
            if( a1[j] != a2[j] )
            {
                result = false;
                break;
            }
        }
        
        return result;
    }
    
    public static Object min( Object [ ] array )
    {
        Arrays.sort( array );
        return array[0];
    }
    
    public static Object max( Object [ ] array )
    {
        Arrays.sort( array );
        return array[ array.length - 1 ];
    }
}
