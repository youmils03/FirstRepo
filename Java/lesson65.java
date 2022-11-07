public class Lesson65
{
    public static void main( String args [ ] )
    {
        Object w = new Character( '$' ); //polymorphism
        Character x = (Character)(w);
        
        switch( x.charValue() ) //switch statements accept not just ints as studied previously, but also chars
        {
            case 'p':
                System.out.println( "apple" );
            case '-':
                System.out.println( "orange" );
            case '$';
                System.out.println( "banana" );
            case '4':
                System.out.println( "grapefruit" );
            case '8':
                System.out.println( "avocado" );
                break;
            case '9':
                System.out.println( "kiwi" );
                break;
            default:
                System.out.println( "not much" );
                break; //unnecessary 
        }
    }
}
