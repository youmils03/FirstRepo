import java.util.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Iterator;

public class Person implements Comparable
{
      private String name;
      private int age;
  
      Person(String n, int a)
      {
          this.name = n;
          this.age = a;
      }
  
      public String toString( )
      {
          return this.name + " is ".concat( ( Integer.toString( this.age ) ).concat( " years old" ) );
      }
      
      public int compareTo( Object t )
      {
          Person z = (Person)(t);
          int a = this.age , b = z.age;
          if(a<b)
          {
              return -1;
          }
          else if( a==b )
          {
              return 0;
          }
          else //a>b
          {
              return 1;
          }
      }
      
      public static void main( String args [ ] )
      {
          ArrayList< Person > people = new ArrayList< Person >( );
          Person a = new Person( "Sam" , 41 );
          Person b = new Person( "Lucas" , 39 );
          Object c1 = new Person( "Emily" , 19 );
          Person c = (Person)(c1);
          Person d = new Person( "Mike" , 71 );
          Person e = new Person( "Walter Jr" , 17 );
          
          people.add(a);
          people.add(b);
          people.add(c);
          people.add(d);
          people.add(0,e); //[e,a,b,c,d]
          
          System.out.println( "Youngest: " + Collections.min(people) );
          System.out.println( "Oldest: " + Collections.max(people) );
          
          Iterator< Person > beforeSorted = people.iterator();
          
          for( String y = "yoyo" ; beforeSorted.hasNext() ; y += "yo" )
          {
              if( y.equals( "yoyo" ) ) //only true for the first iteration of the loop
              {
                  System.out.println( y.toUpperCase() );
              }
              System.out.println( beforeSorted.next() );
          }
          
          Collections.sort( people ); //sorts the list according to Person's compareTo method. [e,c,b,a,d]
          
          beforeSorted = people.iterator(); //reassign the preexisting iterator object to the now-sorted list
          
          for( String r = "rat" ; beforeSorted.hasNext() || false ; r = r.concat("ew") )
          {
              if( r.length( ) % 2 != 0 ) //this will always be true. r has 3 letters, then 5, then 7, then 9, etc.
              {
                  System.out.println( beforeSorted.next() );
              }
              else
              {
                  break;
              }
          }
          
          ArrayList< Integer > sortedNums;
          sortedNums = new ArrayList< Integer >( );
          int [ ] vals = { 4 , 9 , 12 , 14 , 18 , 20, 23, 28 , 29 , 34, 37 , 40, 42, 44, 50, 58 ,64, 65, 66 };
          
          for( int j : vals )
          {
              sortedNums.add(j);
          }
          
          /*
          * We discussed sorting algorithms in lessons 39-41 but then learned about Collections.sort(x)
          * We discussed searching algorithms in lessons 42-43 but now learn about Collections.binarySearch(x,y)
          * remember: binary search requires a SORTED collection
          */
          System.out.println( Collections.binarySearch( sortedNums , 64 ) ); //saves us the work of implementing this
          
          Collections.fill( sortedNums , 81 ); //replaces all elements with the Integer object 81
          
          int eightyOnes = 0;
          
          for( Integer s : sortedNums )
          {
              if( 81 == s.intValue() )
              {
                  eightyOnes += 1;
              }
              continue; //does nothing since it was placed at the end of the loop
          }
          
          System.out.println( eightyOnes == sortedNums.size() ); //true, all elements are 81
          
          sortedNums = new ArrayList< Integer >(); //reset the arraylist
          sortedNums.add(5);
          sortedNums.add(1);
          sortedNums.add(9);
          sortedNums.add(3);
          Collections.addAll( sortedNums , 12 , 19 , 14, 10 ); //can add multiple elements simultaneously
          System.out.println( sortedNums.size( ) );
          
          Collections.shuffle(sortedNums); //order of the elements will now be unknown
          
          for( Integer g : sortedNums )
          {
              System.out.println( (double)( g.intValue() ) ); //impossible to predict, shuffle randomizes the order
          }
          
          ArrayList< Integer > L1 = new ArrayList< Integer >( ), L2 = new ArrayList< Integer >( );
          Collections.addAll(L1, 80, 90, 100);
          Collections.addAll(L2, 800, 900, 1000, sortedNums.get(sortedNums.size()-1) );
          
          System.out.println( Collections.disjoint( sortedNums , L1 ) ); //true, no elements in common
          System.out.println( Collections.disjoint( sortedNums , L2 ) ); //false, at least one element in common
      }
 }
