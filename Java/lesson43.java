//We just had about 20 lessons on object-oriented programming
//I'm going to leave this lesson in terms of primitive data types
//for good practice, implement a Person class and define a binarySearch method which returns the index position
//of the first occurrence of an element in a static (for further practice, a dynamic as well) array whose
//"name" instance variable matches the target name fed into the method. Use my linear search methods i
//lesson42.java for inspiration

public class Lesson43
{
    /**
    * Function which accepts a static array and a target element and returns the index position of the first occurrence
    * of the element in the values array which matches the target element
    * NOTE: binary search requires that the array be SORTED (for a discussion of sorting algorithms, view lessons 39-41)
    * @param values the array to search
    * @param target the element to search for
    * @return the index position of the first occurrence of the target element, or -1 if it doesn't exist
    */
    public static int binarySearch( int [ ] values , int target )
    {
        return Lesson43.binarySearch( values , target , 0 , values.length - 1 ); //call the helper method
    }
    
    public static int binarySearch( int values [ ] , int target , int left , int right )
    {
        int indexResult = -1;
        
        while( left <= right )
        {
            int mid = (left + right) / 2; //floor division to determine the approximate "middle" index position
            
            if( values[mid] < target )
            {
                left = mid + 1;
            }
            else if( values[mid] > target )
            {
                right = mid - 1;
            }
            else if( values[mid] == target )
            {
                indexResult = mid;
                break;
            }
        }
        
        return indexResult;
    }
  
    public static void main( String args [ ] )
    {
         int [ ] numbers = { 64, 66, 68, 69, 72, 76, 78, 80, 83, 84, 89, 92, 94, 97, 98, 100, 101, 103, 104, 106 };
      
         int element = 101;
      
         System.out.println( "Element " + element + " occurs at index position " + binarySearch(numbers,element) );
         //Hopefully you can see that by dividing the array into 2 pieces over and over again, this would save
         //a tremendous amount of time over linear search, in particular when the array is sizable (i.e. n > 100)
    }
}
