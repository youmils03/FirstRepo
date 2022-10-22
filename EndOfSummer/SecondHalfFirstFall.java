import java.io.File;
import java.io.IOException;

import java.io.FileWriter;

import java.util.Scanner;
import java.io.FileNotFoundException;

/**
    * For a college course in computer science, you need to learn file I/O
    * This requires you to understand and implement:
    * 1. creating files
    * 2. writing to files
    * 3. reading from files
    * 
    * PHASE ONE: creating files
    * import java.io.File;
    * import java.io.IOException;
    * try
    * {
    *     File A;
    *     A = new File( "myFileName.txt" );
    *     if( A.createNewFile( ) )
    *     {
    *          System.out.println( "creating this file" );
    *          System.out.println( "AND printing these lines..." );
    *     }
    *     else
    *     {
    *         System.out.println( "already exists" );
    *     }
    * }
    * catch( IOException W ) //OR.... Exception W
    * {
    *     System.out.println( "error" );
    * }
    * 
    * PHASE TWO: writing to files
    * 
    * import java.IO.FileWriter;
    * 
    * //generate a File oject
    * //create a FileWriter object based on that File object
    * 
    * import java.io.File;
    * import java.io.IOException;
    * import java.io.FileWriter;
    * 
    * File F1 = new File( "myFile.txt" );
    * FileWriter W1 = new FileWriter( F1 );
    * 
    * try
    * {
    *     W1.write( "this goes into myFile.txt" );
    * }
    * catch( IOException bat )
    * {
    *     System.out.println( bat ); //homework: figure out what would be printed by this
    * }
    * 
    * PHASE THREE: reading from files
    * 
    * import java.util.Scanner;
    * import java.io.FileNotFoundException;
    * 
    * File hotDog = new File( myFileName ); //myFileName is a string representing the file name
    * Scanner burger = new Scanner( hotDog ); //generate a Scanner object, pass in the File object
    * while( burger.hasNextLine( ) )
    * {
    *     System.out.println( burger.nextLine( ) );
    * }
    * catch( FileNotFoundException YYY )
    * {
    *     System.out.println( "File wasn't found" );
    * }
    }
    }
    }
    }
    }
    }
    }
    *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SecondHalfFirstFall
{
    public static void generateFile( String c , String d )
    {
        try
        {
            File f;
            d = d.concat( ".txt" );
            f = new File( d );
            
            if( f.createNewFile( ) )
            {
                System.out.println( "Created this file: " + f.getName( ) );
            }
            else
            {
                System.out.println( "File " + f.getName( ) + " already exists" );
            }
        }
        catch( IOException E )
        {
            System.out.println( "file create error occurred" );
        }
        
        try
        {
            File q = new File( "taco.txt" );
            
            FileWriter S;
            S = new FileWriter( q );
            S.write( "burritos are my favorite food" );
            S.write( "goodnight" );
            S.close( );
        }
        catch( IOException bat )
        {
            System.out.println( bat );
        }
    }
    
    public static void lastFiveMinutes( )
    {
        try
        {
            File j1 = new File( "taco.txt" );
            Scanner j2 = new Scanner(j1);
        
            while(j2.hasNextLine() || false )
            {
                System.out.println( j2.nextLine( ) );
            }
        }
        catch( FileNotFoundException F ) //or if you insist, ExceptiON F
        {
            System.out.println( "file not found" );
        }
    }
}
