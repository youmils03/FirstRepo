public class Lesson2
{
    public static void main( String args [ ] )
    {
        System.out.println( "time for arithmetic operations" );
      
        /*
         * Understand:
         * 1. addition +
         * 2. subtraction -
         * 3. multiplication *
         * 4. floor division / (with two integers)
         * 5. true division / (with one floating point number)
         * 6. remainder
         * 7. order of operations
         */
      
        System.out.println( 22 + 15 ); //addition
        System.out.println( 6 - 12 ); //subtraction
        System.out.println( 30 * 20 ); //multiplication
        System.out.println( 400 / 100 ); //floor division
        System.out.println( 364 / 100 );
        System.out.println( 364 / 100.0 ); //true division
        System.out.println( 200 / 100.0 ); //implicit casting, discussed in depth in a later video
        System.out.println( 19 % 4 ); //modulus
        System.out.println( 3 + 4 * 2 + 5 * 7 + 2 * 11 ); //order of operations
    }
}
