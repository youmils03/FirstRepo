import java.util.Math;

public class Lesson20
{
    public static int f( int x )
    {
        return x * 10; //method accepts an integer and returns the integer times 10
    }
  
    public static boolean g( String y )
    {
        return y.length() % 2 == 0; //method returns true if the length of the input string is even, false otherwise
    }
  
    public static String concatenateThis( String s , int n )
    {
        String result;
        result = "";
      
        for( int k = 0 ; k < n ; k += 1 )
        {
            result = result.concat(s);
        }
      
        return result;
    }
  
    public static void main( String args [] )
    {
        System.out.println( f(3) );
      
        int c; //declare c
        c = f(9); //initialize c to the result of f(x) with int input x=4
        c += f(-2); //adjusts the value of c
        System.out.println( "c = " + Integer.toString(c) ); //Integer.toString() happens by default here...
      
        if( g("pi"+"zza") )
        {
            System.out.println( "yummy" ); //does not run. Why?
        }
        else
        {
            System.out.println( "nasty" ); //runs, because !( ("pi"+"zza").length() % 2 == 0 )
        }
      
        System.out.println( concatenateThis( "cat" , 8 ) ); //catcatcatcatcatcatcatcat
      
        if( underMain(-1,-1,8+2<10) )
        {
            System.out.println( 241 % 4 ); // runs, because !(8+2<10)
        }
        else if( true )
        {
            System.out.println( 242 % 2 ); //does not run, because the first boolean was already true
        }
        else
        {
            System.out.println( "no way jose" ); //does not run
        }
    } 
  
    public static int underMain( int x , int y , boolean z )
    {
        return !z; //functions can be defined underneath where they are called
    } //the function can accept inputs x and y but not actually use them in the definition
}
