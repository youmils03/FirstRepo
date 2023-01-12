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
    * Accepts an int array and sorts it according to the selection sort algorithm
    * @param values the array to sort
    * @return a sorted version of the array
    *
    */
    public static int [ ] selectionSort( int [ ] values )
    {
        for( int i = 0 ; i < values.length ; i=i+1 )
        {
            int index = i;
            
            for( int j = i + 1 ; j < values.length ; j++ )
            {
                if( values[j] < values[index] )
                {
                    index = j;
                }
            }
            
            int smallerNumber = values[index];
            values[index] = values[i];
            values[i] = smallerNumber;
        }
        
        return values;
    }
    
    /**
    * Accepts a static array of Person objects and sorts it according to the selection sort algorithm and compareTo()
    * @param values the static array to sort
    * @return a sorted version of the array
    *
    */
    public static Person[ ] selectionSort( Person[ ] people )
    {
        for( int i = 0 ; i < people.length ; i=i+1 )
        {
            int index = i;
            
            for( int j = i + 1 ; j < people.length ; j++ )
            {
                if( ( people[j] ).compareTo( people[index] ) < 0 )
                {
                    index = j;
                }
            }
            
            Person smallerPerson = people[index];
            people[index] = people[i];
            people[i] = smallerNumber;
        }
        
        return people;
    }
    
    /**
    * Accepts a dynamic array of Person objects and sorts it according to the selection sort algorithm and compareTo()
    * @param values the arraylist to sort
    * @return a sorted version of the arraylist (dynamic array)
    *
    */
    public static ArrayList< Person > selectionSort( ArrayList< Person > people )
    {
        for( int i = 0 ; i < people.size() ; i=i+1 )
        {
            int index = i;
            
            for( int j = i + 1 ; j < people.size() ; j++ )
            {
                if( ( people.get(j) ).compareTo( people.get(index) ) < 0 )
                {
                    index = j;
                }
            }
            
            Person smallerPerson = people.get(index);
            people.set( index , people.get(i) );
            people.set( i , smallerPerson );
        }
        
        return people;
    }
    
    public static void main( String args [ ] )
    {
        int [ ] scores = { 91 , 87 , 82 , 86 , 90 , 94 , 83 , 80 , 95 , 89 , 81, 81 };
        
        System.out.println( "gonna sort scores now: " );
        
        for( int p : Person.selectionSort(scores) )
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
        
        staticArray = selectionSort( staticArray );
        dynamicArray = Person.selectionSort( dynamicArray );
        
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
