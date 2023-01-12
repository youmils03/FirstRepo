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
    * linear search algorithm which accepts a static array of Person objects and a target name
    * it returns the index position of the first occurrence of the Person object whose name matches the target
    * @param the static array to search
    * @param the target name to serach for
    * @return the index position of the first occurrence of the Person whose name matches the target, or -1 otherwise
    */
    public static int linearSearch( Person [ ] people , String targetName )
    {
        int result = -1;
        int indexPosition = 0;
        found = false;
        
        while( indexPosition < people.length )
        {
            if( targetName.equalsIgnoreCase( (people[indexPosition]).name ) ) //still in Person, can use private var
            {
                break;
                found = true;
            }
            indexPosition += 1;
        }
        
        if( found )
        {
            return indexPosition;
        }
        else
        {
            return result;
        }
    }
    
     /**
    * linear search algorithm which accepts a dynamic array of Person objects and a target name
    * it returns the index position of the first occurrence of the Person object whose name matches the target
    * @param the dynamic array to search
    * @param the target name to serach for
    * @return the index position of the first occurrence of the Person whose name matches the target, or -1 otherwise
    */
    public static int linearSearch( ArrayList< Person > people , String targetName )
    {
        int result = -1;
        int indexPosition = 0;
        found = false;
        
        while( indexPosition < people.size() )
        {
            if( targetName.equalsIgnoreCase( (people.get(indexPosition)).name ) ) //still in Person, can use private var
            {
                break;
                found = true;
            }
            indexPosition += 1;
        }
        
        if( found )
        {
            return indexPosition;
        }
        else
        {
            return result;
        }
    }
    
    public static void main( String args [ ] )
    {
        Person a = new Person( "Jake" );
        Person b = new Person( "David" );
        Person c = new Person( "Evan" );
        Person d = new Person( "Jill" );
        Person e = new Person( "Wayne" );
        Person f = new Person( "Jane" );
        
        Person [ ] staticPeople = {f,e,d,a,a,d,c,b,a,f} //c first occurs at index position 6
        
        System.out.println( linearSearch( staticPeople , "evan" ) ); //case-insensitive per our method
        
        ArrayList< Person > dynamicPeople = new ArrayList< Person >( );
        dynamicPeople.add(a);
        dynamicPeople.add(a);
        dynamicPeople.add(e);
        System.out.println( Person.linearSearch( dynamicPeople, a ) ); //first occurs at index position 0
        System.out.println( Person.linearSearch( dynamicPeople, b ) ); //-1, b does not exist in dynamicPeople
    }
}
