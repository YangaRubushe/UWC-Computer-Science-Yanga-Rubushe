//Author: Rubushe Yanga

//BinaryNode
public class BinaryNode {
    BinaryNode( String theTitle){
        title = theTitle;
        left=null;
        right=null;
    }
    
    // Data
    private String type; // movie or tv show
    private String title; // title of movie/tv show
    private int releaseYear; // release year of movie/tv show
    private BinaryNode left; // left child
    private BinaryNode right; // right child
    
   
    
    public String gettype() {
        return this.type;
            
    }  
    private void settype(String type) {
        this.type = type;
    }
    public String gettitle() {
        return this.title;
            
    }  
    private void settitle(String title) {
        this.title = title;
    }
    public int getreleaseYear() {
        return this.releaseYear;
            
    }  
    private void setreleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public BinaryNode getleft() {
        return this.left;
            
    }  
    private void setleft(BinaryNode left) {
        this.left = left;
    }
    public BinaryNode getright() {
        return this.right;
            
    }
    private void setright(BinaryNode right) {
        this.right = right;
    }
    public void printInOrder() {
    }
    
      

}
