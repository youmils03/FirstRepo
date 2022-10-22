import java.util.Arrays;
/**
 * We already know that subclasses extend the functionality/methods
 * from a superclass
 * 
 * But you can also have a class WITHIN a class if you want
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AnotherTester
{
    public class SampleClass
    {
        SampleClass( )
        {
            System.out.println( "sup" );
        }
    }
    
    AnotherTester( )
    {
        SampleClass s = new SampleClass( );
    }
    
    /**
     * This method accepts a String and throws an exception if the string
     * is longer than 4 characters
     * 
     * @param e the String whose length is to be checked
     * @throws IllegalArgumentException if the string is longer than 4 characters
     */
    public static void throwException( String e )
    {
        if( e.length() > 4 )
        {
            throw new IllegalArgumentException( "Input is too long!" );
        }
    }
    
    public static void main( String args [ ] )
    {
        AnotherTester a = new AnotherTester( );
        
        System.out.println( f(5) + AnotherTester.f(5) );
        //For static methods M in a class C, you must call C.M if you're outside C
        //If you're inside C, you either call M or C.M
        
        //For instance methods I in a class C, you create an instance of C called R
        //and then must write R.I
        
        String [ ] myWords = { "june" , "summer" , "hot" , "sunshine" };
        String [ ] otherWords = Arrays.copyOf( myWords , myWords.length / 2 );
        System.out.println( otherWords[1].substring(1) );
    }
    
    public static int f( int x )
    {
        return x+3;
    }
    
    public static void mergeSort( int [ ] myArray )
    {
        mergeSort( myArray , 0 , myArray.length - 1 );
    }
    
    public static void mergeSort( int [] a , int L , int R )
    {
        if( L < R )
        {
            int M = L + (R-L)/2;
            
            mergeSort( a , L , M );
            mergeSort( a , M+1 , R );
            
            merge( a , L , M , R );
        }
    }
    
    public static void merge( int [ ] a , int L , int M , int R )
    {
        System.out.println( "The first value that k will take is " + L );
        int n1 = M - L + 1; //size of a subarray
        int n2 = R - M;
        
        int [ ] LArray = new int[ n1 ];
        int [ ] RArray = new int[ n2 ];
        
        for( int u = 0 ; u < n1 ; u+=1 )
        {
            LArray[u] = a[L+u];
        }
        for( int v = 0 ; v < n2 ; v+=1 )
        {
            RArray[v] = a[M+1+v];
        }
        
        int i = 0 , j = 0;
        
        int k = L;
        
        while( i < n1 && j < n2 )
        {
            if( LArray[i] <= RArray[j] )
            {
                a[k] = LArray[i];
                i = i+1;
            }
            else
            {
                a[k] = RArray[j];
                j = j+1;
            }
            k += 1;
        }
        
        while( i < n1 )
        {
            a[k] = LArray[i];
            System.out.println( "i = " + i + ", k = " + k );
            i = i+1;
            k = k+1;
            
        }
        
        while( j < n2 )
        {
            a[k] = RArray[j];
            System.out.println( "j = " + j + ", k = " + k );
            j = j+1;
            k = k+1;
        }
        
    }
    
    public static void mergeSortTester( )
    {
        int [ ] myVals = { 6 , 2 , 9 , 0 , 8 , 1 , 7 , 5, 3, 4 };
        
        System.out.println( "Before sort: " + Arrays.toString(myVals) );
        
        mergeSort( myVals );
        
        System.out.println( "After sort: " + Arrays.toString(myVals) );
    }
}
