/*
 * Name of program: List of Cars
 * Author: Amber Caravalho
 * Course: CPT307 - Data Structures & Algorithms
 * Instructor: Dr. Reichard
 * Date Submitted: January 23, 2022
 * 
 * Starter code for this program was retrieved from
 * http://www.newthinktank.com/2013/03/binary-tree-in-java/
 * Copyright (c) 2013 by Derek Banas
 */

//Grouped class stucture, needed to resolve warnings
package listofcars;

public class BinaryTree {
	//Creates a node data structure called "root"
	Node root;

	public void addNode(int key, String name) {
		//Creates a function to create a new node with the "key" and "name" paremeters passed through
		Node newNode = new Node(key, name);
		
		if(root == null){  //Runs if the "root" node does not exist)
			root = newNode; //Creates a new node and makes it the root
		}

		else { //Runs if the "root" node exists
			Node focusNode = root; //Selects "root" as the current node
			Node parent; //Creates a node "parent" to use later
		
			while (true) { //Runs until "return;" is run
				parent = focusNode; //Selects "focusNode" as the current node

                if(key < focusNode.key) { //Runs if the new entry's "key" value is less than the selected node's
					focusNode = focusNode.leftChild; //Switches focus to the left child of "parent"

					if(focusNode == null) { //Runs if the left child of "parent" is empty
						parent.leftChild = newNode; //Creates a new node to the left of "parent"
						return; //Ends the loop
					}
				}
                else { //Runs if the new entry's "key" value is greater than the selected node's
					focusNode = focusNode.rightChild; //Switches focus to the right child of "parent"
					
					if(focusNode == null) { //Runs if the right child of "parent" is empty
						parent.rightChild = newNode; //Creates a new node to the right of "parent"
						return; //Ends the loop
					}
				}
			}
		}
	}

    //Recursively checks all nodes and their children
	public void inOrderTraverseTree(Node focusNode) {
		if(focusNode != null) { //Runs while the node currently in focus is not empty
			inOrderTraverseTree(focusNode.leftChild); //Recursively checks all child nodes to the left
			System.out.println(focusNode);
			inOrderTraverseTree(focusNode.rightChild); //Recursively checks all child nodes to the right
		}
	}

	public static void main(String[] args) {
		//1. Creates a binary tree structure called "vehicleTree"
		BinaryTree vehicleTree = new BinaryTree();
		
		//2. Adds nodes to the parent tree
		vehicleTree.addNode(99, "Volvo");
		vehicleTree.addNode(25, "Ford");
		vehicleTree.addNode(40, "Kia");
		vehicleTree.addNode(75, "Honda");
		vehicleTree.addNode(80, "Subaru");
		vehicleTree.addNode(15, "Tesla");

		//3. Calls "inOrderTraverseTree" to recursively list entries in the binary tree
		vehicleTree.inOrderTraverseTree(vehicleTree.root);
	}
}
	
class Node {
	//Creates variables to be filled later
	int key;
	String name;
	
	//Creates left and right nodes under the parent
	Node leftChild;
	Node rightChild;
	
	Node(int key, String name){
		//Assigns the "key" and "name" variables to the "Node" function
		this.key = key;
		this.name = name;
	}
	
	//Prints the current keys and values found in "vehicleTree" to the terminal
	public String toString() {
		return "Key: " + key + "  |  Name: " + name;
	}
}