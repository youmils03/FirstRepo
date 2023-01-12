import java.util.HashSet;
import java.util.Iterator;

public class Person
{
      private String name;
      private int age;
  
      Person( String u , int v )
      {
            this.name = u;
            age = v;
      }
  
      Person( )
      {
            this( "Allison" , 48 );
      }
  
      public String toString( )
      {
            return this.name + " is " + ( Integer.toString( this.age ) ).concat( " years old" );
      }
  
      public static void main( String args [ ] )
      {
            HashSet< Person > uniquePeople = new HashSet< Person >( );
        
            Person a, b, c;
            a = new Person( "Sam" , 30 );
            b = new Person( "Mike" , 68 );
            c = new Person( );
        
            uniquePeople.add(a);
            uniquePeople.add(b);
        
            for( int s = 0 ; s < 2000 ; s += 1 )
            {
                  uniquePeople.add(c);
            }
        
            System.out.println( uniquePeople.size() > 100 ); //false, c was only added once
            System.out.println( uniquePeople.size() <= 3 ); //true
            System.out.println( uniquePeople.isEmpty() ); //false
        
            Person d = new Person( "Emily" , 11 );
            uniquePeople.remove(d); //no effect, d isn't in the set
            System.out.println( uniquePeople.size() ); //still size 3
            
            int counter = 0;
        
            while( true )
            {
                  if( counter == 18 )
                  {
                        break;
                  }
                  uniquePeople.remove(a); //tries to remove a 18 times, only does it once
            }
        
            System.out.println( uniquePeople.size() ); //2, still has elements b and c
        
            uniquePeople.add(d); //NOW let's add in d. So we have {b,c,d}
        
            System.out.println( uniquePeople.contains(a) ); //false, was removed on line 58
            System.out.println( uniquePeople.contains(b) ); //true
        
            System.out.println( uniquePeople.isEmpty() ); //false
        
            Person e = new Person( "Edris" , 95 );
            uniquePeople.add(e); //{b,c,d,e}, unordered
        
            Iterator< Person > peopleParse;
            peopleParse = uniquePeople.iterator( );
        
            while( peopleParse.hasNext() && 72 < 89 )
            {
                  System.out.println( (peopleParse.next()) ); //invoke toString() method on each element in the set
            }
      }
}
