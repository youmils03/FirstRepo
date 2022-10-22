import java.util.ArrayList; //import java.util.*;
/**
 * 3 types of sorting algorithms:
 * bubble sort
 * insertion sort
 * selection sort
 * 
 * 2 types of searching algorithms:
 * linear search
 * binary search
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarTester
{
    /*
     * We will perform linear search with some property of Car objects (their price)
     * We hope to determine th eindex position of a Car object whose price is equal
     * to some value
     * We will immediatley exit out of the list when we determine the first occurrence
     * of that element
     * 1. found boolean, static array
     * 2. break keyword, dynamic array
     * 
     * 8 different ways 
     * 2 options: found boolean OR break statement
     * 2 options: for loop OR while loop
     * 2 options: static array OR dynamic array
     * >=8 combinations of ways to write the linear search algorithm
     */
    
    public static void binaryExample( )
    {
        Car c1 = new Car( "orange" , 120 , 16000 );
        Car c2 = new Car( "yellow" , 115 , 17000 );
        Car c3 = new Car( "green" , 117 , 19000 );
        Car c4 = new Car( "black" , 117, 21000 );
        Car c5 = new Car( "white" , 118, 22000 );
        Car c6 = new Car( "black" , 110 , 24000 );
        Car c7 = new Car( "yellow" , 130 , 25000 );
        
        Car [ ] garage = {c1,c2,c3,c4,c5,c6,c7};
        
        System.out.println( CarTester.binarySearch( garage , 21000 ) ); //3
    }
    
    /**
     * This method accepts a static array of Car objects and returns the index position
     * of the first occurrence of the Car object in the array whose price matches the
     * target price parameterized
     * @param myCars the collection of Car objects
     * @param targetPrice the price to search for
     * @return the index position of the first occurrence of the Car object with that price
     */
    public static int linearSearch( Car [ ] myCars , int targetPrice )
    {
        boolean found = false;
        
        int result = -1; //default value to return if the price is not found in the array
        
        int indexPosition = 0;
        while( indexPosition < myCars.length && !found )
        {
            if( ( myCars[indexPosition] ).getPrice( ) == targetPrice )
            {
                found = true;
                result = indexPosition;
            }
            indexPosition += 1;
        }
        
        return result;
    }
    
    public static int linearSearch( ArrayList< Car > myCars , int targetPrice )
    {
        int result = -1;
        
        for( int p = 0 ; p < myCars.size( ) ; p += 1 )
        {
            if( ( myCars.get(p) ).getPrice( ) == targetPrice )
            {
                result = p;
                break;
            }
        }
        
        return result;
    }
    
    public static int binarySearch( Car [ ] myCars , int targetPrice )
    {
        return CarTester.binarySearch( myCars , targetPrice , 0 , myCars.length - 1 );
    }
    
    public static int binarySearch( Car [ ] myCars , int targetPrice , int left , int right )
    {
        int indexResult = -1;
        
        while( left <= right )
        {
            int mid = (left + right) / 2; //index position of the "middle" element
            
            if( myCars[mid].getPrice( ) < targetPrice )
            {
                left = mid + 1;
            }
            else if( myCars[mid].getPrice( ) > targetPrice )
            {
                right = mid - 1;
            }
            else
            {
                indexResult = mid;
                break;
            }
        }
        
        return indexResult;
    }
    
    public static void test( )
    {
        Car c1 = new Car( "black" , 23 , 10000 );
        Car c2 = new Car( "orange" , 32 , 15000 );
        Car c3 = c1;
        c1 = c2;
        c2 = c3;
        System.out.println( "c1: " + c1 );
        System.out.println( "c2: " + c2 );
    }
    
    public static void example( )
    {
        Car c1 = new Car( );
        Car c2 = new Car( "green" , 100 , 30000 );
        
        System.out.println( Car.compareTo(c1,c2) );
        System.out.println( c2.compareTo(c1) == Car.compareTo(c2,c1) ); //true
    }
    
    public static ArrayList< Car > selectionSort( ArrayList< Car > unsorted )
    { //A[I]=E, A.set(I,E)
        for( int i = 0 ; i < unsorted.size() ; i += 1 )
        {
            int index = i;
            
            for( int j = i + 1 ; j < unsorted.size() ; j += 1 )
            {
                if( ( unsorted.get(j) ).compareTo( unsorted.get(index) ) < 0 )
                {
                    index = j;
                }
            }
            
            Car smallerCar = unsorted.get(index);
            unsorted.set( index , unsorted.get(i) ); //
            unsorted.set(i,smallerCar);
        }
        
        return unsorted;
    }
    
    /**
     * This method accepts a static array of Car objects and sorts them according to the
     * compareTo( ) method provided by the Car class
     * It uses the selection sort algorithm
     * 
     * @param unsorted the array of Car objects to be sorted
     * @return a sorted version of the input
     */
    public static Car[ ] selectionSort( Car[ ] unsorted )
    {
        for( int i = 0 ; i < unsorted.length ; i += 1 )
        {
            int index = i;
            
            for( int j = i + 1 ; j < unsorted.length ; j += 1 )
            {
                if( ( unsorted[j] ).compareTo( unsorted[index] ) < 0 )
                {
                    index = j;
                }
            }
            
            Car smallerCar = unsorted[index];
            unsorted[index] = unsorted[i];
            unsorted[i] = smallerCar;
        }
        
        return unsorted;
    }
    
    /**
     * This method accepts a dynamic array of Car objects and sorts them according to the
     * compareTo( ) method... uses the insertion sort algorithm
     * 
     * @param unsorted the arraylist of Car objects
     * @return a sorted version of the arraylist
     */
    public static ArrayList< Car > insertionSort( ArrayList< Car > unsorted )
    {
        for( int i = 1 ; i < unsorted.size( ) ; i += 1 )
        {
            Car key = unsorted.get(i);
            
            int j = i-1;
            
            while( j >= 0 && ( unsorted.get(j) ).compareTo( key ) > 0 )
            {
                /*
                 * for an ArrayList A, write A.set(I,E) to assign element E to index position I
                 */
                unsorted.set( j+1 , unsorted.get(j) );  
                j=j-1;
            }
            
            unsorted.set(j+1,key);
        }
        
        return unsorted;
    }
    
    /**
     * This method accepts a static array of Car objects and sorts them according to the
     * compareTo( ) method provided by the Car class
     * It uses the insertion sort algorithm
     * 
     * @param unsorted the array of Car objects to be sorted
     * @return a sorted version of the input
     */
    public static Car[ ] insertionSort( Car [ ] unsorted )
    {
        for( int i = 1 ; i < unsorted.length ; i++ ) //i+=1, i=i+1, i=1+i
        {
            Car key = unsorted[i];
            
            int j = i-1;
            
            while( j >= 0 && ( unsorted[j] ).compareTo( key ) > 0 )
            {
                unsorted[j+1] = unsorted[j];
                j=j-1;
            }
            
            unsorted[j+1] = key;
        }
        
        return unsorted;
    }
    
    /**
     * This method accepts a static array of Car objects and sorts them according to the
     * compareTo( ) method provided by the Car class
     * It uses the bubble sort algorithm
     * 
     * @param unsorted the array of Car objects to be sorted
     * @return a sorted version of the input
     */
    public static Car[ ] bubbleSort( Car[ ] unsorted )
    {
        Car [ ] sortedArray = new Car[ unsorted.length ];
        
        for( int y = 0 ; y < sortedArray.length - 1; y+=1 )
        {
            for( int z = 0 ; z < sortedArray.length - y - 1 ; z += 1 )
            {
                if( ( unsorted[z] ).compareTo( unsorted[z+1] ) > 0 )
                {
                    Car tempCar = unsorted[z];
                    unsorted[z] = unsorted[z+1];
                    unsorted[z+1] = tempCar;
                }
            }
        }
        
        return unsorted; //no longer "unsorted"
    }
    
    public static ArrayList< Car > bubbleSort( ArrayList< Car > unsorted )
    {
        for( int y = 0 ; y < unsorted.size( ) ; y += 1 )
        {
            for( int z = 0 ; z < unsorted.size( ) - y - 1 ; z += 1 )
            {
                if( ( unsorted.get(z) ).compareTo( unsorted.get(z+1) ) > 0 )
                {
                    Car tempCar = unsorted.get(z);
                    unsorted.set(z, unsorted.get(z+1) );
                    unsorted.set(z+1, tempCar);
                }
            }
        }
        
        return unsorted;
    }
    
    public static void main( String args [ ] )
    {
        ArrayList< Car > carLot = new ArrayList< Car >( );
        
        Object c1 = new Car( );
        System.out.println( c1 );
        
        //c1.applyDiscount( );
        
        System.out.println( "SEPARATOR" );

        
        Car c2 = (Car)(c1);
        //c2.printDetails( );
        
        
        Car c3 = new Car( "green" , 88 , 15000 );
        Car c4 = new Car( "orange" , 105 , 13000 );
        Car c5 = new Car( "black" , 91 , 13000 ) , c6 = new Car( "black" , 190 , 14000 );
        Car c7 = new Car( "white" , 200 , 10000 );
        Car c8 = new Car( "gray" , 80 , 25000 );
        
        Car [ ] myCars = { c2 , c3 , c4 , c5, c6, c7, c8 };
        
        for( Car f : myCars )
        {
            carLot.add(f);
        }
        
        //ADD CRITICAL LINE FOR DISCUSSION OF SORTING ALGORITHMS
        carLot = CarTester.selectionSort( carLot );
        //more formally: carLot = CarTester.bubbleSort(carLot);
        
        int s = 0 ;
                
        
        while( true )
        {
            ( carLot.get(s) ).printDetails( );
            s += 1;
            
            if( s == myCars.length )
            {
                break;
            }
        }
        
        
        
    }
    
    /*
     * Generate an ArrayList of Car objects
     * Sort the Car objects according to an implementation of the bubble sort algorithm
     * Print information about each Car object in order to the console
     */
}
