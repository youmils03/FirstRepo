import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.FileNotFoundException;

// import java.io.*; (like with java.util.*, you can import the entire I/O package)

/**
 * Write a description of class Example here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Example
{
    public static void main( String args [ ] )
    {
        Object s;
        s = new File( "sunshine.txt" );
        //by invoking this constructor, s has an instance variable called
        //pathName which is assigned to the String "tony.txt"
        
        System.out.println(s);
        //verify that Object has a toString( ) method
        //since it does, it will invoke FILE's toString( ) method
        
        //System.out.println( s.exists() );
        File t = (File)(s);
        System.out.println( t.exists() ); //false
        
        /*
         * s is declared as an Object but instantiated as a File
         * s can only use methods that were defined in Object
         * however, for those methods, if they are overridden in File,
         * then s will use File's versions of those methods
         */
        
        
        try
        {
        
        boolean b1 = t.createNewFile( );
        boolean b2 = t.exists( );
        System.out.println( "Created file and exists?" );
        System.out.println( b1 && b2 );
        
        }
        catch( IOException A )
        {
            System.out.println( "There was an I/O error" );
        }
        catch( Exception General )
        {
            System.out.println( "There was an error with your code, but" );
            System.out.println( "it is not related to I/O" );   
        }
        /*
        catch( ArrayIndexOutOfBoundsException burger )
        {
            System.out.println( 10*10 );
        }
        */
        finally
        {
            System.out.println( "This code runs REGARDLESS" );
        }
        
        /*
         * 2 options, create a file writer object based on the direct File
         * object you already created OR simply just the path name (string)
         * 
         * FileWriter r = new FileWriter( t ); //accepts the File
         * FileWriter r = new FileWriter( t.getPath() ); //accepts the String
         */ 
        
        try
        {
            FileWriter r = new FileWriter(t);
            
            write( t.getPath( ) , "pizza is my favorite food" );
            write( t.getPath( ) , "tomatoes are not my favorite food" );
            Example.write( t.getPath() , "last line of text!" );
            
            /*
             * Suppose that an instance D belongs to a class C 
             * For an instance method I, we would call D.I()
             * For a static method M, we would call C.M()
             * Or, if we are in C itself, we can simply just call M()
             */
            
            /*
             * r.write(x) works more like System.out.print(x) than
             * System.out.println(x), because you must explicitly specify
             * a new line if you want one
             * 
             * In a previous lesson, we created a STATIC method in THIS class
             * which will accept a path name and some text and write the text
             * to the file with that path name
             */
            
            /*
             * write(x) is an instance method called on a FileWriter object
             * it is an INSTANCE method, because you have to generate an
             * instance of the FileWriter class before you can call the
             * write method
             */
        }
        catch( IOException snake )
        {
            System.out.println( snake );
        }
    
        /*
        try
        {
            System.out.println(3/0);
        }
        catch( IndexOutOfBoundsException K )
        {
            System.out.println( K );
        }
        finally
        {
            System.out.println( "dog" );
        }
        */
       
        try
        {
            throw new IndexOutOfBoundsException( "stop that!" );
        }
        catch( StringIndexOutOfBoundsException Z )
        {
            System.out.println( Z.getMessage( ) );
        }
        catch( RuntimeException U )
        {
            System.out.println( "umbrella" );
        }
        
        System.out.println( "cat" );
        //for any File F, if F.createNewFile() has NOT been called,
        //then F.exists() == false
        
        try
        {
            Scanner pasta = new Scanner(t);
            
                   
            for( int k = 0 ; true ; k += 1 )
            {
                if( ! pasta.hasNextLine() )
                {
                    break;
                }
                
                System.out.println( pasta.nextLine() );
            }
        }
        catch( FileNotFoundException network )
        {
            System.out.println( network );
        }
    }
    
    /**
     * This method accepts a file path and some text and writes the text
     * to the File object whose path is specified by the first argument
     * 
     * @param filePath the path of the file to write text to
     * @param textToWrite the text to write to the file
     */
    public static void write( String filePath , String textToWrite )
    {
        try
        {
            FileWriter W = new FileWriter( filePath );
            W.write( textToWrite + "\n" );
        }
        catch( IOException apple )
        {
            System.out.println( "File I/O error" );
        }
    }
}
