public class Person implements Comparable //the Comparable interface mandates a compareTo( ) method which is required for sorting arbitrary objects of a class
{
    private String name; //declare private instance variable
    
    Person(String u) //first constructor, not the only one
    {
        name=u;
    }
    
    Person(String u,int a)
    {
        this(u + " Smith"); //if you pass in an age, disregard it and just apply the constructor which accepts one String argument to the input u + " Smith"
    }
    
    /*
     * blank default constructor by default
     * Person( )
     {
    
     }
     */
    
    public int compareTo( Object s )
    {
        Person t = (Person)(s);
        
        if( this.name.length() < t.name.length( ) )
        {
            return -1;
        }
        else if( t.name.length() < this.name.length() )
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public static void main( String args [ ] )
    {
        Person a = new Person( "Scott" ) , b = new Person( "Tim" , 28 ); //a.name == "Scott", b.name == "Tim Smith"
        System.out.println(a.compareTo(b)); //a has the shorter name per the modified constructor call, so -1
        System.out.println(b.compareTo(a)); //1. Essentially, b>a per our compareTo() method
    }
}
