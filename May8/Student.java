
/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student extends Person
{
    private String college;
    private double studentLoan;
    
    Student( String name , int age , String college , double SL )
    {
        super( name , age );
        /*
         * name is a String, and age is an int according to this constructor
         * This line looks for the constructor in the superclass that accepts a String and an int,
         * and it will take the functionality from that superclass and assign the instance variables
         * accordingly
         */
        this.college = college; //"this" is required
        this.studentLoan = SL; //or, if you're lazy, studentLoan = SL;
    }
    
    public String getCollege( )
    {
        return this.college; //or if you're lazy, return college;
    }
    
    public double getStudentLoan( )
    {
        return studentLoan; //the ACTUAL NAME of the variable
    }
    
    public void transfer( String college )
    {
        this.college = college;
    }
    
    public void dropOut( )
    {
        this.college = "";
        /*
         * equivalently:
         * 1. this.transfer("");
         * 2. transfer("");
         */
        // this.transfer( "" );   //or more lazily, transfer("");
    }
    
    public void payOffThis( double x )
    {
        studentLoan -= x; //slight variation/spinoff of a traditional setter method
    }
    
    /*
     * 2 uses of the super( ) keyword:
     * 1. invoke the constructor of the superclass to assign instance variables that were defined there
     * 2. more generally call one of the methods from the superclass
     */
    
    public String toString( )
    {
        return super.toString( ) + " and goes to " + this.college + " University";
    }
    
    public int getNumber( )
    {
        return super.getNumber( ) - 1;
    }
}
