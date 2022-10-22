
/**
 * Write a description of class B here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class B extends A
{
    B( String x )
    {
        super(x + " hot dog"); //calls the constrctor from the superclass and applies x as the input to it
    }
    
    public String toString( )
    {
        return super.name;
    }
}
