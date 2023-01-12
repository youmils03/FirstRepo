import java.util.Scanner;

public class Person implements Comparable
{
    private String name;
    private int age;
  
    Person( String u , int v )
    {
        this.name = u;
        this.age = v;
    }
  
    Person( String a )
    {
        Object s = new Scanner(System.in); //polymorphism
        Scanner t = (Scanner)s; //explicit cast back to Scanner
      
        name = a;
        System.out.print( "Specify an age as an integer (0-100): " );
      
        this(a,t.nextInt());
    }
  
    Person( int p )
    {
        this( "Jessica" , p );
    }
  
    Person( )
    {
        this.name = "Andrea";
        this.age = 25; //or shorten to this( "Andrea" , 25 )
    }
  
    public int compareTo( Object otherGuy )
    {
        Person otherPerson;
        otherPerson = (Person)(otherGuy);
        
        if( (this.name).length( ) < (otherPerson.name).length() )
        {
            return -1;
        }
        else if( (this.name).length( ) > (otherPerson.name).length() )
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
    public String toString( )
    {
        return this.name + " is " + this.age + " years old";
    }

    public static void main( String args [ ] )
    {
        String a = "apple";
        Person b = new Person( "Toby" );
        
        System.out.println( a instanceof Object );
        System.out.println( a instanceof String );
        System.out.println( b instanceof Object );
        System.out.println( b instanceof Person );
        
        /*
        * Given: C a = new D();
        *
        * C is a superclass in which a is declared
        * D is a subclass in which a is instantiated
        *
        * We say that a instanceof E if D is a subclass of E
        * We will see more interesting examples in future videos, after we learn of exceptions
        */
    }
}
