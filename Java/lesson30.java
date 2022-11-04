public class Lesson30
{
    /**
    * Recursive function which accepts an integer n and returns (|n|)!, (n factorial, flips n if it comes in negative)
    * Recall that n! == 1 if n == 0, n! == n * (n-1)! if n > 0
    * So 3! = 3 * 2! = 3 * (2 * 1!) = 3 * (2 * (1 * 0!)) = 3 * (2 * (1 * 1)) = 3 * (2 * 1) = 3 * 2 = 6
    *
    * @param n an integer. Theoretically nonnegative but flipped nonnegative if it comes in negative
    * @return n!
    */
    public static int factorial(int n)
    {
        if( n < 0 )
        {
            n = -n;
        }
        
        if( n == 0 )
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);
        }
    }
    
    //Write your Javadocs for the Fibonacci sequence here. Recall that it's the sum of the previous two numbers
    public static int Fibonacci( int n )
    {
        if( n==1 || n==2 )
        {
            return 1;
        }
        else
        {
            return Fibonacci(n-1) + Fibonacci(n-2); //one function call makes formal mention of class name
        }
    }
    
    public static void main( String args [ ] )
    {
        int a = factorial(4); //24
        System.out.println(a);
        
        System.out.println( Fibonacci(8) ); //1,1,2,3,5,8,13,21 --> 21
        
        System.out.println( factorial(-3) );
        System.out.println( Fibonacci(16) );
        
        double s;
        s = factorial(6); 
        System.out.println(s); //120.0
        
        System.out.println( factorial(1) <= Fibonacci(1) );
        System.out.println( factorial(2) <= Fibonacci((int)(2.99)) );
        
        printCharacter( '$' , 1 );
        Lesson30.printCharacter( 'v' , 3 );
        printCharacter( '@' , 10 );
        printCharacter( '!' , -10 ); //shows that printCharacter(c,n) can be improved
    }
    
    /**
    * Function which accepts a character and an integer and prints the character that many times, on different lines
    * @param c the character to print
    * @param n the number of times to print the character
    */
    public static void printCharacter( char c , int n )
    {
        System.out.println(c);
        
        if( n>1 )
        {
            Lesson30.printCharacter( c , n-1 );
        }
    }
}
    
    
