
/**
 * Write a description of class PersonTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonTester
{
    public static void main( String args [ ] )
    {
        Person a = new Person( "Timot" , 35 );
        
        System.out.println( (a.getName( )).lastIndexOf( "t" ) );
        
        for( int s = 0 ; s < 8 || false ; s += 1 )
        {
            a.haveBirthday( );
        }
        
        System.out.println( (a.getAge( ) / (double)(100) ) );
        
        Object s = new Person( "Tony" , 15 );
        System.out.println( s ); //here we'll use Person's toString( ) method, not
        //Object's toString( ) method
        
        //s.setName( "Cassandra" ); --> polymorphism: since you declared s as an Object
        //and Object has no method called setName, this would result in a compile-time error
        
        Person t = (Person)(s); //you can always convert to one of the subclasses
        
        /*
         * Suppose B is a subclass of A, C is a subclass of B, D is a subclass of C
         * A x = new D( );
         * B x1 = (B)(x);
         * C x2 = (C)(x);
         * D x3 = (D)(x);
         * 
         * When we have polymorphism, if a method is OVERRIDDEN/REDEFINED in the subclass, then
         * it will use the subclass's version of that method, BUT if you declare something in the
         * superclass and the method that you're trying to call is nowhere even defined in the
         * superclass, then you will have a compile-time error
         */
        
        Student r;
        r = new Student( "Tony" , 15 , "Stanford" , 1700 );
        
        System.out.println( r.getStudentLoan( ) );
        
        String z = r.getName( );
        System.out.println( (z + z).length( ) / 3 ); // 8/3, so 2
        
        Person key = new Student( "George" , 22 , "MIT" , 26000 );
        //System.out.println( key.getCollege( ) ); --> getCollege( ) is not defined in Person...
        Student hair = (Student)(key);
        System.out.println( hair.getCollege( ) );
        
        Object v1 = new Student( "Carly" , 19 , "Georgia Tech" , 9152.5 );
        Person v2 = (Person)(v1);
        System.out.println( v2.getAge( ) > 0 );
        
        Person v3 = (Student)(v1);
        System.out.println( v3 );
        
        Person v4 = (Person)(v1);
        System.out.println( v4.getAge( ) % 2 == 0 && true );
        
        /*
         * Polymorphism:
         * 1. we can only use methods that were defined in the class in which the object was DECLARED
         * or in any of the superclasses of the class in which the object is declared
         * 2. BUT, if a method is overridden in the subclass, even if the object is declared in the
         * superclass, it will use the subclass's version of the method
         */
        
        Person q = new Student( "Stephanie" , 21 , "UC Irvine" , 35011.79 );
        System.out.println( q.getNumber( ) ); //4
        
        Object e = new Student( "Tara" , 19 , "Stanford" , 1000 );
        System.out.println( e ); //--> we use the subclass's version of toString( ) just fine
        
        //System.out.println( e.getNumber( ) ); --> compile-time error
    }
}
