public class Lesson6
{
    public static void main( String args [ ] )
    {
        String t = "More Strings!";
      
        System.out.println( t.startsWith( "more" ) ); //false, case-sensitive
        System.out.println( t.endsWith( "!" ) ); //true
        System.out.println( t.indexOf( "x" ) ); //-1
        System.out.println( t.indexOf( "r" ) ); //first occurs at index position 2
        System.out.println( t.lastIndexOf( "r" ) + 2.0 ); //9.0, implicit cast to a floating-point number
        System.out.println( "Boston is cold and Boston is old".replaceFirst( "Boston" , "Chicago" ) );
        System.out.println( "twitter".replaceAll("t","s") ); //swisser
      
        System.out.println( t.substring(0) ); // == t == t.toString( ) for any non-empty string t
        System.out.println( t.substring(2) ); //re Strings!
        System.out.println( t.substring(0,2) ); //Mo
        System.out.println( t.substring(1,t.length())); //ore Strings!
    }
}
