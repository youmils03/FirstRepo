//copy and paste the four classes here into four separate Java files within the same program
//

public abstract class Entity
{
    public abstract void makeSound( );
  
    public static int value( )
    {
        return 10;
    }
  
    public void work( )
    {
        System.out.println( "time to work" );
    }
}

public class Lawyer extends Entity
{
    private String name;
    
    Lawyer( String x )
    {
        this.name = x;
    }

    public void makeSound( ) //required since makeSound() is abstract in the superclass
    {
        System.out.println( "the courts are rigged" );
    }
    
    public int value( )
    {
        return super.value( ) + 2; //12
    }
    
    public void work( )
    {
        super.work( ); //unnecessary, happens by nature of inheritance
    }
    
    public boolean f( ) //method that Lawyers can use, but not Entities in general
    {
        return ( this.name ).length() % 2 != 0; //returns true if the name of the Lawyer has an odd number of letters
    }
    
}

public class Waiter extends Entity
{
    public void makeSound( )
    {
        System.out.println( "waiting tables now" );
    }
    
    public void work( )
    {
        super.work( );
        super.work( ); //invoke Entity's work() method twice
    }
    
    public boolean g( )
    {
        return false;
    }
    
    public static String capitalize( String u )
    {
        return "capitalized: " + u.toUpperCase( );
    }
}

public class EntityTester
{
    private static final double D = 3.64; //private (cannot be used outside EntityTester), static (is called
   //on the class rather than an instance of the class), final (constant, immutable), double (floating-point number)
  
    public static void main( String args [ ] )
    {
        double E = EntityTester.D; //now E can be changed, but D is fixed to 3.64
        double F;
        F = D; //do not need to call the class name as we're still in the class in which D is defined
      
        System.out.println( E == F );
        F += 2.26;
        System.out.println( E == F );
      
        //D = 1.88; //illegal operation
        //D = 2*D; //illegal operation
      
        double g = (int)(D);
        System.out.println( g * g ); //9.0
      
        Lawyer A = new Lawyer( "Saul" );
        A.work( );
        a.makeSound( );
        System.out.println( "Value for this lawyer: " + Integer.toString( A.value() ) );
        
        if( ! A.f() )
        {
            System.out.println( "pizza" );
        }
        else
        {
            System.out.println( "pasta" );
        }
      
        Waiter B;
        B = new Waiter( );
        W.work( );
        W.makeSound( );
        System.out.println( "Value for this waiter: " + B.value() );
      
        System.out.println( Waiter.capitalize( "egg" + "plant" ) ); //static method
      
        System.out.println( B.g( ) || false ); //instance method
      
        Entity E = new Lawyer( "Tom" ); //polymorphism, cannot use f() since it is neither concrete nor abstract
        //in Entity or any superclasses of Entity
        // System.out.println( E.f() ); //compile-time error
        System.out.println( E.value() ); //still uses the subclass's version of this method, so 12 not 10
      
        Object F;
        F = new Waiter( ); //F cannot use makeSound( ), work( ), g( ), capitalize( ), or value( )
        Entity G = (Entity)(F); // G cannot use makeSound( ), work( ), or value( ) but can use g( ) and capitalize( )
      
        
        double x;
        x = G.value( );
        System.out.println( x + " apples" ); //10.0 apples
        
    }
}
