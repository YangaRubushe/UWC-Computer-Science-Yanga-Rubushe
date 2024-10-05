// Author: Yanga Rubushe

import java.util.Scanner;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    // Insert method to add new nodes
    void insert(int key) {
        root = insertRec(root, key);
    }

    // Recursive insert method
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);

        return root;
    }

    // Postorder traversal method
    void postorderTraversal() {
        postorderTraversalRec(root);
        System.out.println(); // New line after traversal
    }

    // Recursive postorder traversal
    void postorderTraversalRec(Node root) {
        if (root != null) {
            postorderTraversalRec(root.left);
            postorderTraversalRec(root.right);
            System.out.print(root.key + " ");
        }
    }
}

// Main class to run the program
public class MainPostOrder {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive numbers, type '-1' to stop");

        int num = sc.nextInt();
        while (num != -1) {
            if (num > 0) {
                tree.insert(num);  // Insert only positive numbers
            } else {
                System.out.println("Invalid input. Please enter positive numbers only.");
            }
            num = sc.nextInt();  // Ask for next input
        }

        System.out.println("Postorder traversal of the BST:");
        tree.postorderTraversal();
    }
}
