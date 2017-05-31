package BST_A2;

public class BST_Playground {
/*
 * you will test your own BST implementation in here
 *
 * we will replace this with our own when grading, and will
 * do what you should do in here... create BST objects,
 * put data into them, take data out, look for values stored
 * in it, checking size and height, and looking at the BST_Nodes
 * to see if they are all linked up correctly for a BST
 * 
*/
  
  public static void main(String[]args){

   // you should test your BST implementation in here
   // it is up to you to test it rthoroughly and make sure
   // the methods behave as requested above in the interface
  
   // do not simple depend on the oracle test we will give
   // use the oracle tests as a way of checking AFTER you have done
   // your own testing

   // one thing you might find useful for debugging is a print tree method
   // feel free to use the printLevelOrder method to verify your trees manually
   // or write one you like better
   // you may wish to print not only the node value, and indicators of what
   // nodes are the left and right subtree roots,
   // but also which node is the parent of the current node
	  
	  greekLife();
//	  myEmptyTreeTests();
//	  myHeightTests();
//	  myContainsTest();
//	  myEmptyTest();
//	  mySizeTest();
//	  myFindMinFindMaxTest();
//	  testCompareTo("alpha", "felipe");
//	  dumpContainsTests();
//	  dumpHeightTests();
//	  dumpSizeTests();
//	  dumpFMinFMaxTests();
//	  dumpInsertTests();
//	  dumpRemoveTests();
//	  dumpInsertAfterRemoveTests();
//	  dumpEmptyTests();
//	  fuckitup();
	  
  } // END OF MAIN
  
  // -----------------------------------------  MY TESTS ---------------------------------------------------------------
  public static void greekLife(){
	  System.out.println("------------------ Greek Life Testing ----------------------");
	  BST myTree = new BST();
	  System.out.println("Does it contain alpha: "+myTree.contains("alpha"));
	  System.out.println();
	  myTree.insert("kappa");
	  myTree.insert("lambda");
	  myTree.insert("kappa");  // false
	  myTree.insert("alpha");
	  myTree.insert("beta");
	  myTree.insert("gamma");
	  myTree.insert("delta");
	  myTree.insert("epsilon");
	  myTree.insert("zeta");
	  myTree.insert("eta");
	  myTree.insert("theta");
	  myTree.insert("iota");
	  myTree.insert("felipe");
	  System.out.println("Size: "+myTree.size());
	  printLevelOrder(myTree);
	  System.out.println();
	  
	  myTree.remove("felipe");
	  printLevelOrder(myTree);
	  System.out.println("Size: "+myTree.size());
//	  System.out.println("Does it contain delta: "+myTree.contains("delta"));
//	  System.out.println("Does it contain 12: "+myTree.contains("12"));
//	  System.out.println("Does it contain 12: "+myTree.contains("oranges"));
//	  System.out.println(myTree.findMin());
  }
  
  public static void myEmptyTreeTests(){
	  System.out.println("---------------------- My Empty Tree Test -------------------------------");
	  BST bst = new BST();
	  System.out.println(bst.size());
	  System.out.println(bst.contains("hi"));
	  System.out.println(bst.empty());
//	  printLevelOrder(bst);
  }
  
  public static void myHeightTests(){
	  System.out.println("---------------------- My Height Test -------------------------------");
	  BST myBST = new BST();
	  System.out.println(myBST.height());
	  myBST.insert("well");
	  System.out.println(myBST.height());
	  myBST.insert("this");
	  myBST.insert("is");
	  myBST.insert("fun");
	  System.out.println(myBST.height());
  }
  
  public static void myContainsTest(){
	  System.out.println("---------------------- My Contains Test -------------------------------");
	  BST containsBST = new BST();
	  System.out.println(containsBST.contains("something"));
	  containsBST.insert("whadup");
	  System.out.println(containsBST.contains("something"));
	  containsBST.insert("though");
	  System.out.println(containsBST.contains("whadup"));
	  System.out.println(containsBST.contains("111"));
  }
  
