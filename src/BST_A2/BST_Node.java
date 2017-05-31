package BST_A2;

public class BST_Node {
  String data;
  BST_Node left;
  BST_Node right;
  BST_Node parent;
  
  BST_Node(String data){ this.data=data; }

  // --- used for testing  ----------------------------------------------
  //
  // leave these 3 methods in, as is

  public String getData(){ return data; }
  public BST_Node getLeft(){ return left; }
  public BST_Node getRight(){ return right; }

  // --- end used for testing -------------------------------------------

  
  // --- fill in these methods ------------------------------------------
  //
  // at the moment, they are stubs returning false 
  // or some appropriate "fake" value
  //
  // you make them work properly
  // add the meat of correct implementation logic to them

  // you MAY change the signatures if you wish...
  // make the take more or different parameters
  // have them return different types
  //
  // you may use recursive or iterative implementations

  // string1.compareTo(string2) 
  // 0: if the argument is equal to this string
  // greater than zero (Positive): if the first string is greater than the second string.
  // less than zero (Negative): otherwise result would be negative

  // [DONE]
  public boolean containsNode(String s){ 
	  BST_Node current = this;
	  // keeps looking in either right or left until it finds the node or null. Each cycle the current node is assigned a new node.
	  while (true){
		  if (current.data.compareTo(s) == 0){  // Once the node has been found
			  return true;
		  }
		  if (current.data.compareTo(s) > 0 ){  // to the left
			  if (current.left == null){
				  return false;
			  }
			  else{
				  current = current.left;
			  }
		  }
		  else{   // to the right
			  if (current.right == null){
				  return false;
			  }
			  else{
				  current = current.right;
			  }
		  }
	  }
  }
 
  // [DONE]
  public boolean insertNode(String s){ 
	  BST_Node newNode = new BST_Node(s);
	  BST_Node parent = this;
	  BST_Node current = this;
	  while (true){
		  parent  = current;     // comes in handy to always have know where the parent is (parent pointer)
//		       root --> s
		  if (current.data.compareTo(s) == 0) {
			  return false;
		  }
//		      root --> s
		  if (current.data.compareTo(s) > 0){  // to the left
			  current = current.left;
			  if (current == null){
				  parent.left = newNode;
				  newNode.parent = parent;
				  return true;
			  }
		  }
		  else{  // to the right
			  current = current.right;
			  if (current == null){
				  parent.right = newNode;
				  newNode.parent = parent;
				  return true;
			  }
		  } 
	  } 
  }
  
  public boolean removeNode(String s){ 
	  BST_Node parent = this;
	  BST_Node current = this;
	  BST_Node rootish = this;
	  BST_Node treeMax;
	  
	  while (true){
		  if (!(current.containsNode(s))){    // node is not in the tree
			  return false;
		  }
		  if (current.data.compareTo(s) == 0){  // Found what it's looking for
			  if ((current.left != null) && (current.right != null)){  // if current has 2 child
				  if (current.data.equals(rootish.data)){  // if its the root
					  treeMax = current.left.findMax();
					  current.left.removeNode(treeMax.data);
					  current.data = treeMax.data;
					  return true;  
				  }
				  else if (!(current.data.equals(rootish.data))){  // not root just internal node with 2 children
					  treeMax = current.left.findMax();
					  current.removeNode(treeMax.data);
					  current.data = treeMax.data;
					  return true;  
				  } 
			  }
			  if((current.left != null) || (current.right != null)){ // if current has 1 child
				  // what side is current on!
				  if (parent.left == current){     // current is on the left of parent
					  if (current.left != null){  // child on current is on left
						  parent.left = current.left;
						  return true;
					  }
					  else if (current.right != null){ // child on current is on right
						  parent.left= current.right;
						  return true;
					  }
				  }
				  else if (parent.right ==  current){ // current is on the right of parent
					  if (current.left != null){      // child on current is on left
						  parent.right = current.left;
						  return true;
					  }
					  else if (current.right != null){ // child of current is on right
						  parent.right = current.right;
						  return true;
					  }
				  }
			  }
			  if ((current.left == null) && (current.right == null)){  // if current has 0 child (leaf)
				  if (parent.left == current){ // right leaf
					  parent.left = null;
					  return true;
				  }
				  else if( parent.right == current){ // left leaf
					  parent.right = null;
					  return true; 
				  }		
				  else if (parent.data.equals(current.data)){
					  current.parent.left = null;
					  return true;
				  }
			  }
		  }
		  // iterators to keep going
		  if (current.data.compareTo(s) > 0){  // to the left
			  parent = current;
			  current = current.left;
		  }
		  else{  // to the right
			  parent = current;
			  current = current.right;
		  }
	  }
  }
  
  // [DONE]
  public BST_Node findMin(){ 
	  BST_Node current = this;
	  while (true){
		  if (current.left == null){ //  does not have a left & found the smallest
			  return current;
		  }
		  else{  // it has a left
			  current = current.left;
		  }
	  } 
  }
 // [DONE] 
  public BST_Node findMax(){ 
	  BST_Node current = this;
	  while (true){
		  if (current.right == null){ //  does not have a right & found the biggest
			  return current;
		  }
		  else{  // it has a right
			  current = current.right;
		  }
	  }
	  
  }
  
  // [DONE]
  public int getHeight(){
	  int leftCounter = 0;
	  int rightCounter = 0;
	  if (this.left != null){
		  leftCounter = this.left.getHeight() + 1;
		  
	  }
	  if (this.right != null){
		  rightCounter = this.right.getHeight() + 1;
		  
	  }
	  if (leftCounter > rightCounter){
		  return leftCounter;
	  }
	  else{
		  return rightCounter; 
	  }
  }
  
  // --- end fill in these methods --------------------------------------


  // --------------------------------------------------------------------
  // you may add any other methods you want to get the job done
  // --------------------------------------------------------------------
  
  public String toString(){
    return "Data: "+this.data+", Left: "+((this.left!=null)?left.data:"null")
            +",Right: "+((this.right!=null)?right.data:"null");
  }
}