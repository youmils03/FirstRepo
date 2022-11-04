public class Person
{
    private String name; //1. declare private instance variables
    private int age;
  
    Person( String n , int a ) //constructor with parameters
    {
        name = n; //2. use the constructor to assign the instance variables when the object is created
        age = a;
    }
  
    Person( ) //default constructor
    {
        name = "Jesse";
        age = 29;
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
  
    public String toString( ) //defines a String representation of an instance of a class
    {
        return name + " is " + age + " years old";
    }
  
    public static void main( String args [ ] ) //5. create a main method in a *SEPARATE TESTER CLASS*
    { //this main method should really be in a separate public class PersonTester
        
      Person a = new Person( ); //uses the default constructor
      System.out.println( a.getName( ) );
      System.out.println( "Age: " + a.getAge( ) );
      
      Person b = new Person( "Scott" , 81 );
      System.out.println(b); //Scott is 81 years old. Uses the toString( ) method
      
      System.out.println(a); //Jesse is 29 years old. Uses the default constructor and the toString( ) method
     
    }
}
