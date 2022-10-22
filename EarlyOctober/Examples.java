import java.io.File; //required in order to create a new File object (a new file!)
import java.io.FileWriter; //allows us to write text to a File object
import java.io.IOException; //required when creating and writing to File objects
import java.io.FileNotFoundException; 

import java.util.Scanner;

/*
 * File I/O:
 * 1. import the necessary classes (you need 5)
 * 2. in a try-block, create a File object and call createNewFile( ) method
 * 3. in a try-block, create a FileWriter object based on the File and call the
 * write( ) method and also the close( ) method when you're done writing to it
 * 4. in a try-block, create a Scanner object based on the File and use a while
 * loop to check for next lines, printing the next lines to the console using the
 * nextLine( ) method from the Scanner class
 */

/**
 * Write a description of class Examples here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Examples
{
    public static void main( String args [ ] )
    {
        Exception W;
        W = new Exception( "Stop doing that!" );
        System.out.println( W );
        
        String u = W.getMessage( );
        System.out.println( u.toUpperCase( ) );
        
        Object s = new Exception( "potato" );
        System.out.println( s.toString( ) );
        //the toString( ) method of the Exception class does not
        //throw an exception
        
        try
        {
            int z [ ] = { 3 , 2 , 0 , 4 };
            System.out.println( "cup" );
            System.out.println( z[z[z[0]]] );
            System.out.println( "plate" );
        }
        catch( StringIndexOutOfBoundsException A )
        {
            System.out.println( "april" );
        }
        catch( Exception E )
        {
            System.out.println( E.getMessage( ) );
        }
        finally
        {
            System.out.println( "water".length( ) * 1.0 );
        }
        
        int q = 7;
        
        String [] myArray = { "tree" , "bush" , "plant" , "flower" , "walrus" };
        
        while( q < myArray.length )
        {
            System.out.println( myArray[q] );
            q += 1;
        }
        
        do
        {
            System.out.println( myArray[q] );
            q += 1;
        }
        while( q < myArray.length );
        
        
    }
    
    //public abstract double getVolume( double t );
    //public abstract void getVolume( String t );
    
    /**
     * This method accepts three String objects and a boolean
     * If the boolean is true, it creates a File named by the first String object
     * otherweise, it creates a File named by the second String object
     * 
     * It also writes the third String, in all uppercase, to that File
     * 
     * @param a the first potential file name
     * @param b the second potential file name
     * @boolean c the boolean to check
     * @param d the String to write to the text file
     */
    public static void fileIOexampleOne( String a , String b , boolean c , String d )
    {
        Object v1;
        
        if( c )
        {
            v1 = new File( a );
        }
        else
        {
            v1 = new File( b );
        }
        
        File v2 = (File)(v1);
        
        try
        {
            boolean e = v2.createNewFile( );
            System.out.println( !e ); //false
        }
        catch( IOException E )
        {
            System.out.println( "file-create error" );
        }
        
        try
        {
            FileWriter f = new FileWriter( v2 );
            f.write( d.toUpperCase( ) );
            System.out.println( "Just wrote " + d.toUpperCase( ) + " to " + v2.getPath() );
            f.close( );
        }
        catch( IOException y )
        {
            System.out.println( "file-write error" );
        }
        
        try
        {

            Scanner S = new Scanner( v2 );
            //in order to read a file, you create a Scanner object and parameterize it
            //by the File that you want it to read
            //it's a little different from user input, when we were using the Scanner
            //object as follows: Scanner T = new Scanner( System.in );
            while( S.hasNextLine( ) )
            {
                System.out.println( S.nextLine( ) );
            }
        }
        catch( FileNotFoundException hamburger )
        {
            System.out.println( "could not find " + v2.getPath( ) );
        }
    }
    
    public static void tester( )
    {
        File u = new File( "potato" );
        System.out.println( u.getPath( ) );
    }
}
