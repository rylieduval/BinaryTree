package pack;

class Node {
   public int key;
   public Node left;
   public Node right;

   public Node(int nodeKey) {
      key = nodeKey;
      left = null;
      right = null;
   }
   
   @Override
   public String toString() {
       return Integer.toString(key);
   }
}
