public class Lesson26
{
    public static void printLogicalCombations( boolean a , boolean b )
    {
        System.out.println( "And: " + Boolean.logicalAnd(a,b) );
        System.out.println( "Or, like at least one of them: " + Boolean.logicalOr(a,b) );
        System.out.println( "OR, like exactly one of them: " + Boolean.logicalXor(a,b) );
    }
  
    public static void main( String args [ ] )
    {
        System.out.println( "Maximum integer: " + Integer.MAX_VALUE );
        
        Integer a = new Integer(16);
        System.out.println( a.intValue( ) - 6 );
        System.out.println( 10 * a.doubleValue( ) );
        
        String b = a.toString( );
        System.out.println( b.length( ) );
      
        System.out.println( Integer.sum(30,60) );
        System.out.println( Integer.min(-3,-5) );
        System.out.println( Integer.parseInt( "3" + "2" ) + Integer.parseInt( "5".concat("00") ) );
      
        System.out.println( "Maximum double: " + Double.MAX_VALUE );
      
        Double c = new Double( "6" + "." + "2" + "5" );
        double d = c.doubleValue( );
        System.out.println( d > 6 );
        System.out.println( d > 7 );
        
        System.out.println( c ); //invokes c.toString( ) for Double's toString( ) method
        System.out.println( c.intValue( ) );
      
        System.out.println( Double.max( 6.1 , 2.727 ) );
      
        System.out.println( Double.sum( 3.0 , 126.0 ) );
      
        Boolean B1 = new Boolean(true) , B2 = new Boolean( "fa" + ( "L".toLowerCase( ) ).concat( "se" ) );
        System.out.println( B1.booleanValue( ) && B2.booleanValue( ) );
        System.out.println( B1.booleanValue( ) || B2.booleanValue( ) );
      
        String e = Boolean.toString( 600 + 200 < 700 );
        System.out.println( e.substring(0,1) );
      
        boolean u = 4 < 10;
        boolean v = 9 < 10;
        Lesson26.printLogicalCombations(u,v);
      
        Character lion = new Character( 'L' );
        System.out.println( ( lion.toString( ) ).equalsIgnoreCase( ( "lion" ).substring(0,1) ) );
        Character z = Character.valueOf( (char)('G'+1) );
        System.out.println( lion.compareTo(z) );
    }
}
