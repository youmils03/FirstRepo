
/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car implements Comparable
{
    private String color;
    private int topSpeed;
    private int price;
    
    Car( String c , int topSpeed , int x )
    {
        color = c;
        this.topSpeed = topSpeed;
        this.price = x;
    }
    
    public int getPrice( )
    {
        return this.price;
    }
    
    Car( )
    {
        this( "red" , 125 , 16000 );
        /*
         * equivalent to using Color(c,topSpeed,x) with c="red", topSpeed=125, x=16000
         */
    }
    
    public String toString( ) //overriding the toString( ) method from the superclass
    {
        String u = "Color: " + this.color + ", Price: " + this.price + ", Top speed: " + this.topSpeed;
        return u + "\n";
    }
    
    /*
     * Procedure for sorting instances in your class
     * 1. implement the Comparable interface
     * 2. define a compareTo method which accepts an object and returns an int. Instance method
     * 3. polymorph the input to that method into your class type
     * 4. provide a definition of comparability (what does "less than" mean?)
     * 5. implement a sorting algorithm, Collections.sort(x) for some collection x
     */
    
    public int compareTo( Object t )
    {
        Car u = (Car)(t);
        
        if( this.price < u.price )
        {
            return -1;
        }
        else if( this.price > u.price )
        {
            return 1;
        }
        else
        {
            if( this.topSpeed < u.topSpeed )
            {
                return -1;
            }
            else if( this.topSpeed > u.topSpeed )
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
    }
    
    /**
     * STATIC implementation of the compareTo method
     * This is NOT the traditional compareTo method, which is called ON an instance and only 
     * accepts ONE other instance. 
     * This method accepts two parameters and calls compareTo on the first one, invoking the second
     * one as an argument
     * 
     * @param a the first object to compare
     * @param b the second object to compare
     * @return -1 if a<b, 1 if a>b, -1/0/1 otherwise (see method)
     */
    public static int compareTo( Object a , Object b )
    {
        Car c = (Car)(a);
        Car d = (Car)(b);
        return c.compareTo(d);
    }
    
    public void applyDiscount( )
    {
        price -= 1000;
    }
    
    public void printDetails( )
    {
        System.out.println( "This car is " + this.color + " and costs $" + this.price );
    }
}
