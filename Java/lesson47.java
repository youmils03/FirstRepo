import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson47
{
    public static void main( String args [ ] )
    {
        Object x = new Scanner(System.in);
        Scanner y = (Scanner)(x);
      
        System.out.print( "Enter a one-word file name, don't write .txt cuz I'll add that" );
        String fileName = y.next( ) + ".txt";
      
        //step one: create a file
      
        File F = new File( fileName );
        try
        {
            F.createNewFile( );
        }
        catch( IOException E )
        {
            System.out.println( "error: " + E.getMessage( ) );
        }
        finally
        {
            System.out.println( "runs regardless" );
        }
      
        //step two: write to a file
      
        try
        {
            FileWriter W = new FileWriter(F);
            W.write( "sup" );
            W.write( "not much" );
            W.close( );
            System.out.println( "Just wrote stuff to " + fileName.concat( ", fyi" ) );
        }
        catch( IOException y )
        {
            System.out.println( "file-write error" );
        }
        
        //step three: read from a file
      
        try
        {
            Scanner z = new Scanner(F);
            while( z.hasNextLine( ) || false ) // ||false and &&true have no effect on a boolean expression
            {
                System.out.println( z.nextLine() );
            }
        }
        catch( FileNotFoundException swimming )
        {
            System.out.println( "Could not find " + F.getPath() ); //research getPath() in the Java API on your own
        }
        catch( Exception E ) //probably will not run, a more specific exception has already been identified and caught
        {
             System.out.println( "What other issue could have arisen with creating that Scanner?" );
        }
      
    }
}
