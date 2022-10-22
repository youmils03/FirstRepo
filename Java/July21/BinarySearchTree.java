import java.util.Scanner;

/**
 * ArrayLists (or arrays) are very slow at insertions and deletions
 * Because you have to change multiple index positions 
 * 
 * LinkedLists are very slow at retrieving elements, because they do not
 * keep track of index positions. Start from the beginning
 * 
 * The solution is to use a binary search tree to keep track of your data
 * Adding elements to a binary serach tree is O(log(n)) complexity, which is better than the O(n) complexity
 * you get with ArrayLists
 * Retrieving elements in a binary search tree (searching) is O(log(n)) complexity, which is  better than the
 * O(n) complexity that you get with LinkedLists
 * 
 * binary search tree: a collection of data such that elements to the left of any particular node are "less than"
 * that node (think Comparable interface), elements to the right of any node are greater than that node
 * 
 * This is not limited to numbers. Think any class that implements the Comparable interface
 * We could say that one Person is "less" than another person
 * The objects/constituents/elements in a binary search tree are called nodes
 * 
 * A binary search tree has a root node (a node who has no parents). Every node in a binary search tree can have
 * at MOST two children.
 * A node with zero children is called a: leaf node
 * 
 * Today, we'll figure out how to add nodes to a binary search tree (RECURSIVELY), and how to search for an elemet
 * in a binary search tree (Left or right? Left or right? Left or right?)
 * 
 * Tonight: studied the concept of binary search trees, figured out how to add nodes
 * studied the difference in time complexity for binary search vs linear search, applying the concept to trees
 * 
 * Next time: brief review (user input example --> or homework), heaps --> priority queues
 * 
 */
public class BinarySearchTree
{
    // [30,52,22,27,31] --> root:30, right child of root: 52, left child of root: 22
    
    private Node root; //we want to know what's at the top of the binary search tree
    
    private Node [] nodes; //array of Node objects
    private int [] nodeVals; //the same, but with this one we need to create Node objects out of the ints
    
    BinarySearchTree( Node [ ] myNodes )
    {
        root = null;
        nodes = myNodes; //assigning an instance variable, this is just like assigning an age of a Person
        
        for( Node n : myNodes )
        {
            root = addNode( root , n );
        }
    }
    
    BinarySearchTree( int [ ] myVals )
    {
        root = null;
        nodeVals = myVals;
        
        Node nextNode;
        
        for( int v : myVals )
        {
            nextNode = new Node(v);
            root = addNode( root , nextNode );
        }
    }
    
    public Node addNode( Node newNode )
    {
        return addNode( this.root , newNode );
    }
    
    public Node addNode( int nodeVal )
    {
        Node s = new Node( nodeVal );
        return addNode( s );
    }
    
    /**
     * Recursive implementation. Given a local "root" node (think of it as a parent in general, or the actual root
     * if there's no tree yet) and a new node to add, put the node in the correct place
     * 
     * @param root
     * @param newNode
     * @return 
     */
    public Node addNode( Node currentRoot , Node newNode ) //instance method
    {
        if( currentRoot == null ) //there is no more traversing to do. You're at a null/empty, so fill it in!
        {
            currentRoot = newNode;
        } 
        else //what happens if there's already a node there? Now, use recursion to rinse and repeat either with the
        { //left child, or with the right child
            if( newNode.getVal( ) < currentRoot.getVal( ) )
            {
                currentRoot.leftChild = this.addNode( currentRoot.leftChild , newNode );
            }
            else if( newNode.getVal( ) > currentRoot.getVal( ) )
            {
                currentRoot.rightChild = addNode( currentRoot.rightChild , newNode );
            }
            else
            {
                currentRoot = null;
            }
        }
        
        return currentRoot;
    }
    
    public void printAscending( Node root )//feed in a node to start with
    {
        if( root != null )
        {
            this.printAscending( root.leftChild );
            System.out.println( "Value: " + root );
            this.printAscending( root.rightChild );
        }
    }
    
    /**
     *                                    48
     *              36                                      49
     *    22                  41                                           50
     *         28        40
     */
    public static void main( String args [ ] )
    {
        Node n1 = new Node( 48 ) , n2 = new Node( 36 ) , n3 = new Node( 41 ) , n4 = new Node(49);
        Node n5 = new Node( 50 ) , n6 = new Node( 40 ) , n7 = new Node( 22 ) , n8 = new Node(28);
        
        Node myNodes [ ] = {n1,n2,n3,n4,n5,n6,n7,n8}; //linear search on this array: 8
        
        BinarySearchTree B = new BinarySearchTree( myNodes );
        
        System.out.println( "Root: " + B.root ); //Root: 48
        System.out.println( "Left child of root: " + B.root.leftChild ); //Left child of root: 36
        System.out.println( B.root.leftChild.rightChild ); //41
        
        B.addNode(100);
        System.out.println( B.root.rightChild.rightChild.rightChild ); //100
        System.out.println( B.root.rightChild.rightChild.rightChild.leftChild ); //null
        
        B.printAscending( B.root );
        
        int searchForThis = 28;
        System.out.println( "Let's retrieve the " + searchForThis + " using both linear search and binary search: " );
        System.out.println( "with linear search: " + B.linearSearch(searchForThis) );
        System.out.println( "with binary search: " + B.binarySearch(searchForThis) );
    }
    
    public static void tester( )
    {
        Scanner s = new Scanner( System.in );
        
        System.out.print( "How many numbers do you want? " );
        int size = s.nextInt( );
        
        int [ ] myVals = new int[size];
        int nextNumber;
        
        System.out.println( );
        
        for( int u = 0 ; u < size ; u += 1 )
        {
            System.out.print( "Give a number then: " );
            myVals[u] = s.nextInt( );
            System.out.println( );
        }
        
        /*
         * Generate your binary search tree based off of the int array
         */
        BinarySearchTree x = new BinarySearchTree( myVals );
    }
    
    public int linearSearch( int t )
    {
        Node u = new Node(t);
        return this.linearSearch(u);
    }
    
    public int linearSearch( Node toFind )
    {
        int steps = 1;
        
        for( Node q : nodes )
        {
            if( q.getVal( ) != toFind.getVal( ) )
            {
                steps += 1;
            }
            else
            {
                break;
            }
        }
        
        return steps;
    }
    
    public int binarySearch( int pizza )
    {
        Node cucumber = new Node( pizza );
        return this.binarySearch( cucumber );
    }
    
    public int binarySearch( Node toFind )
    {
        return this.binarySearch( this.root , toFind );
    }
    
    /**
     * We produce a function that determines how many steps it takes the binary search tree to search for a 
     * particular element within the tree
     * 
     * @param root the root to start at with the binary search (this will change with multiple runs of the method)
     * @param toFind the node whose value you are searching for
     * @return the number of steps required to find that node
     */
    public int binarySearch( Node root , Node toFind )
    {
        if( toFind.getVal( ) == root.getVal( ) )
        {
            return 1; //base case
        }
        else if( toFind.getVal( ) < root.getVal( ) )
        {
            return 1 + binarySearch( root.leftChild , toFind ); //add 1 to the result of using the left child
        }
        else
        {
            return 1 + binarySearch( root.rightChild , toFind );
        }
    }
}
