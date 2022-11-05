//Please copy and paste the code from these 4 Java classes into 4 separate Java files for use within the same project
//This code exhibits two options for threading

public class Person extends Thread
{
    private String val;

    Person( String s )
    {
        val=s;
    }

    public void run( )
    {
        System.out.println( "human being" );
        System.out.println( this.val );
    }
}

public class PersonTester
{
    public static void main( String args [ ] )
    {
         Person P;
         P = new Person( "Sam" );
         P.start( );
    }
}

public class Alien implements Runnable
{
    private String val;
    
    Alien( )
    {
        val = "mulligans";
    }
    
    public void run( )
    {
        System.out.println( "planet " + this.val );
    }
}

public class AlienTester
{
    private static final boolean logic = false;
    /*
    * Recall the properties of class variables above
    * 1. private --> logic can ONLY be used in AlienTester
    * 2. static --> logic is called on AlienTester, not on an instance of AlienTester
    * 3. final --> cannot be changed after initialization
    * 4. boolean --> logic must hold either a true or false value
    */
  
    public static void main( String args [ ] )
    {
        if( ! AlienTester.logic )  //true
        {
            Object A; //declare
            A = new Alien( ); //instantiate
            Alien B = (Alien)(A); //polymorph
            Thread C = new Thread(B); //generate thread
            C.start( ); //start the thread      
        }
    }
