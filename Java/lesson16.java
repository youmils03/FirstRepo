public class Lesson16
{
    public static void main( String args [ ] )
    {
        char k = 'P';
        System.out.println(k);
        k += 1; //k is reassigned to the character with one higher ASCII value than it had previously (implicit casting)
        System.out.println(k); 
        k += 4;
        System.out.println(k);
      
        System.out.println( (int)('d') ); //explicit cast to yield the ASCII character encoding for char d
      
        int s = '7';
        System.out.println( s ); //ASCII character encoding of the digit 7
      
        System.out.println( (char)('5' + 2) ); //character with an ASCII encoding two higher than the digit 5
        System.out.println( (char)('z' - 3) ); //character with the ASCII encoding three lower than the letter z
      
        char [ ] myChars = { 'A' , '3' , 'g' , '+' , ' ' , 'S' , '_' };
        String myString = String.copyValueOf( myChars ); //accepts an array of chars and returns a connected String object
        System.out.println( myString );
      
        String yourString;
        yourString = "BUMBLE" + "BEE";
        
        for( char A : yourString.toCharArray( ) ) //x.toCharArray() is called on a String and returns an array of its characters
        {
            System.out.println( "ASCII Code: " + (A+0) ); //implicit casting of char to int
        }
    }
}
