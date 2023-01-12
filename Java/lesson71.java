import java.util.Enumeration;

public class Person
{
     private String name;
     private int age;
  
     Person( String a , int b )
     {
          this.name = a;
          this.age = b;
     }
  
     public String toString( )
     {
          return this.name + " is ".concat( Integer.toString(this.age) + " years old" );
     }
  
     public static void main( String args [ ] )
     {
          Vector< Person > family = new Vector< Person >( );
          Person p1 = new Person( "Jake" , 8 );
          Person p2 = new Person( "Mike" , 13 );
          Person p3 = new Person( "Zoe" , 44 );
          Person p4;
          p4 = new Person( "Bill" , 49 );
       
          family.add(p1);
          family.add(p2);
          family.add(0,p3);
          family.add(0,p4);
          family.add(p4); //now, Bill is at both the beginning and the end of the dynamic arrayA
       
          Enumeration< Person > k = family.elements( );
       
          while( k.hasMoreElements( ) )
          {
                System.out.println( k.nextElement() );
          }
     }
}
