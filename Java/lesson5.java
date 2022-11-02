public class Lesson5
{
    public static void main( String args [ ] )
    {
        String t = "String Time!";
      
        /*
         * equivalent to:
         * String t; //declaration only
         * t = "string time"; //initialization only
         */
      
        System.out.println( t ); //use of a string variable
        System.out.println( t.length() ); //number of characters in t, counting spaces
        System.out.println( t.concat( " Sweet!" ) ); //concatenation, method one
        System.out.println( t + " My favorite!" ); //concatenation, method two
        System.out.println( t.isEmpty( ) ); //returns true if the string is empty, false if it has characters
        System.out.println( t.toUpperCase( ) ); //STRING TIME!
        System.out.println( t.toLowerCase( ) ); //string time!
        System.out.println( t.toString( ) ); //calling toString( ) on a String object returns the String object...
        System.out.println( t.equals( "string time!" ) ); //false, case-sensitive comparison
        System.out.println( t.equalsIgnoreCase( "STRING TIME!" ) ); //true, case-insensitive comparison
    }
}
