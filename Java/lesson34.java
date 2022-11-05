//There is a fleshed-out example of abstract classes in the code for lesson 33. Please review it
//This is a more "abstract" example, no pun intended
//Copy and paste these 4 classes into 4 separate Java files for use within the same program

public abstract class A
{
    public abstract void f( );
  
    public int g( )
    {
        return 400;
    }
  
    public abstract boolean f( int x ); //the abstract class now requires 2 functions f, one with an input and one without
}

public class B extends A
{
    public void f( )
    {
        System.out.println( 14 * 10 );
    }
    
    public boolean f( int a ) //don't have to call the parameter "x" as was written in the abstract class
    {
        return a<0; //this is still an instance method even though it doesn't use any instance variables / attributes...
    }
}

public class C extends A
{
    public void f( )
    {
        System.out.println( "sup" );
    }
    
    public boolean f( int cucumber )
    {
        return cucumber != 200; //probably returns true, unless the input was 200 by coincidence
    }
    
    public int g( int b ) //accessible to C, but not to A or B
    {
        return b+2;
    }
    
    public static boolean h( )
    {
        return false;
    }
    
    public String toString( )
    {
        return "this is an instance of a class";
    }
 }
 
public class D
{
      public static void main( String args [ ] )
      {
            B object1 = new B( );
            object1.f( );
            System.out.println( object1.f(-22) ); //instance method so called on an INSTANCE of the class
            System.out.println( A.g() / 189 ); //2, there are two full groups of 189 in the number 400
            
            Object object2 = new C( ); //can ONLY use toString( ) / print the instance
            A object3 = new C( ); //can use f(), g(), f(x), and toString( ) but not g(b) or h()
            C object4 = new C( ); //can use f(), g(), f(x), toString, g(b), and h( )
        
            System.out.println( object2 ); //this is an instance of a class
          
            object3.f();
            System.out.println( "Result: " + object3.g() );
            System.out.println( object3.f(200-1) );
            System.out.println( object3.f(201-1) );
        
            System.out.println( object4.g(9000) );
        
            if( C.h( ) ) //static method. Call it on C, not on object4
            {
                System.out.println( "November" );
            }
            else
            {
                System.out.println( "March" );
            }
      }
}
            
