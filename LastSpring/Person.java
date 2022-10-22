import java.lang.ArithmeticException;
/**
 * Today:
 * this/super review
 * compareTo interface
 * iterators (list, enumerations) --> apply to a collection of OBJECTS 
 * (not just Integers/Strings)
 * 
 * Javadocs: formal API documentation that you can build for your class to give people an understanding
 * in English about what each of the constructors and methods does, what parameters they accept,
 * and what they return, if anything
 * You google "String Java API" and see Javadocs for all the methods in the String class
 * Now, it's up to us to generate our own API's for our specific code that WE write
 * 
 * Another topic: Collections class
 * compareTo: YOU define your ordering --> Java provides a fast sorting method based on the compareTo
 * method that YOU specified. Sorting method is a static method from the Collections class called sort
 * --> for any collection C, call Collections.sort(C); --> sort the elements according to nat. ordering
 * 
 * Collections has other static methods that are also nice to know about
 * 
 * Remaining topics:
 * 1. Collections class --> static methods that operate on dynamic collections (array lists, sets, stacks)
 * 2. Arrays class --> static methods that operate on static arrays
 * 3. numeric data types --> int, double --> short, long, float
 * 4. pass by value
 * 5. PriorityQueues
 * 
 * Tonight: Collections.sort(x), Collections.fill(x,y), Collections.max(x), Collections.swap(x,y,z)
 * 
 * Next time: Review compareTo() --> Collectoins.sort(x)
 * Next time: Also review fill, max, and swap
 * Next time: introduce a few more methods from Collections class, but then start talking about the Arrays class
 * which also offers static methods, but this time just on static arrays
 * 2 classes from now: numeric data types
 * 3 classes from now: pass by value
 * 4 classes from now: PriorityQueues
 * Optional: final class (5 from now): you can ask any curious/clarifying questions about the entire Java curriculum
 */
public class Person implements Comparable
{
    private String name; //declare private instance variables 
    private int age; //good etiquette
    //private: name and age can only be called IN the Person class
    //protected: variables that can be accessed in the class or subclasses
    //public: variables that can be accessed by any class within the project
    
    /**
     * Constructor which creates an instance of the Person class by accepting a name and an age and 
     * assigning those instance variables
     * @param name the name of the new Person object
     * @param w the age of the new Person object
     */
    Person( String name , int w )
    {
        this.name = name; //this is required, because we can't say name=name
        //name on the left is the actual instance variable
        //we assign it to the little name parameter passed in
        this.age = w; //or if you really want, age = w;
    }
    
    /**
     * Default constructor which assigns the name and age of a new Person object to "Kate" and 20, respectively
     * this(a,b) calls the parameterized constructor with the default values a and b
     */
    Person( ) //default constructor: no parameters, assigns default values for all instance variables
    {
        name = "Kate";
        this.age = 20;
        /*
         * You can actually generate a default constructor by calling the parameterized constructor
         * and just passing values into it
         * 
         * this( "Kate" , 20 ); --> calls the parameter WITH constructors and manually passes in
         * "Kate" for name and 20 for age
         */
    }
    
    Person( String name )
    {
        this( name , 26 ); //calls the "main" constructor that accepts two inputs, one of those inputs
        //comes from this constructor and the other one is a manual/default 26 that we pass in
    }
    
    Person( int x )
    {
        this( "Gary" , x ); //"Gary" is default, and x is a parameter
        /*
         * equivalent to, a short hand form, for:
         * this.name = "Gary";
         * this.age = x;
         */
    }
    
    public String getName( ) //getter methods typically do not accept any inputs
    {
        return this.name; //or, if you're lazy, return name;
        //for getter methods, you don't typically NEED "this"
        //for setter methods, it's more likely that you need "this" because your parameter might
        //just be called "name" or "age"
    }
    
    /**
     * Returns the age of the Person object
     * 
     * @return the age of the Person object
     */
    public int getAge( ) //getter methods are output methods, setter methods are input methods
    {
        return this.age;
    }
    
    /**
     * This method accepts a String input, which the name of the Person object is reassigned to
     * 
     * @param newName the name to change the name of the Person instance to
     */
    public void setName( String newName ) //setter methods typically do not RETURN anything
    {
        name = newName; //formally: this.name = newName
    }
    
    public void setAge( int age ) //overlap between the instance variable and the parameter
    {
        this.age = age; 
    }
    
    /*
     * How do we define a haveBirthday method by USING the setAge method above?
     */
    
    public void haveBirthday( ) //spin-off, variation of a setter method
    {
        //this.age = age + 1; //But how can we define this method by invoking setAge( ) ?
        setAge( age + 1 );
        //OR: this.setAge( age + 1 )
        //OR: setAge( this.age + 1 )
        //OR: this.setAge( this.age + 1 )
        
        //this: refers to the current instance of the class
        //so whenever you call an instance method, it's never a problem to preface it with: this.
        //same with an instance variable: you could say setAge(age+1) or setAge(this.age+1)
    }
    
    public String toString( ) //defines what it means to print an instance of a class
    {
        return this.name + " is " + getAge( ) + " years old";
    }
    
    /**
     * This instance method [is called on an instance of class] and immediately throws an ArithmeticException if
     * the age of the Person instance is even (divisible by 2)
     * Write: @throw, then write the type of exception, then write the conditions in which that exception is thrown
     * 
     * @throw ArithmeticException
     */
    public void throwException( )
    {
        if( this.getAge( ) % 2 == 0 )
        {
            throw new ArithmeticException( "Bad arithmetic!" );
        }
    }
    
    /**
     * If you want to sort objects of a class, here are the steps you take
     * 1. implement Comparable interface
     * 2. define an instance method called compareTo that accepts an OBJECT and returns an int
     * 3. in the method body, polymorph the OBJECT to the class type that you're in (Object --> Person)
     * 4. define what it means to be less than x (return negative integer), equal to x (return 0), or
     * greater than x (return positive integer)
     * 
     * Java terms: *this* is compared to x
     */
    public int compareTo( Object x )
    {
        Person y = (Person)(x);
        
        //one implementation: return (this.getName()).compareTo(y.getName());
        //in this implementatoin, we define one Person instance as being less than a second if the first
        //one had a name that came before the second one in the alphabet
        
        if( this.getAge( ) < y.getAge( ) )
        {
            return -1;
        }
        else if( this.getAge( ) == y.getAge( ) )
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
