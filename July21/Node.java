
/**
 * Write a description of class Node here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Node
{
    /*
     * 3 characteristics of a node:
     * 1. left child --> Node 
     * 2. right child --> Node
     * 3. value --> int
     * 
     * Nodes have to be objects, beacuse we need to check whether or not they are null
     * A null node is a node who is not carrying a value. So it doesn't really "exist" in the tree
     */
    
    private int myVal; //PRIVATE: requires a getter method to retrieve it and a setter method to change it
    public Node leftChild; //in our BinarySearchTree, we will want to frequently reference the children and change them
    public Node rightChild;
    private String myName;

    Node( int myVal )
    {
        this.myVal = myVal; //cannot say "myVal = myVal..." --> reassign the PARAMETER to itself...trivial/useless
        this.leftChild = null; //when we first create a node, we do not assign children
        this.rightChild = null; //the node is standalone, and it's the tree that figures out children
    }
    
    Node( String myVal )
    {
        myName = myVal;
    }
    
    public int getVal( )
    {
        return this.myVal;
    }
    
    public String toString( )
    {
        return Integer.toString(myVal); //or return this.myVal + "";
        /*
         * 1. concatenate with ""
         * 2. Integer.toString(myVal)
         */
    }
    
    
}
