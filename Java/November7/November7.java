import java.util.*; //java.util.Scanner
import java.io.*;
import java.util.concurrent.*; //java.util.concurrent.ConcurrentLinkedQueue

public class November7
{
    November7( )
    {
        throw new IndexOutOfBoundsException( "can't do that!" );
    }
    
    public static void main( String args [ ] )
    {
        try
        {
            Object s = new November7( );
        }
        catch( Exception X )
        {
            System.out.println( X.getMessage() );
        }

        /*
         * file I/O:
         * 1. creating a text file
         * 2. writing to the text file (append vs. write)
         * 3. reading from the text file
         * 
         * unfortunately, with file I/O, there are multiple issues that can happen
         * 1. a file already existing when you try creating it
         * 2. reading from a file that doesn't exist
         * 3. writing to a file that doesn't exist
         * The solution to this: exceptions try/catch blocks,
         * optionally finally block: runs regardless of 
         */
        
        try
        {
            int [ ] k = {4,5};
            throw new RuntimeException( "pizza" );
            //System.out.println(k[k[0]]);
        }
        catch( ArithmeticException w )
        {
            System.out.println( "can't do that" );
        }
        catch( Exception I )
        {
            //System.out.println( I ); //toString() of the RuntimeException class
            System.out.println( ( I.getMessage() ).toUpperCase() );
        }
        finally
        {
            System.out.println( "goodnight" );
        }
        
        String w = ( new RuntimeException( "watermelon" ) ).getMessage( );
        System.out.println( w.substring(0,5) );
        
        File a = new File( "myFile.txt" ); //just creates an object in Java
        
        try
        {
            System.out.println( a.getPath() );
            boolean s = a.createNewFile( );
            if(s)
            {
                System.out.println(4);
            }
            else if( true ) //with if/elseif, we only run the first true boolean
            {
                System.out.println( 9 );
            }
        }
        catch( IOException A )
        {
            System.out.println( "could not create file" );
        }
        
        //step 2: write to myFile.txt
        
        try
        {
            Object f = new FileWriter( a ); //polymorphism
            FileWriter g = (FileWriter)(f); //create a FileWriter object based on the File
            //a better way to write this: FileWriter g = new FileWriter(a);
            g.write("sup\n");
            write( g , "not much" ); //call write(x) on your object, where x is what to write
            November7.write( g , "writing to files" );
            g.close( ); //call close() on your object
        }
        catch( IOException spaghetti )
        {
            System.out.println( "issue writing to file" );
            System.out.println( spaghetti.getMessage() );
        }
        
        //step 3: read from the file
        
        try
        {
            Scanner t = new Scanner( a );
            
            /*
            while( t.hasNextLine() ) //hasNextLine() is an instance method
            {
                System.out.println( t.nextLine() );
            }
            */
           
             while( true )
             {
                 if( !t.hasNextLine() )
                 {
                     break;
                 }
                 System.out.println( (t.nextLine()).toUpperCase() );
             }
        }
        catch( FileNotFoundException F )
        {
            System.out.println( "could not find that file, could not read" );
        }
    }
    
    /**
     * This static method accepts a FileWriter object and a String
     * It writes that String to the file represented by the FileWriter
     * It also enters a new line, for cleaner text on the file
     * 
     * @param r the FileWriter object
     * @param u the text to write
     * @return true if the text was successfully written, false if an I/O error occurred
     */
    public static boolean write( FileWriter r , String u )
    {
        try
        {
            r.write( u + "\n" );
            return true;
        }
        catch( IOException T )
        {
            System.out.println(T);
            return false;
        }
    }
    
    public static void queues( )
    {
        ConcurrentLinkedQueue< String > myLine = new ConcurrentLinkedQueue< String >( );
        
        try //element() and peek() return but do not remove the first element
        {
            System.out.println( myLine.element() );
            //System.out.println( myLine.peek() );
            System.out.println( "sup" );
        }
        catch( NoSuchElementException Z )
        {
            System.out.println( "nothing there" );
        }
        
        try //remove() and poll() return and remove the first element
        {
            String x = myLine.remove();
            System.out.println( x.toUpperCase() );
            //System.out.println( myLine.poll() );
            System.out.println( "pasta" );
        }
        catch( RuntimeException L )
        {
            System.out.println(L);
        }
        
        myLine.offer( "Scott" );
        myLine.offer( "Kate" );
        myLine.add( "Chris" );
        myLine.add( "Tim" );
        myLine.add( "Stephanie" );
        
        Iterator< String > lineParse = myLine.iterator( );
        
        int k = 0;
        int mySize = myLine.size();
        
        while( true )
        {
            if( lineParse.hasNext( ) )
            {
                System.out.println( lineParse.next( ) );
                lineParse.remove( );
                k += 1;
            }
            else
            {
                break;
            }
        }
        

        System.out.println( k == mySize ); //true, 5==5
        System.out.println( k == myLine.size() ); //false, !(5==0)
    }
    
    public static void lists( )
    {
        LinkedList< Integer > myList = new LinkedList< Integer >( );
        
        myList.add( 5 );
        myList.add( 4 );
        myList.add( 2 );
        myList.add( 0 );
        
        myList.remove(0); //removes the Integer object at index position 0
        //to remove the Integer object 0: write myList.remove( Integer.valueOf(0) );
        //[4,2,0]
        ListIterator< Integer > listParse;
        listParse = myList.listIterator();
        
        int t = 0;
        
        while( listParse.hasNext() )
        {
            listParse.next(); //scooting the cursor position from the left to the right end
            t += 1;
        }
        
        System.out.println( t == myList.size() ); //true
        
        while( listParse.hasPrevious() )
        {
            System.out.println( 10 + ( listParse.previous() ).doubleValue() );
            //For an Integer object I, we call I.doubleValue()
            //for a primitive int i, we call (double)(i)
            listParse.remove( );
        }
        
        System.out.println( myList.size() > 0 ); //false
    }
}