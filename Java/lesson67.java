import java.util.LinkedHashSet;

public class Person
{
    private String name;
    
    Person( String s )
    {
        name = s;
    }
    
    public String toString( )
    {
        return (this.name).toUpperCase();
    }
    
    public static void main( String args [ ] )
    {
        Person a = new Person( "Abby" );
        Person b = new Person( "Bo" );
        Person c = new Person( "Cameron" );
        Person d = new Person( "David" );
        
        LinkedHashSet< Person > mySet = new LinkedHashSet< String >( );
        
        for( int z = 0 ; z < 412 ; z += 1 )
        {
            mySet.add(a); //only adds a once, since sets cannot have duplicate elements
        }
        
        System.out.println( mySet.size() < 2 ); //true
        System.out.println( mySet.isEmpty() ); //false, an element has been added but not removed
        
        mySet.add(b);
        mySet.add(c);
        mySet.add(d);
        Person e = new Person( "elephant" );
        
        try
        {
            mySet.remove(e); //this does not produce a runtime error, it just has no effect
        }
        catch( Exception A )
        {
            System.out.println( "can't do that!" ); //doesn't run since no exceptions were thrown
        }
        
        Iterator< Person > setParse = mySet.iterator( );
        
        while( setParse.hasNext() )
        {
            System.out.println( "This person is: ".concat( setParse.next() ) ); //invoke the toString() method
        }
    }
}
