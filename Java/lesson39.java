import java.util.*;

public class Person implements Comparable
{
    private String name;
  
    Person( String t )
    {
        this.name = t;
    }
  
    Person( )
    {
        this("Scott");
    }
  
    public String toString( )
    {
        return this.name;
    }
  
    public int compareTo( Object s )
    {
        Person t = (Object)s;
        
        int u = (this.name).length( ) , v = (t.name).length( );
        
        if(u<v)
        {
            return -1;
        }
        else if(v<u)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
    /**
    * Accepts an int array and sorts it according to the bubble sort algorithm
    * @param values the array to sort
    * @return a sorted version of the array
    *
    */
    public static int [ ] bubbleSort( int [ ] values )
    {
        for( int y = 0 ; y < values.length - 1 ; y += 1 )
        {
            for( int z = 0 ; z < values.length - y - 1 ; z += 1 )
            {
                if( values[z+1] < values[z] )
                {
                    int substitute = values[z];
                    values[z] = values[z+1];
                    values[z+1] = substitute;
                }
            }
        }
        
        return values;
    }
    
    /**
    * Accepts a static array of Person objects and sorts it according to the bubble sort algorithm and compareTo()
    * @param values the static array to sort
    * @return a sorted version of the array
    *
    */
    public static Person[ ] bubbleSort( Person[ ] people )
    {
        for( int y = 0 ; y < people.length - 1 ; y += 1 )
        {
            for( int z = 0 ; z < people.length - y - 1 ; z += 1 )
            {
                if( ( people[z+1] ).compareTo( people[z] ) < 0 )
                {
                    Person substitute;
                    substitute = people[z];
                    people[z] = people[z+1];
                    people[z+1] = substitute;
                }
            }
        }
        
        return people;
    }
    
    /**
    * Accepts a dynamic array of Person objects and sorts it according to the bubble sort algorithm and compareTo()
    * @param values the arraylist to sort
    * @return a sorted version of the arraylist (dynamic array)
    *
    */
    public static ArrayList< Person > bubbleSort( ArrayList< Person > people )
    {
        for( int y = 0 ; y < people.size( ) - 1 ; y += 1 )
        {
            for( int z = 0 ; z < people.size( ) - 1 - y ; z++ )
            {
                if( ( people.get(z+1) ).compareTo( people.get(z) ) < 0 )
                {
                    Person substitute = people.get(z);
                    people.set(z, people.get(z+1));
                    people.set(z+1, substitute);
                }
            }
        }
        
        return people;
    }
    
    public static void main( String args [ ] )
    {
        int [ ] scores = { 91 , 87 , 82 , 86 , 90 , 94 , 83 , 80 , 95 , 89 , 81, 81 };
        
        System.out.println( "gonna sort scores now: " );
        
        for( int p : Person.bubbleSort(scores) )
        {
            System.out.println( p );
        }
    
        Person a = new Person( "Becky" );
        Person b = new Person( "Bo" );
        Person c = new Person( "Geraldo" );
        Person d = new Person( "Diana Acquesta" );
        Person e = new Person( "Tim" );
        Person f = new Person( "Camron" );
        Person g = new Person( "Xi" );
        
        Person [ ] staticArray = {a,b,c,d,e,f,g};
        
        ArrayList< Person > dynamicArray = new ArrayList< Person >( );
        
        for( Person j : staticArray )
        {
            dynamicArray.add(j);
        }
        
        staticArray = bubbleSort( staticArray );
        dynamicArray = Person.bubbleSort( dynamicArray );
        
        System.out.println( "sorted static array" );
        
        for( int sit = 0 ; sit < staticArray.length ; sit = sit+1 )
        {
            System.out.println( staticArray[sit] );
        }
        
        int tape = 0;
        
        while( tape < dynamicArray.size( ) || false )
        {
            System.out.println( dynamicArray.get(tape) );
            tape += 1;
        }
    }
}
