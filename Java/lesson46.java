import java.util.ArrayList;

public class Lesson46
{
    public static void main( String args [ ] )
    {
        ArrayList< Character > myCharacters = new ArrayList< Character >( );
        
        myCharacters.add( 'v' );
        myCharacters.add( 'i' );
        myCharacters.add( '3' );
        myCharacters.add( '^' );
        myCharacters.add( '.' );
        myCharacters.add( 'S' );
        myCharacters.add( 0 , '$' ); //adds $ to the beginning [ '$' ,'v' , 'i' , '3' , '^' , '.' , 'S' ]
        
        int k = 0;
        
        do
        {
            System.out.println( "Character: " + ( myCharacters.get(k) ).charValue() );
            System.out.println( "ASCII code for that character: " + ( 0 + (myCharacters.get(k)).charValue() ) + "\n" );
            k += 1; //implicit casting from char to int on the line above, yielding the ASCII codes (see lesson 16)
        }
        while( k < myCharacters.size( ) && true );
        
        do
        {
            System.out.println( "sup" );
        }
        while( false ); //contrasts with a regular while loop. do-while loops always run their body at least once
    }
}
