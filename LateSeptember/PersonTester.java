
/**
 * Write a description of class PersonTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 * Suppose that C is a superclass of D
 * C x = new D( ); //polymorphism
 * 
 * System.out.println( C instanceof E );
 * //returns true if D is a subclass of E
 * 
 */
public class PersonTester
{
    public static void main( String args [ ] )
    {
        Person a = new Doctor( "James" , 27 , "Syracuse" );
        System.out.println( a.getNumber( ) );
        
        //System.out.println( a.getHospital( ) );
        
        System.out.println( a );
        
        Doctor b = (Doctor)(a);
        System.out.println( b.getHospital( ) );
        
        Object c = new Doctor( "Kayla" , 19 , "Stanford" );
        Person d = (Person)(c);
        System.out.println( d.getNumber( ) ); //7
        
        Doctor e = (Doctor)(c);
        System.out.println( e.getNumber( ) ); //7
        
        System.out.println( d instanceof Person );
        System.out.println( d instanceof Doctor );
        System.out.println( d instanceof Object );
    }
}
