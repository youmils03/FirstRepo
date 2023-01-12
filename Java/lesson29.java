import java.util.ArrayList;

public class Person
{
    private String name;
    private int age;
  
    /**
    * Constructor to create an instance of the Person class, provided a name and an age
    * @param name the name of the Person object to create
    * @param age the age of the Person object to create
    */
    Person( String name , int age )
    {
        this.name = name;
        this.age = age;
    }
  
    /**
    * Default constructor for Person class
    */
    Person( )
    {
        this( "Sam" , 64 ); // assigns this.name = "Sam" and this.age = 64 to a new Person object
    }
  
    Person( String k )
    {
        this( k , 60 ); //creates a 60-year-old with the specified name. one parameter, one default value
    } //invokes the constructor Person(name,age) with name=k and age=60
  
    Person( int v ) //you don't have to create all combinations of constructors, but it's good practice
    {
        this( "Adrian" , v-2 ); //creates a Person named Adrian with age 2 less than the input passed in
    }
  
    /**
    *Returns the name of this instance of the Person class
    * @return the name of the Person
    */
    public String getName( )
    {
        return name; //or return this.name;
    }
  
    /**
    *Returns the age of this instance of the Person class
    * @return the age of the Person
    */
    public int getAge( )
    {
        return this.age; //or return age;
    }
  
    /**
    * Reassigns the name of this Person to the name provided in the argument
    * @param the new name for this instance of the Person class
    *
    */
    public void setName( String name )
    {
        this.name = name;
    }
  
    /**
    * Setter method which ALSO returns the old age of this Person
    * @param the new age to assign to this instance of the Person class
    * @return the old age that is being replaced
    */
    public int setAge( int age )
    {
        this.age = age; //within this method, "age" is the PARAMETER, not the official instance variable.
        return age; //is this the old age or the new age? You should be able to tell
    }
  
    /**
    * String representation of a Person
    * @return a descriptive statement about this Person
    */
    public String toString( )
    {
        return this.name + " is " + age + " years".concat( "ol" + "d" );
    }
  
    public static void main( String args [ ] )
    {
        System.out.println( "I hope you saw the descriptive Javadocs, which are expected in the software industry" );
      
        Person w, x, y, z;
        w = new Person( "Scott" , 72 );
        x = new Person( "Pamela" );
        y = new Person( 53 );
        z = new Person( );
      
        System.out.println( "Value: " + w.setAge( w.getAge( ) + 1 ) ); //having a birthday
      
        Person [ ] people = {w,x,y,z,w};
      
        ArrayList< Person > dynamicArray = new ArrayList< Person >( );
        int q = 0;
      
        for( Person e : people )
        {
            dynamicArray.add(e); //adds each element from the static array into the dynamic array (arraylist)
            System.out.println( dynamicArray.get(q) ); //prints the newest/last element added to the arraylist
            q++;
        }
      
        Boolean b = new Boolean( dynamicArray.size( ) == people.length );
        Boolean c = new Boolean( q == people.length );
        Boolean d;
        d = new Boolean( w.getAge() == 72 );
      
        System.out.println( b.booleanValue() && c.booleanValue() );
        System.out.println( b.booleanValue() || d.booleanValue() );
        System.out.println( b.booleanValue() || c.booleanValue() );
      
        //Study the Javadocs above the methods in the Person class, and understand why they are important
    }
}
        
