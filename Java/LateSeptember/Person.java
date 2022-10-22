
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private int age;
    
    Person(String n,int a)
    {
        this.name = n;
        age = a;
    }
    
    Person( )
    {
        this("Peter",32);
    }
    
    public int getNumber( )
    {
        return 5;
    }
}
