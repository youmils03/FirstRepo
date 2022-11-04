public class Person
{
    private String name; //can NOT be accessed outside the class
    private int age; //can be accessed outside the class
  
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
  
    public String f() //instance method called on an INSTANCE of a class
    {
        return ( this.getName( ) ).toUpperCase( ); //returns the result of getName( ) on the instance, but uppercase
    }
  
    public static String f(boolean y) //overloaded. Static rather than instance method. One input rather than zero
    {
        Person x = new Person( ); //29-year-old Jesse
      
        if( y )
        {
            System.out.println(x); // x.toString( ) == "Jesse is 29 years old"
        }
        else
        {
            System.out.println( x.f() ); //invokes the instance method on x
        }
      
        return "cheeseburger";
            
    }
  
    public String toString( )
    {
        return name + " is " + this.age + " years old";
    }
  
    public static void main( String args [ ] )
    {
        Person S = new Person( "Kate" , 23 );
        Person T;
        T = new Person( "Will" , 19 );
      
        //System.out.println( S.name ); //not allowed, name is private
        System.out.println( (S.getName()).indexOf("E") ); //getName() is permitted. Method returns -1, no capital E
      
        System.out.println(T); //Will is 19 years old
      
        System.out.println( S.f() ); //KATE
      
        String U = f(true); //invokes the static f(boolean y) with input true. 
        //The line above prints "Jesse is 29 years old" as a result of calling it. U is assigned to "cheeseburger"
        String V; //declare a string
        V = Person.f(true && false); //prints "JESSE" as a result of calling it, but V is assigned to "cheeseburger" like U
        //for static methods M called outside of the class C in which they are defined, you MUST call C.M() not just M()
        //here it is done optionally, you could have written V = f(true&&false) since f(y) was defined in this class
      
        V = V.toUpperCase( ); //doesn't print anything about Jesse since you didn't call f(y), but V == "CHEESEBURGER"
      
        System.out.println( V.equalsIgnoreCase(U) ); //true
    }
}
