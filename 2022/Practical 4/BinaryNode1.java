//Author: Rubushe Yanga

//BinaryNode
public class BinaryNode1 {
    
    
    // Data
    private String type; // movie or tv show
    private String title; // title of movie/tv show
    private int releaseYear; // release year of movie/tv show
    private BinaryNode1 left; // left child
    private BinaryNode1 right; // right child
    
   
    
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
    public BinaryNode1 getleft() {
        return this.left;
            
    }  
    private void setleft(BinaryNode1 left) {
        this.left = left;
    }
    public BinaryNode1 getright() {
        return this.right;
            
    }
    private void setright(BinaryNode1 right) {
        this.right = right;
    }
    public void printInOrder() {
    }
    
      

}
