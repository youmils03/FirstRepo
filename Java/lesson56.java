import java.util.HashMap;
import java.util.Iterator;

public class C
{
    private String val;
    private String ID;
  
    C( String identifier, boolean indicator )
    {
        this.ID = identifier;
        if( indicator )
        {
            val = "happy";
        }
        else
        {
            val = "sad";
        }
    }
  
    public String toString( )
    {
          return this.ID + " is " + this.val;
    }
  
    public static void main( String args [ ] )
    {
        C v = new C("A104",false), w = new C("B202",true), x = new C("F420",300+100<=400);
        C y = new C("Z333",!true), z = new C("M411",!false);
      
        String a = "apple", b = "walnut", c = "carrot";
      
        HashMap< C , String > myDictionary;
        myDictionary = new HashMap< C , String >( );
      
        myDictionary.put( v , a );
        myDictionary.put( w , a );
        myDictionary.put( x , b );
        myDictionary.replace( x , b , c ); //changes the value of x from b to c since it was originally b
        myDictionary.replace( v , c , a ); //no effect since the value of v is not currently c
        myDictionary.put( y , a );
        myDictionary.put( z , b );
      
        System.out.println( myDictionary.containsKey(z) );
        System.out.println( myDictionary.containsValue( "bolt" ) );
      
        System.out.println( myDictionary.isEmpty( ) || myDictionary.size() == 0); //false, neither boolean is true
      
        Iterator< C , String > dictParse;
        dictParse = myDictionary.iterator( );
        int pair = 1;
      
        while( !(!(dictParse.hasNext())))  // double negative, equivalent to while( dictParse.hasNext() )
        {
            System.out.println( "pair #" + Integer.toString(pair) );
            Object currentObject = dictParse.next( );
            C currentElement = (C)(currentObject);
            System.out.println( "Key: " + currentElement );
            System.out.println( "Value: " + myDictionary.get(currentElement) );
            dictParse.remove( ); //removes each key-value pair
        }
      
        System.out.println( dictParse.size() > 0.25 ); //false, dictParse.size() == 0 since we removed each element
    }
}
