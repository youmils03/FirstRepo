
/**
 * Write a description of class OccupationTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 * for an instance variable V that 
 * belongs to some instance I, we usually write
 * I.getV( ) --> no parameters, no inputs to a getter method
 * I.setV(newValueForV) --> usually doesn't return anything
 * 
 */
public class OccupationTester
{
    public static void main( String args [ ] )
    {
        Engineer e = new Engineer( );
        System.out.println( e.getOccupation( ) );
        
        //Cannot instantiate abstract class or interface
        //Occupation V = new Occupation( );
        
        Occupation L;
        L = new Lawyer( );
        
        System.out.println( L.getOccupation( ) );
        
        /*
         * prints 3 just as a result of CALLING getOccupation()
         * prints lawyer as the result of printing the
         * RESULT of getOccupation( )
         */
        
        System.out.println( e.getNumber( ) );
        
        /*
         * Polymorphism in the abstract case is seen below
         * 
         * F is declared as an Occupation, so it can only use
         * the concrete or abstract methods that have
         * signatures in Occupation
         * However, since it is instantiated as an Engineer,
         * it will use the furthest down subclass's version
         * of any of those methods that had at least signatures
         * in Occupation
         */
        
        Occupation F = new Engineer( );
        System.out.println( F.getNumber( ) );
        
        System.out.println( F instanceof Lawyer );
        System.out.println( F instanceof Object );
        System.out.println( F instanceof Occupation );
        System.out.println( F instanceof Engineer );
    }
}
