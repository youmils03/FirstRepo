public class Lesson7
{
    public static void main( String args [ ] )
    {
        System.out.println( 6 + 2.0 ); //8.0
      
        double s = 3;
        System.out.println(s*s); //9.0
      
        String t = 54 + " apples"; //implicit cast of 54 into the String "54", then concatenation with " apples"
        System.out.println( t.substring(0,2) ); //"54"
        System.out.println( t.substring(1) ); //"4 apples"
        
        System.out.println( "4" + 2 ); //"42"
      
        String z = "Platform " + 9.75;
        System.out.println( z.indexOf("f"+"orm") );
        
        int numberOfApples = Integer.parseInt( "4" + "2" + "0" ); //420
        System.out.println( numberOfApples / 10 ); //42
        System.out.println( (numberOfApples+8) / 10 ); //42, floor division
        System.out.println( (numberOfApples+8) / (double)(10) ); //42.8, true division
      
        String GPAstring = "My GPA is 3.82".substring( "My GPA is 3.82".indexOf(".") - 1 );
        double GPA; //declare a variable
        GPA = Double.parseDouble(GPAstring); //initialize a variable and invoke Double's parseDouble method
        System.otu.println( GPA + 0.10 ); //3.92
      
        String p = Integer.toString(45+14);
        System.out.println( p + "3" ); //593
      
        String q;
        q = Double.toString(2.831 + 2.000);
        System.out.println( q.indexOf("2") ); //-1, "2" does not appear in "4.831"
    }
}
