//Author: Rubushe Yanga

//BinarySearchTree
// BinarySearchTree class
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BinarySearchTree extends BinaryNode {
    
    BinarySearchTree(String title) {
        super(title);
        //TODO Auto-generated constructor stub
    }



    private BinaryNode root;
    
    
    public void BinarySearchTree() {
        root = null;
    }
    
   
    
    private void insert( String theType, String 
    theTitle, int theReleaseYear) {
     /*c) creates a new BinaryNode and inserts it into the BST using the unique title attribute*/
      root = insert(theTitle, root);
    }
    private  BinaryNode insert(String theTitle, BinaryNode yy) {
        
        return null;
    }



    private BinaryNode name() {
        return root;
        
    }
    
    public void remove( String theTitle ){
     /*d) removes a node from the BST*/
      root = remove(theTitle, root);
    }
    
    private BinaryNode remove(String theTitle, BinaryNode root) {
        return null;
    }



    public String find ( String theTitle ){
       return elementAt(find(theTitle, root));
       
    }
    
    private String elementAt(BinaryNode root2){
        return root2 == null ? null : root2.gettitle();
    }


    private BinaryNode find(String theTitle, BinaryNode root2){
        while( root2 != null){
            if(theTitle.compareTo(root2.gettitle())<0){
                root2 = root2.getleft();
            }else if( theTitle.compareTo(root2.gettitle())>0){
                root2 = root2.getright();
            }else{
                return root2;
            }
           
        }
         return null;
    }

    public void printInOrder(String title ){
        /*f) prints out the in–order traversal of the BST using the unique title attribute*/
        if(getleft() != null){
            getleft().printInOrder();
        }
    
        
        System.out.println(title);
        if( getright() != null){
            getright().printInOrder();
        }

    }
    public String toString(){
        return null;

    }



    public static void main(String[] args) throws IOException {
         
        String path = "C:/Users/yanga/Downloads/netflix_titles.csv";
        String curline= "";
        int wordCount = 0;
        String rm = "";
        try {
            BufferedReader BST = new BufferedReader(new FileReader(path));

            while ((curline = BST.readLine()) != null) {
                
                String[] words = curline.split(",");
                System.out.println(words);
                if(curline.contains("2018") && curline.contains("TV Show")){
                    wordCount = wordCount + 1;
                }
              
              if(curline == "S"){ 
               rm = curline.replace(words[2],"");
               
               }
               
               

            }
            System.out.println(rm);
            System.out.println("number of tv shows released in 2021: "+ wordCount);
            
             
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        
    }      
     
}