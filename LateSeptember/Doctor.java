
/**
 * For a constructor that makes a call to one of the superclass's
 * constructors, super(x,y,...) must be the first line
 * of code.
 */
public class Doctor extends Person
{
    private String hospital;
    
    Doctor( String name , int age , String hospital )
    {
        super( name , age );
        this.hospital = hospital;
    }
    
    public int getNumber( )
    {
        int t = 2;
        t += super.getNumber( );
        return t;
    }
    
    public String getHospital( )
    {
        return this.hospital;
    }
    
    public String toString( )
    {
        return this.hospital;
    }
}
