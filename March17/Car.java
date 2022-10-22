
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car
{
    //declare private instance variables
    private String model;
    private int year;
    private String color;
    
    Car( String m , int y ,String color )
    {
        model = m;
        this.year = y; //"this" is optional
        this.color = color; //"this" is required to distinguish the color parameter from the instance variable
    }
    
    Car( String model , int year )
    {
        this.model = model;
        this.year = year;
        this.color = "black";
    }
    
    Car( ) //constructor with no parameters --> default constructor
    {
        model = "Civic";
        this.year = 2006;
        this.color = "red";
    }
    
    public String getModel( )
    {
        return model; //return this.model;
    }
    
    public int getYear( )
    {
        return this.year;
    }
    
    public String getColor( )
    {
        return this.color; //return color;
    }
    
    public void setModel( String model )
    {
        this.model = model;
    }
    
    public void setYear( int w )
    {
        year = w;
    }
    
    public void setColor( String cactus )
    {
        this.color = cactus;
    }
    
    public String toString( )
    {
        return "This is a " + this.year + " " + this.color + " " + model;
    }
}
