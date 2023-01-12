public class Lesson8
{
    public static void main( String args [ ] )
    {
        boolean a = (26 < 38);
        System.out.println(a); //boolean variable
      
        boolean b = a || false , c = a && false; //multiple variable declarations on one line
        /*
         * a||false == true||false == true, so b is true since at least one of the statements is true
         * a&&false == true&&false == false, so c is false since at least one of the statements is false
         */
        System.out.println(!b); //!b == false since b==true
        System.out.println(!c); //!c == true since c==false
      
        boolean d; //declaring a boolean variable without yet initializing it. Neither true nor false yet
      
        System.out.println( !(!(5==10-5)) ); //true, double-negation
      
        /*
         * DeMorgan's laws in propositional logic
         * !(a || b) == !a && !b. It's not the case that at least one of two statements is true, if and only if both statements are false
         * !(a && b) == !a || !b. It's not the case that both of two statements are true, if and only if at least one statement is false.
         */
      
      boolean e = !true; //false
      e = !e; //reassignment of a boolean variable. Flip its value
      e = e && !e; //e is true and !e is false, so e becomes true&&false which is false
      e = (2<200) || e; //2<200 is true and e is false, so e becomes true||false which is true
      System.out.println( e == false ); //false
      
      String k1 = true + " story!";  //"true story!"
      String k2 = k1.substring(0,4); //"true"
      System.out.println( k2.toUpperCase( ) ); //"TRUE"
    }
}
