import java.util.concurrent.ConcurrentLinkedQueue;

public class Lesson66
{
    public static void main( String args [ ] )
    {
          ConcurrentLinkedQueue< String > wordLine = new ConcurrentLinkedQueue< String >( );
      
          wordLine.add( "wilson" );
          wordLine.add( "winter" );
          wordLine.add( "wallace" );
          wordLine.add( "wiggler" );
          wordLine.add( "westwood" ); //can ONLY add elements to the END of a queue. REMOVE from the BEGINNING (FIFO)
      
          System.out.println( wordLine.peek( ) ); //wilson, returns the first element without removing it
          
          System.out.println( wordLine.isEmpty( ) || false ); //false, both booleans are false (the queue has elements)
      
          System.out.println( true && wordLine.contains( "wrist" ) ); //false, !wordLine.contains("wrist")
      
          Iterator< String > wordParse;
          wordParse = wordLine.iterator( ); //can only have an iterator on queues. No list iterators, no enumerations
      
          for( int a = 0 ; wordParse.hasNext( ) ; a *= 2 ) //a stays at 0 forever, but the value of a doesn't matter
          {
                System.out.println( wordParse.next() );
                wordParse.remove( ); //remember, iterators can remove elements from the underlying collection
          }
      
          System.out.println( wordParse.size( ) > 0 ); //false
          System.out.println( wordParse.contains( "winter" ) || wordParse.contains( "summer" ) ); //false
    }
}
