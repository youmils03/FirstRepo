import java.util.ArrayList; //required to import ArrayList in order to use it

public class Lesson27
{
    public static void main( String args [ ] )
    {
        ArrayList< Integer > myValues = new ArrayList< Integer >( ); //ArrayLists only accept Integer objects, not primitive ints
      
        myValues.add(3);
        myValues.add(2);
        myValues.add(1);
        myValues.add(0);
        myValues.add(0,4); //adds 4 to the beginning of the ArrayList, so now it's [4,3,2,1,0]
      
        //unlike static arrays, array lists (or dynamic arrays) can grow or shrink in size
      
        myValues.remove(0); //TRICKY. Removes index position 0, not the Integer object 0. Now we have [3,2,1,0]
        //this is only an issue for Integers and possibly Doubles. Otherwise remove(x) can be used for both
        //index positions x and objects/elements x
        //To remove the element 0 which is at index position 4, write: myValues.remove( Integer.valueOf(0) );
      
        int h = 0;
        while( false || myValues.size() > h )
        {
            System.out.println( myValues.get(h) );
            h += 1;
        }
      
        myValues.add( myValues.get(0) ); //[3,2,1,0,3]
        myValues.add( myValues.size( ) ); //[3,2,1,0,3,5]
        myValues.add( myValues.indexOf(myValues.get(0)) ); //[3,2,1,0,3,5,0]
        myValues.add( myValues.lastIndexOf(myValues.get(0)) ); //[3,2,1,0,3,5,0,4]
        myValues.set( myValues.get(1) , myValues.get( myValues.size( ) - 1 ) ); //[3,2,4,0,3,5,0,4]
      
        for( Integer q : myValues )
        {
            System.out.println( "Value: " + Integer.toString( q.intValue( ) ) );
        }
      
        System.out.println( myValues.isEmpty( ) ); //false because myValues.size( ) != 0 (or >0)
        myValues.clear( ); //removes all data
        System.out.println( myValues.isEmpty( ) ); //true because myValues.size( ) == 0 (or <=0)
            
    }
}
