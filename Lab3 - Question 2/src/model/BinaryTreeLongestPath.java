package model;

import java.util.ArrayList;

public class BinaryTreeLongestPath {
	
	public static class Node
	{
	    public Node left;
	    public Node right;
	    public int data;
	}
	
	// Function to create a new Binary node
	public static Node newNode(int data)
	{
	    Node temp = new Node();
	 
	    temp.data = data;
	    temp.left = null;
	    temp.right = null;
	 
	    return temp;
	}


	// Function to find and return the longest path
	
	public ArrayList<Integer> longestPath(Node root)
	{
	     
	    // If root is null means there is no binary tree so return a empty List
	    if(root == null)
	    {
	        ArrayList<Integer> output = new ArrayList<>();
	        return output;
	    }
	     
	    // Recursive call on root.right
	    ArrayList<Integer> right = longestPath(root.right);
	     
	    // Recursive call on root.left
	    ArrayList<Integer> left = longestPath(root.left);
	     
	    // Compare the size of the two ArrayList and insert current node accordingly
	    if(right.size() < left.size())
	    {
	        left.add(root.data);
	    }
	    else
	    {
	        right.add(root.data);
	    }
	     
	    // Return the appropriate ArrayList
	    return (left.size() > right.size() ? left :right);
	}
	 

//Driver function

public static void main(String[] args)
{
	//Initializing Object for the class
	BinaryTreeLongestPath P =new BinaryTreeLongestPath(); 

	// Hard code for defining a Binary tree.
	Node root = newNode(100);
    root.left = newNode(20);
    root.right= newNode(130);
    root.left.left = newNode(10);
    root.left.right = newNode(50);
    root.left.left.left = newNode(5);
    root.right.left = newNode(110);
    root.right.right = newNode(140);
   	
    //Function calling and filling ArrayList 
	ArrayList<Integer> output = P.longestPath(root);
    int n = output.size();
    
    //Displaying Longest path 
    System.out.print(output.get(n - 1));
    for(int i = n - 2; i >= 0; i--)
    {
        System.out.print(" -> " + output.get(i));
    }
}

}
