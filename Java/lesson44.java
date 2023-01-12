public class Lesson44 extends Object //every class inherits from Objet by default
{
    public static void naturalException( )
    {
        int r[] = { 9 , 3 , 2 , 4 };
        System.out.println( r[r[3]] ); //throws an ArrayIndexOutOfBoundsException (runtime error) naturally
    }
  
    public static void engineeredException( )
    {
        System.out.println( "let's mess up the program by pretending that there's an issue with arithmetic" );
        throw new ArithmeticException( "This is the error message for an exception, you can specify it!" );
    }
  
    public static void engineeredException( String u )
    {
        throw new StringIndexOutOfBoundsException(u); //pretends there's an issue with string indexing
    } //throws the error message specified by the input u
  
    public static void solutionOne( )
    {
          try
          {
              System.out.println( "no issue yet" );
              System.out.println( 15 / 0 );
              System.out.println( "cannot reach this statement" );
          }
          catch( Exception A )
          {
              System.out.println( "woah, there's an error up there! Let's pick up here instead" );
          }
    }
  
    public static void solutionTwo( )
    {
          try
          {
              int q [ ] = {5};
              System.out.println(q[1]);
          }
          catch( StringIndexOutOfBoundsException S ) //this is not the exception that would be caught
          {
              System.out.println( "can't index a string like that" );
          }
          catch( IndexOutOfBoundsException I ) //ArrayIndexOutOfBounds falls within this category, so run this block
          {
              System.out.println( "can't index an ARRAY like that..." ); //wouldn't run for a string indexing issue
          }
          catch( RuntimeException R )
          {
              System.out.println( "you didn't have an indexing issue, but something went wrong" );
          }
          finally
          {
              System.out.println( "This code always definitely runs regardless of any issues raised or not raised above" );
          }
    }
  
    public static void main( String args [ ] )
    {
          //naturalException(); //runtime error if you uncomment this
          //Lesson44.engineeredException();
          //Lesson44.engineeredException( "quesadilla" );
      
          solutionOne();
          Lesson44.solutionTwo( );
    }
}
