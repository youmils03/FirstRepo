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
    * Accepts an int array and sorts it according to the insertion sort algorithm
    * @param values the array to sort
    * @return a sorted version of the array
    *
    */
    public static int [ ] insertionSort( int [ ] values )
    {
        for( int i = 1 ; i < values.length ; i++ )
        {
            int key = values[i];
            
            int j = i-1;
            
            while( j>=0 && values[j] > key )
            {
                values[j+1] = values[j];
                j=j-1;
            }
            
            values[j+1] = key;
        }
        
        return values;
    }
    
    /**
    * Accepts a static array of Person objects and sorts it according to the insertion sort algorithm and compareTo()
    * @param values the static array to sort
    * @return a sorted version of the array
    *
    */
    public static Person[ ] insertionSort( Person[ ] people )
    {
        for( int i = 1 ; i < people.length ; i++ )
        {
            Person key = people[i];
            
            int j = i-1;
            
            while( j>=0 && ( people[j] ).compareTo(key) > 0 )
            {
                people[j+1] = people[j];
                j=j-1;
            }
            
            people[j+1] = key;
        }
        
        return people;
    }
    
    /**
    * Accepts a dynamic array of Person objects and sorts it according to the insertion sort algorithm and compareTo()
    * @param values the arraylist to sort
    * @return a sorted version of the arraylist (dynamic array)
    *
    */
    public static ArrayList< Person > insertionSort( ArrayList< Person > people )
    {
        for( int i = 1 ; i < people.size() ; i++ )
        {
            Person key = people.get(i);
            
            int j = i-1;
            
            while( j>=0 && ( people.get(j) ).compareTo(key) > 0 )
            {
                people.set(j+1, people.get(j));
                j=j-1;
            }
            
            people.set(j+1, key);
        }
        
        return people;
    }
    
    public static void main( String args [ ] )
    {
        int [ ] scores = { 91 , 87 , 82 , 86 , 90 , 94 , 83 , 80 , 95 , 89 , 81, 81 };
        
        System.out.println( "gonna sort scores now: " );
        
        for( int p : Person.insertionSort(scores) )
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
        
        staticArray = insertionSort( staticArray );
        dynamicArray = Person.insertionSort( dynamicArray );
        
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
