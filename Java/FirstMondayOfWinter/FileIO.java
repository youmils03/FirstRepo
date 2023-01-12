import java.io.*; //package
import java.util.Scanner; //class

/**
 * Methods which have the potential to throw an exception must be
 * invoked within a try block.
 * 
 * 1. Import java.io.* and java.util.Scanner
 * 2. in a try/block, do all of the following
 * a. create a File object based on a filename
 * b. call the createNewFile() method on the File object
 * c. create a FileWriter object based on the File object OR on the filename
 * d. call the write(x) method on the FileWriter object with some text x, remembering "\n"
 * e. call the close() method on the FileWriter object
 * f. create a Scanner object based on the File object created in step a
 * g. while( scannerObject.hasNextLine() )
 * h. { System.out.println( scannerObject.nextLine() ); }
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FileIO
{
    public static void main( String args [ ] )
    {
        try //write all of your file I/O code in this one try block
        {
            String name = "winter.txt";
            
            Object a;
            a = new File( name );
            File b = (File)(a);

            boolean c = b.createNewFile( );
            System.out.println( (b.getPath()).toUpperCase() );
            System.out.println( "File name: " + b.getName( ) );

            //FileWriter 
            
            FileWriter k = new FileWriter( name );
            FileIO.write( k , name ); //in general, static methods are called on the class
            write(k,name); //but if you're in the same class it's defined in, don't need class name
            k.close(); //you need to remember to close the FileWriter object
            
            Scanner read;
            read = new Scanner(b);
            
            for( int p = 0 ; read.hasNextLine() ; p += 1 )
            {
                System.out.println( read.nextLine() );
            }
            
            /*
            IOException d = new IOException();
            throw d;
            */
        }
        catch( IOException w ) //to catch all potential file I/O errors 
        {
            System.out.println( "The error would be this: " + w.getMessage() );
        }
    }
    
    /**
     * This function accepts a FileWriter object and a String and 
     * writes the string to the text file parameterized by the FileWriter
     * It also adds a new line
     * 
     * @param myWriter is the FileWriter object containing the text file
     * @param u the text to write
     */
    public static void write( FileWriter myWriter , String u )
    {
        try
        {
            myWriter.write( u + "\n" );
        }
        catch( IOException s )
        {
            System.out.println( s.getMessage() );
        }
    }
}
