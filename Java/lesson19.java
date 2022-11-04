import java.util.Math;
import java.util.Scanner;

public class Lesson19
{
    public static void main( String args [] )
    {
        /*
        * Last lesson was the first one where we imported a module/class, Scanner
        * Here, we also consider the Math class
        * Consider two important constants from the Math class, Pi and E, and various useful mathematical functions, from sqrt(x) to addExact(x,y)
        */
      
        System.out.println( Math.PI );
        System.out.println( "Natural logarithm: " + Math.E );
      
        System.out.println( Math.abs(-4.2) );
      
        System.out.println( Math.addExact(10,22) );
      
        System.out.println( Math.pow( 64.0 , 0.5 ) );
      
        System.out.println( Math.sin( Math.PI / 2 ) );
        System.out.println( Math.acos(1) );
        
        System.out.println( Math.max( -35 , -32 ) );
      
        System.out.println( Math.tan( Math.PI / (int)(4.0) ) );
      
        System.out.println( Math.decrementExact(91) );
      
        Scanner chilly = new Scanner(System.in);
      
        System.out.print( "Enter an integer: " );
        int v = chilly.nextInt( );
        System.out.print( "\n".concat( "One more please: " ) );
        v = Math.multiplyExact( v , chilly.nextInt( ) );
        System.out.println( "\n".concat( "The product of the two integers you entered is: " + v ) );
    } 
}
