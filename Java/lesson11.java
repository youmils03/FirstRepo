public class Lesson11
{
    public static void main( String args [ ] )
    {
        int u;
        u = 16;
      
        switch( u / 6 ):
        {
          case 0:
            System.out.println( "apple" ); // runs if u>=0 && u<6
          case 1:
            System.out.println( "orange" ); // runs if u>=0 && u<12, since there was no break statement in case 0
          case 2:
            System.out.println( "banana" ); // runs if u>=0 && u<18, since there was no break statement in case 1
          case 3:
            System.out.println( "walnut" ); // runs if u>=0 && u<24, since there was no break statement in case 2
            break;
          case 4:
            System.out.println( "pineapple" ); //runs if u>=24 && u<30, since there was a break statement in case 3
            break;
          default:
            System.out.println( "ice cube" ); //runs in all other cases (u<0 || u>=30)
        }
      
        /*
         * If you have a break statement at the end of each case, it functions as an if/elseif/else statement
         
         String k = "kiwi";
         int p;
         p = k.length(); //4
         
         switch(p*2):
         {
            case 7:
              System.out.println( "dog" );
              break;
            case 8:
              System.out.println( "cat" );
              break;
            case 9:
              System.out.println( "horse" );
              break;
            default:
              System.out.println( "bug" );
              break;
          }
          
          if( p*2 == 7 )
          {
            System.out.println( "dog" );
          }
          else if( p*2 == 8 )
          {
            System.out.println( "cat" );
          }
          else if( p*2 == 9 )
          {
            System.out.println( "horse" );
          }
          else
          {
            System.out.println( "bug" );
          }
    }
}
