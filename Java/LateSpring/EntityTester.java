
/**
 * Write a description of class EntityTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EntityTester
{
    public static void main( String args [ ] )
    {
        Lizard L;
        L = new Lizard( );
        System.out.println( L.getName( ) ); //Taylor
        
        L.doSomething( );
        
        System.out.println( L.getNumber( ) + 1 ); //9
        
        Entity E = new Lizard( );
        System.out.println( E.getName( 218 ) );
        
        Entity W;
        // W = new Entity( ); --> you can declare but NOT INSTANTIATE an abstracet class
        W = new Lizard( );
        //W.doSomething( ); --> polymorphism
        
        Lizard y = (Lizard)(W);
        y.doSomething( );
    }
}
