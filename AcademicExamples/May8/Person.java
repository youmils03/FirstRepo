
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name; //method, instance, or static variable? --> instance
    private int age;
    
    private static int u = 10; //static variable
    
    Person( String n , int a )
    {
        name = n;
        this.age = a; //"this" is optional
        //this keyword is required when the PARAMETER (little a here) would overlap
        //with the ACTUAL NAME of the variable
    }
    
    Person( )
    {
        this.name = "Tony";
        age = 15;
    }
    
    public String getName( )
    {
        return this.name; //or if you really want, just "return name;"
    }
    
    public int getAge( )
    {
        return age; //more formally: return this.age;
    }
    
    public int getNumber( )
    {
        return 5;
    }
    
    public void setName( String potato ) //traditional setter method
    {
        this.name = potato;
    }
    
    public void haveBirthday( )
    {
        System.out.println( "Happy birthday!" );
        age += 1; //age++; age = age + 1;
    }
    
    public String toString( )
    //What does it mean to PRINT an INSTANCE of a class?
    //If x = Person( "Tony" , 15 ) --> System.out.println(x) --> Tony is 15 years old
    {
        return this.name + " is " + this.age + " years old";
    }
}
