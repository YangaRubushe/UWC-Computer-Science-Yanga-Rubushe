// Author: Yanga Rubushe

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
        if (key > 0) {  // Only insert positive integers
            root = insertRec(root, key);
        }
    }

    // Recursive insert method
    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    // Inorder traversal method
    void inorderTraversal() {
        inorderTraversalRec(root);
        System.out.println(); // New line after traversal
    }

    // Recursive inorder traversal
    void inorderTraversalRec(Node root) {
        if (root != null) {
            inorderTraversalRec(root.left);
            System.out.print(root.key + " ");
            inorderTraversalRec(root.right);
        }
    }
}

// Main class to run the program
class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Inserting positive integers
        tree.insert(3);
        tree.insert(5);
        tree.insert(2);
        tree.insert(1);
        tree.insert(4);
        tree.insert(6);

        System.out.println("Inorder traversal of the BST:");
        tree.inorderTraversal();  // Output: 1 2 3 4 5 6
    }
}
