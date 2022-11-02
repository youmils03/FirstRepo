public class Lesson8
{
    public static void main( String args [ ] )
    {
        System.out.println( 10+2 > 4+6 ); //greater than
        System.out.println( 3 - 2 <= 2 - 3 ); //less than or equal to
        System.out.println( 19 == 28 - 9 ); //equality
        System.out.println( 5 != 30 - 25 ); //non-equality
        System.out.println( !( 3 + 3 != 6) ); //true, double negative
      
        System.out.println( true || false ); //true, or boolean
        System.out.println( true && false ); //false, and boolean
      
        System.out.println( ( 5 * 3 > 16 ) || !(3 + 2 == 900) ); //true, second boolean is true
        System.out.println( ( 8 + 9 == 17 ) && !(8 + 8 != 462) ); //false, second boolean is false
    }
}
