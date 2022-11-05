//Copy and paste these 3 "classes" (1 interface, 2 classes) into 3 separate Java files for use within the same program

public interface I
{
    public abstract void f( int x , String y ); //require a function f which accepts an int and a String and returns nothing

    public abstract int f(); //also require a function which accepts no inputs and returns an int
  
    public abstract boolean g(boolean s);
    //ONLY abstract methods allowed
}

public class C implements I //versus "extends A" for some [abstract] class A
{
    private String variable;
    
    C( String instanceVariable )
    {
        this.variable = instanceVariable;
    }
    
    public String getName( ) //not mandated by the interface, implementing classes can have their OWN methods too
    {
        return variable;
    }
  
    public void f( int x , String y )
    {
        System.out.println( 100*x );
        System.out.println( (this.variable).length( ) < y.length() ); //just prints 2 statements to the console
    }
  
    public int f( ) //required by interface
    {
        return 302; //doesn't matter how it's defined
    }
  
    public boolean g( boolean t ) //required by interface, doesn't matter what you call the boolean input
    {
        return t && (this.variable).length() >= 4;
    }
  
    public String toString( )
    {
        return "instance of a class";
    }
}

public class Tester
{
    public static void main( String args [ ] )
    {
         C x = new C( "Carmen" );
         x.f( -6 , "eating" );
         System.out.println( x.f() - 200 );
      
         System.out.println( x.g( 22 + 15 >= 37 ) );
      
         I y = new C( "Dave" ); //can declare as an interface but cannot instantiate as an interfae
         System.out.println( y.f() ); //302
      
         Object z;
         z = new C( "Emily" );
         System.out.println( z ); //"instance of a class". Invokes the subclass's version of toString( )
    }
}
  
  
