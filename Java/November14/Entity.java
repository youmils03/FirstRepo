
/**
 * Write a description of interface Entity here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 * What is an interface? (4 points)
 * 0 points: blank, completely incorrect (a function which accepts no inputs)
 * 1 point: a blueprint or program for running sectioned code
 * 2 points: a collection of abstract methods
 * 3 points: a collection of abstract methods which cannot be instantiated, but
 * an interface can be implemented
 * 4 points: a collection of abstract methods which cannot be instantiated, but
 * an interface can be implemented by a class. The class must provide full-bodied
 * definitions for each method that was abstract in the interface
 * 
 * 
 */
public interface Entity
{
    /*
     * This abstract method mandates that any class that implements the Entity
     * interface must define an instance method called getValue( ) which accepts
     * no parameters and returns an int
     */
    public abstract int getValue( );
    
    /*
     * abstract word is optional
     * the word "abstract" doesn't make a method abstract
     * it's the semicolon at the end of the line that essentially makes it abstract
     * 
     * This abstract method mandates th
     */
    public double logic( int t );
    public boolean logic( String x );
}
