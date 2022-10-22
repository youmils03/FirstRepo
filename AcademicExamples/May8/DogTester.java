
/**
 * Write a description of class DogTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DogTester
{
    public static void main( String args [ ] )
    {
        Entity E = new Dog( "Max" );
        System.out.println( E.getSeven( ) * 10 );
        
        Object F;
        F = new Dog( "Whitney" );
        //F.setName( ( F.getName( ) ).substring(0,4) );
        //System.out.println( F.getName( ) );
        Entity G = (Entity)(F);
        
        System.out.println( G.getName( ) );
        
        /*
         * If you declare a class C and initialize it as a subclass S, and there is an abstract method
         * in C called M(), and you call x.M() for that object x as you created as described above,
         * then even though M( ) is abstract in C, it will use S's implementation of M( )
         */
        
        //Entity X = new Entity( );
    }
}
