package BST_A2;

public class BST implements BST_Interface {
  public BST_Node root;
  int size;
  
  public BST(){ size=0; root=null; }
  
  @Override
  //used for testing, please leave as is
  public BST_Node getRoot(){ return root; }
  
  
// ---------------------------- My Implementations begin -----------------------------------------------

// [DONE]
@Override
public boolean insert(String s) {
	boolean retVal = false;
	if (root == null){
		root = new BST_Node(s);
		size++;
		retVal = true;
	}
	else{
		
		retVal = root.insertNode(s);
		if (retVal){   // if did remove something
			size++;
			return retVal;
		}
		else{
			return retVal;
		}
		
		
	}
	return retVal;
}

@Override
public boolean remove(String s) {
	if ((root == null) || (size == 0)){
		return false;
	}
	else if ((root.data.equals(s)) && ((root.left == null) && (root.right == null) )){ // root with no child
		root = null;
		size--;
		return true;		
	}
	if ((root.data.equals(s)) && ((root.left == null) || (root.right == null) )){  // root but has one child
		boolean retVal = false;
		if (root.right != null){
			root = root.right;
			size--;
			retVal = true;
		}
		else if (root.left != null){
			root = root.left;
			size--;
			retVal = true;
		}
		return retVal;
	}
	
	else{
		boolean caller = root.removeNode(s);
		if (caller){   // if did remove something
			size--;
			return caller;
		}
		else{
			return caller;
		}

	}


}

// [DONE]
@Override
public String findMin() {
	if ((root == null) || (size == 0)){
		return null;
	}
	else{
		BST_Node min = root.findMin();
		return min.getData();
	}
	
}

// [DONE]
@Override
public String findMax() {
	if ((root == null) || (size == 0)){
		return null;
	}
	else{
		BST_Node max = root.findMax();
		return max.getData();
	}
}

// [DONE]
@Override
public boolean empty() {
	boolean retVal = false;
	if (size == 0){
		retVal = true;
	}
	return retVal;
}

// [DONE]
@Override
public boolean contains(String s) {
	if ((root == null) || (size == 0)){
		return false;
	}
	else{
		return root.containsNode(s);
	}
}

// [DONE]
@Override
public int size() {
	return size;
}

// [DONE]
@Override
public int height() {
	if ((root == null) || (size == 0)){
		return -1;
	}
	else {
		return root.getHeight();
	}
}

}