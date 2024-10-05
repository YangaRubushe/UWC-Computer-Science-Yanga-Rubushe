//Author: Rubushe Yanga

//BinaryNode
public class BinaryNode {
    private String type; // movie or tv show
    private String title; // title of movie/tv show
    private int releaseYear; // release year of movie/tv show
    private BinaryNode left; // left child
    private BinaryNode right; // right child

    public BinaryNode(String theTitle) {
        title = theTitle;
        left = null;
        right = null;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public BinaryNode getLeft() {
        return this.left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return this.right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(title); // Print the title of the node
        if (right != null) {
            right.printInOrder();
        }
    }
}
