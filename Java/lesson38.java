public interface I
{
    public abstract int f(String s);
}

public class J implements I
{
    private String name;

    J( )
    {
        name = "walrus";
    }
    
    public int f( String s )
    {
        return name.length() * s.length();
    }
    
    public void W() //optional method not mandated by the implemented interface
    {
        System.out.println( "water" );
    }
}

public class K implements I
{
    public int f( String u )
    {
        if( u.length() % 4 == 0 ) //a multiple of 4
        {
            return 3;
        }
        else if( u.length() % 2 == 0 ) //a multiple of 2 that isn't a multiple of 4
        {
            return 9;
        }
        else
        {
            return 15;
        }
    }
}

public class Tester
{
    public static void main( String args [ ] )
    {
         I[] identities = new I[ 6 ]; //can hold 6 objects, all of which must be instances of classes that implement I
          //cannot write = new I() to instantiate an I, but you CAN have this "abstract data structure"
          
          identities[0] = new J( );
          identities[1] = new K( );
          identities[2] = new J( );
          identities[3] = new K( );
          identities[4] = new K( );
          identities[5] = new K( );
      
         int jCount = 0 , kCount = 0;
      
          for( I element : identities )
          {
              System.out.println( "Operations with new element coming up..." );
              System.out.println( element.f( "watermelon" ) );
              if( element instanceof J )
              {
                  element.W();
                  jCount += 1;
                  continue; //do not increment kCount
              }
              kCount += 1;
          }
      
          System.out.println( "Number of J's: " + jCount );
          System.out.println( "Number of K's: " + kCount );
    }
}
