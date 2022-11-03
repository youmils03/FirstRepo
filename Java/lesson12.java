public class Lesson12
{
    public static void main( String args [ ] )
    {
        int counter = 0;
      
        while( counter < 5 ) //checks a boolean, executes code once for each evaluation of true, stops at first false
        {
            System.out.println( "trees and bushes in the " + "for".concat("est") ); //shows 2 ways to concatenate strings
            counter++; //prevents an infinite loop
        }
    
        int t = 6;
      
        while( t < 9 )
        {
            System.out.println( "Value: " + Integer.toString( 3*t + 20 ) ); //explicit (unnecessary) casting of int to string
            t += 1;
        }
      
        int s, t;
        s = 16;
        while( s < 48 )
        {
            t = 3;
            while( t < 6 ) //nested while loop
            {
                System.out.println(s/t);
                t = 1+t;
            }
            s=5+t;
        }
    }
}
      
        
