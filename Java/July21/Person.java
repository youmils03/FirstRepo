import java.util.LinkedList;
/**
 * It's not customary to have a binary search tree of booleans
 * You only get 2 unique values
 * Root is true --> left subchild which is false
 * Root is false --> right subchild which is true
 * 
 * Java review:
 * printing statements, System.out.println( ) vs. System.out.print( )
 * arithmetic expressions --> add/multiply/substract/divide/reminder
 * variables, storing information --> int t = 6; String s; s = "sup";
 * changing the values of two variables
 * String methods: length, substring, indexOf, toUpperCase, startsWith, endsWith, equals, equalsIgnoreCase, concatb (or +)
 * casting: int --> double --> String (implicit), String --> double Double.parseDouble(x), Integer.parseInt(x)
 * booleans: true/false, true&&false == false, true||false == true
 * if/else if/else architecture
 * switch statement
 * while loop
 * for loop
 * break/continue keywords
 * do while loop
 * 1d arrays --> static arrays. Fixed number of index positions, but you can change the values at any index positions
 * for-each loop --> particularly well suited for array
 * char data type --> Character wrapper class, ASCII values
 * escape sequences
 * Scanner class: accepts user input (import Scanner, create a Scanner object, use the right methods, save the data, 
 * use the data)
 * Math class: Math provides a lot of static methods (sqrt, abs, addExact, etc.)
 * static methods: void methods, overloaded methods, methods might not accept any inputs
 * static methods: more "general" methods that operate on a particular CLASS, they are not specific to INSTANCES
 * instance methods: usually they are getter/setter/constructor/toString methods, they depend on which instance
 * you're actually referring to. They have no "static" header in the method header
 * public: can be accessed by any class within the project
 * protected: can be accessed by the class in which it is defined or ANY subclasses (e.g. subclasses of subclasses)
 * private: can only be accessed by the class in which it is defined
 * this: refers to the specific instance of the class. Essential when your instance variable/method coincides with the
 * paramter name. You want to create a new Person object with a name. Will name refer to the actual name of the new PEreson
 * object, or will it refer to the simple paramater that you passed in?
 * arrays of objects( Person[ ] , Car[], Food[ ] )
 * wrapper classes: int --> Integer, double --> Double, boolean --> Boolean, char --> Character
 * ArrayLists only accept objects. That's why we need to know about wrapper classes
 * Can have ArrayList< Integer >, you cannot have ArrayList< int >
 * Javadocs: write your formal documentation above the function headers. Specify what the method does, hwat it accepts,
 * what it returns, and any exceptions it might throw
 * recursion
 * inheritance: subclasses, inherit all the information from the superclass
 * polymorphism: Object s = new Person( "Tony" ,16 ); --> s can only call the methods defined in Person or Person's subclases
 * System.out.println( s.getName( ) ); --> ERROR, because getName( ) is not defined in the Object class
 * instanceof
 * bubble sort
 * insertion sort
 * selection sort
 * linear search
 * binary search
 * file I/O --> review lesson 
 * linked lists
 * iterator: can be applied to arraylist, linked list, vector, stack, queue, concurrent linked queue, hashmap, linked has map,
 * hash set, linked hash set, hash table, concurrent hash map
 * list iterator: more powerful than an iterator
 * enumeration: less powerful than an iterator
 * stacks, queues, arraylists, linkedlists, sets, maps --> 6 fundamental data structures
 * numeric data types --> Long, Short, Float, Integer, Double
 * pass by value --> static method tried to increment a variable by 1 but was unsuccessful.
 * Either use an instance variable, OR simply return the value + 1, OR use an array with at least one element
 * 
 * 2 more lessons:
 * file I/O
 * heaps, priority queues
 * quick sort implementation
 * 
 */
public class Person implements Comparable
{
    private String name;
    private int age;
    
    Person( String name , int age )
    {
        this.name = name;
        this.age = age;
    }
    
    public int compareTo( Object s )
    {
        Person t = (Person)(s);
        
        if( (this.name).compareTo(t.name) < 0 )
        {
            return -1;
        }
        else if( (this.name).compareTo(t.name) > 0 )
        {
            return 1;
        }
        else
        {
            if( this.age < t.age )
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
    }
    
    public static void f( )
    {
        int s = 10;
        int t = 12;
        int z = s;
        s = t;
        t = z;
        System.out.println( "s = " + s );
        System.out.println( "t = " + t );
        
        String u [ ] = new String[4];
        System.out.println( u[2] );
    }
    
    public static void g( )
    {
        int t = 52;
        
        switch(t - 20)
        {
            case 31:
                System.out.println( "taco" );
            case 32:
                System.out.println( "burger" );
            case 33:
                System.out.println( "pizza" );
            default:
                System.out.println( "goodbye" );
        }
    }
    
    public static void h( )
    {
        int u = 0;
        
        do
        {
            if( ! (u % 2 == 0) )
            {
                u += 1;
                continue;
            }
            else
            {
                System.out.println( u );
                u += 1;
            }
        }
        while( u <= 20 );
    }
    
    public static void burger( )
    {
        System.out.println( "The \"book\" is not to be \t released by you.\n Go your own way." );
    }
    
    public static int f1( )
    {
        return 4;
    }
    
    /**
     * By writing static, we either call Person.f2( ) or simply f2( )
     * If we had not written static, then this method would be an INSTANCE method
     * in which case we'd write
     * Person w = new Person( );
     * w.f2( ); //use of an instance method
     * 
     * [accessibility identifier public/private/protected] [static / blank] [return type] [method name]( any parameters/inputs )
     * {
     *     define what to do with those parameters/inputs;
     * }
     }
     */
    public static void f2( )
    {
        System.out.println( Person.f1( ) * f1( ) );
    }
    
    public static void pizza( )
    {
        
    }
}
