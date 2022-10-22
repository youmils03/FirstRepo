
/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Food
{
    private String item;
    private double price;
    
    Food( String i , double price )
    {
        item = i; //more formally, this.item = i;
        this.price = price; //this is required because price=price (?)
    }
    
    Food( )
    {
        item = "pizza";
        price = 6.25;
    }
    
    Food( String x )
    {
        this.item = x;
        price = 8.25;
    }
    
    public String toString( )
    {
        //return super.toString( ); //This method has absolutely no effect, because you would be calling Object's
        //toString method anyway if you didn't provide a toString( ) method
        return "This " + this.item + " costs $" + this.price;
    }
}
