
/**
 * Write a description of class Dog here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dog extends Entity
{
    private String name;
    
    Dog( String w )
    {
        this.name = w; //happens when the object is created
    }
    
    public void setName( String w )
    {
        this.name = w; //happens/called after the object is created
    }
    
    public String getName( )
    {
        return this.name;
    }
    
    public int getEight( )
    {
        return this.getSeven( ) + 1;
    }
    
    
}
