using System;

namespace MySpace
{
    class EasyMath
    {
        static void Main( string[] args )
        {
            Console.WriteLine( 8 + 30 ); //C# is capable of addition
            Console.WriteLine( 26 - 27 ); //C# is capable of subtraction and negative numbers
            Console.WriteLine( 2 + 4 * 2 + 5 ); //C# is capable of multiplication and respects mathematical order of operations
            Console.WriteLine( (2 + 4) * (2 + 5) );
            
            Console.WriteLine( -70 / 10 );
            Console.WriteLine( 15 / 10 ); //floor division, like Java
            
            Console.WriteLine( 29 % 8 ); //the remainder when 29 is divided by 8
            Console.WriteLine( (7 * 912) % 7 ); //predict this without a calculator before running the code
        }
    }
}
