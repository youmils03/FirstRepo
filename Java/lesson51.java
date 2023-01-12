import java.util.*;

public class Person implements Comparable
{
    private String name;
    private int age;
    
    Person( String u , int v )
    {
        this.name = u;
        this.age = v;
    }
    
    Person( String e )
    {
        this(e,52);
    }
    
    Person( int i )
    {
        this( "Scott" , i );
    }
    
    Person( )
    {
        this( "Jeremiah" , 9 );
    }
    
    public int compareTo( Object k )
    {
        Person y = (Person)(k);
        int myAge = this.age , yourAge = y.age;
        
        if( myAge < yourAge )
        {
            return -1;
        }
        else if( myAge > yourAge )
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    public String toString( )
    {
        return "my name is ".concat( (this.name).toLowerCase() );
    }
    
    public static void main( String args [ ] )
    {
        Person a = new Person( "Tom" , 22 );
        Person b = new Person( "Aaron" , 26 );
        Person c = new Person( "Colette" , 3 );
        Person d = new Person( "Joe" , 74 );
        Person e = new Person( "Ian" , 53 );
        Person f = new Person( "Tara" , 39 );
        
        LinkedList< Person > clan = new LinkedList< Person >( );
        clan.add(a);
        clan.add(b);
        clan.add(c);
        clan.add(d);
        clan.add(e);
        clan.add(f);
        
        Iterator< Person > clanParse = clan.iterator( );
        
        while( clanParse.hasNext( ) )
        {
            System.out.println( clanParse.next() ); //invokes toString( ) on each Person object
        }
        
        System.out.println( "Youngest person: " + Collections.min(clan) );
        System.out.println( "Oldest fart: " + Collections.max(clan) );
        System.out.println( "Let's sort using Collections.sort(x), a static method" );
        System.out.println( "Remember that our class needs to define compareTo!" );
        
        Collections.sort( clan );
        System.out.println( "in order..." );
        
        for( Person f : clan )
        {
            System.out.println(f);
        }
    }
}
