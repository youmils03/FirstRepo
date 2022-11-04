import java.util.Scanner; //first example with importing a module. Won't be the last

public class Lesson18
{
    public static void main( String args [] )
    {
        public[ ][ ] charMatrix = new charMatrix[3][5]; //2-dimensional array of char values
        charMatrix[0] = { 'a' , 'b' , 'c' , 'd' , 'e' }; //first "element" in the 2-dimensional array
        charMatrix[1] = { '7' , '6' , '5' , '4' , '3' };
        charMatrix[charMatrix.length-1] = { '%' , '^' , '&' , '*' , '(' }; //charMatrix.length - 1 == 3 - 1 == 2
        
        int p;
        
        for( char [ ] myList : charMatrix )
        {
            p = 0;
            while( p < myList.length && true )
            {
                /*
                * The print statement below demonstrates multiple concepts
                * 1. myList[p] shows the workings of a nested loop. p goes through each one-dimensional char array within the matrix of arrays
                * In a sense, myList is both an array and an element of an array
                * 2. implicit casting as a result of adding 0 to myList[p], yielding the ASCII value of the character myList[p]
                * 3. escape sequences for both double quotes " and for a new line, therefore no need for System.out.println()
                * 4. increment p as mandated by the function of a while loop
                */
              
                System.out.print("ASCII value of \"" + myList[p] + "\"= " + (myList[p] + 0) + "\n");
                p += 1;
            }
        }
        
        Scanner u; //declare a Scanner object
        u = new Scanner( System.in ); //initialize a Scanner object
        //The two lines above could have been shortened as: Scanner u = new Scanner( System.in );
        
        System.out.print("\n\n" );
        
        System.out.print( "What is your first name? " ) ; //specify the user input to provide 
        String name = u.next( ); //collect user input
        System.out.print( "\nWhat is your favorite color? " );
        String color = u.next( );
        System.out.println( "\nYour first name has " + name.length( ) + " characters in it!" ); //do something useful with the user input
        System.out.println( "The first letter in your favorite color, capitalized, is " + ( color.toUpperCase( ) ).substring(0,1) + "! " );
    } 
}
