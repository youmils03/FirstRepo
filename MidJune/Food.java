
/**
 * Sorting objects:
 * 1. implement Comparable
 * 2. make your signature --> public int compareTo( Object x )
 * 3. polymorph x to whatever class you're in (Food y = (Food)(x);)
 * 4. define your compareTo --> fill in the body however you'd like
 * 5. import java.util.Collections and java.util.ArrayList/LinkedList/Vector
 * 6. make the list (e.g. called myList)
 * 7. Collections.sort( myList );
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Food implements Comparable
{
    private String item;
    private int calories;
    protected static double v = 25;
    
    Food( String item , int c )
    {
        this.item = item;
        this.calories = c;
    }
    
    Food( )
    {
        this( "pizza" , 400 );
    }
    
    Food( String item )
    {
        this( item , 250 );
    }
    
    Food( int calories )
    {
        this( "cookies" , calories );
    }
    
    /**
     * Returns the item associated with this Food object
     * 
     * @return the item associated with the Food object
     */
    public String getItem( )
    {
        return this.item; //return item;
        //"this" is usually not *required* for getter methods
        //but it's never bad practice
        //and, for setter methods, much more likely you'll need it
    }
    
    /**
     * This setter method accepts a new item name called "item" and 
     * reassigns it to the actual item instance variable
     * The word that was originally the item is saved to oldItem and
     * returned by the method
     * 
     * @param item the new item for the Food object
     * @return oldItem the previous item before the change
     */
    public String setItem( String item )
    {
        String oldItem = this.item; //assigns
        this.item = item;
        System.out.println( "sun" );
        return oldItem;
    }
    
    /**
     * Since this class implements Comparable, we define what it means for one Food object to be
     * less than another. This enables Collections.sort(x) and Arrays.sort(x) to make use of this
     * NATURAL ORDERING
     * 
     * @param t the object that THIS object should be compared to
     * @return -1 if THIS is less than t, +1 if THIS is greater than t, and 0 otherwise
     */
    public int compareTo( Object t )
    {
        Food otherFood = (Food)(t);
        
        if( this.calories < otherFood.calories )
        {
            return -1;
        }
        else if( this.calories > otherFood.calories )
        {
            return 1;
        }
        else
        {
            if( ( this.getItem( ) ).compareTo( otherFood.getItem( ) ) < 0 )
            {
                return -1;
            }
            else if( ( this.getItem( ) ).compareTo( otherFood.getItem( ) ) > 0 )
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
}
