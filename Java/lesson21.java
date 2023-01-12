public class Lesson21
{
    public static void main( String args [ ] )
    {
        double v = f( );
        System.out.println( v * 100 ); //200.0, because v was declared as a double and assigned to 2.0
        
        boolean y = f(3); //prints 1 to the console as a result of calling f with input 3
        boolean z = f(4); //prints 2 to the console as a result of calling f with input 4
        
        if( y && z ) //false because z is false
        {
            f(2.5,8.3);
        }
        else if( y || z ) //true because y is true
        {
            f(-6.4,-8.2);
        }
        else
        {
            f(9.1,-3.5);
        }
    }
    
    public static int f( ) //input which accepts no inputs
    {
        return 2;
    }
    
    public static boolean f(int x) //input which both prints something and returns a value
    { 
        System.out.println(x-2); //this function prints x-2 whenever it is invoked/called
        return x % 2 != 0; //g(x) is true if x is odd
    }
    
    public static void f(double a, double b) //input which does not return anything (i.e. void method)
    {
        System.out.println( a<b || (a<0 && b<0) ); //prints true if a is less than b, or if they're both negative
    }
}
