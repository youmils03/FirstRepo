public class Person
{
    private String name; //1. declare private instance variables
    private int age;
  
    Person( String n , int a )
    {
        name = n; //2. use the constructor to assign the instance variables when the object is created
        age = a;
    }
  
    public String getName( ) //3. create getter methods which return the values of the private instance variables
    {
        return name;
    }
  
    public int getAge( ) //dataType(someFunction) == dataType(variableThatItReturns) == intInThisExample
    {
        return age;
    }
  
    public void setName(String n) //4. create setter methods which accept new values for the instance variables
    {
        name = n;
    }
  
    public void setAge(int potato) //doesn't matter what you name parameters
    {
        age = potato;
    }
  
    public static void main( String args [ ] ) //5. create a main method in a *SEPARATE TESTER CLASS*
    { //this main method should really be in a separate public class PersonTester
        Person p = new Person( "Tony" , 34 );
        System.out.println( p.getName( ) );
      
        int q = p.getAge( );
      
        if( q >= 21 )
        {
            System.out.println( p.getName( ) + " is an adult" );
        }
        else
        {
            System.out.println( ( p.getName( ) ).concat( "is ".concat( "a" + "child" ) ) );
        }
      
        Person z;
        z = new Person( "Zack" , 49 );
        System.out.println( z.getName( ) + " is " + z.getAge( ) + " years old." );
    }
}
