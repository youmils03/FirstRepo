import java.util.*;

public class Person
{
    private String name;
    
    Person( String x )
    {
        this.name = x;
    }
    
    public String toString( )
    {
        return this.name + " is a cool person";
    }
    
    public static void main( String args [ ] )
    {
        LinkedList< Person > group = new LinkedList< Person >( );
        
        Person a, b, c, d, e, f;
        a = new Person( "Louis" );
        b = new Person( "Andrea" );
        c = new Person( "Will" );
        d = new Person( "Toby" );
        e = new Person( "Carlisle" );
        f = new Person( "Jolene" );
        
        group.add(a);
        group.add(b);
        group.add(0,c); //adds c to the beginning of the linked list. More efficient than for an arraylist
        group.add(d);
        group.add(0,e); //e is the new head of the linked list. So we have [e,c,a,b,d]
        group.add(a); //of course, linked lists can have duplicates. [e,c,a,b,d,a]
        
        System.out.println( group.contains(f) ); //was never added, false
        System.out.println( group.indexOf(a) < group.lastIndexOf(a) ) //true, there is more than one occurrence
        
        double k;
        k = group.size( );
        k *= 2;
        System.out.println(k); //12.0
        
        Object B1 = new Boolean( group.isEmpty() );
        Boolean B2 = (Boolean)(B1);
        
        if( B2.booleanValue( ) )
        {
            System.out.println( "linked list empty" );
        }
        else
        {
            System.out.println( "there are still elements in here..." );
        }
        
        System.out.println( group.get(3) ); //this is not a recommended operation for linked listsg
        group.remove(0); //much quicker for a linked list than for an array list
        
        for( Object Z : group )  # a sense of polymorphism in a for-each loop
        {
            System.out.println( Z ); //invokes the toString( ) method from Person, not from Object
        }
    }
}
