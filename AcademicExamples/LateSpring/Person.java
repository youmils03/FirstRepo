
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    /*
     * Class:
     * 1. declare private instance variables
     * 2. set up constructors which will initialize instances of your class
     * 3. getter/setter methods --> return or change the values of instance variables
     * 4. toString( ) method --> defines what it means to print an instance of your class
     */
    
    private String name;
    private int age;
    
    /**
     * Javadocs is the Java equivalent to docstrings in Python
     * We want formal comments/documentation to show up
     * When we create a class, it generates something called an API
     * API is where the documentation/information about our class is stored
     * 
     * This is how you create it: /** every line has a * end with a...you know, look
     * This is different from an ordinary multi-line comment, because multi-line comments
     * only start with /*
     * 
     * Documentation: Constructor which assigns values to two instance variables when a 
     * Person object is created
     * @param name the name of the new Person object that is being created
     * @param age the age of the Person object
     */
    Person( String name , int w )
    {
        this.name = name;
        this.age = w;
    }
    
    /**
     * Default constructor which assigns default values to the instance variables
     */
    Person( )
    {
        this.name = "Henry";
        age = 32;
    }
    
    /**
     * Method which returns the name of an instance of the Person class (Person object)
     * @return the name of the Person object
     */
    public String getName( )
    {
        return this.name;
    }
    
    /**
     * Method which changes the name of a Person object
     * @param name the new name to assign to the Person object
     */
    public void setName( String name )
    {
        this.name = name;
    }
}
