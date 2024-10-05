// Author: Rubushe Yanga

// File name: BinarySearchTree.java
public class BinarySearchTree 
{
    
    /* attributes */
    private BinaryNode root;
    private int size;
    
    /* constructor */
    public BinarySearchTree()
    {
        root = null;
    }
    
    /* getter methods for attributes */
    public int getSize()
    {
        return size;
    }
    public BinaryNode getRoot()
    {
        return root;
    }
    
    /* methods from Practical 3 (Phase 2) */
    
    public void insert(String theType, String theTitle, int theReleaseYear)
    {
        root = insert(theTitle, root);
        // copy your code from Practical 3 here
    }
    
    private BinaryNode insert(String theTitle, BinaryNode root) {
        if( root == null ){
            root = new BinaryNode( );
        }else if( theTitle.compareTo( root.getTitle() ) < 0 ){
            root = insert( theTitle, root.getLeft() );
        }else if( theTitle.compareTo( root.getTitle() ) > 0 ){
            root = insert( theTitle, root.getRight() );
        }else{
            
            return root;
        }

        return null;
    }

    public void remove(String title)
    {
        root = remove(title, root);
        // copy your code from Practical 3 here
    }
    
    private BinaryNode remove(String title, BinaryNode root) {
       
        

        if( root == null ){
            throw new Exception( title.toString( ) );
            if( title.compareTo( root.getTitle() ) < 0 ){
                root = remove( title, root.getLeft() );
            }else if( title.compareTo( root.getTitle() ) > 0 ){
                root  = remove( title, root.getRight() );
            }else if( root.getLeft() != null && root.getRight() != null ){
                root = findMin( root.getRight() ).getTitle();
                root = removeMin( root.getRight() );
            }else{
                root = ( root.getLeft() != null ) ? root.getLeft() : root.getRight();
                return root;
            }
        }
        return null;
    }

    private BinaryNode findMin(BinaryNode right) {
        if( right != null){
            while(right.getRight() != null){
                right = right.getRight();
            }
        }
        return null;
    }

    private BinaryNode removeMin(BinaryNode right) {
        return null;
    }

    public BinaryNode find(String x)
    {
        //return elementAt(find(x));
        return elementAt(find(x, root));
        // copy your code from Practical 3 here
    }
   
    
    private BinaryNode find(String x, BinaryNode t) {
       while (t != null) {
        if( x.compareTo( t.getTitle() ) < 0 ){
            t = t.getLeft();
        }else if( x.compareTo( t.getTitle() ) > 0 ){
            t = t.getRight();
        }else{
            return t;
        }
       }
        
        return null;
    }

    public void printInOrder(BinaryNode t)
    {
        if(t.getLeft() != null){
            t.getLeft().printInOrder();
        }
    
        
        System.out.println(t);
        if( t.getRight()!= null){
            t.getRight().printInOrder();
        }
        // copy your code from Practical 3 here
    }
   
    /* methods from Practical 4 (Phase 3) */
    

    
    public int height(BinaryNode t) // [ 2 marks ]
    {
        if(t == null){
            return -1;
        }else{
            return 1 +  Math.max( height( t.getLeft() ), height( t.getRight() ) );
        }
        // insert code here
    }
    
    public boolean isFull(BinaryNode t) // [ 2 marks ]
    {
      if(t == null){
          return true;
      }
      if(t.getLeft()== null && t.getRight() == null){
          return true;
      }
      if((t.getLeft() != null) && (t.getRight() != null) ){
          return (isFull(t.getLeft()) && isFull(t.getRight()));
      }
        return false;// insert code here
    }
    
    public boolean isAVLTree(BinaryNode t) // [ 2 marks]
    {
        int lh;
        int rh;

        if(t == null){
            return true;
        }
        lh = height(t.getLeft());
        rh = height(t.getRight());
        if (Math.abs(lh - rh) <= 1 && isAVLTree(t.getLeft()) && isAVLTree(t.getRight())) {
            return true;
        }
        return false;
        // insert code here
    }
    
    
    /* auxiliary methods: you may use the below methods to help you write your code, if necessary */
    public void makeEmpty()
    {
        root = null;
    }
    
    public Boolean isEmpty()
    {
        return root==null;
    }

    private BinaryNode elementAt(BinaryNode t)
    {
        return t == null ? null : t;
    }
    
}
// end of file