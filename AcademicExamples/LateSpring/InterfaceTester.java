
/**
 * Write a description of class InterfaceTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class InterfaceTester
{
    public static void main( String args [ ] )
    {
        Implementer mouse = new Implementer( ); //creating a new instance 
        System.out.println( mouse.getNumber( ) ); // 168
        
        System.out.println( mouse.getNumber(2) ); //400
        
        boolean Q;
        Q = "tree".length( ) % 3 == 0;
        mouse.doSomething(Q);
        
        mouse.doSomething( );
        
        MyInterface x;
        x = new Implementer( );
        
        int p = x.getNumber( );
        p = p - 100;
        System.out.println( "p = " + p );
        
        //System.out.println( x.getNumber(-1) ); --> compile-time error
        
        Implementer a;
        a = (Implementer)(x);
        System.out.println( a.getNumber(-1) );
        
        AnotherImplementer y = new AnotherImplementer( );
        y.doSomething( ); //pizza
        
        y.doSomething( false == !true ); //I love cucumbers
        
        MyInterface M;
        M = new AnotherImplementer( );
        System.out.println( M.getNumber( ) - 10 ); //-14
        
        //System.out.println( M.getNumber(10) ); --> in the interface ("superclass"), you
        //never acknowledged a method called getNumber that would accept an integer argument
        
        AnotherImplementer N = (AnotherImplementer)(M);
        System.out.println( N.getNumber(9) );
    }
}
