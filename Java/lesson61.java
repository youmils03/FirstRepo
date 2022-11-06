import java.util.HashMap;
import java.util.Iterator;

public class Person
{
    private String name;
    
    Person( String s )
    {
         this.name = s;
    }
    
    Person( )
    {
        this.name = "Alicia";
    }
    
    public String toString( )
    {
        return (this.name).toUpperCase();
    }
    
    public static void main( String args [ ] )
    {
        HashMap< Person , Integer > theirAges = new HashMap< Person , Integer >( );
        Person p1 = new Person( "Emily" );
        Person p2, p3, p4, p5, p6, p7;
        p2 = new Person( );
        p3 = new Person( "Kate" );
        p4 = new Person( "Dave" );
        p5 = new Person( "Abby" );
        p6 = new Person( "Tom" );
        p7 = new Person( "Moaz" );
        
        theirAges.put( p1 , 45 );
        theirAges.put( p2 , 45 );
        theirAges.put( p3 , theirAges.get(p2) );
        theirAges.put( p4 , 53 );
        theirAges.put( p5 , 12 );
        theirAges.put( p6 , theirAges.get(p5) * 2 );
        theirAges.put( p7 , 90 );
        
        System.out.println( theirAges.isEmpty() );
        System.out.println( (double)(theirAges.size()) );
        System.out.println( theirAges.get(p4) > 60 );
        System.out.println( theirAges.get(p5) < 20 );
        System.out.println( theirAges.containsValue( 92 - 2 ) );
        System.out.println( theirAges.containsKey( new Person( "Scott" ) ) );
        
        Iterator< Person > keyParse = ( theirAges.keySet( ) ).iterator( );
        
        while( !(!(keyParse.hasNext())) )
        {
            Person dude;
            dude = keyParse.next( );
            System.out.println( "Key: " + dude );
            System.out.println( "Value: " + theirAges.get(dude) );
        }
        
        System.out.println( theirAges.size() == 0 ); //false, didn't call keyParse.remove() on each element
    }
}
