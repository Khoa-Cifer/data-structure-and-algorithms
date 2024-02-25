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
}
