import java.util.Scanner;
import java.io.*;
/**
 * 3 components to file I/O:
 * 1. creating a file - could raise an exception so do it within a try/catch
 * 2. writing to the file - could raise an exception
 * 3. read from the file - could raise an exception
 */
public class FileIO
{
    public static void main( String args [ ] )
    {
        
        File s = new File( "ukelele.txt" );
        /*
         * the line above creates a File object in Java
         * it does not create a file in the Windows operating system
         */
        boolean t = s.exists( );
        System.out.println( !t ); //true
        
        //try-block to create a new file
        try
        {
            s.createNewFile( );
        }
        catch( IOException dog )
        {
            System.out.println( dog.getMessage() );
        }
        
        //try-block to write to the file
        try
        {
            FileWriter cheese = new FileWriter( s );
            
            cheese.write( "Cheese is my favorite food\n" );
            cheese.write( "Cheese works well on pizza\n" );
            
            cheese.close( );
        }
        catch( IOException b )
        {
            System.out.println( b ); //invoke toString() from IOException class
        }
        
        //try-block to read from the file
        try
        {
            Scanner red;
            red = new Scanner( s );
            
            while( red.hasNextLine( ) )
            {
                System.out.println( red.nextLine() );
            }
        }
        catch( Exception egg )
        {
            System.out.println( egg.getMessage() );
        }
    }
}
