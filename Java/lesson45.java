public class Lesson45
{
    public static void main( String args [ ] )
    {
          Exception E = new ArithmeticException( "bad math" ); //polymorphism
          System.out.println( E.getMessage( ) );
          System.out.println( E );
      
          try
          {
              System.out.println( "reachable" );
              throw E;
              System.out.println( "unreachable" );
          }
          catch( IndexOutOfBoundsException B ) //wrong type of exception, doesn't run
          {
               for( int k = 0 ; k < 200 ; k+= 1 )
               {
                    System.out.println(400*k);
               }
          }
          catch( RuntimeException P ) //ArithmeticException is a subclass of RuntimeException, run this
          {
               System.out.println( "sup" );
          }
      
          String name = "Peter" , state = "Texas";
          int age = 32;
          double favoriteNumber;
          favoriteNumber = 8.320213;
          
          System.out.printf( "My name is %s and I live in %s%s" , name , state , "\n" ); //My name is Peter and I live in Texas
          System.out.printf( "In 5 years, I'll be %d" , (age+5) );
          System.out.printf( "Too %s many %s arguments!" , "gosh darn" , "freakin" , "so many" , "why so many" , "yikes" );
      
          System.out.println( );
          System.out.printf( "Age: %20d%s" , age , "\n" );
          System.out.printf( "Age: %30d%s" , age , "\n" );
          System.out.printf( "Number: %8.4f%s" , favoriteNumber , "\n" );
          System.out.printf( "Number: %20.11f" , favoriteNumber , "\n");
    }
}
