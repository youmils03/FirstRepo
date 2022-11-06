public class Lesson4
{
    public static void main( String args [ ] )
    {
        int a = 12 , b = 14; //multiple variable declaration-initializations on the same line for the same data type
        System.out.println( b - a ); //2
        
        double c, d;
        c = 15;
        d = c+5; //cannot initialize multiple variables on the same line unless you're declaring them on the same line
        System.out.println(c+d); //35.0
        
        System.out.println( (int)(2.12 + 0.5) ); //rounds 2.12 to the nearest integer
        System.out.println( (int)(5.82 + 0.5) ); //rounds 5.82 to the nearest integer
        System.out.println( (int)(-1.53 - 0.5) ); //rounds -1.53 to the nearest integer
        System.out.println( (int)(-1.49 - 0.5) ); //rounds -1.49 to the nearest integer
        
        int k = 100;
        k = k-1; //99
        k -= 1; //98
        k--; //97
        System.out.println( k-1.0 ); //96.0
        
        int seven = 8, eight = 7;
        int temp = seven;
        seven = eight;
        eight = temp;
        System.out.println( "seven: " + seven );
        System.out.println( "eight: " + eight );
    }
}
