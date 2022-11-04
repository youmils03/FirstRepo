public class Person
{
    private String name; //can NOT be accessed outside the class
    public int age; //can be accessed outside the class
  
    Person( String n , int age )
    {
        this.name = n; //"this" not required since instance variable doesn't overlap with parameter
        this.age = age; //"this" required
    }
  
    Person( ) //default constructor
    {
        this.name = "Jesse";
        age = 29;
    }
  
    public String getName( )
    {
        return this.name; //"this" not required but good etiquette
    }
  
    public int getAge( )
    {
        return age;
    }
  
    public void setName(String name)
    {
        this.name = name; //"this" required. this.name == instance variable, name == parameter to function
    }
  
    public void setAge(int potato)
    {
        this.age = potato; //"this" not required
    }
  
    public String toString( )
    {
        return name + " is " + this.age + " years old";
    }
  
    public boolean K(int a,Person b) //instance method with two inputs. Call it on an instance of Person, not Person itself
    {
        return this.getAge( ) > b.getAge( );
        //you call this method ON an instance of a class, but you also PASS IN an instance of a class
        //this method returns true if the current instance's age is higher than the age of the instance passed in
        //regardless of the integer passed in
    }
  
    public static int K(Person b) //static method with one input. Call it on Person, not on an instance of Person
    {
        return b.getAge( ) - 1;
    }
  
    public static void main( String args [ ] )
    {
        String [ ] names = { "Becky" , "Amber" , "Zack" , "Michael" , "Patrick" , "Jeremiah" };
        int ages [ ] = { 52 , 29 , 34 , 38 , 45 , 40 };
        Person [ ] group = new Person[ names.length ]; //array of objects
        
        for( int t = 0 ; t < group.length ; t += 1 )
        {
            group[t] = new Person( names[t] , ages[t] ); //assign the objects in the Person array
        }
        
        for( Person s : group )
        {
             System.out.println(s); //invokes the toString( ) method for each Person object
        }
        
        Person greg = new Person( "Greg" , 44 );
        
        int r = 0;
        
        while( r < group.length )
        {
            System.out.println( greg.K( 12 , group[r] ) ); //use of an instance method
            r = 1+r;
        }
        
        System.out.println( K( group[0] ) ); //use of a static method within the same class
        System.out.println( Person.K( group[2] ) ); //use of a static method in general
    }
}
