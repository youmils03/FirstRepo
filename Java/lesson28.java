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
        
      Person a = new Person( "Jack" , 31 );
      Person b, c, d, e, f;
      b = new Person( ); //29-year-old Jesse
      c = new Person( "Walter" , 53 );
      d = new Person( "Kyrie" , 33 );
      e = new Person( "Henry" , 17 );
      f = new Person( "Jacqueline" , 24 );
      
      ArrayList< Person > clan;
      clan = new ArrayList< Person >( );
      
      clan.add(a);
      clan.add(b);
      clan.add(c);
      clan.add(d);
      clan.add(e);
      clan.add(f);
      
      System.out.println( ( clan.get(2) ).getName( ) );
      System.out.println( 100 + ( clan.get(1) ).getAge( ) );
      
      for( Person x : clan )
      {
          System.out.println( x ); //uses a for-each loop on an arraylist of person objects, invoking toString( )
      }
      
      Person z = new Person( "Randy" , 35 );
      
      System.out.println( clan.contains(c) );
      System.out.println( clan.contains(z) );
      
      System.out.println( clan.size( ) % 4 == 0 );
      
      System.out.println( clan.isEmpty( ) );
      
      clan.set(clan.indexOf(c),z);
      System.out.println(clan.contains(c));
      System.out.println(clan.contains(z));
     
    }
}