  public static void myEmptyTest(){
	  System.out.println("---------------------- My Empty Test -------------------------------");
	  BST emptyBST = new BST();
	  System.out.println(emptyBST.empty());
	  emptyBST.insert("sex");
	  System.out.println(emptyBST.empty());
  }
  
  public static void mySizeTest(){
	  System.out.println("---------------------- My Size Test -------------------------------");
	  BST sizeBST = new BST();
	  System.out.println(sizeBST.size());
	  sizeBST.insert("sex");
	  System.out.println(sizeBST.size());
	  sizeBST.insert("fine");
	  sizeBST.insert("change");
	  System.out.println(sizeBST.size());
  }
  
  public static void myFindMinFindMaxTest(){
	  System.out.println("---------------------- My FindMin Test -------------------------------");
	  BST findMinFindMaxBST = new BST();
	  System.out.println("BST FindMin: "+findMinFindMaxBST.findMin());
	  System.out.println("BST FindMax: "+findMinFindMaxBST.findMax());
	  findMinFindMaxBST.insert("a");
	  System.out.println("\nBST FindMin: "+findMinFindMaxBST.findMin());
	  System.out.println("BST FindMax: "+findMinFindMaxBST.findMax());
	  findMinFindMaxBST.insert("c");
	  findMinFindMaxBST.insert("b");
	  System.out.println("\nBST FindMin: "+findMinFindMaxBST.findMin());
	  System.out.println("BST FindMax: "+findMinFindMaxBST.findMax());
	  System.out.println("\nnext one");
	  
	  BST findMinFindMaxBST2 = new BST();
	  findMinFindMaxBST2.insert("f");
	  findMinFindMaxBST2.insert("d");
	  findMinFindMaxBST2.insert("e");
	  findMinFindMaxBST2.insert("b");
	  System.out.println("\nBST2 FindMin: "+findMinFindMaxBST2.findMin()); 
	  System.out.println("BST2 FindMax: "+findMinFindMaxBST2.findMax());
  }
  
  public static void testCompareTo(String first, String second){
	  System.out.println(first.compareTo(second));
  }
  
//-----------------------------------------  TEST DUMP ---------------------------------------------------------------
  public static void dumpContainsTests(){
	  System.out.println("---------------------- Dump Contains Test -------------------------------");
	  BST dumpContainsBST = new BST();
	  dumpContainsBST.insert("B");
	  dumpContainsBST.insert("A");
	  dumpContainsBST.insert("D");
	  dumpContainsBST.insert("C");
	  dumpContainsBST.insert("E");
	  printLevelOrder(dumpContainsBST);
	  System.out.println(dumpContainsBST.contains("D"));
  }
 
  public static void dumpHeightTests(){
	  System.out.println("---------------------- Dump Height Test -------------------------------");
	  BST dumpHeightBST = new BST();
	  dumpHeightBST.insert("B");
	  dumpHeightBST.insert("A");
	  dumpHeightBST.insert("D");
	  dumpHeightBST.insert("C");
	  dumpHeightBST.insert("F");
	  dumpHeightBST.insert("E");
	  printLevelOrder(dumpHeightBST);
	  System.out.println(dumpHeightBST.height());
  }
  
  public static void dumpSizeTests(){
	  System.out.println("---------------------- Dump Size Test -------------------------------");
	  BST dumpSizeBST = new BST();
	  System.out.println(dumpSizeBST.size());
	  dumpSizeBST.insert("a");
	  dumpSizeBST.insert("b");
	  System.out.println(dumpSizeBST.size());
	  printLevelOrder(dumpSizeBST);

  }
  public static void dumpFMinFMaxTests(){
	  System.out.println("---------------------- Dump Find Max & Find Min Test -------------------------------");
	  BST dumpFMinFMaxBST = new BST();
	  dumpFMinFMaxBST.insert("A");
	  System.out.println("FindMax: "+dumpFMinFMaxBST.findMax());
	  System.out.println("FindMin: "+dumpFMinFMaxBST.findMin());
	  System.out.println();
	  
	  BST dumpFMinFMaxBST2 = new BST();
	  dumpFMinFMaxBST2.insert("A");
	  dumpFMinFMaxBST2.insert("B");
	  System.out.println("\nFindMax: "+dumpFMinFMaxBST2.findMax());
	  System.out.println("FindMin: "+dumpFMinFMaxBST2.findMin());
	  System.out.println();
  }
  
