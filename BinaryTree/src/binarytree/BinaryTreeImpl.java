/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarytree;

/**
 *
 * @author Cifer
 */
public class BinaryTreeImpl {

    Node root;

    private Node addRecursive(Node currentNode, int data) {
        if (currentNode == null) {
            return new Node(data);
        }

        if (data < currentNode.data) {
            currentNode.left = addRecursive(currentNode.left, data);
        } else if (data > currentNode.data) {
            currentNode.right = addRecursive(currentNode.right, data);
        } else { //value already exist
            return currentNode;
        }

        return currentNode;
    }

    public void add(int data) {
        root = addRecursive(root, data);
    }

    private boolean containsNodeRecursive(Node currentNode, int data) {
        if (currentNode == null) {
            return false;
        }
        if (data == currentNode.data) {
            return true;
        }
        return data < currentNode.data
                ? containsNodeRecursive(currentNode.left, data)
                : containsNodeRecursive(currentNode.right, data);
    }

    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private Node deleteRecursive(Node currentNode, int data) {
        if (currentNode == null) {
            return null;
        }
        //If the node is a leaf node
        if (currentNode.left == null && currentNode.right == null) {
            return null;
        }
        //Else if the node has 1 child
        if (currentNode.right == null) {
            return currentNode.left;
        }

        if (currentNode.left == null) {
            return currentNode.right;
        }
        if (data == currentNode.data) {
            //Once we find the node to delete, there are 3 main different cases:
            //a node has no children – this is the simplest case; we just need to replace this node with null in its parent node
            //a node has exactly one child – in the parent node, we replace this node with its only child.
            //a node has two children – this is the most complex case because it requires a tree reorganization
        }
        if (data < currentNode.data) {
            currentNode.left = deleteRecursive(currentNode.left, data);
            return currentNode;
        } else {
            currentNode.right = deleteRecursive(currentNode.right, data);
        }
        return currentNode;

    }

    public int height(Node root) {
        if (root == null) {
            return 0;
        } else {

            // Compute  height of each subtree
            int lheight = height(root.left);
            int rheight = height(root.right);

            // use the larger one
            if (lheight > rheight) {
                return (lheight + 1);
            } else {
                return (rheight + 1);
            }
        }
    }

    public int calculateDepth(Node root, Node node) {
        if (root == null) {
            return 0;
        } else if (root == node) {
            return 1;
        } else {
            // Search for the node in the left and right subtrees
            int leftDepth = calculateDepth(root.left, node);
            if (leftDepth != 0) {
                return leftDepth + 1; // Add 1 for the current level
            }
            int rightDepth = calculateDepth(root.right, node);
            if (rightDepth != 0) {
                return rightDepth + 1; // Add 1 for the current level
            }
            // If the node is not found in either subtree, return 0
            return 0;
        }
    }

    public int smallestElement(Node temp) {
        //Check whether tree is empty  
        if (root == null) {
            System.out.println("Tree is empty");
            return 0;
        } else {
            int leftMin, rightMin;
            //Min will store temp's data  
            int min = temp.data;

            //It will find smallest element in left subtree  
            if (temp.left != null) {
                leftMin = smallestElement(temp.left);
                //If min is greater than leftMin then store the value of leftMin into min  
                min = Math.min(min, leftMin);
            }

            //It will find smallest element in right subtree  
            if (temp.right != null) {
                rightMin = smallestElement(temp.right);
                //If min is greater than rightMin then store the value of rightMin into min  
                min = Math.min(min, rightMin);
            }
            return min;
        }
    }
}
