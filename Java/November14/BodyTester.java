
/**
 * Write a description of class BodyTester here.
 * 
 * a constructor is a function/method with the same name of the class that creates
 * an instance of the class
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BodyTester
{
    public static void main( String args [] )
    {
        Body x = new Body(40);
        System.out.println(x);
        
        Entity y; //you can declare an object in an abstract class or interface
        y = new Body(-2); //you can NOT instantiate an object in an interface
        System.out.println( y.toString() ); //System.out.println(y);
        
        Object S;
        S = new Body( "Emily" ); //-1
        //System.out.println( S.getValue() ); //compile-time error
        
        Body T = (Body)(S);
        System.out.println( T.getValue() ); //3
        
        System.out.println(S); //3
        
        System.out.println( T.logic( "soccer" ) ); //false
        System.out.println( T.logic( "balls" ) );
        
        Entity burger = new Body( );
        //System.out.println( burger.logic() );
        //Entity interface does not mandate/"have" a logic() method
        //which accepts no parameters. Therefore, burger cannot use it
        
        System.out.println( burger.logic(15) );
        
        Body.printBody(T,x); //20
        
        Body.printBody(T,T); 
    }
}
