
/**
 * Which of the following values would translate to type int?
 * 
 * a. double s = 4;
 * b. 7 + "9"
 * c. Integer.toString(54)
 * d. (int)(6.25)
 * 
 * Which of the following is not true of inheritance?
 * 
 * a. every class is a subclass of Object, except Object itself
 * b. every class has at least one subclass
 * c. every class has at least one superclass, except Object
 * d. a class could have 105 immediate subclasses
 * 
 * Which of the following is an invalid instantiation?
 * 
 * a. Object s = new Scanner( System.in ); //polymorphism
 * b. Object t = new Object( ); //ok
 * c. String u = new Object( "pizza" );  
 * d. Object z = new StringIndexOutOfBoundsException( "stop that" );
 * 
 * //you cannot declare an object in a subclass but then instantiate
 * //it in a superclass
 * 
 * Which of the following has an effect?
 * 
 * a. placing the word continue at the end of a loop
 * b. placing the word break at the end of a default block in a switch/case statement
 * c. placing the word break within a false boolean
 * d. placing the word continue near the beginning of a loop
 * 
 * ArrayList, LinkedList, Stack, Queue, HashSet, HashMap
 * not on the AP: Vector, ConcurrentLinkedQueue, LinkedHashSet, Hashtable, 
 * LinkedHashMap, ConcurrentHashMap
 * 
 * 2 types of indexed lists (a collection where elements are accessed by index position)
 * 1. arraylist: iterator, list iterator
 * 2. vector (legacy): iterator, list iterator, enumeration
 * 
 * 1 type of linked list (a collection of nodes which each point to the next node)
 * 1. LinkedList: iterator, list iterator
 * 
 * 1 type of stack (LIFO, remove and add from the same side of the stack)
 * 1. Stack: iterator, list iterator, enumeration
 * 
 * 2 types of queues (Queue>Linked List,ConcurrentLinkedQueue)
 * Queues are FIFO: remove and add from opposite ends of the queue
 * 1. Queue: iterator
 * 2. ConcurrentLinkedQueue: iterator
 * 
 * 2 types of sets (unordered collections of unique elements)
 * 1. HashSet: iterator
 * 2. LinkedHashSet: iterator
 * 
 * 4 types of dictionaries (key-value pairs, myDictionary.get(myKey) == myValue)
 * 1. HashMap: iterator on keys, iterator on values
 * 2. Hashtable:  iterator on keys, iterator on values, enumeration
 * 3. LinkedHashMap:  iterator on keys, iterator on values
 * 4. ConcurrentHashMap: iterator on keys, iterator on values, enumeration
 * 
 * 7 lessons left
 */
public class November14
{
    public static void main( String args [ ] )
    {
        int u = 80;
        
        /*
         * switch case statement
         * keeps looking for the correct case value
         * if it is found, it will run that case and all subsequent cases until
         * a break statement is reached
         * if no break statement is reached, then the default block runs
         * 
         * The way to implement a switch/case statement and adapt it into an
         * if/elseif/else block would be to do what? 
         * add a break to every CASE. Break at end of default is optional
         *          * 
         */
        switch( u % 4 )
        {
            case 1:
                System.out.println( "pizza" );
            case 2:
                System.out.println( "rocket" );
            case 3:
                System.out.println( "iceberg" );
                break;
            case 0:
                System.out.println( "milkshake" );
            default:
                System.out.println( "no way jose" );
        }
        
        System.out.println( Integer.SIZE );
        System.out.println( "Largest int: " + Integer.MAX_VALUE ); //2^31 - 1
        System.out.println( "Smallest int: " + Integer.MIN_VALUE ); //-(2^31)
        
        System.out.println( Integer.MAX_VALUE + 1 ); //Integer.MIN_VALUE
        //Java spills the 1 and cancels out all the other 1's
        //largest integer: 32 1's
        //largest integer: 1111 1111 1111 1111 1111 1111 1111 1111
        //add 1 to it: 0000 0000 0000 0000 0000 0000 0000 0000 (most negative number)
        //: 1000 0000 0000 0000 0000 0000 0000 0000
        // 00 + 1 = 01, 01 + 1 = 10, 10 + 1 = 11, 11 + 1 = 00 (spillover)
        
        System.out.println( Double.SIZE );
        System.out.println( Double.MAX_VALUE );
        System.out.println( Double.MIN_VALUE );
        
        System.out.println( Short.SIZE ); //16
        System.out.println( Short.MAX_VALUE ); //
        System.out.println( Short.MAX_VALUE * Short.MAX_VALUE );
        
        System.out.println( Long.SIZE ); //64
        System.out.println( Long.MAX_VALUE ); //2^63 - 1
        System.out.println( Long.MIN_VALUE ); //-2^63
        
        System.out.println( Float.SIZE );
        System.out.println( Float.MAX_VALUE < Double.MAX_VALUE ); //true
        System.out.println( Float.MIN_VALUE < Double.MIN_VALUE );
        
        Object s = new Float( "6.232" );
        System.out.println(s);
        System.out.println(s.toString());
        Float g = (Float)(s);
        System.out.println(Float.toString(g));
    }
}
