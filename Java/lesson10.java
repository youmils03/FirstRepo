public class Lesson10
{
    public static void main( String args [ ] )
    {
        int k = 16;
        boolean k1 = k % 4 == 0;
        boolean k2 = k % 2 == 0;
        boolean k3 = k % 5 == 0;
        
        if( k1 == true ) //or if(k1)
        {
            System.out.println( k + " is divisible by 4" );
        }
        
        if( k2 )
        {
            System.out.println( k + " is divisible by 2" );
        }
        
        if( k3 )
        {
            System.out.println( k + " is divisible by 5" );
        }
        
        int age = 19;
        
        if( age < 21 ) //only runs if age<21
        {
            System.out.println( "you can't drink alcohol!" );
        }
        else if( age < 35 )  // only runs if !(age<21) && (age<35). Therefore, age is between 21 and 34 inclusive
        {
            System.out.println( "you can drink, but you can't be president!" );
        }
        else if( age < 55 ) // only runs if !(age<21) && !(age<35) && age<55. Therefore, age is between 35 and 54 inclusive
        {
            System.out.println( "you can be president, a young one!" );
        }
        else //only runs if !(age<21) && !(age<35) && !(age<55). Therefore, age is at least 55
        {
            System.out.println( "you can be president, an old one!" );
        }
        
        //you can have an if-else block without elseif statements. Either one body will execute, or the other.
        //you can have an if-elseif block without an else statement. If all booleans fail, no code will run.
    }
}
