//Author: Rubushe Yanga

//BinarySearchTree
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BinarySearchTree {
    private BinaryNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(String theTitle) {
        root = insert(theTitle, root);
    }

    private BinaryNode insert(String theTitle, BinaryNode node) {
        if (node == null) {
            return new BinaryNode(theTitle); // Create a new node
        }
        if (theTitle.compareTo(node.getTitle()) < 0) {
            node.setLeft(insert(theTitle, node.getLeft()));
        } else if (theTitle.compareTo(node.getTitle()) > 0) {
            node.setRight(insert(theTitle, node.getRight()));
        }
        return node; // Return the unchanged node pointer
    }

    public void remove(String theTitle) {
        root = remove(theTitle, root);
    }

    private BinaryNode remove(String theTitle, BinaryNode node) {
        if (node == null) return null;
        if (theTitle.compareTo(node.getTitle()) < 0) {
            node.setLeft(remove(theTitle, node.getLeft()));
        } else if (theTitle.compareTo(node.getTitle()) > 0) {
            node.setRight(remove(theTitle, node.getRight()));
        } else {
            // Node with only one child or no child
            if (node.getLeft() == null) return node.getRight();
            else if (node.getRight() == null) return node.getLeft();
            // Node with two children: Get the inorder successor (smallest in the right subtree)
            node.setTitle(minValue(node.getRight()));
            node.setRight(remove(node.getTitle(), node.getRight()));
        }
        return node;
    }

    private String minValue(BinaryNode node) {
        String minv = node.getTitle();
        while (node.getLeft() != null) {
            minv = node.getLeft().getTitle();
            node = node.getLeft();
        }
        return minv;
    }

    public void printInOrder() {
        if (root != null) {
            root.printInOrder();
        }
    }

    public static void main(String[] args) throws IOException {
        BinarySearchTree bst = new BinarySearchTree();
        // Example of inserting titles
        bst.insert("Inception");
        bst.insert("The Matrix");
        bst.insert("Interstellar");
        bst.printInOrder(); // Print titles in order
    }
}