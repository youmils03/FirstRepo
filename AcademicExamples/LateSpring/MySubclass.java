
/**
 * Write a description of class MySubclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MySubclass extends MyClass
{
    public static void main( String args [ ] )
    {
        System.out.println( MyClass.s.length );
        
        
        MySubclass w = new MySubclass( );
        System.out.println( w.getNumber( ) ); //20
        
        MyClass y = new MySubclass( ); //<-- INITIALIZED as a MySubclass object
        System.out.println( (double)(y.getNumber()) ); //2.0
        
        Object z;
        z = new MySubclass( );
        //System.out.println( z.getNumber( ) > 0 ); --> compile-time error
        
        MyClass p = (MyClass)(z); //= (MySubclass)(z);
        System.out.println( p.getNumber( ) > 0 );
        
        try
        {
            String u = "pizza";
            System.out.println( u.substring( 8 ) );
        }
        catch( ArrayIndexOutOfBoundsException e1 )
        {
            System.out.println( 100 );
        }
        catch( IndexOutOfBoundsException e2 )
        {
            System.out.println( e2.getMessage( ) );
            System.out.println( e2 );
        }
    }
    
    public int getNumber( )
    {
        return super.getNumber( ) * 2;
    }
}