  public static void dumpInsertTests(){
	  System.out.println("---------------------- Dump Insert Tests -------------------------------");
	  BST dumpInsertTest = new BST();
	  dumpInsertTest.insert("C");
	  dumpInsertTest.insert("B");
	  dumpInsertTest.insert("A");
	  printLevelOrder(dumpInsertTest);
  }
  
  public static void dumpRemoveTests(){
	  System.out.println("---------------------- Dump Remove Tests -------------------------------");
	  BST dumpRemoveTest = new BST();
	  dumpRemoveTest.insert("B");
	  dumpRemoveTest.insert("A");
	  dumpRemoveTest.insert("D");
	  dumpRemoveTest.insert("C");
	  dumpRemoveTest.insert("E");
	  dumpRemoveTest.remove("D");
	  printLevelOrder(dumpRemoveTest);
  }
  
  public static void dumpInsertAfterRemoveTests(){
	  System.out.println("---------------------- Dump Insert Remove Tests -------------------------------");
	  BST dumpInsertAfterRemoveTest = new BST();
	  dumpInsertAfterRemoveTest.insert("A");
	  dumpInsertAfterRemoveTest.remove("A");
	  dumpInsertAfterRemoveTest.insert("B");
	  System.out.println(dumpInsertAfterRemoveTest.size());
	 
	  printLevelOrder(dumpInsertAfterRemoveTest);
  }
  
  public static void dumpEmptyTests(){
	  System.out.println("---------------------- Dump Empty Tests -------------------------------");
	  BST dumpEmptyTest = new BST();
	  dumpEmptyTest.insert("B");
	  dumpEmptyTest.insert("A");
	  dumpEmptyTest.insert("D");
	  dumpEmptyTest.insert("C");
	  dumpEmptyTest.insert("E");
	  printLevelOrder(dumpEmptyTest);
	  dumpEmptyTest.remove("B");
	  printLevelOrder(dumpEmptyTest);
	  dumpEmptyTest.remove("A");
	  printLevelOrder(dumpEmptyTest);
	  dumpEmptyTest.remove("D");
	  printLevelOrder(dumpEmptyTest);
	  dumpEmptyTest.remove("C");
	  printLevelOrder(dumpEmptyTest);
	  dumpEmptyTest.remove("E");
	  System.out.println(dumpEmptyTest.empty());

  }
  
  public static void fuckitup(){
	  
	  BST b = new BST();
	  b.insert("k");
	  b.insert("a");
	  b.insert("x");
	  b.insert("m");
	  b.insert("z");
	  b.insert("n");
	  b.insert("p");
	  printLevelOrder(b); 
	  b.remove("x");
	  printLevelOrder(b); 
  }
  
  
   
  
// -------------------------------- Given Test methods --------------------------------------------
  static void printLevelOrder(BST tree){ 
  //will print your current tree in Level-Order...
  //https://en.wikipedia.org/wiki/Tree_traversal
    int h=tree.getRoot().getHeight();
    System.out.println("Height: "+h);
    for(int i=0;i<=h;i++){
      printGivenLevel(tree.getRoot(), i);
      System.out.println("-----Level: "+ i);
    }
    
  }
  static void printGivenLevel(BST_Node root,int level){
    if(root==null)return;
    if(level==0)System.out.print(root.data+" ");
    else if(level>0){
      printGivenLevel(root.left,level-1);
      printGivenLevel(root.right,level-1);
    }
  }
}