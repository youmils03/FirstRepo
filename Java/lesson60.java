public class Lesson60
{
     public static void main( String args [ ] )
     {
          /* Go google 5 things
          * 1. integer java api
          * 2. double java api
          * 3. float java api
          * 4. long java api
          * 5. short java api
          */
       
          System.out.println( Integer.MAX_VALUE );
          System.out.println( Integer.MIN_VALUE );
          System.out.println( Integer.SIZE ); //the number of bits (0's and 1's) stored by an integer
       
          System.out.println( Double.MAX_VALUE );
          System.out.println( Double.SIZE );
          System.out.println( Double.BYTES ); //x.BYTES == x.SIZE / 8, since BYTES are bigger
          
          System.out.println( Long.MAX_VALUE );
          System.out.println( Long.SIZE );
          System.out.println( Long.BYTES );
       
          int g = Integer.MAX_VALUE - 10;
          System.out.println( (short)(g) );
          System.out.println( (long)(g) );
       
          Float h = new Float(3.21301923);
          System.out.println( h.intValue() );
          System.out.println( h.longValue() );
       
          
     }
}
