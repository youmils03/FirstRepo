
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student implements Runnable
//just like Comparable requires a compareTo( ) method, Runnable requires a run( ) method
//In some sense, every interface can be thought of as a "type" of abstract class
//But you couldn't say that every abstract class is an interface because some abstract classes
//have concrete methods
{
    private String name;
    private String university;
    
    Student( String name , String u )
    {
        this.name = name;
        university = u;
    }
    /*
     * Runnable is an interface with one ABSTRACT method called run( )
     * This means that any class that implements Runnable MUST provide a definition for run( )
     */
    
    public void run( )
    {
        System.out.println( this );
        //this is an important keyword. In general, it refers to the CURRENT INSTANCE!
        //in the toString( ) method below, we specify what it means to print an instance of a class
    }
    
    public String toString( )
    {
        return "I go to " + this.university;
    }
}
