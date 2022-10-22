
/**
 * Sorting:
 * Integers are sorted obviously by how big the number is (compareTo method from the Integer class)
 * Strings are sorted alphabetically (compareTo method from the String class)
 * 
 * You can sort any type of objects for a particular class. To do this:
 * 1. implement the Comparable interface
 * 2. define a method called compareTo that accepts an object and returns an int
 * 3. polymorph the object into the specific class type (whatever class is implementing that Comparable interface)
 * 4. define - define what it means for one instasnce of your class to be less than another instance of your class
 * 5. import java.util.Collections;
 * 6. Collections.sort( myList ); --> myList is a list or vector whose type is whatever class you made (Car, Person)
 * --> Collections.sort(x) uses a sorting algorithm called timsort, which is similar to mergesort and insertion sort
 * 
 * Javadocs: Write /** to generate formal documentation. Explain what the method does, use 
 * @param to specify any inputs to the function
 * @return to specify what the function returns, if anything
 * @throws to specify each type of exception the function might throw and under what conditions that exception 
 * would be thrown
 * 
 * Methods from the Collections class that you should know how to use:
 * 1. Collections.sort(x) --> NATURAL ORDERING (think about a class that implements Comparable interface)
 * 2. Collections.min(x) --> NATURAL MINIMUM, HOW DID YOU DEFINE ONE INSTANCE AS BEING LESS THAN ANOTHER
 * 3. Collections.max(x)
 * 4. Collections.swap(x,y,z) --> within collection x, swaps the values at index positions y and z
 * 5. Collections.fill(x,y) --> takes the collection x and fills each index position of it with whatever y is
 * 6. Collections.shuffle(x) --> randomly changes the ordering of the elements
 * 7. Collections.reverse(x) --> reverses all the index positions
 * 8. Collections.replaceAll(x,y,z) --> BOOLEAN method that does 2 things
 * a. actually replaces all occurrences of y with z
 * b. return true if any replacements were actually made, false otherwise
 * 9. Collections.disjoint(x,y) --> returns true if and x and y do not share ANY of the same elements
 */
public class Car implements Comparable
{
    private String color;
    private int price;
    
    Car( String c , int p )
    {
        this.color = c;
        this.price = p;
    }
    
    Car( ) //default constructor 
    {
        this( "red" , 17000 ); //calls the constructor that DOES
        //accept parameters, but feeds in the default values
        //"red" and 17000
        
        /*
         * equivalently:
         * this.color = "red";
         * this.price = 17000;
         */
    }
    
    Car( String color )
    {
        this( color , 22000 );
    }
    
    Car( int p )
    {
        this( "black" , p / 2 );
        
        /*
         * equivalent to:
         * this.color = "black";
         * this.price = p/2;
         */
    }
    
    public int compareTo( Object w )
    {
        Car z = (Car)(w); //polymorphism
        
        if( this.price < z.price )
        {
            return -1;
        }
        else if( this.price > z.price )
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    public String getColor( )
    {
        return this.color;
    }
    
    public int getPrice( )
    {
        return this.price;
    }
    
    public String toString( )
    {
        return "This " + getColor( ) + " car costs $" + this.getPrice( ) + ".";
    }
}
