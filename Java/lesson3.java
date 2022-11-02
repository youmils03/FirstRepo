public class Lesson2
{
    public static void main( String args [ ] )
    {
        System.out.println( "time for variables" );
      
        int a = 4;  //integer variable
        System.out.println(10+a);
      
        double b = 3.62;  //floating-point variable
        System.out.println( b*10 );
      
        double c = 1;
        System.out.println(a+c); //5.0, since c==1.0 (implicit casting)
      
        int d; //declare a variable
        d = (int)(4.99); //initialize a variable
        System.out.println( d + (int)(2.23) ); //4+2==6
        
        System.out.println( (int)(5.0) + (double)(2) ); //7.0
      
        double e;
        e = 3.8; //initialized to 3.8
        e = 91; //reassigned to 91.0
        e = e + 2; //93.0
        System.out.println((int)(e + 0.44)); //93
      
        int u = 8;
        u = u + 1; //9
        u += 1; //10
        u++; //11
        System.out.println(u);
    }
}
