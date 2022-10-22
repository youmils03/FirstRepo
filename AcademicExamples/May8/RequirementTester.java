
/**
 * Write a description of class RequirementTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RequirementTester
{
    public static void main( String args [] )
    {
        Cat c = new Cat( "Timmy" );
        System.out.println( c.getFour( ) / 1 );
        
        Requirements d; //it's ok to declare something as an asbtract class or an interface
        d = new Cat( "John" ); //it's not ok to initialize something as an abstract class or interface
        System.out.println( d.getName( ) );
        
        d.doSomething( );
        
        //System.out.println( d.getFive( ) * d.getFour( ) );
        
        Cat z = (Cat)(d);
        System.out.println( c.getFive( ) * c.getFour( ) );
        
        //example of polymorphism and abstraction: Just because d is initialized as a Cat, and Cat
        //has a getFive( ) method, does not mean that the getFive( ) method is mandated in the
        //interface, which is what d was declared as
    }
    
    
}
